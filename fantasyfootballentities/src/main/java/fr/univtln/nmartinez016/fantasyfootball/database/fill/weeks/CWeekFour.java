package fr.univtln.nmartinez016.fantasyfootball.database.fill.weeks;

import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.database.CQueryParameter;
import fr.univtln.nmartinez016.fantasyfootball.entities.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 10/09/2016.
 */
public class CWeekFour {
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

        List <CPlayerByGame> lPlayersPsgVsAsse = new ArrayList<CPlayerByGame>();
        List <CPlayerByGame> lPlayersOlVsBdx = new ArrayList<CPlayerByGame>();
        List <CPlayerByGame> lPlayersLilleVsMonaco = new ArrayList<CPlayerByGame>();
        List <CPlayerByGame> lPlayersAngersVsDijon = new ArrayList<CPlayerByGame>();
        List <CPlayerByGame> lPlayersBastiaVsToulouse = new ArrayList<CPlayerByGame>();
        List <CPlayerByGame> lPlayersEagVsMhsc = new ArrayList<CPlayerByGame>();
        List <CPlayerByGame> lPlayersLorientVsNancy = new ArrayList<CPlayerByGame>();
        List <CPlayerByGame> lPlayersNantesVsMetz = new ArrayList<CPlayerByGame>();
        List <CPlayerByGame> lPlayersRennesVsCaen = new ArrayList<CPlayerByGame>();
        List <CPlayerByGame> lPlayersNiceVsOm = new ArrayList<CPlayerByGame>();

        List<CYellowCardByGame> lYellowsPsgVsAsse = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsOlVsBdx = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsLilleVsMonaco = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsAngersVsDijon = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsBastiaVsToulouse = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsEagVsMhsc = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsLorientVsNancy = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsNantesVsMetz = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsRennesVsCaen = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsNiceVsOm = new ArrayList<CYellowCardByGame>();

        List<CGoalsByGame> lGoalsPsgVsAsse = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsOlVsBdx = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsLilleVsMonaco = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsAngersVsDijon = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsBastiaVsToulouse = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsEagVsMhsc = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsLorientVsNancy = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsNantesVsMetz = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsRennesVsCaen = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsNiceVsOm = new ArrayList<CGoalsByGame>();

        List<CAssistByGame> lAssistsPsgVsAsse = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsOlVsBdx = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsLilleVsMonaco = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsAngersVsDijon = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsBastiaVsToulouse = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsEagVsMhsc = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsLorientVsNancy = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsNantesVsMetz = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsRennesVsCaen = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsNiceVsOm = new ArrayList<CAssistByGame>();

        List<CRedCardByGame> lRedsOlVsBdx = new ArrayList<CRedCardByGame>();
        List<CRedCardByGame> lRedsAngersVsDijon = new ArrayList<CRedCardByGame>();

        List<CPenaltyProvokedByGame> lPenaltiesProvokedPsgVsAsse = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyConcededByGame> lPenaltiesConcededPsgVsAsse = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltyScoredByGame> lPenaltiesScoredPsgVsAsse = new ArrayList<CPenaltyScoredByGame>();

        List<CPenaltyProvokedByGame> lPenaltiesProvokedNantesVsMetz = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyConcededByGame> lPenaltiesConcededNantesVsMetz = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltyScoredByGame> lPenaltiesScoredNantesVsMetz = new ArrayList<CPenaltyScoredByGame>();


        List<CPenaltyProvokedByGame> lPenaltiesProvokedNiceVsOm = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyConcededByGame> lPenaltiesConcededNiceVsOm = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltyScoredByGame> lPenaltiesScoredNiceVsOm = new ArrayList<CPenaltyScoredByGame>();

        // game psg asse

