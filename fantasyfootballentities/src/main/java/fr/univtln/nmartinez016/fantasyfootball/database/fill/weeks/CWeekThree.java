package fr.univtln.nmartinez016.fantasyfootball.database.fill.weeks;

import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.database.CQueryParameter;
import fr.univtln.nmartinez016.fantasyfootball.entities.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 26/08/2016.
 */
public class CWeekThree {
    public static void main(String[] args) {
        CCrudMethods lCrudMethods = new CCrudMethods();
        CTeamEntity lNantes = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.NANTES).parameters())).get(0);
        CTeamEntity lDijon = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.DIJON).parameters())).get(0);
        CTeamEntity lLille = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.LOSC).parameters())).get(0);
        CTeamEntity lMetz = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.METZ).parameters())).get(0);
        CTeamEntity lAsse = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.ASSE).parameters())).get(0);
        CTeamEntity lBdx = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.BORDEAUX).parameters())).get(0);
        CTeamEntity lBastia = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.BASTIA).parameters())).get(0);
        CTeamEntity lParis = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.PSG).parameters())).get(0);
        CTeamEntity lMonaco = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.MONACO).parameters())).get(0);
        CTeamEntity lGuingamp = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.GUINGAMP).parameters())).get(0);
        CTeamEntity lMhsc = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.MHSC).parameters())).get(0);
        CTeamEntity lAngers = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.ANGERS).parameters())).get(0);
        CTeamEntity lCaen = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.CAEN).parameters())).get(0);
        CTeamEntity lLorient = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.LORIENT).parameters())).get(0);
        CTeamEntity lOm = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.OM).parameters())).get(0);
        CTeamEntity lToulouse = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.TOULOUSE).parameters())).get(0);
        CTeamEntity lNice = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.NICE).parameters())).get(0);
        CTeamEntity lRennes = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.RENNES).parameters())).get(0);
        CTeamEntity lOl = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.OL).parameters())).get(0);
        CTeamEntity lNancy = ((List<CTeamEntity>)lCrudMethods.findWithNamedQuery(CTeamEntity.GET_BY_NAME, CQueryParameter.with(CTeamEntity.PARAMETER_NAME, CConstants.NANCY).parameters())).get(0);

        List<CPlayerByGame> lPlayersOmVsLorient = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersDijonVsOl = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersNancyVsGuingamp = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersMhscVsRennes = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersNiceVsLille = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersCaenVsBastia = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersMetzVsAngers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersBdxVsNantes = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersAsseVsToulouse = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersMonacoVsPsg = new ArrayList<CPlayerByGame>();

        List<CGoalsByGame> lGoalsOmVsLorient = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsDijonVsOl = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsNancyVsGuingamp = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsMhscVsRennes = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsNiceVsLille = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsCaenVsBastia = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsMetzVsAngers = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsBdxVsNantes = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsAsseVsToulouse = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsMonacoVsPsg = new ArrayList<CGoalsByGame>();

        List<CAssistByGame> lAssistsOmVsLorient = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsDijonVsOl = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsNancyVsGuingamp = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsMhscVsRennes = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsNiceVsLille = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsCaenVsBastia = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsMetzVsAngers = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsBdxVsNantes = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsAsseVsToulouse = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsMonacoVsPsg = new ArrayList<CAssistByGame>();

        List<CYellowCardByGame> lYellowsOmVsLorient = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsDijonVsOl = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsNancyVsGuingamp = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsMhscVsRennes = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsNiceVsLille = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsCaenVsBastia = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsMetzVsAngers = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsBdxVsNantes = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsAsseVsToulouse = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsMonacoVsPsg = new ArrayList<CYellowCardByGame>();

        List<CPenaltyProvokedByGame> lPenaltiesProvokedDijonVsOl = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyConcededByGame> lPenaltiesConcededDijonVsOl = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltyScoredByGame> lPenaltiesScoredDijonVsOl = new ArrayList<CPenaltyScoredByGame>();

        List<CPenaltyProvokedByGame> lPenaltiesProvokedMonacoVsPsg = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyConcededByGame> lPenaltiesConcededMonacoVsPsg = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltyScoredByGame> lPenaltiesScoredMonacoVsPsg = new ArrayList<CPenaltyScoredByGame>();

        List<CPenaltyProvokedByGame> lPenaltiesProvokedNancyVsGuingamp = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyConcededByGame> lPenaltiesConcededNancyVsGuingamp = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltyMissedByGame> lPenaltiesMissedNancyVsGuingamp = new ArrayList<CPenaltyMissedByGame>();

        // GAME OM LORIENT

        for (CPlayerEntity lPlayer : lOm.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_PELE)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_SAKAI)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_HUBOCAN)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsOmVsLorient.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_DORIA)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_REKIK)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_DIARRA)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_MACHACH)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_THAUVIN)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_CABELLA)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsOmVsLorient.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lAssistsOmVsLorient.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_GOMIS)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsOmVsLorient.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_ISEKA)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_KHAOUI)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_ZAMBO)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_SARR)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

        }

        for (CPlayerEntity lPlayer : lLorient.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LECOMTE)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_KOFFI)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_ROSE)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LEGOFF)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_TOURE)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsOmVsLorient.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MESLOUB)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_CAFU)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_PHILIPPOTEAUX)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MOUKANDJO)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_FOFANA)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_WARIS)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_BARTHELME)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_CABOT)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_SELEMANI)){
                lPlayersOmVsLorient.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        CGameEntity lGameOmVsLorient = new CGameEntity.CGameBuilder().homeTeam(lOm).awayTeam(lLorient).homeScore(2).awayScore(0).players(lPlayersOmVsLorient).assisters(lAssistsOmVsLorient).yellowCards(lYellowsOmVsLorient).scorers(lGoalsOmVsLorient).week(3).build();
        lGameOmVsLorient.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameOmVsLorient);
            lCrudMethods.commitTransaction();
        }

        // GAME DIJON LYON

        for (CPlayerEntity lPlayer : lOl.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_OL_LOPES)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_MAPOU)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_NKOULOU)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsDijonVsOl.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesConcededDijonVsOl.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_RAFAEL)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_RYBUS)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_DARDER)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_GONALONS)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsDijonVsOl.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_TOLISSO)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsDijonVsOl.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_FEKIR)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsDijonVsOl.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_LACAZETTE)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsDijonVsOl.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_CORNET)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_FERRI)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_VALBUENA)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_GRENIER)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lDijon.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_REYNET)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_ABDELHAMID)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_RUFLI)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_CHAFIK)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_VARRAULT)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_MARIE)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsDijonVsOl.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BALMONT)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsDijonVsOl.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_SAMMARITANO)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsDijonVsOl.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
                lGoalsDijonVsOl.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesScoredDijonVsOl.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_AMALFITANO)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsDijonVsOl.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_DIONY)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_TAVARES)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsDijonVsOl.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesProvokedDijonVsOl.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BAHAMBOULA)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsDijonVsOl.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_LEESMELOU)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsDijonVsOl.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_GASTIEN)){
                lPlayersDijonVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        CGameEntity lGameDijonVsOl = new CGameEntity.CGameBuilder().week(3).homeTeam(lDijon).awayTeam(lOl).homeScore(4).awayScore(2).players(lPlayersDijonVsOl).scorers(lGoalsDijonVsOl).assisters(lAssistsDijonVsOl).yellowCards(lYellowsDijonVsOl).build();
        lGameDijonVsOl.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameDijonVsOl);
            lCrudMethods.commitTransaction();
        }

        // GAME NANCY GUINGAMP

        for (CPlayerEntity lPlayer : lNancy.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_NDYASSEMBE)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_LENGLET)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNancyVsGuingamp.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesProvokedNancyVsGuingamp.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_CUFFAUT)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_MURATORI)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_AITBENNASSER)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(78).build());
                lYellowsNancyVsGuingamp.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_ROBIC)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(63).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_COULIBALY)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(69).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_PUYO)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_PEDRETTI)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_CETOUT)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_HADJI)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesMissedNancyVsGuingamp.add(new CPenaltyMissedByGame.CPenaltyMissedByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_GUIDILEYE)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(12).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_MANDANNE)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(27).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_DALE)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(21).build());
            }
        }

        for (CPlayerEntity lPlayer : lGuingamp.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_JOHNSSON)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_IKOKO)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_MARCAL)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsNancyVsGuingamp.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(2).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SORBON)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_KERBRAT)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DIALLO)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsNancyVsGuingamp.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DEAUX)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(74).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_COCO)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNancyVsGuingamp.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_GIRESSE)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(83).build());
                lGoalsNancyVsGuingamp.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_PRIVAT)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(70).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SALIBUR)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_MANE)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(16).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_BLAS)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(7).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DEPAUW)){
                lPlayersNancyVsGuingamp.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(20).build());
                lPenaltiesConcededNancyVsGuingamp.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
        }

        CGameEntity lGameNancyVsEag = new CGameEntity.CGameBuilder().homeTeam(lNancy).awayTeam(lGuingamp).homeScore(0).awayScore(2).players(lPlayersNancyVsGuingamp).assisters(lAssistsNancyVsGuingamp).yellowCards(lYellowsNancyVsGuingamp).scorers(lGoalsNancyVsGuingamp).week(3).build();
        lGameNancyVsEag.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameNancyVsEag);
            lCrudMethods.commitTransaction();
        }

        // GAME MHSC RENNES

        for (CPlayerEntity lPlayer : lMhsc.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_JOURDREN)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_CONGRE)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsMhscVsRennes.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_HILTON)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_VANDENBORRE)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsMhscVsRennes.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_ROUSSILLON)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SANSON) && lPlayer.getFirstName().equals("morgan")){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_BOUDEBOUZ)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsMhscVsRennes.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SKHIRI)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_BERIGAUD)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(68).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_MOUNIE)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_NINGA)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(83).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_REMY)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(44).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_CAMARA)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(7).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SAIHI)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(22).build());
            }

        }

        for (CPlayerEntity lPlayer : lRennes.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_COSTIL)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_MEXER)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(65).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_MENDES)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsMhscVsRennes.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_BENSEBAINI)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_ANDRE)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsMhscVsRennes.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_DANZE)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_BAAL)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_HENRIQUE)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(53).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_GOURCUFF)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_SAID)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(84).build());
                lYellowsMhscVsRennes.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_SIO)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_FERNANDES)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(25).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_DIAKHABY)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(37).build());
                lGoalsMhscVsRennes.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_LENJANI)){
                lPlayersMhscVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(6).build());
            }
        }

        CGameEntity lGameMhscVsRennes = new CGameEntity.CGameBuilder().homeTeam(lMhsc).awayTeam(lRennes).homeScore(1).awayScore(1).players(lPlayersMhscVsRennes).assisters(lAssistsMhscVsRennes).yellowCards(lYellowsMhscVsRennes).scorers(lGoalsMhscVsRennes).week(3).build();
        lGameMhscVsRennes.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameMhscVsRennes);
            lCrudMethods.commitTransaction();
        }

        // GAME NICE LILLE

        for (CPlayerEntity lPlayer : lNice.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NICE_CARDINALE)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BAYSSE)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_PEREIRA)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BODMER)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(70).build());
                lYellowsNiceVsLille.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_CYPRIEN)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_HENRIQUE)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNiceVsLille.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_SARR)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_SERI)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_EYSSERIC)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_KOZIELLO)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsNiceVsLille.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_PLEA)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_WALTER)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(20).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_LUSAMBA)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(1).build());
            }
        }

        for (CPlayerEntity lPlayer : lLille.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_ENEYAMA)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_CORCHIA)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_CIVELLI)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BERIA)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(83).build());
                lGoalsNiceVsLille.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lYellowsNiceVsLille.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_SOUMAORO)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_SANKHARE)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_AMADOU)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNiceVsLille.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_AMALFITANO)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BAUTHEAC)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(70).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BENZIA)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(83).build());
                lAssistsNiceVsLille.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_EDER)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_PALMIERI)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(7).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_DEPREVILLE)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(20).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_MENDES)){
                lPlayersNiceVsLille.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(7).build());
            }
        }

        CGameEntity lGameNiceVsLosc = new CGameEntity.CGameBuilder().homeTeam(lNice).awayTeam(lLille).homeScore(1).awayScore(0).players(lPlayersNiceVsLille).assisters(lAssistsNiceVsLille).yellowCards(lYellowsNiceVsLille).scorers(lGoalsNiceVsLille).week(3).build();
        lGameNiceVsLosc.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameNiceVsLosc);
            lCrudMethods.commitTransaction();
        }

        // GAME CAEN BASTIA

        for (CPlayerEntity lPlayer : lCaen.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_VERCOUTRE)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_SEUBE)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BENYOUSSEF)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsCaenVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DASILVA)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_GENEVOIS)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DELAPLACE)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_FERET)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsCaenVsBastia.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_KARAMOH)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BESSAT)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_RODELIN)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsCaenVsBastia.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(2).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_SANTINI)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_YAHIA)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BAZILE)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsCaenVsBastia.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_SANE)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lBastia.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_LECA)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_SQUILLACI)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsCaenVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_PEYBERNES)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_DJIKU)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_MARANGE)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsCaenVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_DANIC)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_MOSTEFA)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsCaenVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CAHUZAC)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_STMAXIMIN)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_BIFOUMA)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsCaenVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CRIVELLI)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsCaenVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_NANGIS)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_NGANDO)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CABRAL)){
                lPlayersCaenVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        CGameEntity lGameCaenVsBastia = new CGameEntity.CGameBuilder().homeTeam(lCaen).awayTeam(lBastia).homeScore(2).awayScore(0).players(lPlayersCaenVsBastia).assisters(lAssistsCaenVsBastia).yellowCards(lYellowsCaenVsBastia).scorers(lGoalsCaenVsBastia).week(3).build();
        lGameCaenVsBastia.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameCaenVsBastia);
            lCrudMethods.commitTransaction();
        }

        // GAME METZ ANGERS

        for (CPlayerEntity lPlayer : lMetz.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DIDILLON)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_RIVIEREZ)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MILAN)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsMetzVsAngers.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_FALETTE)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsMetzVsAngers.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_SIGNORINO)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
                lYellowsMetzVsAngers.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DOUKOURE)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsMetzVsAngers.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MANDJECK)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_NGUETTE)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MOLLET)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(57).build());
                lAssistsMetzVsAngers.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_COHADE)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsMetzVsAngers.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_ERDING)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(69).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_ASSOUEKOTTO)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_SARR)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(33).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DIALLO)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(21).build());
            }
        }

        for (CPlayerEntity lPlayer : lAngers.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MICHEL)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_ANDREU)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_TRAORE)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MARTINEZ)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(76).build());
                lYellowsMetzVsAngers.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_THOMAS)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MANGANI)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(76).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_KETKEO)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsMetzVsAngers.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_NDOYE)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_SANTAMARIA)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_TOKOEKAMBI)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_SUNU)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(63).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MANCEAU)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(14).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_DIEDHIOU)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(14).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_PEPE)){
                lPlayersMetzVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(27).build());
            }
        }

        CGameEntity lGameMetzVsAngers = new CGameEntity.CGameBuilder().homeTeam(lMetz).awayTeam(lAngers).homeScore(2).awayScore(0).players(lPlayersMetzVsAngers).assisters(lAssistsMetzVsAngers).yellowCards(lYellowsMetzVsAngers).scorers(lGoalsMetzVsAngers).week(3).build();
        lGameMetzVsAngers.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameMetzVsAngers);
            lCrudMethods.commitTransaction();
        }

        // GAME BDX NANTES

        for (CPlayerEntity lPlayer : lBdx.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_CARRASSO)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_SABALY)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsBdxVsNantes.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_POUNDJE)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_TOULALAN)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(48).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_SERTIC)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_PLASIL)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_VADA)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_MENEZ)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(80).build());
                lAssistsBdxVsNantes.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_TOURE)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(74).build());
                lYellowsBdxVsNantes.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_MALCOLM)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_ROLAN)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsBdxVsNantes.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_GUILBERT)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(42).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_ARAMBARRI)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(10).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_LABORDE)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(16).build());
            }
        }

        for (CPlayerEntity lPlayer : lNantes.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_RIOU)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_DUBOIS)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_VIZCARRONDO)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_CARLOS)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsBdxVsNantes.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_LIMA)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_GILLET)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_RONGIER)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_HARIT)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_KACANIKLIC)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_THOMSEN)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(81).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_SIGTHORSSON)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(86).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_BAMMOU)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(44).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_ALEGUE)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(9).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_ARISTEGUIETA)){
                lPlayersBdxVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(4).build());
            }
        }

        CGameEntity lGameBdxVsNantes = new CGameEntity.CGameBuilder().homeTeam(lBdx).awayTeam(lNantes).homeScore(1).awayScore(0).players(lPlayersBdxVsNantes).assisters(lAssistsBdxVsNantes).yellowCards(lYellowsBdxVsNantes).scorers(lGoalsBdxVsNantes).week(3).build();
        lGameBdxVsNantes.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameBdxVsNantes);
            lCrudMethods.commitTransaction();
        }

        // GAME ASSE TOULOUSE

        for (CPlayerEntity lPlayer : lAsse.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_RUFFIER)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_KTC)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_POGBA)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_MALCUIT)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_PIERREGABRIEL)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsAsseVsToulouse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_PAJOT)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(80).build());
                lYellowsAsseVsToulouse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_TANNANE)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_SAIVET)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(82).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_SELNAES)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_KMP)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(70).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_BERIC)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_VERETOUT)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(10).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_ROUX)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(8).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_LEMOINE)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(20).build());
            }
        }

        for (CPlayerEntity lPlayer : lToulouse.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_LAFONT)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_DIOP)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_JULLIEN)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_SYLLA)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(72).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_YAGO)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_MOUBANDJE)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_TREJO)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(83).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_SOMALIA)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BLIN)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_TOIVONEN)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(59).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_EDOUARD)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_DURMAZ)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(18).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BODIGER)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(7).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_PI)){
                lPlayersAsseVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(31).build());
            }
        }

        CGameEntity lGameAsseVsToulouse = new CGameEntity.CGameBuilder().week(3).homeTeam(lAsse).awayTeam(lToulouse).homeScore(0).awayScore(0).players(lPlayersAsseVsToulouse).scorers(lGoalsAsseVsToulouse).assisters(lAssistsAsseVsToulouse).yellowCards(lYellowsAsseVsToulouse).build();
        lGameAsseVsToulouse.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameAsseVsToulouse);
            lCrudMethods.commitTransaction();
        }

        // GAME MONACO PSG

        for (CPlayerEntity lPlayer : lMonaco.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_SUBASIC)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_SIDIBE)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsMonacoVsPsg.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_GLIK)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_RAGGI)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_MENDY)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_JEMERSON)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesProvokedMonacoVsPsg.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_FABINHO)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsMonacoVsPsg.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesScoredMonacoVsPsg.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_BAKAYOKO)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsMonacoVsPsg.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_MOUTINHO)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsMonacoVsPsg.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_GERMAIN)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(78).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_BERNARDO)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_BOSCHILIA)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_DIRAR)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(12).build());
            }
        }

        for (CPlayerEntity lPlayer : lParis.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_PSG_TRAPP)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_AURIER)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsMonacoVsPsg.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_LUIZ)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(62).build());
                lYellowsMonacoVsPsg.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesConcededMonacoVsPsg.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_KIMPEMBE)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_KURZAWA)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_RABIOT)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MOTTA)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_VERRATTI)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(70).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_LUCAS)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(81).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_DIMARIA)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_CAVANI)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsMonacoVsPsg.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lGoalsMonacoVsPsg.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MEUNIER)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(28).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MATUIDI)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(20).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_BENARFA)){
                lPlayersMonacoVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(9).build());
            }
        }

        CGameEntity lGameMonacoVsPsg = new CGameEntity.CGameBuilder().homeTeam(lMonaco).awayTeam(lParis).homeScore(3).awayScore(1).scorers(lGoalsMonacoVsPsg).assisters(lAssistsMonacoVsPsg).yellowCards(lYellowsMonacoVsPsg).players(lPlayersMonacoVsPsg).week(3).build();
        lGameMonacoVsPsg.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameMonacoVsPsg);
            lCrudMethods.commitTransaction();
        }


















    }
}
