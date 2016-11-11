package fr.univtln.nmartinez016.fantasyfootball;

import fr.univtln.nmartinez016.fantasyfootball.entities.*;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 02/11/2016.
 */
public class CUserEntityTest extends TestCase {

    public final String ERROR_IN_BUY_PLAYERS_WITH_LESS_THAN_14_PLAYERS_AND_ENOUGH_MONEY = "error in buy players with less than 14 players and enough money";
    public final String ERROR_IN_BUY_PLAYERS_WITH_LESS_THAN_14_PLAYERS_BUT_NOT_ENOUGH_MONEY = "error in buy players with less than 14 players but not enough money";
    public final String ERROR_IN_BUY_PLAYERS_WITH_14_OR_MORE_PLAYERS_BUT_ENOUGH_MONEY = "error in buy players with 14 or more players but enough money";
    public final String ERROR_IN_BUY_PLAYERS_WITH_14_OR_MORE_PLAYERS_AND_NOT_ENOUGH_MONEY = "error in buy players with 14 or more players and not enough money";

    public final String ERROR_IN_MOVE_PLAYER_IF_INITIAL_POSITION_OK_AND_SWAP = "error in edit player position if initial position ok and swap";
    public final String ERROR_IN_MOVE_PLAYER_IF_INITIAL_POSITION_OK_AND_NOT_SWAP = "error in edit player position if initial position ok and not swap";
    public final String ERROR_IN_MOVE_PLAYER_IF_PLAYER_NOT_IN_SQUAD = "error in move player if player not in squad";

    public final String ERROR_IN_PUT_PLAYER_IF_PLAYER_IN_SQUAD_AND_WITH_SWAP = "error in put player if player in squad and with swap";
    public final String ERROR_IN_PUT_PLAYER_IF_PLAYER_IN_SQUAD_AND_WITHOUT_SWAP = "error in put player if player in squad and without swap";
    public final String ERROR_IN_PUT_PLAYER_IF_PLAYER_NOT_IN_SQUAD = "error in put player if player not in squad";


    public void testBuyPlayerWithLessThan14PlayersAndEnoughMoney() throws Exception {

        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer2 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer3 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer4 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer5 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer6 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer7 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer8 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer9 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer10 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        

        List<CFantasyLeagueEntity> lFantasyLeagues = new ArrayList<CFantasyLeagueEntity>();
        CFantasyLeagueEntity lFantasyLeague = new CFantasyLeagueEntity.CFantasyLeagueBuilder().name("leagues").build();
        lFantasyLeagues.add(lFantasyLeague);
        CUserEntity lUser = new CUserEntity.CUserBuilder().fantasyLeagues(lFantasyLeagues).coins(50).build();
        lFantasyLeague.addUser(lUser);
        lUser.buyPlayer(lPlayer1);
        lUser.buyPlayer(lPlayer2);
        lUser.buyPlayer(lPlayer3);
        lUser.buyPlayer(lPlayer4);
        lUser.buyPlayer(lPlayer5);
        lUser.buyPlayer(lPlayer6);
        lUser.buyPlayer(lPlayer7);
        lUser.buyPlayer(lPlayer8);
        lUser.buyPlayer(lPlayer9);
        assertEquals(ERROR_IN_BUY_PLAYERS_WITH_LESS_THAN_14_PLAYERS_AND_ENOUGH_MONEY, lUser.buyPlayer(lPlayer10), CUserEntity.BUYING_SUCCESS);

    }

    public void testBuyPlayerWithLessThan14PlayersButNotEnoughMoney() throws Exception {

        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer2 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer3 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer4 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer5 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer6 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer7 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer8 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer9 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer10 = new CPlayerEntity.CPlayerBuilder().value(70).build();


        List<CFantasyLeagueEntity> lFantasyLeagues = new ArrayList<CFantasyLeagueEntity>();
        CFantasyLeagueEntity lFantasyLeague = new CFantasyLeagueEntity.CFantasyLeagueBuilder().name("leagues").build();
        lFantasyLeagues.add(lFantasyLeague);

        CUserEntity lUser = new CUserEntity.CUserBuilder().fantasyLeagues(lFantasyLeagues).coins(50).build();
        lUser.buyPlayer(lPlayer1);
        lUser.buyPlayer(lPlayer2);
        lUser.buyPlayer(lPlayer3);
        lUser.buyPlayer(lPlayer4);
        lUser.buyPlayer(lPlayer5);
        lUser.buyPlayer(lPlayer6);
        lUser.buyPlayer(lPlayer7);
        lUser.buyPlayer(lPlayer8);
        lUser.buyPlayer(lPlayer9);

        assertEquals(ERROR_IN_BUY_PLAYERS_WITH_LESS_THAN_14_PLAYERS_BUT_NOT_ENOUGH_MONEY, lUser.buyPlayer(lPlayer10), CUserEntity.BUYING_ERROR_PLAYER_TOO_EXPENSIVE);

    }

