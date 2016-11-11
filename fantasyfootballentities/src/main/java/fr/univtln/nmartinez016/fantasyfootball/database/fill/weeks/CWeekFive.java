package fr.univtln.nmartinez016.database.fill.weeks;

import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.database.CQueryParameter;
import fr.univtln.nmartinez016.fantasyfootball.entities.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 16/09/2016.
 */
public class CWeekFive {
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

        List<CPlayerByGame> lPlayersCaenVsPsg = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersMonacoVsRennes = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersBdxVsAngers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersDijonVsMetz = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersLorientVsLosc = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersNancyVsNantes = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersToulouseVsEag = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersMhscVsNice = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersAsseVsBastia = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersOmVsOl = new ArrayList<CPlayerByGame>();

        List<CGoalsByGame> lGoalsCaenVsPsg = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsMonacoVsRennes = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsBdxVsAngers = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsDijonVsMetz = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsLorientVsLosc = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsNancyVsNantes = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsToulouseVsEag = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsMhscVsNice = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsAsseVsBastia = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsOmVsOl = new ArrayList<CGoalsByGame>();

        List<CAssistByGame> lAssistsCaenVsPsg = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsMonacoVsRennes = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsBdxVsAngers = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsDijonVsMetz = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsLorientVsLosc = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsNancyVsNantes = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsToulouseVsEag = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsMhscVsNice = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsAsseVsBastia = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsOmVsOl = new ArrayList<CAssistByGame>();

        List<CYellowCardByGame> lYellowsCaenVsPsg = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsMonacoVsRennes = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsBdxVsAngers = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsDijonVsMetz = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsLorientVsLosc = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsNancyVsNantes = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsToulouseVsEag = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsMhscVsNice = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsAsseVsBastia = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsOmVsOl = new ArrayList<CYellowCardByGame>();

        List<CRedCardByGame> lRedsBdxVsAngers = new ArrayList<CRedCardByGame>();
        List<CRedCardByGame> lRedsDijonVsMetz = new ArrayList<CRedCardByGame>();
        List<CRedCardByGame> lRedsToulouseVsEag = new ArrayList<CRedCardByGame>();

        List<CPenaltyProvokedByGame> lPenaltiesProvokedPsgVsCaen = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyConcededByGame> lPenaltiesConcededPsgVsCaen = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltyScoredByGame> lPenaltiesScoredPsgVsCaen = new ArrayList<CPenaltyScoredByGame>();

        List<CPenaltyProvokedByGame> lPenaltiesProvokedDijonVsMetz = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyConcededByGame> lPenaltiesConcededDijonVsMetz = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltyMissedByGame> lPenaltiesMissedDijonVsMetz = new ArrayList<CPenaltyMissedByGame>();
        List<CPenaltySavedByGame> lPenaltiesSavedDijonVsMetz = new ArrayList<CPenaltySavedByGame>();

        List<CPenaltyProvokedByGame> lPenaltiesProvokedToulouseVsGuingamp = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyConcededByGame> lPenaltiesConcededToulouseVsGuingamp = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltyScoredByGame> lPenaltiesScoredToulouseVsGuingamp = new ArrayList<CPenaltyScoredByGame>();

        List<CPenaltyProvokedByGame> lPenaltiesProvokedLorientVsLille = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyConcededByGame> lPenaltiesConcededLorientVsLille = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltyScoredByGame> lPenaltiesScoredLorientVsLille = new ArrayList<CPenaltyScoredByGame>();

        List<CPenaltyProvokedByGame> lPenaltiesProvokedMhscVsNice = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyConcededByGame> lPenaltiesConcededMhscVsNice = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltyScoredByGame> lPenaltiesScoredMhscVsNice = new ArrayList<CPenaltyScoredByGame>();

        List<CPenaltyProvokedByGame> lPenaltiesProvokedAsseVsBastia = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyConcededByGame> lPenaltiesConcededAsseVsBastia = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltyScoredByGame> lPenaltiesScoredAsseVsBastia = new ArrayList<CPenaltyScoredByGame>();
        List<CPenaltySavedByGame> lPenaltiesSavedAsseVsBastia = new ArrayList<CPenaltySavedByGame>();
        List<CPenaltyMissedByGame> lPenaltiesMissedAsseVsBastia = new ArrayList<CPenaltyMissedByGame>();

