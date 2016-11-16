package nmartinez016.univtln.fr.fantasyfootball.websocket;

import android.content.Intent;
import android.util.Log;

import java.util.List;

import javax.websocket.MessageHandler;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CBuyingErrorPlayerTooExpensive;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CBuyingErrorPlayerTooMuchPlayersAndPlayerTooExpensive;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CBuyingErrorTooMuchPlayers;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CConnectedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CFantasyLeagueJoinedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CFantasyLeagueSelectedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CLeagueCreatedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayerBoughtAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayerInvitedInFantasyLeagueAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayerMovedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayerPutOnFieldAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayersLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayersLoadedByGoals;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPositionsLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPublicFantasyLeaguesLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CReturnLeagueNameAvailable;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CTeamsLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;

/**
 * Created by marti on 01/08/2016.
 */


public class CMessageHandler implements MessageHandler.Whole<CAction> {

    private CWebSocketService mWebSocketService;
    public static final String TYPE = "type";
    public static final String PLAYERS = "players";
    public static final String TEAMS = "teams";
    public static final String POSITIONS = "positions";
    public static final String INTENT_TYPE = "intent_type";
    public static final String PLAYERS_BY_GOALS = "playersbygoals";
    public static final String PLAYER_PUT_ON_FIELD = "player_put_on_field";
    public static final String PLAYER_MOVED = "player_moved";
    public static final String CONNECTED = "connected";
    public static final String PLAYER_BOUGHT = "player_bought";
    public static final String FANTASY_LEAGUE_JOINED = "fantasy_league_joined";
    public static final String FANTASY_LEAGUE_CREATED = "fantasy_league_created";
    public static final String INVITED_IN_FANTASY_LEAGUE = "invited_in_fantasy_league";
    public static final String PUBLIC_FANTASY_LEAGUES = "public_fantayçleagues";
    public static final String FANTASY_LEAGUE_SELECTED = "fantasy_league_selected";
    public static final String RETURN_LEAGUE_NAME_AVAILABLE = "return_league_name_available";


    public CMessageHandler(CWebSocketService pService){
        mWebSocketService = pService;
    }