    public void testBuyPlayerWith14PlayersOrMoreButEnoughMoney() throws Exception {

        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer2 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer3 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer4 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer5 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer6 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer7 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer8 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer9 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer10 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer11 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer12 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer13 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer14 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer15 = new CPlayerEntity.CPlayerBuilder().value(20).build();


        List<CFantasyLeagueEntity> lFantasyLeagues = new ArrayList<CFantasyLeagueEntity>();
        CFantasyLeagueEntity lFantasyLeague = new CFantasyLeagueEntity.CFantasyLeagueBuilder().name("leagues").build();
        lFantasyLeagues.add(lFantasyLeague);

        CUserEntity lUser = new CUserEntity.CUserBuilder().fantasyLeagues(lFantasyLeagues).coins(50).build();
        lUser.buyPlayer(lPlayer1);
        lUser.buyPlayer(lPlayer2);
        lUser.buyPlayer(lPlayer3);
        lUser.buyPlayer(lPlayer4);
        lUser.buyPlayer(lPlayer5);
        lUser.buyPlayer(lPlayer6);
        lUser.buyPlayer(lPlayer7);
        lUser.buyPlayer(lPlayer8);
        lUser.buyPlayer(lPlayer9);
        lUser.buyPlayer(lPlayer10);
        lUser.buyPlayer(lPlayer11);
        lUser.buyPlayer(lPlayer12);
        lUser.buyPlayer(lPlayer13);
        lUser.buyPlayer(lPlayer14);

        assertEquals(ERROR_IN_BUY_PLAYERS_WITH_14_OR_MORE_PLAYERS_BUT_ENOUGH_MONEY, lUser.buyPlayer(lPlayer15), CUserEntity.BUYING_ERROR_OVER_13_PLAYERS);

    }

    public void testBuyPlayerWith14PlayersOrMoreAndNotEnoughMoney() throws Exception {

        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer2 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer3 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer4 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer5 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer6 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer7 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer8 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer9 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer10 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer11 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer12 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer13 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer14 = new CPlayerEntity.CPlayerBuilder().value(20).build();
        CPlayerEntity lPlayer15 = new CPlayerEntity.CPlayerBuilder().value(70).build();


        List<CFantasyLeagueEntity> lFantasyLeagues = new ArrayList<CFantasyLeagueEntity>();
        CFantasyLeagueEntity lFantasyLeague = new CFantasyLeagueEntity.CFantasyLeagueBuilder().name("leagues").build();
        lFantasyLeagues.add(lFantasyLeague);
        CUserEntity lUser = new CUserEntity.CUserBuilder().fantasyLeagues(lFantasyLeagues).coins(50).build();
        lUser.buyPlayer(lPlayer1);
        lUser.buyPlayer(lPlayer2);
        lUser.buyPlayer(lPlayer3);
        lUser.buyPlayer(lPlayer4);
        lUser.buyPlayer(lPlayer5);
        lUser.buyPlayer(lPlayer6);
        lUser.buyPlayer(lPlayer7);
        lUser.buyPlayer(lPlayer8);
        lUser.buyPlayer(lPlayer9);
        lUser.buyPlayer(lPlayer10);
        lUser.buyPlayer(lPlayer11);
        lUser.buyPlayer(lPlayer12);
        lUser.buyPlayer(lPlayer13);
        lUser.buyPlayer(lPlayer14);

        assertEquals(ERROR_IN_BUY_PLAYERS_WITH_14_OR_MORE_PLAYERS_AND_NOT_ENOUGH_MONEY, lUser.buyPlayer(lPlayer15), CUserEntity.BUYING_ERROR_OVER_13_PLAYERS_AND_PLAYER_TOO_EXPENSIVE);
    }