        // game caen vs psg

        for (CPlayerEntity lPlayer : lCaen.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_VERCOUTRE)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BENYOUSSEF)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsCaenVsPsg.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesConcededPsgVsCaen.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DASILVA)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BESSAT)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_GENEVOIS)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_SEUBE)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_FERET)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_RODELIN)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_KARAMOH)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(68).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BAZILE)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_SANTINI)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_IMOROU)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(22).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_ADEOTI)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(44).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DIOMANDE)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(44).build());
            }
        }

        for (CPlayerEntity lPlayer : lParis.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_PSG_AREOLA)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_KIMPEMBE)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsCaenVsPsg.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MARQUINHOS)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MEUNIER)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MAXWELL)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_KRYCHOWIAK)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_RABIOT)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MATUIDI)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(67).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_DIMARIA)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(61).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_LUCAS)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsCaenVsPsg.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesProvokedPsgVsCaen.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_CAVANI)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
                lGoalsCaenVsPsg.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(4).build());
                lPenaltiesScoredPsgVsCaen.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_JESE)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(44).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_AUGUSTIN)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(29).build());
                lGoalsCaenVsPsg.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MOTTA)){
                lPlayersCaenVsPsg.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(23).build());
            }


        }

        // monaco vs rennes

        for (CPlayerEntity lPlayer : lMonaco.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_SUBASIC)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_RAGGI)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_GLIK)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_JEMERSON)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_TOURE)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_MOUTINHO)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_FABINHO)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_TRAORE)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(62).build());
                lYellowsMonacoVsRennes.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_LEMAR)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsMonacoVsRennes.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(2).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_GERMAIN)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(85).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_FALCAO)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(78).build());
                lGoalsMonacoVsRennes.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(2).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_NDORAM)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(5).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_BERNARDO)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(28).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_CARILLO)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(12).build());
            }


        }

        for (CPlayerEntity lPlayer : lRennes.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_COSTIL)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_DANZE)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_MEXER)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_MENDES)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_BENSEBAINI)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_ZEFFANE)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(75).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_FERNANDES)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_ANDRE)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_BAAL)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_NTEP)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(61).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_SIO)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(60).build());
                lYellowsMonacoVsRennes.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_DIAKHABY)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(30).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_SAID)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(29).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_ERASMUS)){
                lPlayersMonacoVsRennes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(15).build());
            }


        }

        // bdx vs angers

        for (CPlayerEntity lPlayer : lBdx.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_CARRASSO)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_SABALY)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_LEWCZUK)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_PALLOIS)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_CONTENTO)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_VADA)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(62).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_PLASIL)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_MALCOLM)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_OUNAS)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_ROLAN)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(82).build());
                lRedsBdxVsAngers.add(new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_MENEZ)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_TRAORE)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(28).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_LABORDE)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(44).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_KIESETHELIN)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(1).build());
            }
        }

        for (CPlayerEntity lPlayer : lAngers.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MICHEL)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MANCEAU)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_PAVLOVIC)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_THOMAS)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_ANDREU)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_SANTAMARIA)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MANGANI)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(80).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_NDOYE)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_TOKOEKAMBI)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(70).build());
                lGoalsBdxVsAngers.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_CAPELLE)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(85).build());
                lYellowsBdxVsAngers.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_DIEDHIOU)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_TAHRAT)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(5).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_PEPE)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(20).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_DORE)){
                lPlayersBdxVsAngers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(10).build());
            }

        }

        // dijon vs metz

        for (CPlayerEntity lPlayer : lDijon.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_REYNET)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BOUKAMOUTOU)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesProvokedDijonVsMetz.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_ABDELHAMID)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsDijonVsMetz.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_VARRAULT)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_RUFLI)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsDijonVsMetz.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BALMONT)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsDijonVsMetz.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_ABEID)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsDijonVsMetz.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesConcededDijonVsMetz.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_SAMMARITANO)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesMissedDijonVsMetz.add(new CPenaltyMissedByGame.CPenaltyMissedByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_LEESMELOU)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(75).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_DIONY)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_TAVARES)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(35).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BAHAMBOULA)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(55).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_AMALFITANO)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(15).build());
            }
        }

        for (CPlayerEntity lPlayer : lMetz.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DIDILLON)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesSavedDijonVsMetz.add(new CPenaltySavedByGame.CPenaltySavedByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_RIVIEREZ)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MILAN)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_FALETTE)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_SIGNORINO)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MANDJECK)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsDijonVsMetz.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DOUKOURE)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsDijonVsMetz.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(2).build());
                lRedsDijonVsMetz.add(new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_COHADE)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_SARR)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesConcededDijonVsMetz.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DIALLO)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(65).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_ERDING)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsDijonVsMetz.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesMissedDijonVsMetz.add(new CPenaltyMissedByGame.CPenaltyMissedByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MOLLET)){
                lPlayersDijonVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(25).build());
                lYellowsDijonVsMetz.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
        }

        // lorient vs losc

        for (CPlayerEntity lPlayer : lLorient.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LECOMTE)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MOREIRA)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_TOURE)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_CIANI)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LEGOFF)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_BELLUGOU)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_CAFU)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(10).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MVUEMBA)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_PHILIPPOTEAUX)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(68).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MARA)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MOUKANDJO)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(84).build());
                lGoalsLorientVsLosc.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesScoredLorientVsLille.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_CABOT)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(6).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MESLOUB)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(80).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_WARIS)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(22).build());
            }


        }

        for (CPlayerEntity lPlayer : lLille.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_ENEYAMA)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_CORCHIA)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BASA)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_CIVELLI)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BERIA)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_AMADOU)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(12).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_MAVUBA)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_SANKHARE)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_AMALFITANO)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_LOPES)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_EDER)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(61).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_SUNZU)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(78).build());
                lPenaltiesConcededLorientVsLille.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_DEPREVILLE)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(29).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_MENDES)){
                lPlayersLorientVsLosc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(13).build());
            }


        }

        // nancy vs nantes

        for (CPlayerEntity lPlayer : lNancy.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_NDYASSEMBE)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_CUFFAUT)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_CETOUT)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_LENGLET)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_MURATORI)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(21).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_GUIDILEYE)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_PEDRETTI)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(71).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_AITBENNASSER)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_ROBIC)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(59).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_PUYO)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsNancyVsNantes.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_HADJI)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_BADILA)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(69).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_KOURA)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(31).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_DALE)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(19).build());
            }
        }

        for (CPlayerEntity lPlayer : lNantes.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_RIOU)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_LIMA)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_WALONGWA)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_VIZCARRONDO)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_DUBOIS)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_GILLET)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_HARIT)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_THOMSEN)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(58).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_MOIMBE)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(79).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_SALA)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(87).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_STEPINSKI)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsNancyVsNantes.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_BAMMOU)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(32).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_RONGIER)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(11).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_ARISTEGUIETA)){
                lPlayersNancyVsNantes.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(3).build());
            }
        }

        // toulouse vs eag

        for (CPlayerEntity lPlayer : lToulouse.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_LAFONT)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesConcededToulouseVsGuingamp.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_MOUBANDJE)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_JULLIEN)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_DIOP)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_YAGO)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BLIN)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BODIGER)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(64).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_SYLLA)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_DURMAZ)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(83).build());
                lGoalsToulouseVsEag.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_TOIVONEN)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BRAITHWAITE)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
                lGoalsToulouseVsEag.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesScoredToulouseVsGuingamp.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_CAFARO)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_PI)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(7).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_EDOUARD)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(26).build());
            }
        }

        for (CPlayerEntity lPlayer : lGuingamp.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_JOHNSSON)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(41).build());
                lRedsToulouseVsEag.add(new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_IKOKO)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SORBON)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_KERBRAT)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_MARCAL)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DIALLO)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(75).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_GIRESSE)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DEAUX)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_COCO)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(37).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SALIBUR)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesProvokedToulouseVsGuingamp.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_BRIAND)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsToulouseVsEag.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesScoredToulouseVsGuingamp.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_GUIVARCH)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(49).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_BLAS)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(53).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DEPAUW)){
                lPlayersToulouseVsEag.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(15).build());
            }
        }

        // mhsc vs nice

        for (CPlayerEntity lPlayer : lMhsc.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_JOURDREN)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_CONGRE)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_HILTON)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_VANDENBORRE)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_ROUSSILLON)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesProvokedMhscVsNice.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SYLLA)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SANSON) && lPlayer.getFirstName().equals("morgan")){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(82).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_BOUDEBOUZ)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsMhscVsNice.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesScoredMhscVsNice.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SKHIRI)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsMhscVsNice.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_BERIGAUD)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(82).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_MOUNIE)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_NINGA)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(8).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_CAMARA)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(8).build());
            }
        }

        for (CPlayerEntity lPlayer : lNice.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NICE_CARDINALE)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BAYSSE)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BODMER)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(74).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_HENRIQUE)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_DANTE)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_SOUQUET)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_SARR)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(74).build());
                lPenaltiesConcededMhscVsNice.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BELHANDA)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsMhscVsNice.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_LUSAMBA)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_PLEA)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(74).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_WALTER)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_CYPRIEN)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(16).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_DONIS)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(16).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_EYSSERIC)){
                lPlayersMhscVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(16).build());
                lYellowsMhscVsNice.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }


        }

        // asse vs bastia

        for (CPlayerEntity lPlayer : lAsse.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_RUFFIER)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_KTC)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_LACROIX)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_PERRIN)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_MALCUIT)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_PAJOT)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(58).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_TANNANE)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(69).build());
                lYellowsAsseVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_VERETOUT)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_SELNAES)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsAsseVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_KMP)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_BERIC)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesMissedAsseVsBastia.add(new CPenaltyMissedByGame.CPenaltyMissedByGameBuilder().shooter(lPlayer).quantity(1).build());
                lPenaltiesProvokedAsseVsBastia.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_HAMOUMA)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(32).build());
                lGoalsAsseVsBastia.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesScoredAsseVsBastia.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
                lPenaltiesProvokedAsseVsBastia.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_SODERLUND)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(21).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_LEMOINE)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(1).build());
            }

        }

        for (CPlayerEntity lPlayer : lBastia.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_LECA)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsAsseVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesConcededAsseVsBastia.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
                lPenaltiesSavedAsseVsBastia.add(new CPenaltySavedByGame.CPenaltySavedByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_SQUILLACI)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_PEYBERNES)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_BENGTSSON)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CIONI)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsAsseVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CAHUZAC)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesConcededAsseVsBastia.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_MOSTEFA)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_COULIBALY)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_STMAXIMIN)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_NANGIS)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(79).build());
                lYellowsAsseVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CRIVELLI)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsAsseVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_DIALLO) && lPlayer.getFirstName().equals("sadio")){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(44).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_ELKAOUTARI)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(11).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_ACHEAMPONG)){
                lPlayersAsseVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(1).build());
            }

        }

        // om vs ol

        for (CPlayerEntity lPlayer : lOm.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_PELE)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_SAKAI)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_HUBOCAN)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsOmVsOl.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_DORIA)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_BEDIMO)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_ZAMBO)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsOmVsOl.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_VAINQUEUR)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(74).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_THAUVIN)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(72).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_SARR)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_ISEKA)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(59).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_GOMIS)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_MACHACH)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(16).build());
                lYellowsOmVsOl.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_NJIE)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(18).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_CABELLA)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(31).build());
            }

        }

        for (CPlayerEntity lPlayer : lOl.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_OL_LOPES)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_RAFAEL)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_MOREL)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_MAPOU)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsOmVsOl.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_NKOULOU)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_RYBUS)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_TOUSARD)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsOmVsOl.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_FERRI)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(84).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_DARDER)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(78).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_TOLISSO)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_CORNET)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_KEMEN)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(6).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_GHEZZAL)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(12).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_KALULU)){
                lPlayersOmVsOl.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(1).build());
            }
        }

        CGameEntity lGameCaenVsPsg = new CGameEntity.CGameBuilder().homeTeam(lCaen).awayTeam(lParis).homeScore(0).awayScore(6).players(lPlayersCaenVsPsg).scorers(lGoalsCaenVsPsg).assisters(lAssistsCaenVsPsg).yellowCards(lYellowsCaenVsPsg).week(5).build();
        lGameCaenVsPsg.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameCaenVsPsg);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameMonacoVsRennes = new CGameEntity.CGameBuilder().homeTeam(lMonaco).awayTeam(lRennes).homeScore(0).awayScore(3).players(lPlayersMonacoVsRennes).scorers(lGoalsMonacoVsRennes).assisters(lAssistsMonacoVsRennes).yellowCards(lYellowsMonacoVsRennes).week(5).build();
        lGameMonacoVsRennes.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameMonacoVsRennes);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameBdxVsAngers = new CGameEntity.CGameBuilder().homeTeam(lBdx).awayTeam(lAngers).homeScore(0).awayScore(1).players(lPlayersBdxVsAngers).scorers(lGoalsBdxVsAngers).assisters(lAssistsBdxVsAngers).yellowCards(lYellowsBdxVsAngers).week(5).build();
        lGameBdxVsAngers.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameBdxVsAngers);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameDijonVsMetz = new CGameEntity.CGameBuilder().homeTeam(lDijon).awayTeam(lMetz).homeScore(0).awayScore(0).players(lPlayersDijonVsMetz).scorers(lGoalsDijonVsMetz).assisters(lAssistsDijonVsMetz).yellowCards(lYellowsDijonVsMetz).week(5).build();
        lGameDijonVsMetz.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameDijonVsMetz);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameLorientVsLosc = new CGameEntity.CGameBuilder().homeTeam(lLorient).awayTeam(lLille).homeScore(1).awayScore(0).players(lPlayersLorientVsLosc).scorers(lGoalsLorientVsLosc).assisters(lAssistsLorientVsLosc).yellowCards(lYellowsLorientVsLosc).week(5).build();
        lGameLorientVsLosc.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameLorientVsLosc);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameNancyVsNantes = new CGameEntity.CGameBuilder().homeTeam(lNancy).awayTeam(lNantes).homeScore(1).awayScore(1).players(lPlayersNancyVsNantes).scorers(lGoalsNancyVsNantes).assisters(lAssistsNancyVsNantes).yellowCards(lYellowsNancyVsNantes).week(5).build();
        lGameNancyVsNantes.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameNancyVsNantes);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameToulouseVsEag = new CGameEntity.CGameBuilder().homeTeam(lToulouse).awayTeam(lGuingamp).homeScore(2).awayScore(1).players(lPlayersToulouseVsEag).scorers(lGoalsToulouseVsEag).assisters(lAssistsToulouseVsEag).yellowCards(lYellowsToulouseVsEag).week(5).build();
        lGameToulouseVsEag.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameToulouseVsEag);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameMhscVsNice = new CGameEntity.CGameBuilder().homeTeam(lMhsc).awayTeam(lNice).homeScore(1).awayScore(1).players(lPlayersMhscVsNice).scorers(lGoalsMhscVsNice).assisters(lAssistsMhscVsNice).yellowCards(lYellowsMhscVsNice).week(5).build();
        lGameMhscVsNice.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameMhscVsNice);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameAsseVsBastia = new CGameEntity.CGameBuilder().homeTeam(lAsse).awayTeam(lBastia).homeScore(1).awayScore(0).players(lPlayersAsseVsBastia).scorers(lGoalsAsseVsBastia).assisters(lAssistsAsseVsBastia).yellowCards(lYellowsAsseVsBastia).week(5).build();
        lGameAsseVsBastia.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameAsseVsBastia);
            lCrudMethods.commitTransaction();
        }

        CGameEntity lGameOmVsOl = new CGameEntity.CGameBuilder().homeTeam(lOm).awayTeam(lOl).homeScore(0).awayScore(0).players(lPlayersOmVsOl).scorers(lGoalsOmVsOl).assisters(lAssistsOmVsOl).yellowCards(lYellowsOmVsOl).week(5).build();
        lGameOmVsOl.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameOmVsOl);
            lCrudMethods.commitTransaction();
        }
    }
}
