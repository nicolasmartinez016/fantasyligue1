package fr.univtln.nmartinez016.fantasyfootball;

import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyTeamEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPositionEntity;
import fr.univtln.nmartinez016.fantasyfootball.entities.CYourPlayerEntry;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 02/11/2016.
 */
public class CFantasyTeamTest extends TestCase {

    public final String ERROR_IN_EDIT_PLAYER_POSITION_OK_WITHOUT_SWAP = "error in edit player position ok without swap";
    public final String ERROR_IN_MOVE_PLAYER_IF_INITIAL_POSITION_OK_AND_SWAP = "error in edit player position if initial position ok and swap";
    public final String ERROR_IN_MOVE_PLAYER_IF_INITIAL_POSITION_OK_AND_NOT_SWAP = "error in edit player position if initial position ok and not swap";
    public final String ERROR_IN_MOVE_PLAYER_IF_PLAYER_NOT_IN_SQUAD = "error in move player if player not in squad";

    public final String ERROR_IN_PUT_PLAYER_IF_PLAYER_IN_SQUAD_AND_WITH_SWAP = "error in put player if player in squad and with swap";
    public final String ERROR_IN_PUT_PLAYER_IF_PLAYER_IN_SQUAD_AND_WITHOUT_SWAP = "error in put player if player in squad and without swap";
    public final String ERROR_IN_PUT_PLAYER_IF_PLAYER_NOT_IN_SQUAD = "error in put player if player not in squad";

    public void testEditPlayerPositionOkWithoutSwap() throws Exception {
        CPositionEntity lPosition1 = new CPositionEntity.CPositionBuilder().name("position1").build();
        CPositionEntity lPosition2 = new CPositionEntity.CPositionBuilder().name("position2").build();
        CYourPlayerEntry lYourPlayerEntry1 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("nomdefam").build()).position(lPosition1).build();
        List<CYourPlayerEntry> lYourPlayerEntries = new ArrayList<CYourPlayerEntry>();
        lYourPlayerEntries.add(lYourPlayerEntry1);

        CFantasyTeamEntity lFantasyTeam = new CFantasyTeamEntity.CFantasyTeamBuilder().yourPlayerEntries(lYourPlayerEntries).build();

        lFantasyTeam.editPlayerPosition(0, lPosition2);

