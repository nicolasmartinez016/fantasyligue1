package fr.univtln.nmartinez016;



import com.google.api.client.googleapis.auth.oauth2.GoogleIdTokenVerifier;
import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.CCustomActionDecoder;
import fr.univtln.nmartinez016.fantasyfootball.CCustomActionEncoder;
import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.load.*;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.*;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.database.CQueryParameter;
import fr.univtln.nmartinez016.fantasyfootball.entities.*;

import javax.websocket.*;
import javax.websocket.server.ServerEndpoint;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Collections;
import java.util.List;



/**
 * Created by marti on 01/08/2016.
 */


@ServerEndpoint(value = "/echo",
        encoders = {CCustomActionEncoder.class},
        decoders = {CCustomActionDecoder.class})

public class CServer {
    private static List<Session> mSessions = new ArrayList<Session>();
    public final static String SERVER_IP;
    public final static int SERVER_PORT;
    //private CCrudMethods mCrudMethods = new CCrudMethods();

    static {
        String ip = null;
        int port = 8025;
        try {
            //ip = System.getProperty("fr.univtln.bruno.test.simple.websocket.server.ip");
            //ip = System.getProperty("fr.univtln.nmartinez016.ip");
        } catch (NullPointerException e) {
        }

        try {
            //port = Integer.parseInt(System.getProperty("fr.univtln.bruno.test.simple.websocket.server.port"));
        } catch (NullPointerException e) {
        } catch (NumberFormatException e) {
        }
        if (ip == null) ip = "0.0.0.0";
        SERVER_IP = ip;
        SERVER_PORT = port;
        System.out.println("Server IP:" + SERVER_IP + " Port: " + SERVER_PORT);
    }


    @OnOpen
    public void onOpen(final Session session, EndpointConfig endpointConfig) {
        System.out.println("new Client connected in session " + session.getId());
        mSessions.add(session);
        System.out.println("session ajoutee");
    }