        for (CPlayerEntity lPlayer : lParis.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_PSG_TRAPP)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_KIMPEMBE)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MARQUINHOS)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MEUNIER)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MOTTA)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_VERRATTI)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsPsgVsAsse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MATUIDI)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesProvokedPsgVsAsse.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_LUCAS)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsPsgVsAsse.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesScoredPsgVsAsse.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_BENARFA)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_JESE)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_CAVANI)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_KRYCHOWIAK)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsPsgVsAsse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_DIMARIA)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lAsse.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_RUFFIER)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_KTC)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_MBENGUE)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(62).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_POGBA)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsPsgVsAsse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_PERRIN)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_MALCUIT)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsPsgVsAsse.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
                lYellowsPsgVsAsse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesConcededPsgVsAsse.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_SAIVET)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(72).build());
                lYellowsPsgVsAsse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_VERETOUT)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(79).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_SELNAES)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsPsgVsAsse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_LEMOINE)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_ROUX)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_LACROIX)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(28).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_HAMOUMA)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(18).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_BERIC)){
                lPlayersPsgVsAsse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(11).build());
                lGoalsPsgVsAsse.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
        }

        // game ol vs bdx

        for (CPlayerEntity lPlayer : lOl.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_OL_LOPES)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_DIAKHABY)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_MAPOU)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_RAFAEL)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(82).build());
                lGoalsOlVsBdx.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_MOREL)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_GONALONS)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lRedsOlVsBdx.add(new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_FERRI)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_DARDER)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(69).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_KALULU)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(58).build());
                lGoalsOlVsBdx.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_GHEZZAL)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsOlVsBdx.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_LACAZETTE)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_CORNET)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(32).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_TOUSARD)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(8).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_TOLISSO)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(21).build());
            }


        }

        for (CPlayerEntity lPlayer : lBdx.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_CARRASSO)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_PALLOIS)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_SERTIC)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsOlVsBdx.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_CONTENTO)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsOlVsBdx.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_SABALY)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_VADA)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(63).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_PLASIL)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_MALCOLM)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(72).build());
                lGoalsOlVsBdx.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_MENEZ)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsOlVsBdx.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_OUNAS)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_ROLAN)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(79).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_TRAORE)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(27).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_LABORDE)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(11).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_KAMANO)){
                lPlayersOlVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(18).build());
            }


        }

        // game lille vs monaco

        for (CPlayerEntity lPlayer : lLille.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_ENEYAMA)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_CORCHIA)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_CIVELLI)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_PALMIERI)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsLilleVsMonaco.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lGoalsLilleVsMonaco.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BASA)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_SANKHARE)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_AMADOU)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsLilleVsMonaco.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_AMALFITANO)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BENZIA)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_DEPREVILLE)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(61).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_EDER)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_MENDES)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(44).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_MAVUBA)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(44).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BAUTHEAC)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(29).build());
                lYellowsLilleVsMonaco.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
        }

        for (CPlayerEntity lPlayer : lMonaco.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_DESANCTIS)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_GLIK)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsLilleVsMonaco.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_RAGGI)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_SIDIBE)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(79).build());
                lGoalsLilleVsMonaco.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_JEMERSON)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_DIRAR)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_BERNARDO)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(62).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_BAKAYOKO)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsLilleVsMonaco.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_TRAORE)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsLilleVsMonaco.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_FABINHO)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsLilleVsMonaco.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_GERMAIN)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(65).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_TOURE)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(11).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_MOUTINHO)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(28).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_FALCAO)){
                lPlayersLilleVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(25).build());
            }
        }

        // game angers vs dijon

        for (CPlayerEntity lPlayer : lAngers.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MICHEL)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_ANDREU)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_TRAORE)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_THOMAS)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MANGANI)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(83).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_KETKEO)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsAngersVsDijon.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(2).build());
                lRedsAngersVsDijon.add(new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_NDOYE)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsAngersVsDijon.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lYellowsAngersVsDijon.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_SANTAMARIA)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MANCEAU)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_TOKOEKAMBI)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsAngersVsDijon.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_DIEDHIOU)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(70).build());
                lGoalsAngersVsDijon.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_CAPELLE)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(7).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_PEPE)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(44).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_NWAKAEME)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(20).build());
            }
        }

        for (CPlayerEntity lPlayer : lDijon.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_REYNET)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_ABDELHAMID)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_RUFLI)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsAngersVsDijon.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_CHAFIK)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_VARRAULT)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsAngersVsDijon.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_MARIE)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsAngersVsDijon.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(2).build());
                lRedsAngersVsDijon.add(new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BALMONT)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_SAMMARITANO)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(54).build());
                lGoalsAngersVsDijon.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_AMALFITANO)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(38).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_DIONY)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_TAVARES)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(74).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_ABEID)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(36).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BAHAMBOULA)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(52).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_LEESMELOU)){
                lPlayersAngersVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(16).build());
            }


        }

        // game bastia vs toulouse

        for (CPlayerEntity lPlayer : lBastia.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_LECA)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsBastiaVsToulouse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_SQUILLACI)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_PEYBERNES)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_BENGTSSON)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsBastiaVsToulouse.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CIONI)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsBastiaVsToulouse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_MOSTEFA)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CAHUZAC)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_STMAXIMIN)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(71).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_DIALLO) && lPlayer.getFirstName().equals("sadio")){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(60).build());
                lGoalsBastiaVsToulouse.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_NANGIS)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
                lYellowsBastiaVsToulouse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_BIFOUMA)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(30).build());
                lYellowsBastiaVsToulouse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_COULIBALY)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(19).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_DANIC)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(1).build());
            }
        }

        for (CPlayerEntity lPlayer : lToulouse.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_LAFONT)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_DIOP)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_JULLIEN)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_SYLLA)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_YAGO)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(86).build());
                lYellowsBastiaVsToulouse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_MOUBANDJE)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_TREJO)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_PI)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(66).build());
                lYellowsBastiaVsToulouse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BLIN)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BRAITHWAITE)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsBastiaVsToulouse.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lYellowsBastiaVsToulouse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_TOIVONEN)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_DURMAZ)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(44).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BODIGER)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(4).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_CAFARO)){
                lPlayersBastiaVsToulouse.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(24).build());
                lYellowsBastiaVsToulouse.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }


        }

        // game eag vs mhsc

        for (CPlayerEntity lPlayer : lGuingamp.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_JOHNSSON)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_IKOKO)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_MARCAL)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SORBON)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_KERBRAT)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DIALLO)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DEAUX)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_COCO)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsEagVsMhsc.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_GIRESSE)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(65).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_PRIVAT)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(78).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SALIBUR)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(87).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DEPAUW)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(25).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_BLAS)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(12).build());
                lYellowsEagVsMhsc.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_BRIAND)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(3).build());
            }
        }

        for (CPlayerEntity lPlayer : lMhsc.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_JOURDREN)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_CONGRE)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_REMY)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_VANDENBORRE)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_ROUSSILLON)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_SYLLA)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SANSON) && lPlayer.getFirstName().equals("morgan")){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsEagVsMhsc.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_BOUDEBOUZ)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsEagVsMhsc.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SKHIRI)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_BERIGAUD)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(77).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_NINGA)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(66).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_MOUNIE)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(13).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_CAMARA)){
                lPlayersEagVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(24).build());
            }


        }

        // game lorient vs nancy

        for (CPlayerEntity lPlayer : lLorient.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LECOMTE)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_CIANI)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MOREIRA)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LAUTOA)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LEGOFF)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_CAFU)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(62).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MESLOUB)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_BARTHELME)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(61).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_WARIS)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MARVEAUX)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(68).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MOUKANDJO)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MVUEMBA)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(28).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_CABOT)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(29).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_PHILIPPOTEAUX)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(22).build());
            }
        }

        for (CPlayerEntity lPlayer : lNancy.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_NDYASSEMBE)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_LENGLET)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_CUFFAUT)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsLorientVsNancy.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_MURATORI)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_AITBENNASSER)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsLorientVsNancy.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_ROBIC)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(68).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_GUIDILEYE)){lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsLorientVsNancy.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_PUYO)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsLorientVsNancy.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_PEDRETTI)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(82).build());
                lYellowsLorientVsNancy.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_CETOUT)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_HADJI)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(73).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_DALE)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(22).build());
                lGoalsLorientVsNancy.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_MARCHETTI)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(8).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_KOURA)){
                lPlayersLorientVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(17).build());
                lYellowsLorientVsNancy.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }


        }

        // game nantes vs metz

        for (CPlayerEntity lPlayer : lNantes.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_RIOU)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_DUBOIS)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_WALONGWA)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_VIZCARRONDO)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesConcededNantesVsMetz.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_LIMA)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_GILLET)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_THOMASSON)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_RONGIER)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(78).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_HARIT)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_BAMMOU)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_STEPINSKI)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(63).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_THOMSEN)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(44).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_SALA)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(27).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_BAMMOU)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(12).build());
            }


        }

        for (CPlayerEntity lPlayer : lMetz.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DIDILLON)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_RIVIEREZ)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(74).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_FALETTE)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MILAN)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNantesVsMetz.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_SIGNORINO)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MANDJECK)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DOUKOURE)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_COHADE)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNantesVsMetz.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_NGUETTE)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(39).build());
                lAssistsNantesVsMetz.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
                lYellowsNantesVsMetz.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_SARR)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNantesVsMetz.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesProvokedNantesVsMetz.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_ERDING)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsNantesVsMetz.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(3).build());
                lPenaltiesScoredNantesVsMetz.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_BALLIU)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(16).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_JOUFFRE)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(17).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DIALLO)){
                lPlayersNantesVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(34).build());
            }



        }

        // game rennes vs caen

        for (CPlayerEntity lPlayer : lRennes.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_COSTIL)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_DANZE)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsRennesVsCaen.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_MEXER)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_MENDES)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_BAAL)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_BENSEBAINI)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_FERNANDES)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsRennesVsCaen.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_SAID)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(64).build());
                lGoalsRennesVsCaen.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_ANDRE)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_GOURCUFF)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(88).build());
                lYellowsRennesVsCaen.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_SIO)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(81).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_PRCIC)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(2).build());
                lGoalsRennesVsCaen.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_HENRIQUE)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(26).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_NTEP)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(9).build());
                lAssistsRennesVsCaen.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
        }

        for (CPlayerEntity lPlayer : lCaen.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_VERCOUTRE)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_SEUBE)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BENYOUSSEF)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DASILVA)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_GENEVOIS)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsRennesVsCaen.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_MALBRANQUE)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(70).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_FERET)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_KARAMOH)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(60).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BESSAT)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_RODELIN)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_SANTINI)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_SANE)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(20).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BAZILE)){
                lPlayersRennesVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(30).build());
            }

        }

        // game nice vs om

        for (CPlayerEntity lPlayer : lNice.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NICE_CARDINALE)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_SARR)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BAYSSE)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_PEREIRA)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNiceVsOm.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lAssistsNiceVsOm.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_DANTE)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_HENRIQUE)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(76).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_CYPRIEN)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsNiceVsOm.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_SERI)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesProvokedNiceVsOm.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_KOZIELLO)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNiceVsOm.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesConcededNiceVsOm.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_PLEA)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(76).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BALOTELLI)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsNiceVsOm.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(2).build());
                lPenaltiesScoredNiceVsOm.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BELHANDA)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(14).build());
                lAssistsNiceVsOm.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_EYSSERIC)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(14).build());
            }
        }

        for (CPlayerEntity lPlayer : lOm.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_PELE)){

            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_SAKAI)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_DORIA)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNiceVsOm.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_REKIK)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_HUBOCAN)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_VAINQUEUR)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(68).build());
                lPenaltiesConcededNiceVsOm.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_ZAMBO)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNiceVsOm.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_THAUVIN)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsNiceVsOm.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_SARR)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesProvokedNiceVsOm.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_ISEKA)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(57).build());
                lAssistsNiceVsOm.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_GOMIS)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsNiceVsOm.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesScoredNiceVsOm.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_KHAOUI)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_NJIE)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(22).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_MACHACH)){
                lPlayersNiceVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(33).build());
                lYellowsNiceVsOm.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
        }

        CGameEntity lGamePsgVsAsse = new CGameEntity.CGameBuilder().homeTeam(lParis).awayTeam(lAsse).homeScore(1).awayScore(1).scorers(lGoalsPsgVsAsse).assisters(lAssistsPsgVsAsse).yellowCards(lYellowsPsgVsAsse).week(4).players(lPlayersPsgVsAsse).build();
        lGamePsgVsAsse.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGamePsgVsAsse);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameOlVsBdx = new CGameEntity.CGameBuilder().homeTeam(lOl).awayTeam(lBdx).homeScore(1).awayScore(3).scorers(lGoalsOlVsBdx).assisters(lAssistsOlVsBdx).yellowCards(lYellowsOlVsBdx).week(4).players(lPlayersOlVsBdx).redCards(lRedsOlVsBdx).build();
        lGameOlVsBdx.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameOlVsBdx);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameLilleVsMonaco = new CGameEntity.CGameBuilder().homeTeam(lLille).awayTeam(lMonaco).homeScore(1).awayScore(4).scorers(lGoalsLilleVsMonaco).assisters(lAssistsLilleVsMonaco).yellowCards(lYellowsLilleVsMonaco).week(4).players(lPlayersLilleVsMonaco).build();
        lGameLilleVsMonaco.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameLilleVsMonaco);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameLorientVsNancy = new CGameEntity.CGameBuilder().homeTeam(lLorient).awayTeam(lNancy).homeScore(0).awayScore(2).scorers(lGoalsLorientVsNancy).assisters(lAssistsLorientVsNancy).yellowCards(lYellowsLorientVsNancy).week(4).players(lPlayersLorientVsNancy).build();
        lGameLorientVsNancy.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameLorientVsNancy);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameBastiaVsToulouse = new CGameEntity.CGameBuilder().homeTeam(lBastia).awayTeam(lToulouse).homeScore(2).awayScore(1).scorers(lGoalsBastiaVsToulouse).assisters(lAssistsBastiaVsToulouse).yellowCards(lYellowsBastiaVsToulouse).week(4).players(lPlayersBastiaVsToulouse).build();
        lGameBastiaVsToulouse.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameBastiaVsToulouse);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameEagVsMhsc = new CGameEntity.CGameBuilder().homeTeam(lGuingamp).awayTeam(lMhsc).homeScore(1).awayScore(1).scorers(lGoalsEagVsMhsc).assisters(lAssistsEagVsMhsc).yellowCards(lYellowsEagVsMhsc).week(4).players(lPlayersEagVsMhsc).build();
        lGameEagVsMhsc.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameEagVsMhsc);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameAngersVsDijon = new CGameEntity.CGameBuilder().homeTeam(lAngers).awayTeam(lDijon).homeScore(3).awayScore(1).scorers(lGoalsAngersVsDijon).assisters(lAssistsAngersVsDijon).yellowCards(lYellowsAngersVsDijon).week(4).players(lPlayersAngersVsDijon).redCards(lRedsAngersVsDijon).build();
        lGameAngersVsDijon.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameAngersVsDijon);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameNantesVsMetz = new CGameEntity.CGameBuilder().homeTeam(lNantes).awayTeam(lMetz).homeScore(0).awayScore(3).scorers(lGoalsNantesVsMetz).assisters(lAssistsNantesVsMetz).yellowCards(lYellowsNantesVsMetz).players(lPlayersNantesVsMetz).week(4).build();
        lGameNantesVsMetz.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameNantesVsMetz);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameRennesVsCaen = new CGameEntity.CGameBuilder().homeTeam(lRennes).awayTeam(lCaen).homeScore(2).awayScore(0).scorers(lGoalsRennesVsCaen).assisters(lAssistsRennesVsCaen).yellowCards(lYellowsRennesVsCaen).players(lPlayersRennesVsCaen).week(4).build();
        lGameRennesVsCaen.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameRennesVsCaen);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameNiceVsOm = new CGameEntity.CGameBuilder().homeTeam(lNantes).awayTeam(lMetz).homeScore(3).awayScore(2).scorers(lGoalsNiceVsOm).assisters(lAssistsNiceVsOm).yellowCards(lYellowsNiceVsOm).players(lPlayersNiceVsOm).week(4).build();
        lGameNiceVsOm.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameNiceVsOm);
            lCrudMethods.commitTransaction();
        }
    }

}