        assertEquals(ERROR_IN_EDIT_PLAYER_POSITION_OK_WITHOUT_SWAP, lFantasyTeam.getYourPlayerEntries().get(0).getPosition(), lPosition2);

    }

    public void testMovePlayerIfInitialPositionOkAndSwap() throws Exception {
        CPositionEntity lPosition1 = new CPositionEntity.CPositionBuilder().name("position1").build();
        CPositionEntity lPosition2 = new CPositionEntity.CPositionBuilder().name("position2").build();
        CPositionEntity lPosition3 = new CPositionEntity.CPositionBuilder().name("position3").build();

        CYourPlayerEntry lYourPlayerEntry1 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("nomdefam").build()).position(lPosition1).build();
        CYourPlayerEntry lYourPlayerEntry2 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("jack").build()).position(lPosition2).build();

        List<CYourPlayerEntry> lYourPlayerEntries = new ArrayList<CYourPlayerEntry>();
        lYourPlayerEntries.add(lYourPlayerEntry1);
        lYourPlayerEntries.add(lYourPlayerEntry2);

        CFantasyTeamEntity lFantasyTeam = new CFantasyTeamEntity.CFantasyTeamBuilder().yourPlayerEntries(lYourPlayerEntries).build();

        assertEquals(ERROR_IN_MOVE_PLAYER_IF_INITIAL_POSITION_OK_AND_SWAP, lFantasyTeam.movePlayer(lPosition1, lPosition2), CFantasyTeamEntity.MOVE_PLAYER_SUCCESS_WITH_SWAP);
    }

    public void testMovePlayerIfInitialPositionOkAndNotSwap() throws Exception {
        CPositionEntity lPosition1 = new CPositionEntity.CPositionBuilder().name("position1").build();
        CPositionEntity lPosition2 = new CPositionEntity.CPositionBuilder().name("position2").build();
        CPositionEntity lPosition3 = new CPositionEntity.CPositionBuilder().name("position3").build();

        CYourPlayerEntry lYourPlayerEntry1 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("nomdefam").build()).position(lPosition1).build();
        CYourPlayerEntry lYourPlayerEntry2 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("jack").build()).position(lPosition2).build();

        List<CYourPlayerEntry> lYourPlayerEntries = new ArrayList<CYourPlayerEntry>();
        lYourPlayerEntries.add(lYourPlayerEntry1);
        lYourPlayerEntries.add(lYourPlayerEntry2);

        CFantasyTeamEntity lFantasyTeam = new CFantasyTeamEntity.CFantasyTeamBuilder().yourPlayerEntries(lYourPlayerEntries).build();

        assertEquals(ERROR_IN_MOVE_PLAYER_IF_INITIAL_POSITION_OK_AND_NOT_SWAP, lFantasyTeam.movePlayer(lPosition1, lPosition3), CFantasyTeamEntity.MOVE_PLAYER_SUCCESS_NO_SWAP);
    }

    public void testMovePlayerIfPlayerNotInSquad() throws Exception {
        CPositionEntity lPosition1 = new CPositionEntity.CPositionBuilder().name("position1").build();
        CPositionEntity lPosition2 = new CPositionEntity.CPositionBuilder().name("position2").build();
        CPositionEntity lPosition3 = new CPositionEntity.CPositionBuilder().name("position3").build();

        CYourPlayerEntry lYourPlayerEntry1 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("nomdefam").build()).position(lPosition1).build();
        CYourPlayerEntry lYourPlayerEntry2 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("jack").build()).position(lPosition2).build();

        List<CYourPlayerEntry> lYourPlayerEntries = new ArrayList<CYourPlayerEntry>();
        lYourPlayerEntries.add(lYourPlayerEntry2);

        CFantasyTeamEntity lFantasyTeam = new CFantasyTeamEntity.CFantasyTeamBuilder().yourPlayerEntries(lYourPlayerEntries).build();

        assertEquals(ERROR_IN_MOVE_PLAYER_IF_PLAYER_NOT_IN_SQUAD, lFantasyTeam.movePlayer(lPosition1, lPosition3), CFantasyTeamEntity.MOVE_PLAYER_FAILURE_PLAYER_NOT_IN_SQUAD);


    }

    public void testPutPlayerOnFieldWithPlayerOnTheTeamAndWithoutSwap() throws Exception {
        CPositionEntity lPosition1 = new CPositionEntity.CPositionBuilder().name("position1").build();
        CPositionEntity lPosition2 = new CPositionEntity.CPositionBuilder().name("position2").build();

        CYourPlayerEntry lYourPlayerEntry1 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("nomdefam").build()).build();
        CYourPlayerEntry lYourPlayerEntry2 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("jack").build()).position(lPosition2).build();

        List<CYourPlayerEntry> lYourPlayerEntries = new ArrayList<CYourPlayerEntry>();
        lYourPlayerEntries.add(lYourPlayerEntry1);
        lYourPlayerEntries.add(lYourPlayerEntry2);

        CFantasyTeamEntity lFantasyTeam = new CFantasyTeamEntity.CFantasyTeamBuilder().yourPlayerEntries(lYourPlayerEntries).build();
        assertEquals(ERROR_IN_PUT_PLAYER_IF_PLAYER_IN_SQUAD_AND_WITHOUT_SWAP, lFantasyTeam.putPlayerOnField(lYourPlayerEntry1.getPlayer(), lPosition1), CFantasyTeamEntity.PUT_PLAYER_SUCCESS_NO_SWAP);

    }

    public void testPutPlayerOnFieldWithPlayerOnTheTeamAndWithSwap() throws Exception {
        CPositionEntity lPosition1 = new CPositionEntity.CPositionBuilder().name("position1").build();
        CPositionEntity lPosition2 = new CPositionEntity.CPositionBuilder().name("position2").build();

        CYourPlayerEntry lYourPlayerEntry1 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("nomdefam").build()).build();
        CYourPlayerEntry lYourPlayerEntry2 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("jack").build()).position(lPosition2).build();

        List<CYourPlayerEntry> lYourPlayerEntries = new ArrayList<CYourPlayerEntry>();
        lYourPlayerEntries.add(lYourPlayerEntry1);
        lYourPlayerEntries.add(lYourPlayerEntry2);

        CFantasyTeamEntity lFantasyTeam = new CFantasyTeamEntity.CFantasyTeamBuilder().yourPlayerEntries(lYourPlayerEntries).build();
        assertEquals(ERROR_IN_PUT_PLAYER_IF_PLAYER_IN_SQUAD_AND_WITH_SWAP, lFantasyTeam.putPlayerOnField(lYourPlayerEntry1.getPlayer(), lPosition2), CFantasyTeamEntity.PUT_PLAYER_SUCCESS_WITH_SWAP);
        //assertTrue("", lYourPlayerEntries.get(1).getPosition() == null);
    }

    public void testPutPlayerOnFieldWithPlayerNotOnTheTeam() throws Exception {
        CPositionEntity lPosition1 = new CPositionEntity.CPositionBuilder().name("position1").build();
        CPositionEntity lPosition2 = new CPositionEntity.CPositionBuilder().name("position2").build();

        CYourPlayerEntry lYourPlayerEntry1 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("nomdefam").build()).position(lPosition1).build();
        CYourPlayerEntry lYourPlayerEntry2 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("jack").build()).position(lPosition2).build();

        List<CYourPlayerEntry> lYourPlayerEntries = new ArrayList<CYourPlayerEntry>();
        lYourPlayerEntries.add(lYourPlayerEntry2);

        CFantasyTeamEntity lFantasyTeam = new CFantasyTeamEntity.CFantasyTeamBuilder().yourPlayerEntries(lYourPlayerEntries).build();
        assertEquals(ERROR_IN_PUT_PLAYER_IF_PLAYER_NOT_IN_SQUAD, lFantasyTeam.putPlayerOnField(lYourPlayerEntry1.getPlayer(), lPosition2), CFantasyTeamEntity.PUT_PLAYER_FAILURE_PLAYER_NOT_IN_SQUAD);
    }

    public void testGetPlayerByPositionIfNoPlayerHasThisPosition() throws Exception {
        CPositionEntity lPosition1 = new CPositionEntity.CPositionBuilder().name("position1").build();
        CPositionEntity lPosition2 = new CPositionEntity.CPositionBuilder().name("position2").build();
        CYourPlayerEntry lYourPlayerEntry1 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("nomdefam").build()).position(lPosition1).build();
        List<CYourPlayerEntry> lYourPlayerEntries = new ArrayList<CYourPlayerEntry>();
        lYourPlayerEntries.add(lYourPlayerEntry1);
        CFantasyTeamEntity lFantasyTeam = new CFantasyTeamEntity.CFantasyTeamBuilder().yourPlayerEntries(lYourPlayerEntries).build();
        assertEquals("", lFantasyTeam.getPlayerByPosition(lPosition2), null);
    }

    public void testGetPlayerByPositionIfAPlayerHasThisPosition() throws Exception {
        CPositionEntity lPosition1 = new CPositionEntity.CPositionBuilder().name("position1").build();
        CPositionEntity lPosition2 = new CPositionEntity.CPositionBuilder().name("position2").build();
        CYourPlayerEntry lYourPlayerEntry1 = new CYourPlayerEntry.CYourPlayerEntryBuilder().player(new CPlayerEntity.CPlayerBuilder().lastName("nomdefam").build()).position(lPosition1).build();
        List<CYourPlayerEntry> lYourPlayerEntries = new ArrayList<CYourPlayerEntry>();
        lYourPlayerEntries.add(lYourPlayerEntry1);
        CFantasyTeamEntity lFantasyTeam = new CFantasyTeamEntity.CFantasyTeamBuilder().yourPlayerEntries(lYourPlayerEntries).build();
        assertEquals("", lFantasyTeam.getPlayerByPosition(lPosition1), lYourPlayerEntry1.getPlayer());
    }
}