    @OnMessage
    public void echo(CAction pAction, Session pPeer) throws IOException, EncodeException {
        System.out.println("Received: " + pAction);
        CCrudMethods lCrudMethods = new CCrudMethods();
        List<CPlayerEntity> lPlayers = new ArrayList<CPlayerEntity>();

        /*
         * When a client sends an action CConnectionAction, we
         * load the player with the id sent from the database.
         * If no player matched this id, we create one and send it
         * back to the client.
         * Else, we send back the loaded player.
         */

        if (pAction instanceof CConnectionAction){
            System.out.println("recu connection\n");
            CConnectionAction lConnectionAction = (CConnectionAction) pAction;
            System.out.println("id gmail : " + lConnectionAction.getUserId());
            CUserEntity lUser = lCrudMethods.find(CUserEntity.class, lConnectionAction.getUserId());
            if (lUser == null){
                List<CFantasyLeagueEntity> lFantasyLeagues = new ArrayList<CFantasyLeagueEntity>();
                CFantasyLeagueEntity lFantasyLeague = lCrudMethods.find(CFantasyLeagueEntity.class, CFantasyLeagueEntity.BASE_LEAGUE);
                lFantasyLeagues.add(lFantasyLeague);
                lUser = new CUserEntity.CUserBuilder().id(lConnectionAction.getUserId()).coins(150).fantasyLeagues(lFantasyLeagues).build();
                if (lCrudMethods.openTransaction()){
                    lCrudMethods.create(lUser);
                    lCrudMethods.commitTransaction();
                }
            }
            CAction lConnectedAction = new CConnectedAction(lUser);
            pPeer.getBasicRemote().sendObject(lConnectedAction);
        }

        /*
         * When a client sends an action CLoadPlayers, we
         * check if he chose to sort them by team, age and/or
         * name.
         * Then we look for the players maching what has been
         * requested, and send back to the client the list
         * of players.
         */

        if (pAction instanceof CLoadPlayersAction){
            CLoadPlayersAction lLoadPlayerAction = (CLoadPlayersAction)pAction;
            System.out.println("load players");
            System.out.println("team : " + lLoadPlayerAction.getTeamIdOk());
            System.out.println("age : " + lLoadPlayerAction.getAgeOk());
            System.out.println("name : " + lLoadPlayerAction.getSearchNameOk());


            // si tri par team sans age sans nom
            if ((lLoadPlayerAction.getTeamIdOk() == CConstants.TRI_PAR && lLoadPlayerAction.getAgeOk() == CConstants.TRI_INDETERMINE && lLoadPlayerAction.getSearchNameOk() == CConstants.TRI_INDETERMINE)) {
                lPlayers = (List<CPlayerEntity>)lCrudMethods.findWithNamedQuery(CPlayerEntity.GET_BY_TEAM, CQueryParameter.with(CPlayerEntity.PARAMETER_TEAM, lLoadPlayerAction.getTeamId()).parameters());
            }

            // sinon si tri par team et nom sans age
            else if (lLoadPlayerAction.getTeamIdOk() == CConstants.TRI_PAR && lLoadPlayerAction.getAgeOk() == CConstants.TRI_INDETERMINE && lLoadPlayerAction.getSearchNameOk() == CConstants.TRI_PAR) {
                System.out.println("team : " + lLoadPlayerAction.getTeamId());
                System.out.println("nom : " + lLoadPlayerAction.getSearchName());
                lPlayers = (List<CPlayerEntity>)lCrudMethods.findWithNamedQuery(CPlayerEntity.GET_BY_NAME_AND_TEAM, CQueryParameter.with(CPlayerEntity.PARAMETER_LASTNAME, "%" + lLoadPlayerAction.getSearchName() + "%").and(CPlayerEntity.PARAMETER_TEAM, lLoadPlayerAction.getTeamId()).parameters());
            }

            // sinon si tri par team et age = sans nom
            else if (lLoadPlayerAction.getTeamIdOk() == CConstants.TRI_PAR && lLoadPlayerAction.getAgeOk() == CConstants.TRI_PAR && lLoadPlayerAction.getSearchNameOk() == CConstants.TRI_INDETERMINE) {
                Calendar lCalendar = Calendar.getInstance();
                int lYear = lCalendar.get(Calendar.YEAR);
                int lMonth = lCalendar.get(Calendar.MONTH) + 1;
                int lDay = lCalendar.get(Calendar.DAY_OF_MONTH);
                lPlayers = (List<CPlayerEntity>) lCrudMethods.findWithNamedQuery(CPlayerEntity.GET_BY_TEAM_AND_AGE_EQUALS, (CQueryParameter.with(CPlayerEntity.PARAMETER_YEAR, lYear - lLoadPlayerAction.getAge()).and(CPlayerEntity.PARAMETER_MONTH, lMonth).and(CPlayerEntity.PARAMETER_DAY, lDay).and(CPlayerEntity.PARAMETER_TEAM, lLoadPlayerAction.getTeamId()).and(CPlayerEntity.PARAMETER_OTHER_YEAR, lYear - lLoadPlayerAction.getAge() - 1).parameters()));

            }

            // sinon si tri par team et age <= sans nom
            else if (lLoadPlayerAction.getTeamIdOk() == CConstants.TRI_PAR && lLoadPlayerAction.getAgeOk() == CConstants.TRI_PAR_AGE_INF && lLoadPlayerAction.getSearchNameOk() == CConstants.TRI_INDETERMINE) {
                Calendar lCalendar = Calendar.getInstance();
                int lYear = lCalendar.get(Calendar.YEAR);
                int lMonth = lCalendar.get(Calendar.MONTH) + 1;
                int lDay = lCalendar.get(Calendar.DAY_OF_MONTH);
                lPlayers = (List<CPlayerEntity>) lCrudMethods.findWithNamedQuery(CPlayerEntity.GET_BY_TEAM_AND_AGE_LOWER_OR_EQUALS, (CQueryParameter.with(CPlayerEntity.PARAMETER_YEAR, lYear - lLoadPlayerAction.getAge()).and(CPlayerEntity.PARAMETER_MONTH, lMonth).and(CPlayerEntity.PARAMETER_DAY, lDay).and(CPlayerEntity.PARAMETER_TEAM, lLoadPlayerAction.getTeamId()).parameters()));

            }

            // sinon si tri par team et age >= sans nom
            else if (lLoadPlayerAction.getTeamIdOk() == CConstants.TRI_PAR && lLoadPlayerAction.getAgeOk() == CConstants.TRI_PAR_AGE_SUP && lLoadPlayerAction.getSearchNameOk() == CConstants.TRI_INDETERMINE) {

            }

            // sinon si tri par age = sans nom sans team
            else if (lLoadPlayerAction.getTeamIdOk() == CConstants.TRI_INDETERMINE && lLoadPlayerAction.getAgeOk() == CConstants.TRI_PAR && lLoadPlayerAction.getSearchNameOk() == CConstants.TRI_INDETERMINE) {
                Calendar lCalendar = Calendar.getInstance();
                int lYear = lCalendar.get(Calendar.YEAR);
                int lMonth = lCalendar.get(Calendar.MONTH);
                int lDay = lCalendar.get(Calendar.DAY_OF_MONTH);
                lPlayers = (List<CPlayerEntity>) lCrudMethods.findWithNamedQuery(CPlayerEntity.GET_BY_AGE_EQUALS, (CQueryParameter.with(CPlayerEntity.PARAMETER_YEAR, lYear - lLoadPlayerAction.getAge()).and(CPlayerEntity.PARAMETER_MONTH, lMonth).and(CPlayerEntity.PARAMETER_DAY, lDay).and(CPlayerEntity.PARAMETER_OTHER_YEAR, lYear - lLoadPlayerAction.getAge() - 1).parameters()));

            }

            // sinon si tri par age <= sans nom sans team
            else if (lLoadPlayerAction.getTeamIdOk() == CConstants.TRI_INDETERMINE && lLoadPlayerAction.getAgeOk() == CConstants.TRI_PAR_AGE_INF && lLoadPlayerAction.getSearchNameOk() == CConstants.TRI_INDETERMINE) {
                Calendar lCalendar = Calendar.getInstance();
                int lYear = lCalendar.get(Calendar.YEAR);
                int lMonth = lCalendar.get(Calendar.MONTH) + 1;
                int lDay = lCalendar.get(Calendar.DAY_OF_MONTH);
                lPlayers = (List<CPlayerEntity>) lCrudMethods.findWithNamedQuery(CPlayerEntity.GET_BY_AGE_LOWER_THAN_OR_EQUALS, (CQueryParameter.with(CPlayerEntity.PARAMETER_YEAR, lYear - lLoadPlayerAction.getAge()).and(CPlayerEntity.PARAMETER_MONTH, lMonth).and(CPlayerEntity.PARAMETER_DAY, lDay).parameters()));
            }

            // sinon si tri par age >= sans nom sans team
            else if (lLoadPlayerAction.getTeamIdOk() == CConstants.TRI_INDETERMINE && lLoadPlayerAction.getAgeOk() == CConstants.TRI_PAR_AGE_SUP && lLoadPlayerAction.getSearchNameOk() == CConstants.TRI_INDETERMINE) {

            }

            // sinon si tri par nom sans age sans team
            else if (lLoadPlayerAction.getTeamIdOk() == CConstants.TRI_INDETERMINE && lLoadPlayerAction.getAgeOk() == CConstants.TRI_INDETERMINE && lLoadPlayerAction.getSearchNameOk() == CConstants.TRI_PAR){
                System.out.println("tri par nom : " + lLoadPlayerAction.getSearchName());
                lPlayers = lCrudMethods.findWithNamedQuery(CPlayerEntity.GET_BY_NAME_WITH, CQueryParameter.with(CPlayerEntity.PARAMETER_LASTNAME, "%" + lLoadPlayerAction.getSearchName() + "%").parameters());
                System.out.println("nb trouves : " + lPlayers.size());
                for (CPlayerEntity lPlayer : lPlayers){
                    System.out.println(lPlayer.getFirstName() + " " + lPlayer.getLastName());
                }
            }

            // sinon si tri par nom et age = sans team
            else if (lLoadPlayerAction.getSearchNameOk() == CConstants.TRI_PAR && lLoadPlayerAction.getAgeOk() == CConstants.TRI_PAR && lLoadPlayerAction.getTeamIdOk() == CConstants.TRI_INDETERMINE){
                Calendar lCalendar = Calendar.getInstance();
                int lYear = lCalendar.get(Calendar.YEAR);
                int lMonth = lCalendar.get(Calendar.MONTH) + 1;
                int lDay = lCalendar.get(Calendar.DAY_OF_MONTH);
                lPlayers = (List<CPlayerEntity>) lCrudMethods.findWithNamedQuery(CPlayerEntity.GET_BY_NAME_AND_AGE_EQUALS, (CQueryParameter.with(CPlayerEntity.PARAMETER_YEAR, lYear - lLoadPlayerAction.getAge()).and(CPlayerEntity.PARAMETER_MONTH, lMonth).and(CPlayerEntity.PARAMETER_DAY, lDay).and(CPlayerEntity.PARAMETER_LASTNAME, lLoadPlayerAction.getSearchName()).and(CPlayerEntity.PARAMETER_OTHER_YEAR, lYear - lLoadPlayerAction.getAge() - 1).parameters()));

            }

            // sinon si  tri par nom et age <= sans team
            else if (lLoadPlayerAction.getSearchNameOk() == CConstants.TRI_PAR && lLoadPlayerAction.getAgeOk() == CConstants.TRI_PAR_AGE_INF && lLoadPlayerAction.getTeamIdOk() == CConstants.TRI_INDETERMINE){
                Calendar lCalendar = Calendar.getInstance();
                int lYear = lCalendar.get(Calendar.YEAR);
                int lMonth = lCalendar.get(Calendar.MONTH) + 1;
                int lDay = lCalendar.get(Calendar.DAY_OF_MONTH);
                lPlayers = (List<CPlayerEntity>) lCrudMethods.findWithNamedQuery(CPlayerEntity.GET_BY_NAME_AND_AGE_LOWER_OR_EQUALS, (CQueryParameter.with(CPlayerEntity.PARAMETER_YEAR, lYear - lLoadPlayerAction.getAge()).and(CPlayerEntity.PARAMETER_MONTH, lMonth).and(CPlayerEntity.PARAMETER_DAY, lDay).and(CPlayerEntity.PARAMETER_LASTNAME, "%" + lLoadPlayerAction.getSearchName() + "%").parameters()));
            }

            //sinon si tri par nom et age = et team
            else if (lLoadPlayerAction.getSearchNameOk() == CConstants.TRI_PAR && lLoadPlayerAction.getAgeOk() == CConstants.TRI_PAR && lLoadPlayerAction.getTeamIdOk() == CConstants.TRI_PAR){
                Calendar lCalendar = Calendar.getInstance();
                int lYear = lCalendar.get(Calendar.YEAR);
                int lMonth = lCalendar.get(Calendar.MONTH) + 1;
                int lDay = lCalendar.get(Calendar.DAY_OF_MONTH);
                lPlayers = (List<CPlayerEntity>) lCrudMethods.findWithNamedQuery(CPlayerEntity.GET_BY_NAME_AND_AGE_EQUALS, (CQueryParameter.with(CPlayerEntity.PARAMETER_YEAR, lYear - lLoadPlayerAction.getAge()).and(CPlayerEntity.PARAMETER_MONTH, lMonth).and(CPlayerEntity.PARAMETER_DAY, lDay).and(CPlayerEntity.PARAMETER_LASTNAME, "%" + lLoadPlayerAction.getSearchName() + "%").and(CPlayerEntity.PARAMETER_OTHER_YEAR, lYear - lLoadPlayerAction.getAge() - 1).and(CPlayerEntity.PARAMETER_TEAM, lLoadPlayerAction.getTeamId()).parameters()));

            }

            // sinon si tri par nom et age <= et team
            else if (lLoadPlayerAction.getSearchNameOk() == CConstants.TRI_PAR && lLoadPlayerAction.getAgeOk() == CConstants.TRI_PAR_AGE_INF && lLoadPlayerAction.getTeamIdOk() == CConstants.TRI_PAR){
                Calendar lCalendar = Calendar.getInstance();
                int lYear = lCalendar.get(Calendar.YEAR);
                int lMonth = lCalendar.get(Calendar.MONTH) + 1;
                int lDay = lCalendar.get(Calendar.DAY_OF_MONTH);
                lPlayers = (List<CPlayerEntity>) lCrudMethods.findWithNamedQuery(CPlayerEntity.GET_BY_NAME_AND_TEAM_AND_AGE_LOWER_OR_EQUALS, (CQueryParameter.with(CPlayerEntity.PARAMETER_YEAR, lYear - lLoadPlayerAction.getAge()).and(CPlayerEntity.PARAMETER_MONTH, lMonth).and(CPlayerEntity.PARAMETER_DAY, lDay).and(CPlayerEntity.PARAMETER_TEAM, lLoadPlayerAction.getTeamId()).and(CPlayerEntity.PARAMETER_LASTNAME, "%" + lLoadPlayerAction.getSearchName() + "%").parameters()));

            }

            // sinon si tri par nom et age >= et team

            else if (lLoadPlayerAction.getSearchNameOk() == CConstants.TRI_PAR && lLoadPlayerAction.getAgeOk() == CConstants.TRI_PAR_AGE_SUP && lLoadPlayerAction.getTeamIdOk() == CConstants.TRI_PAR){
                Calendar lCalendar = Calendar.getInstance();
                int lYear = lCalendar.get(Calendar.YEAR);
                int lMonth = lCalendar.get(Calendar.MONTH) + 1;
                int lDay = lCalendar.get(Calendar.DAY_OF_MONTH);
            }

            System.out.println("nombre de joueurs charges : " + lPlayers.size());
            CAction lPlayersLoadedAction = new CPlayersLoadedAction.CPlayersLoadedBuilder().players(lPlayers).build();

            pPeer.getBasicRemote().sendObject(lPlayersLoadedAction);
        }

        /*
         * When a client sends an action CLoadTeam, we
         * load all the teams from the database and
         * send them back to the client.
         */

        else if (pAction instanceof CLoadTeamsAction){
            System.out.println("recu load teams !\n");
            List<CTeamEntity> lTeams = (List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_ALL);
            System.out.println(lTeams.size());
            CAction lTeamsLoadedAction = new CTeamsLoadedAction.CTeamsLoadedBuilder().teams(lTeams).build();
            pPeer.getBasicRemote().sendObject(lTeamsLoadedAction);
        }

        /*
         * When a client sends an action CLoadPositions, we
         * load all the positions from the database and
         * send them back to the client.
         */

        else if (pAction instanceof CLoadPositionsAction){
            System.out.println("recu load positions !\n");
            List<CPositionEntity> lPositions = (List<CPositionEntity>)lCrudMethods.findWithNamedQuery(CPositionEntity.GET_ALL);
            System.out.println(lPositions.size());
            CAction lPositionsLoadedAction = new CPositionsLoadedAction.CPositionsLoadedBuilder().positions(lPositions).build();
            pPeer.getBasicRemote().sendObject(lPositionsLoadedAction);
        }

        /*
         * When a client sends an action CLoadPlayersByGoals, we
         * load all the players from the database sorting them by
         * the amount of goals they scored, then we take the 15 best
         * scorers and send them back to the client.
         */

        else if (pAction instanceof CLoadPlayersByGoals){
            System.out.println("recu load players by goals !\n");
            List<CPlayerEntity> lPlayersByGoals = (List<CPlayerEntity>)lCrudMethods.findWithNamedQuery(CPlayerEntity.GET_ALL);
            Collections.sort(lPlayersByGoals, CPlayerEntity.getCompareByScoredGoals().reversed());
            List<CPlayerEntity> lPlayersToSend = new ArrayList<CPlayerEntity>();
            // the 15 best goal scorers, takes only ppl with more than + goal
            for (int i = 0; i < 15; i++){
                if (lPlayersByGoals.get(i).getGoals() > 0){
                    lPlayersToSend.add(lPlayersByGoals.get(i));
                }
            }
            CAction lPlayersLoadedByGoals = new CPlayersLoadedByGoals(lPlayersToSend);
            pPeer.getBasicRemote().sendObject(lPlayersLoadedByGoals);

        }

        else if (pAction instanceof CBuyPlayerAction){
            System.out.println("recu buy player action ! \n");
            CUserEntity lUser = ((CBuyPlayerAction) pAction).getUser();
            CPlayerEntity lPlayer = ((CBuyPlayerAction) pAction).getPlayer();
            //lUser.addYourPlayerEntry(new CYourPlayerEntry.CYourPlayerEntryBuilder().player(lPlayer).build());
            //CUserEntity lUserGotten = lCrudMethods.find(CUserEntity.class, lUser.getId());
            int lBuyResult = lUser.buyPlayer(lPlayer);

            System.out.println("user received : " + lUser.getId());
            if (lBuyResult == CUserEntity.BUYING_SUCCESS){
                if (lCrudMethods.openTransaction()){
                    lCrudMethods.update(lUser);
                    lCrudMethods.commitTransaction();
                }

                CUserEntity lUserGotten1 = lCrudMethods.find(CUserEntity.class, lUser.getId());
                CAction lPlayerBought = new CPlayerBoughtAction(lUserGotten1);
                pPeer.getBasicRemote().sendObject(lPlayerBought);
            }
            // send back couldnt because too much players
            else if (lBuyResult == CUserEntity.BUYING_ERROR_OVER_13_PLAYERS){
                CAction lTooMuchPlayer = new CBuyingErrorTooMuchPlayers();
                pPeer.getBasicRemote().sendObject(lTooMuchPlayer);
            }
            // send back couldnt because player too expensive
            else if (lBuyResult == CUserEntity.BUYING_ERROR_PLAYER_TOO_EXPENSIVE){
                CAction lPlayerTooExpensive = new CBuyingErrorPlayerTooExpensive();
                pPeer.getBasicRemote().sendObject(lPlayerTooExpensive);
            }
            else if (lBuyResult == CUserEntity.BUYING_ERROR_OVER_13_PLAYERS_AND_PLAYER_TOO_EXPENSIVE){
                CAction lPlayerTooExpensiveAndTooMuchPlayers = new CBuyingErrorPlayerTooMuchPlayersAndPlayerTooExpensive();
                pPeer.getBasicRemote().sendObject(lPlayerTooExpensiveAndTooMuchPlayers);
            }
        }

        else if (pAction instanceof CPutPlayerOnField){
            System.out.println("recu put player on field ! \n");
            CPutPlayerOnField lPutPlayerOnField = (CPutPlayerOnField) pAction;
            CUserEntity lUser = lPutPlayerOnField.getUser();
            CPositionEntity lPosition = lPutPlayerOnField.getPosition();
            if (lPosition != null){
                System.out.println("position : " + lPosition.getName());
            }
            else{
                System.out.println("position null");
            }
            CPlayerEntity lPlayer = lPutPlayerOnField.getPlayer();
            if (lPlayer != null){
                System.out.println("player : " + lPlayer.getLastName());
            }
            else{
                System.out.println("player null");
            }
            int lPutOnFieldResult = lUser.putPlayerOnField(lPlayer, lPosition);
            if (lCrudMethods.openTransaction()){
                lCrudMethods.update(lUser);
                lCrudMethods.commitTransaction();
            }
            CUserEntity lUserGotten = lCrudMethods.find(CUserEntity.class, lUser.getId());
            CAction lPlayerPutOnField = new CPlayerPutOnFieldAction(lUserGotten);
            pPeer.getBasicRemote().sendObject(lPlayerPutOnField);
        }

        else if (pAction instanceof CMovePlayerAction){
            System.out.println("recu move player action ! \n");
            CMovePlayerAction lMovePlayerAction = (CMovePlayerAction) pAction;
            CUserEntity lUser = lMovePlayerAction.getUser();
            CPositionEntity lInitialPosition = lMovePlayerAction.getInitialPosition();
            System.out.println("initial position : " + lInitialPosition.getName());
            CPlayerEntity lPlayer = lUser.getCurrentFantasyTeam().getPlayerByPosition(lInitialPosition);
            System.out.println("player : " + lPlayer.getLastName());
            CPositionEntity lFinalPosition = lMovePlayerAction.getFinalPosition();
            System.out.println("final position : " + lFinalPosition.getName());
            int lResultMove = lUser.movePlayer(lInitialPosition, lFinalPosition);
            System.out.println("result move : " + lResultMove);
            for (CYourPlayerEntry lYourPlayerEntry : lUser.getCurrentFantasyTeam().getYourPlayerEntries()){
                System.out.println("nouvelle position : " + lYourPlayerEntry.getPosition().getName() + "  --- joueur : " + lYourPlayerEntry.getPlayer().getLastName());
            }
            if (lCrudMethods.openTransaction()){
                lCrudMethods.update(lUser);
                lCrudMethods.commitTransaction();
            }

            CUserEntity lUserGotten = lCrudMethods.find(CUserEntity.class, lUser.getId());
            CAction lPlayerMoved = new CPlayerMovedAction(lUserGotten);
            pPeer.getBasicRemote().sendObject(lPlayerMoved);
        }

        /*
         * when receiving an object createleagueaction, we add the creator of the
         * league to the league, change the selected team of the creator to the
         * new team created in the new league.
         * then we persist the new league
         */

        else if (pAction instanceof CCreateLeagueAction){
            CCreateLeagueAction lCreateLeagueAction = (CCreateLeagueAction) pAction;
            CFantasyLeagueEntity lFantasyLeague = lCreateLeagueAction.getFantasyLeague();
            CUserEntity lUser = lCreateLeagueAction.getCreator();
            lFantasyLeague.addUser(lUser);
            if (lCrudMethods.openTransaction()){
                lCrudMethods.create(lFantasyLeague);
                lCrudMethods.commitTransaction();
            }

            CAction lLeagueCreated = new CLeagueCreatedAction.CLeagueCreatedBuilder().fantasyLeague(lCrudMethods.find(CFantasyLeagueEntity.class, lFantasyLeague.getName())).creator(lUser).build();
            if (lFantasyLeague.getVisibility() == CFantasyLeagueEntity.VISIBILITY_PUBLIC){
                // send back to all
                for (Session lSession : mSessions){
                    lSession.getBasicRemote().sendObject(lLeagueCreated);
                }
            }
            else if (lFantasyLeague.getVisibility() == CFantasyLeagueEntity.VISIBILITY_PRIVATE){
                // send back to the user
                pPeer.getBasicRemote().sendObject(lLeagueCreated);
            }
        }

        /*
         * when receiving an object joinleagueaction, we add the user to the league
         * and
         */

        else if (pAction instanceof CJoinFantasyLeagueAction){
            CJoinFantasyLeagueAction lJoinLeagueAction = (CJoinFantasyLeagueAction) pAction;
            CFantasyLeagueEntity lFantasyLeague = lJoinLeagueAction.getFantasyLeague();
            CUserEntity lUser = lJoinLeagueAction.getUser();
            lFantasyLeague.addUser(lUser);

            if (lCrudMethods.openTransaction()){
                lCrudMethods.update(lFantasyLeague);
                lCrudMethods.commitTransaction();
            }

            CAction lLeagueJoined = new CFantasyLeagueJoinedAction(lCrudMethods.find(CUserEntity.class, lUser.getId()));
            pPeer.getBasicRemote().sendObject(lLeagueJoined);
        }

        else if (pAction instanceof CLoadPublicFantasyLeaguesAction){
            CLoadPublicFantasyLeaguesAction lLoadPublicFantasyLeaguesAction = (CLoadPublicFantasyLeaguesAction) pAction;
            List<CFantasyLeagueEntity> lPublicFantasyLeagues = (List<CFantasyLeagueEntity>) lCrudMethods.findWithNamedQuery(CFantasyLeagueEntity.GET_BY_VISIBILITY, CQueryParameter.with(CFantasyLeagueEntity.PARAMETER_PUBLIC, CFantasyLeagueEntity.VISIBILITY_PUBLIC).parameters());
            CAction lPublicLeaguesLoaded = new CPublicFantasyLeaguesLoadedAction(lPublicFantasyLeagues);
            pPeer.getBasicRemote().sendObject(lPublicLeaguesLoaded);
        }

    }

    @OnClose
    public void onClose(final Session session, EndpointConfig endpointConfig) {
        System.out.println(session.getId() + " left.");
        mSessions.remove(session);
    }

    public static void main(String[] args) {
        System.out.println("Server starting...");
        org.glassfish.tyrus.server.Server server =
                new org.glassfish.tyrus.server.Server(SERVER_IP, SERVER_PORT, "/", null, CServer.class);

        try {

            server.start();
            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Please press a key to stop the server.");
            while(true){
                reader.readLine();
            }
            //reader.readLine();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            System.out.println("salut2");
            server.stop();
        }
    }
}