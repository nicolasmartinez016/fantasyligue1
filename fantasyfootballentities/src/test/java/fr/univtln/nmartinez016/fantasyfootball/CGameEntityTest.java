package fr.univtln.nmartinez016.fantasyfootball;

import fr.univtln.nmartinez016.fantasyfootball.entities.*;
import junit.framework.TestCase;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 03/11/2016.
 */
public class CGameEntityTest extends TestCase {
    public final String ERROR_IN_ADD_POINTS_BY_WEEK_LIST_STAYS_NULL = "error in add points by week list stays null";
    public final String ERROR_IN_ADD_POINTS_BY_WEEK_NEW_SIZE = "error in add points by week new size";
    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_60_MINUTES_OR_MORE = "error in attribute points player 60 minutes or more";
    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_LESS_THAN_60_MINUTES = "error in attribute points player less than 60 minutes";
    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_1_GOAL_PLAYING_60_MINUTES_OR_MORE = "error in attribute points player forward scoring 1 goal playing 60 minutes or more";
    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_2_GOALS_PLAYING_60_MINUTES_OR_MORE = "error in attribute points player forward scoring 2 goals playing 60 minutes or more";
    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_3_GOALS_PLAYING_60_MINUTES_OR_MORE = "error in attribute points player scoring 3 goals playing 60 minutes or more";
    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_4_GOALS_PLAYING_60_MINUTES_OR_MORE = "error in attribute points player scoring 4 goals playing 60 minutes or more";
    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_1_GOAL_PLAYING_LESS_THAN_60_MINUTES = "error in attribute points player forward scoring 1 goal playing less than 60 minutes";
    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_2_GOALS_PLAYING_LESS_THAN_60_MINUTES = "error in attribute points player forward scoring 2 goal playing less than 60 minutes";
    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_3_GOALS_PLAYING_LESS_THAN_60_MINUTES = "error in attribute points player forward scoring 3 goal playing less than 60 minutes";
    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_4_GOALS_PLAYING_LESS_THAN_60_MINUTES = "error in attribute points player forward scoring 4 goal playing less than 60 minutes";

    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_1_YELLOW_CARD_PLAYING_60_MINUTES_OR_MORE = "error in attribute points player with 1 yellow card playing 60 minutes or more";
    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_1_YELLOW_CARD_PLAYING_LESS_THAN_60_MINUTES = "error in attribute points player with 1 yellow card playing less than 60 minutes";

    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_STRAIGHT_RED_PLAYING_LESS_THAN_60_MINUTES = "error in attribute points player with straight red playing less than 60 minutes";
    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_STRAIGHT_RED_PLAYING_60_MINUTES_OR_MORE = "error in attribute points player with straight red playing less than 60 minutes";

    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_STRAIGHT_RED_AFTER_A_YELLOW_PLAYING_LESS_THAN_60_MINUTES = "error in attribute points player with straight red after a yellow playing less than 60 minutes";
    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_STRAIGHT_RED_AFTER_A_YELLOW_PLAYING_60_MINUTES_OR_MORE = "error in attribute points player with straight red after a yellow playing less than 60 minutes";

    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_A_RED_AFTER_TWO_YELLOWS_PLAYING_60_MINUTES_OR_MORE = "error in attribute points player with a red after two yellows playing 60 minutes or more";
    public final String ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_A_RED_AFTER_TWO_YELLOWS_PLAYING_LESS_THAN_60_MINUTES = "error in attribute points player wit ha red after two yellows playing less than 60 minutes";

    public void testAddPointsByWeekWithInitialListNull() throws Exception {
        CGameEntity lGame = new CGameEntity();
        lGame.addPointsByWeek(new CPointsByWeek.CPointsByWeekBuilder().week(1).build());
        assertTrue(ERROR_IN_ADD_POINTS_BY_WEEK_LIST_STAYS_NULL, lGame.getPointsByWeek() != null);
    }

    public void testAddPointsByWeekNewSize() throws Exception {
        CGameEntity lGame = new CGameEntity();
        lGame.addPointsByWeek(new CPointsByWeek.CPointsByWeekBuilder().week(1).build());
        assertEquals(ERROR_IN_ADD_POINTS_BY_WEEK_NEW_SIZE, lGame.getPointsByWeek().size(), 1);
    }

