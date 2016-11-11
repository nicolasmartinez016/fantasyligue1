package fr.univtln.nmartinez016.fantasyfootball.database.fill.weeks;

import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.database.CQueryParameter;
import fr.univtln.nmartinez016.fantasyfootball.entities.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 21/09/2016.
 */
public class CWeekSix implements Serializable {

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

        List<CPlayerByGame> lLoscVsToulousePlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPsgVsDijonPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lAngersVsCaenPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lBastiaVsNancyPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lGuingampVsLorientPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lLyonVsMontpelPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lMetzVsBdxPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lNantesVsAssePlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lNiceVsMonacoPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lRennesVsMarseillePlayers = new ArrayList<CPlayerByGame>();

        List<CGoalsByGame> lLoscVsToulouseGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lPsgVsDijonGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lAngersVsCaenGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lBastiaVsNancyGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGuingampVsLorientGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lLyonVsMontpelGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lMetzVsBdxGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lNantesVsAsseGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lNiceVsMonacoGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lRennesVsMarseilleGoals = new ArrayList<CGoalsByGame>();

        List<CAssistByGame> lLoscVsToulouseAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lPsgVsDijonAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAngersVsCaenAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lBastiaVsNancyAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lGuingampVsLorientAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lLyonVsMontpelAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lMetzVsBdxAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lNantesVsAsseAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lNiceVsMonacoAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lRennesVsMarseilleAssists = new ArrayList<CAssistByGame>();

        List<CYellowCardByGame> lLoscVsToulouseYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lPsgVsDijonYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lAngersVsCaenYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lBastiaVsNancyYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lGuingampVsLorientYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lLyonVsMontpelYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lMetzVsBdxYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lNantesVsAsseYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lNiceVsMonacoYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lRennesVsMarseilleYellowCards = new ArrayList<CYellowCardByGame>();


        // game losc vs toulouse