    public void testMovePlayerIfInitialPositionOkAndSwap() throws Exception {
        CPositionEntity lPosition1 = new CPositionEntity.CPositionBuilder().name("position1").build();
        CPositionEntity lPosition2 = new CPositionEntity.CPositionBuilder().name("position2").build();
        CPositionEntity lPosition3 = new CPositionEntity.CPositionBuilder().name("position3").build();

        CYourPlayerEntry lYourPlayerEntry1 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("nomdefam").build()).position(lPosition1).build();
        CYourPlayerEntry lYourPlayerEntry2 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("jack").build()).position(lPosition2).build();

        List<CFantasyLeagueEntity> lFantasyLeagues = new ArrayList<CFantasyLeagueEntity>();
        CFantasyLeagueEntity lFantasyLeague = new CFantasyLeagueEntity.CFantasyLeagueBuilder().name("leagues").build();
        lFantasyLeagues.add(lFantasyLeague);
        CUserEntity lUser = new CUserEntity.CUserBuilder().fantasyLeagues(lFantasyLeagues).build();
        lUser.getCurrentFantasyTeam().addYourPlayerEntry(lYourPlayerEntry1);
        lUser.getCurrentFantasyTeam().addYourPlayerEntry(lYourPlayerEntry2);
        assertEquals(ERROR_IN_MOVE_PLAYER_IF_INITIAL_POSITION_OK_AND_SWAP, lUser.movePlayer(lPosition1, lPosition2), CFantasyTeamEntity.MOVE_PLAYER_SUCCESS_WITH_SWAP);
    }

    public void testMovePlayerIfInitialPositionOkAndNotSwap() throws Exception {
        CPositionEntity lPosition1 = new CPositionEntity.CPositionBuilder().name("position1").build();
        CPositionEntity lPosition2 = new CPositionEntity.CPositionBuilder().name("position2").build();
        CPositionEntity lPosition3 = new CPositionEntity.CPositionBuilder().name("position3").build();

        CYourPlayerEntry lYourPlayerEntry1 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("nomdefam").build()).position(lPosition1).build();
        CYourPlayerEntry lYourPlayerEntry2 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("jack").build()).position(lPosition2).build();

        List<CFantasyLeagueEntity> lFantasyLeagues = new ArrayList<CFantasyLeagueEntity>();
        CFantasyLeagueEntity lFantasyLeague = new CFantasyLeagueEntity.CFantasyLeagueBuilder().name("leagues").build();
        lFantasyLeagues.add(lFantasyLeague);
        CUserEntity lUser = new CUserEntity.CUserBuilder().fantasyLeagues(lFantasyLeagues).build();

        lUser.getCurrentFantasyTeam().addYourPlayerEntry(lYourPlayerEntry1);
        lUser.getCurrentFantasyTeam().addYourPlayerEntry(lYourPlayerEntry2);
        assertEquals(ERROR_IN_MOVE_PLAYER_IF_INITIAL_POSITION_OK_AND_NOT_SWAP, lUser.movePlayer(lPosition1, lPosition3), CFantasyTeamEntity.MOVE_PLAYER_SUCCESS_NO_SWAP);
    }

    public void testMovePlayerIfPlayerNotInSquad() throws Exception {
        CPositionEntity lPosition1 = new CPositionEntity.CPositionBuilder().name("position1").build();
        CPositionEntity lPosition2 = new CPositionEntity.CPositionBuilder().name("position2").build();
        CPositionEntity lPosition3 = new CPositionEntity.CPositionBuilder().name("position3").build();

        CYourPlayerEntry lYourPlayerEntry1 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("nomdefam").build()).position(lPosition1).build();
        CYourPlayerEntry lYourPlayerEntry2 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("jack").build()).position(lPosition2).build();


        List<CFantasyLeagueEntity> lFantasyLeagues = new ArrayList<CFantasyLeagueEntity>();
        CFantasyLeagueEntity lFantasyLeague = new CFantasyLeagueEntity.CFantasyLeagueBuilder().name("leagues").build();
        lFantasyLeagues.add(lFantasyLeague);
        CUserEntity lUser = new CUserEntity.CUserBuilder().fantasyLeagues(lFantasyLeagues).build();

        lUser.getCurrentFantasyTeam().addYourPlayerEntry(lYourPlayerEntry2);
        assertEquals(ERROR_IN_MOVE_PLAYER_IF_PLAYER_NOT_IN_SQUAD, lUser.movePlayer(lPosition1, lPosition3), CFantasyTeamEntity.MOVE_PLAYER_FAILURE_PLAYER_NOT_IN_SQUAD);
    }

    public void testPutPlayerOnFieldWithPlayerOnTheTeamAndWithoutSwap() throws Exception {
        CPositionEntity lPosition1 = new CPositionEntity.CPositionBuilder().name("position1").build();
        CPositionEntity lPosition2 = new CPositionEntity.CPositionBuilder().name("position2").build();

        CYourPlayerEntry lYourPlayerEntry1 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("nomdefam").build()).build();
        CYourPlayerEntry lYourPlayerEntry2 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("jack").build()).position(lPosition2).build();


        List<CFantasyLeagueEntity> lFantasyLeagues = new ArrayList<CFantasyLeagueEntity>();
        CFantasyLeagueEntity lFantasyLeague = new CFantasyLeagueEntity.CFantasyLeagueBuilder().name("leagues").build();
        lFantasyLeagues.add(lFantasyLeague);
        CUserEntity lUser = new CUserEntity.CUserBuilder().fantasyLeagues(lFantasyLeagues).build();

        lUser.getCurrentFantasyTeam().addYourPlayerEntry(lYourPlayerEntry1);
        lUser.getCurrentFantasyTeam().addYourPlayerEntry(lYourPlayerEntry2);
        assertEquals(ERROR_IN_PUT_PLAYER_IF_PLAYER_IN_SQUAD_AND_WITHOUT_SWAP, lUser.putPlayerOnField(lYourPlayerEntry1.getPlayer(), lPosition1), CFantasyTeamEntity.PUT_PLAYER_SUCCESS_NO_SWAP);

    }

    public void testPutPlayerOnFieldWithPlayerOnTheTeamAndWithSwap() throws Exception {
        CPositionEntity lPosition1 = new CPositionEntity.CPositionBuilder().name("position1").build();
        CPositionEntity lPosition2 = new CPositionEntity.CPositionBuilder().name("position2").build();

        CYourPlayerEntry lYourPlayerEntry1 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("nomdefam").build()).build();
        CYourPlayerEntry lYourPlayerEntry2 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("jack").build()).position(lPosition2).build();


        List<CFantasyLeagueEntity> lFantasyLeagues = new ArrayList<CFantasyLeagueEntity>();
        CFantasyLeagueEntity lFantasyLeague = new CFantasyLeagueEntity.CFantasyLeagueBuilder().name("leagues").build();
        lFantasyLeagues.add(lFantasyLeague);
        CUserEntity lUser = new CUserEntity.CUserBuilder().fantasyLeagues(lFantasyLeagues).build();

        lUser.getCurrentFantasyTeam().addYourPlayerEntry(lYourPlayerEntry1);
        lUser.getCurrentFantasyTeam().addYourPlayerEntry(lYourPlayerEntry2);
        assertEquals(ERROR_IN_PUT_PLAYER_IF_PLAYER_IN_SQUAD_AND_WITH_SWAP, lUser.putPlayerOnField(lYourPlayerEntry1.getPlayer(), lPosition2), CFantasyTeamEntity.PUT_PLAYER_SUCCESS_WITH_SWAP);
    }

    public void testPutPlayerOnFieldWithPlayerNotOnTheTeam() throws Exception {
        CPositionEntity lPosition1 = new CPositionEntity.CPositionBuilder().name("position1").build();
        CPositionEntity lPosition2 = new CPositionEntity.CPositionBuilder().name("position2").build();

        CYourPlayerEntry lYourPlayerEntry1 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("nomdefam").build()).position(lPosition1).build();
        CYourPlayerEntry lYourPlayerEntry2 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("jack").build()).position(lPosition2).build();


        List<CFantasyLeagueEntity> lFantasyLeagues = new ArrayList<CFantasyLeagueEntity>();
        CFantasyLeagueEntity lFantasyLeague = new CFantasyLeagueEntity.CFantasyLeagueBuilder().name("leagues").build();
        lFantasyLeagues.add(lFantasyLeague);
        CUserEntity lUser = new CUserEntity.CUserBuilder().fantasyLeagues(lFantasyLeagues).build();

        lUser.getCurrentFantasyTeam().addYourPlayerEntry(lYourPlayerEntry2);

        assertEquals(ERROR_IN_PUT_PLAYER_IF_PLAYER_NOT_IN_SQUAD, lUser.putPlayerOnField(lYourPlayerEntry1.getPlayer(), lPosition2), CFantasyTeamEntity.PUT_PLAYER_FAILURE_PLAYER_NOT_IN_SQUAD);
    }
}