    public void testAttributePointsPlayerLessThan60Minutes() throws Exception {
        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();

        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).build();
        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(60).endMinute(90).build();
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        lPlayersByGame.add(lPlayer1ByGame);
        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).build();
        lGame.attributePoints();
        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_LESS_THAN_60_MINUTES, lPlayer1.getPointsByWeekAt(1), 1);

    }

    public void testAttributePointsPlayer60MinutesOrMore() throws Exception {
        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();

        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).build();
        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(0).endMinute(90).build();
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        lPlayersByGame.add(lPlayer1ByGame);
        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).build();
        lGame.attributePoints();
        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_60_MINUTES_OR_MORE, lPlayer1.getPointsByWeekAt(1), 3);
    }

    public void testAttributePointsPlayerForwardScoring1GoalPlaying60MinutesOrMore() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CGoalsByGame> lGoalsByGame = new ArrayList<CGoalsByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();

        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);

        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();
        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(0).endMinute(90).build();
        CGoalsByGame lGoalByGame = new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer1).quantity(1).build();
        lPlayersByGame.add(lPlayer1ByGame);
        lGoalsByGame.add(lGoalByGame);
        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).scorers(lGoalsByGame).build();
        lGame.attributePoints();
        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_1_GOAL_PLAYING_60_MINUTES_OR_MORE, lPlayer1.getPointsByWeekAt(1), 7);
    }

    public void testAttributePointsPlayerForwardScoring1GoalPlayingLessThan60Minutes() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CGoalsByGame> lGoalsByGame = new ArrayList<CGoalsByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();

        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);

        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();
        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(40).endMinute(90).build();
        CGoalsByGame lGoalByGame = new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer1).quantity(1).build();
        lPlayersByGame.add(lPlayer1ByGame);
        lGoalsByGame.add(lGoalByGame);
        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).scorers(lGoalsByGame).build();
        lGame.attributePoints();
        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_1_GOAL_PLAYING_LESS_THAN_60_MINUTES, lPlayer1.getPointsByWeekAt(1), 5);
    }

    public void testAttributePointsPlayerForwardScoring2GoalsPlaying60MinutesOrMore() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CGoalsByGame> lGoalsByGame = new ArrayList<CGoalsByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();

        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);

        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();
        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(0).endMinute(90).build();
        CGoalsByGame lGoalByGame = new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer1).quantity(2).build();
        lPlayersByGame.add(lPlayer1ByGame);
        lGoalsByGame.add(lGoalByGame);
        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).scorers(lGoalsByGame).build();
        lGame.attributePoints();
        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_2_GOALS_PLAYING_60_MINUTES_OR_MORE, lPlayer1.getPointsByWeekAt(1), 11);
    }

    public void testAttributePointsPlayerForwardScoring2GoalsPlayingLessThan60Minutes() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CGoalsByGame> lGoalsByGame = new ArrayList<CGoalsByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();

        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);

        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();
        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(40).endMinute(90).build();
        CGoalsByGame lGoalByGame = new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer1).quantity(2).build();
        lPlayersByGame.add(lPlayer1ByGame);
        lGoalsByGame.add(lGoalByGame);
        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).scorers(lGoalsByGame).build();
        lGame.attributePoints();
        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_2_GOALS_PLAYING_LESS_THAN_60_MINUTES, lPlayer1.getPointsByWeekAt(1), 9);
    }

    public void testAttributePointsPlayerForwardScoring3GoalsPlaying60MinutesOrMore() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CGoalsByGame> lGoalsByGame = new ArrayList<CGoalsByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();

        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);

        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();
        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(0).endMinute(90).build();
        CGoalsByGame lGoalByGame = new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer1).quantity(3).build();
        lPlayersByGame.add(lPlayer1ByGame);
        lGoalsByGame.add(lGoalByGame);
        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).scorers(lGoalsByGame).build();
        lGame.attributePoints();
        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_3_GOALS_PLAYING_60_MINUTES_OR_MORE, lPlayer1.getPointsByWeekAt(1), 15);
    }

    public void testAttributePointsPlayerForwardScoring3GoalsPlayingLessThan60Minutes() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CGoalsByGame> lGoalsByGame = new ArrayList<CGoalsByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();

        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);

        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();
        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(40).endMinute(90).build();
        CGoalsByGame lGoalByGame = new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer1).quantity(3).build();
        lPlayersByGame.add(lPlayer1ByGame);
        lGoalsByGame.add(lGoalByGame);
        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).scorers(lGoalsByGame).build();
        lGame.attributePoints();
        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_3_GOALS_PLAYING_LESS_THAN_60_MINUTES, lPlayer1.getPointsByWeekAt(1), 13);
    }

    public void testAttributePointsPlayerForwardScoring4GoalsPlaying60MinutesOrMore() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CGoalsByGame> lGoalsByGame = new ArrayList<CGoalsByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();

        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);

        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();
        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(0).endMinute(90).build();
        CGoalsByGame lGoalByGame = new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer1).quantity(4).build();
        lPlayersByGame.add(lPlayer1ByGame);
        lGoalsByGame.add(lGoalByGame);
        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).scorers(lGoalsByGame).build();
        lGame.attributePoints();
        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_4_GOALS_PLAYING_60_MINUTES_OR_MORE, lPlayer1.getPointsByWeekAt(1), 19);
    }

    public void testAttributePointsPlayerForwardScoring4GoalsPlayingLessThan60Minutes() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CGoalsByGame> lGoalsByGame = new ArrayList<CGoalsByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();

        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);

        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();
        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(40).endMinute(90).build();
        CGoalsByGame lGoalByGame = new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer1).quantity(4).build();
        lPlayersByGame.add(lPlayer1ByGame);
        lGoalsByGame.add(lGoalByGame);
        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).scorers(lGoalsByGame).build();
        lGame.attributePoints();
        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_FORWARD_SCORING_4_GOALS_PLAYING_LESS_THAN_60_MINUTES, lPlayer1.getPointsByWeekAt(1), 17);
    }

    public void testAttributePointsPlayer1YellowCardPlayingLessThan60Minutes() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();
        List<CYellowCardByGame> lYellowCardsByGame = new ArrayList<CYellowCardByGame>();

        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);


        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();

        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(40).endMinute(90).build();
        CYellowCardByGame lPlayer1YellowCards = new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer1).quantity(1).build();

        lPlayersByGame.add(lPlayer1ByGame);
        lYellowCardsByGame.add(lPlayer1YellowCards);

        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).yellowCards(lYellowCardsByGame).build();
        lGame.attributePoints();

        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_1_YELLOW_CARD_PLAYING_LESS_THAN_60_MINUTES, lPlayer1.getPointsByWeekAt(1), 0);
    }


    public void testAttributePointsPlayer1YellowCardPlaying60MinutesOrMore() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();
        List<CYellowCardByGame> lYellowCardsByGame = new ArrayList<CYellowCardByGame>();

        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);


        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();

        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(0).endMinute(90).build();
        CYellowCardByGame lPlayer1YellowCards = new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer1).quantity(1).build();

        lPlayersByGame.add(lPlayer1ByGame);
        lYellowCardsByGame.add(lPlayer1YellowCards);

        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).yellowCards(lYellowCardsByGame).build();
        lGame.attributePoints();
        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_1_YELLOW_CARD_PLAYING_60_MINUTES_OR_MORE, lPlayer1.getPointsByWeekAt(1), 2);
    }

    public void testAttributePointsPlayerWithStraightRedCardPlayingLessThan60Minutes() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();
        List<CRedCardByGame> lRedCardsByGame = new ArrayList<CRedCardByGame>();

        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);


        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();

        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(40).endMinute(90).build();
        CRedCardByGame lPlayer1RedCards = new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer1).quantity(1).build();

        lPlayersByGame.add(lPlayer1ByGame);
        lRedCardsByGame.add(lPlayer1RedCards);

        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).redCards(lRedCardsByGame).build();
        lGame.attributePoints();

        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_STRAIGHT_RED_PLAYING_LESS_THAN_60_MINUTES, lPlayer1.getPointsByWeekAt(1), -2);
    }


    public void testAttributePointsPlayerWithStraightCardPlaying60MinutesOrMore() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();
        List<CRedCardByGame> lRedCardsByGame = new ArrayList<CRedCardByGame>();

        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);


        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();

        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(0).endMinute(90).build();
        CRedCardByGame lPlayer1RedCards = new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer1).quantity(1).build();

        lPlayersByGame.add(lPlayer1ByGame);
        lRedCardsByGame.add(lPlayer1RedCards);

        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).redCards(lRedCardsByGame).build();
        lGame.attributePoints();
        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_STRAIGHT_RED_PLAYING_60_MINUTES_OR_MORE, lPlayer1.getPointsByWeekAt(1), 0);
    }

    public void testAttributePointsPlayerWithStraightRedAfterAYellowCardPlayingLessThan60Minutes() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();
        List<CRedCardByGame> lRedCardsByGame = new ArrayList<CRedCardByGame>();
        List<CYellowCardByGame> lYellowCardsByGame = new ArrayList<CYellowCardByGame>();

        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);


        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();

        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(40).endMinute(90).build();
        CRedCardByGame lPlayer1RedCards = new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer1).quantity(1).build();
        CYellowCardByGame lPlayer1YellowCard = new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer1).quantity(1).build();

        lPlayersByGame.add(lPlayer1ByGame);
        lRedCardsByGame.add(lPlayer1RedCards);
        lYellowCardsByGame.add(lPlayer1YellowCard);

        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).redCards(lRedCardsByGame).yellowCards(lYellowCardsByGame).build();
        lGame.attributePoints();

        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_STRAIGHT_RED_AFTER_A_YELLOW_PLAYING_LESS_THAN_60_MINUTES, lPlayer1.getPointsByWeekAt(1), -3);
    }


    public void testAttributePointsPlayerWithStraightCardAfterAYellowPlaying60MinutesOrMore() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();
        List<CRedCardByGame> lRedCardsByGame = new ArrayList<CRedCardByGame>();
        List<CYellowCardByGame> lYellowCardsByGame = new ArrayList<CYellowCardByGame>();

        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);


        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();

        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(0).endMinute(90).build();
        CRedCardByGame lPlayer1RedCards = new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer1).quantity(1).build();
        CYellowCardByGame lPlayer1YellowCard = new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer1).quantity(1).build();

        lPlayersByGame.add(lPlayer1ByGame);
        lRedCardsByGame.add(lPlayer1RedCards);
        lYellowCardsByGame.add(lPlayer1YellowCard);

        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).redCards(lRedCardsByGame).yellowCards(lYellowCardsByGame).build();
        lGame.attributePoints();
        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_STRAIGHT_RED_AFTER_A_YELLOW_PLAYING_60_MINUTES_OR_MORE, lPlayer1.getPointsByWeekAt(1), -1);
    }

    public void testAttributePointsPlayerWithARedAfterTwoYellowCardsPlayingLessThan60Minutes() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();
        List<CRedCardByGame> lRedCardsByGame = new ArrayList<CRedCardByGame>();
        List<CYellowCardByGame> lYellowCardsByGame = new ArrayList<CYellowCardByGame>();

        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);


        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();

        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(40).endMinute(90).build();
        CRedCardByGame lPlayer1RedCards = new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer1).quantity(1).build();
        CYellowCardByGame lPlayer1YellowCard = new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer1).quantity(1).build();

        lPlayersByGame.add(lPlayer1ByGame);
        lRedCardsByGame.add(lPlayer1RedCards);
        lYellowCardsByGame.add(lPlayer1YellowCard);

        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).redCards(lRedCardsByGame).yellowCards(lYellowCardsByGame).build();
        lGame.attributePoints();

        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_A_RED_AFTER_TWO_YELLOWS_PLAYING_LESS_THAN_60_MINUTES, lPlayer1.getPointsByWeekAt(1), -3);
    }


    public void testAttributePointsPlayerWithARedCardAfterTwoYellowsPlaying60MinutesOrMore() throws Exception {
        List<CPlayerByGame> lPlayersByGame = new ArrayList<CPlayerByGame>();
        List<CPositionEntity> lPlayer1Positions = new ArrayList<CPositionEntity>();
        List<CRedCardByGame> lRedCardsByGame = new ArrayList<CRedCardByGame>();
        List<CYellowCardByGame> lYellowCardsByGame = new ArrayList<CYellowCardByGame>();

        CPositionEntity lStriker = new CPositionEntity.CPositionBuilder().name("st").forward().build();
        lPlayer1Positions.add(lStriker);


        CTeamEntity lHomeTeam = new CTeamEntity.CTeamBuilder().name("equipe1").build();
        CTeamEntity lAwayTeam = new CTeamEntity.CTeamBuilder().name("equipe2").build();
        CPlayerEntity lPlayer1 = new CPlayerEntity.CPlayerBuilder().team(lHomeTeam).positions(lPlayer1Positions).build();

        CPlayerByGame lPlayer1ByGame = new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer1).startMinute(0).endMinute(90).build();
        CRedCardByGame lPlayer1RedCards = new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer1).quantity(1).build();
        CYellowCardByGame lPlayer1YellowCards = new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer1).quantity(2).build();

        lPlayersByGame.add(lPlayer1ByGame);
        lRedCardsByGame.add(lPlayer1RedCards);
        lYellowCardsByGame.add(lPlayer1YellowCards);

        CGameEntity lGame = new CGameEntity.CGameBuilder().week(1).homeTeam(lHomeTeam).awayTeam(lAwayTeam).players(lPlayersByGame).redCards(lRedCardsByGame).yellowCards(lYellowCardsByGame).build();
        lGame.attributePoints();
        assertEquals(ERROR_IN_ATTRIBUTE_POINTS_PLAYER_WITH_A_RED_AFTER_TWO_YELLOWS_PLAYING_60_MINUTES_OR_MORE, lPlayer1.getPointsByWeekAt(1), -2);
    }
}