        for (CPlayerEntity lPlayer : lLille.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_ENEYAMA)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_CORCHIA)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_SOUMAORO)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BASA)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_SANKHARE)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BAUTHEAC)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(64).build());
                lLoscVsToulouseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_PALMIERI)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_LOPES)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_MAVUBA)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(81).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_DEPREVILLE)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(64).endMinute(90).build());
                lLoscVsToulouseAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BISSOUMA)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lLoscVsToulouseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_SLITI)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(64).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_MENDES)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(81).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_EDER)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(64).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lToulouse.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_LAFONT)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_DIOP)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lLoscVsToulouseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lLoscVsToulouseAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_JULLIEN)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_SYLLA)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lLoscVsToulouseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_YAGO)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lLoscVsToulouseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_MOUBANDJE)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lLoscVsToulouseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_DURMAZ)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BODIGER)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BLIN)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_TOIVONEN)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lLoscVsToulouseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lLoscVsToulouseGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(2).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_EDOUARD)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_MICHELIN)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_CAFARO)){
                lLoscVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

        }

        CGameEntity lGameLoscVsToulouse = new CGameEntity.CGameBuilder().homeTeam(lLille).awayTeam(lToulouse).homeScore(1).awayScore(2).scorers(lLoscVsToulouseGoals).assisters(lLoscVsToulouseAssists).yellowCards(lLoscVsToulouseYellowCards).build();
        lGameLoscVsToulouse.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameLoscVsToulouse);
            lCrudMethods.commitTransaction();
        }

        // game psg vs dijon

        for (CPlayerEntity lPlayer : lParis.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_PSG_AREOLA)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_SILVA)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_KIMPEMBE)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPsgVsDijonYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MEUNIER)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(65).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MAXWELL)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPsgVsDijonAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_LUCAS)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPsgVsDijonGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MOTTA)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_PASTORE)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_RABIOT)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_CAVANI)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(80).build());
                lPsgVsDijonGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(2).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_DIMARIA)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(72).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MARQUINHOS)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(65).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_AUGUSTIN)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(80).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MATUIDI)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(72).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lDijon.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_REYNET)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_LANG)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_LOTIES)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_ABDELHAMID)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BOUKAMOUTOU)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_CHAFIK)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_LEESMELOU)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_MARIE)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_ABEID)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_GASTIEN)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BAHAMBOULA)){
                lPsgVsDijonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

        }

        CGameEntity lGamePsgVsDijon = new CGameEntity.CGameBuilder().homeTeam(lParis).awayTeam(lDijon).homeScore(3).awayScore(0).scorers(lPsgVsDijonGoals).assisters(lPsgVsDijonAssists).yellowCards(lPsgVsDijonYellowCards).build();
        lGamePsgVsDijon.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGamePsgVsDijon);
            lCrudMethods.commitTransaction();
        }

        // angers vs caen

        for (CPlayerEntity lPlayer : lAngers.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MICHEL)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_ANDREU)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_PAVLOVIC)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_THOMAS)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MANGANI)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_KETKEO)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_NDOYE)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_SANTAMARIA)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MANCEAU)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_TOKOEKAMBI)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_DIEDHIOU)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_DORE)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_CAPELLE)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_PEPE)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lCaen.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_VERCOUTRE)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_YAHIA)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_IMOROU)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DASILVA)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_GENEVOIS)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DIOMANDE)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DELAPLACE)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BESSAT)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_FERET)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_RODELIN)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_SANTINI)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_ADEOTI)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_KARAMOH)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_SANE)){
                lAngersVsCaenPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }


        }

        // bastia vs nancy

        for (CPlayerEntity lPlayer : lBastia.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_LECA)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_SQUILLACI)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_PEYBERNES)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_BENGTSSON)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CIONI)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_DIALLO)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CAHUZAC)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_COULIBALY)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_STMAXIMIN)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_NANGIS)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CRIVELLI)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CABRAL)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_BIFOUMA)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lNancy.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_NDYASSEMBE)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_LENGLET)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_BADILA)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_CHRETIEN)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_CABACO)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_CETOUT)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_AITBENNASSER)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_MARCHETTI)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_DALE)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_MANDANNE)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_KOURA)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_HADJI)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_DIA)){
                lBastiaVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        // guingamp vs lorient

        for (CPlayerEntity lPlayer : lGuingamp.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SALIN)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_IKOKO)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_MARCAL)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SORBON)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_KERBRAT)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DIALLO)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DEAUX)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_BLAS)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_PRIVAT)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SALIBUR)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_BRIAND)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SANKOH)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_COCO)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_MANE)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }


        }

        for (CPlayerEntity lPlayer : lLorient.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LECOMTE)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_TOURE)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_BELLUGOU)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MOREIRA)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LEGOFF)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_KOFFI)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MVUEMBA)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MESLOUB)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_PHILIPPOTEAUX)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MARA)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MOUKANDJO)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_FOFANA)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_SELEMANI)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_CABOT)){
                lGuingampVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }


        }

        // lyon vs montpel

        for (CPlayerEntity lPlayer : lOl.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_OL_LOPES)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_NKOULOU)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_MAMMANA)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_MOREL)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_RAFAEL)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_RYBUS)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_TOLISSO)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_DARDER)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_TOUSARD)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_FEKIR)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_CORNET)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_GHEZZAL)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_VALBUENA)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_MATETA)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lMhsc.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_JOURDREN)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_CONGRE)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_HILTON)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_DEPLAGNE)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_POATY)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SYLLA)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SANSON)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_BOUDEBOUZ)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SKHIRI)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_CAMARA)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_NINGA)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_ROUSSILLON)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_MARVEAUX)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_REMY)){
                lLyonVsMontpelPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        // metz vs bdx

        for (CPlayerEntity lPlayer : lMetz.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DIDILLON)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MILAN)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_FALETTE)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_SIGNORINO)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_BALLIU)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_HEIN)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MANDJECK)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MOLLET)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_COHADE)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_ERDING)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_SARR)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DIALLO)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_THILL)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_SEYDI)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lBdx.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_CARRASSO)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_CONTENTO)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_LEWCZUK)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_PALLOIS)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_SABALY)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_PLASIL)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_SERTIC)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_TOURE)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_KIESETHELIN)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_LABORDE)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_MALCOLM)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_KAMANO)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_TRAORE)){
                lMetzVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        // nantes vs asse

        for (CPlayerEntity lPlayer : lNantes.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_RIOU)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_VIZCARRONDO)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_WALONGWA)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_LIMA)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_DUBOIS)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_GILLET)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_HARIT)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_KACANIKLIC)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_BAMMOU)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_SALA)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_STEPINSKI)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_KWATENG)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_THOMSEN)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_RONGIER)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }


        }

        for (CPlayerEntity lPlayer : lAsse.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_RUFFIER)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_PERRIN)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_LACROIX)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_POGBA)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_PIERREGABRIEL)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_DABO)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_VERETOUT)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_LEMOINE)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_ROUX)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_HAMOUMA)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_KMP)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_MALCUIT)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_TANNANE)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_PAJOT)){
                lNantesVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }


        }

        // nice vs monaco

        for (CPlayerEntity lPlayer : lNice.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NICE_CARDINALE)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BAYSSE)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_PEREIRA)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_CYPRIEN)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_HENRIQUE)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_DANTE)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_SARR)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BELHANDA)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_SERI)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_KOZIELLO)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BALOTELLI)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_EYSSERIC)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BODMER)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_PLEA)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }


        }

        for (CPlayerEntity lPlayer : lMonaco.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_SUBASIC)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_FABINHO)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_JEMERSON)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_SIDIBE)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_RAGGI)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_GLIK)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_MOUTINHO)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_BERNARDO)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_BAKAYOKO)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_LEMAR)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_FALCAO)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_TOURE)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_CARILLO)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_GERMAIN)){
                lNiceVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }


        }

        // rennes vs marseille

        for (CPlayerEntity lPlayer : lRennes.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_COSTIL)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_MEXER)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_BENSEBAINI)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_BAAL)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_DANZE)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_ANDRE)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_FERNANDES)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_HENRIQUE)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_GOURCUFF)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_NTEP)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_SIO)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_ERASMUS)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_GROSICKI)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_HUNOU)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }


        }

        for (CPlayerEntity lPlayer : lOm.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_PELE)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_REKIK)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_HUBOCAN)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_SAKAI)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_BEDIMO)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_VAINQUEUR)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_THAUVIN)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_CABELLA)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_NJIE)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_MACHACH)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_GOMIS)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_ZAMBO)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_LOPEZ)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_SARR)){
                lRennesVsMarseillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }


        }
    }
}