    @Override
    public void onMessage(CAction pAction) {

        /*
         * When the server sends an action CPlayersLoaded, just
         * send the object to the other activities so they can use
         * the list of players inside.
         */

        if (pAction instanceof CPlayersLoadedAction){
            Log.i("tag", "c est un type players loaded");
            CPlayersLoadedAction lPlayersLoaded = (CPlayersLoadedAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CPlayersLoadedAction.class.getName());
            lIntent.putExtra(PLAYERS, lPlayersLoaded);
            mWebSocketService.sendBroadcast(lIntent);
        }

        if (pAction instanceof CTeamsLoadedAction){
            Log.i("teams", "dans msghandler teamsloaded");
            CTeamsLoadedAction lTeamsLoadedAction = (CTeamsLoadedAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CTeamsLoadedAction.class.getName());
            lIntent.putExtra(TEAMS, lTeamsLoadedAction);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * When the server sends an action CPositionsLoaded, just
         * send to the activities the object so they can use the list of
         * positions inside.
         */

        if (pAction instanceof CPositionsLoadedAction){
            CPositionsLoadedAction lPositionsLoadedAction = (CPositionsLoadedAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CPositionsLoadedAction.class.getName());
            lIntent.putExtra(POSITIONS, lPositionsLoadedAction);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * When the server sends an action CPlayersLoadedByGoals, just
         * send to the activities the object so they can use the list of
         * players inside.
         */
        if (pAction instanceof CPlayersLoadedByGoals){
            CPlayersLoadedByGoals lPlayersLoadedByGoals = (CPlayersLoadedByGoals) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CPlayersLoadedByGoals.class.getName());
            lIntent.putExtra(PLAYERS_BY_GOALS, lPlayersLoadedByGoals);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * When the server sends an action CPlayerPutOnField, just
         * send to the squad management the object so it can update
         * the static user and reload the field view
         */

        if (pAction instanceof CPlayerPutOnFieldAction){
            CPlayerPutOnFieldAction lPlayerPutOnField = (CPlayerPutOnFieldAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CPlayerPutOnFieldAction.class.getName());
            lIntent.putExtra(PLAYER_PUT_ON_FIELD, lPlayerPutOnField);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * When the server sends an action CPlayerMoved, just
         * send to the squad management the object so it can update
         * the static user and reload the field view
         */

        if (pAction instanceof CPlayerMovedAction){
            CPlayerMovedAction lPlayerMoved = (CPlayerMovedAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CPlayerMovedAction.class.getName());
            lIntent.putExtra(PLAYER_MOVED, lPlayerMoved);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * When the server sends an action CConnected, just
         * send to the authentification activity the object so it can
         * update the static user and start the game activity
         */

        if (pAction instanceof CConnectedAction){
            CConnectedAction lConnectedAction = (CConnectedAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CConnectedAction.class.getName());
            lIntent.putExtra(CONNECTED, lConnectedAction);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * player bought
         */

        if (pAction instanceof CPlayerBoughtAction){
            CPlayerBoughtAction lPlayerBoughtAction = (CPlayerBoughtAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CPlayerBoughtAction.class.getName());
            lIntent.putExtra(PLAYER_BOUGHT, lPlayerBoughtAction);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * error player bought too expensive
         */

        if (pAction instanceof CBuyingErrorPlayerTooExpensive){
            CBuyingErrorPlayerTooExpensive lBuyingErrorPlayerTooExpensive = (CBuyingErrorPlayerTooExpensive) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CBuyingErrorPlayerTooExpensive.class.getName());
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * error player bought too much player
         */

        if (pAction instanceof CBuyingErrorPlayerTooExpensive){
            CBuyingErrorTooMuchPlayers lBuyingErrorPlayerTooMuchPlayers = (CBuyingErrorTooMuchPlayers) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CBuyingErrorTooMuchPlayers.class.getName());
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * error player bought both
         */

        if (pAction instanceof CBuyingErrorPlayerTooMuchPlayersAndPlayerTooExpensive){
            CBuyingErrorPlayerTooMuchPlayersAndPlayerTooExpensive lBuyingErrorPlayerTooMuchPlayersAndTooExpensive = (CBuyingErrorPlayerTooMuchPlayersAndPlayerTooExpensive) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CBuyingErrorPlayerTooMuchPlayersAndPlayerTooExpensive.class.getName());
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * load all public leagues
         */

        if (pAction instanceof CPublicFantasyLeaguesLoadedAction){
            CPublicFantasyLeaguesLoadedAction lPublicFantasyTeams = (CPublicFantasyLeaguesLoadedAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CPublicFantasyLeaguesLoadedAction.class.getName());
            lIntent.putExtra(PUBLIC_FANTASY_LEAGUES, lPublicFantasyTeams);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * league joined
         */

        if (pAction instanceof CFantasyLeagueJoinedAction){
            CFantasyLeagueJoinedAction lFantasyLeagueJoined = (CFantasyLeagueJoinedAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CFantasyLeagueJoinedAction.class.getName());
            lIntent.putExtra(FANTASY_LEAGUE_JOINED, lFantasyLeagueJoined);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * league created
         */

        if (pAction instanceof CLeagueCreatedAction){
            CLeagueCreatedAction lLeagueCreated = (CLeagueCreatedAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CLeagueCreatedAction.class.getName());
            lIntent.putExtra(FANTASY_LEAGUE_CREATED, lLeagueCreated);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * invited
         */

        if (pAction instanceof CPlayerInvitedInFantasyLeagueAction){
            CPlayerInvitedInFantasyLeagueAction lPlayerInvited = (CPlayerInvitedInFantasyLeagueAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CPlayerInvitedInFantasyLeagueAction.class.getName());
            lIntent.putExtra(INVITED_IN_FANTASY_LEAGUE, lPlayerInvited);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * change the team selected
         */

        if (pAction instanceof CFantasyLeagueSelectedAction){
            CFantasyLeagueSelectedAction lFantasyLeagueSelected = (CFantasyLeagueSelectedAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CFantasyLeagueSelectedAction.class.getName());
            lIntent.putExtra(FANTASY_LEAGUE_SELECTED, lFantasyLeagueSelected);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * return league name available
         */

        if (pAction instanceof CReturnLeagueNameAvailable){
            CReturnLeagueNameAvailable lReturnLeagueNameAvailable = (CReturnLeagueNameAvailable) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CReturnLeagueNameAvailable.class.getName());
            lIntent.putExtra(RETURN_LEAGUE_NAME_AVAILABLE, lReturnLeagueNameAvailable);
            mWebSocketService.sendBroadcast(lIntent);
        }

    }
}