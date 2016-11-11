package fr.univtln.nmartinez016.fantasyfootball.database.fill.weeks;

import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.database.CQueryParameter;
import fr.univtln.nmartinez016.fantasyfootball.entities.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 21/08/2016.
 */
public class CWeekTwo {
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



        List<CGoalsByGame> lGoalsNantesVsMonaco = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsPsgVsMetz = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsAsseVsMhsc = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsEagVsOm = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsLorientVsBastia = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsRennesVsNancy = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsLilleVsDijon = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsToulouseVsBdx = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsAngersVsNice = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsOlVsCaen = new ArrayList<CGoalsByGame>();

        List<CPlayerByGame> lPlayersNantesVsMonaco = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersPsgVsMetz = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersAsseVsMhsc = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersEagVsOm = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersLorientVsBastia = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersRennesVsNancy = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersLilleVsDijon = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersToulouseVsBdx = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersAngersVsNice = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPlayersOlVsCaen = new ArrayList<CPlayerByGame>();

        List<CAssistByGame> lAssistsNantesVsMonaco = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsPsgVsMetz = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsAsseVsMhsc = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsEagVsOm = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsLorientVsBastia= new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsRennesVsNancy = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsLilleVsDijon = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsToulouseVsBdx = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsAngersVsNice = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAssistsOlVsCaen = new ArrayList<CAssistByGame>();

        List<CYellowCardByGame> lYellowsNantesVsMonaco = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsPsgVsMetz = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsAsseVsMhsc = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsEagVsOm = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsLorientVsBastia = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsRennesVsNancy = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsLilleVsDijon = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsToulouseVsBdx = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsAngersVsNice = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lYellowsOlVsCaen = new ArrayList<CYellowCardByGame>();

        List<CRedCardByGame> lRedsLorientVsBastia = new ArrayList<CRedCardByGame>();
        List<CRedCardByGame> lRedsToulouseVsBdx = new ArrayList<CRedCardByGame>();

        List<CPenaltyProvokedByGame> lPenaltiesProvokedOlVsCaen = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyScoredByGame> lPenaltiesScoredOlVsCaen = new ArrayList<CPenaltyScoredByGame>();
        List<CPenaltyConcededByGame> lPenaltiesConcededOlVsCaen = new ArrayList<CPenaltyConcededByGame>();

        List<CPenaltyProvokedByGame> lPenaltiesProvokedRennesVsNancy = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyMissedByGame> lPenaltiesMissedRennesVsNancy = new ArrayList<CPenaltyMissedByGame>();
        List<CPenaltyConcededByGame> lPenaltiesConcededRennesVsNancy = new ArrayList<CPenaltyConcededByGame>();

        List<CPenaltyProvokedByGame> lPenaltiesProvokedBastiaVsLorient = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyMissedByGame> lPenaltiesMissedBastiaVsLorient = new ArrayList<CPenaltyMissedByGame>();
        List<CPenaltyConcededByGame> lPenaltiesConcededBastiaVsLorient = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltySavedByGame> lPenaltiesSavedBastiaVsLorient = new ArrayList<CPenaltySavedByGame>();

        List<CTotwPlayerEntity> lTotwPlayers = new ArrayList<CTotwPlayerEntity>();

        // GAME NANTES VS MONACO
        for (CPlayerEntity lPlayer : lMonaco.getPlayers()){

            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_SUBASIC)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNantesVsMonaco.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_MENDY)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_GLIK)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNantesVsMonaco.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_TISSERAND)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNantesVsMonaco.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_DIALLO)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_MOUTINHO)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_NDORAM)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_BOSCHILIA)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(67).build());
                lGoalsNantesVsMonaco.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_TRAORE)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(81).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_CAVALEIRO)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(72).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_JEAN)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNantesVsMonaco.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_GERMAIN)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(72).endMinute(90).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_BAKAYOKO)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(81).endMinute(90).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_LEMAR)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(67).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lNantes.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_RIOU)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_DUBOIS)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_VIZCARRONDO)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_CARLOS)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNantesVsMonaco.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_LIMA)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_GILLET)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsNantesVsMonaco.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_RONGIER)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_HARIT)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(83).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_ILOKI)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(23).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_THOMSEN)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_SIGTHORSSON)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(71).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_KACANIKLIC)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(23).endMinute(90).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_BAMMOU)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(71).endMinute(90).build());
            }


            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_ALEGUE)){
                lPlayersNantesVsMonaco.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(83).endMinute(90).build());
            }

        }

        CGameEntity lGameNantesVsMonaco = new CGameEntity.CGameBuilder().homeTeam(lNantes).awayTeam(lMonaco).homeScore(0).awayScore(1).scorers(lGoalsNantesVsMonaco).players(lPlayersNantesVsMonaco).assisters(lAssistsNantesVsMonaco).yellowCards(lYellowsNantesVsMonaco).week(2).build();
        lGameNantesVsMonaco.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameNantesVsMonaco);
            lCrudMethods.commitTransaction();
        }


        // GAME PSG VS METZ
        for (CPlayerEntity lPlayer : lParis.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_PSG_TRAPP)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_AURIER)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsPsgVsMetz.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
                lYellowsPsgVsMetz.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_KIMPEMBE)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_LUIZ)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_KURZAWA)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsPsgVsMetz.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MOTTA)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_RABIOT)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_PASTORE)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_LUCAS)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsPsgVsMetz.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_CAVANI)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_DIMARIA)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsPsgVsMetz.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(2).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_BENARFA)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MATUIDI)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_VERRATTI)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsPsgVsMetz.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
        }

        for (CPlayerEntity lPlayer : lMetz.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DIDILLON)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_RIVIEREZ)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MILAN)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_FALETTE)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_SIGNORINO)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_JOUFFRE)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(81).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DOUKOURE)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(71).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MANDJECK)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsPsgVsMetz.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_COHADE)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_ERDING)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_NGUETTE)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(70).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MOLLET)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DIALLO)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_SARR)){
                lPlayersPsgVsMetz.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        CGameEntity lGamePsgVsMetz = new CGameEntity.CGameBuilder().homeTeam(lParis).awayTeam(lMetz).homeScore(3).awayScore(0).scorers(lGoalsPsgVsMetz).players(lPlayersPsgVsMetz).assisters(lAssistsPsgVsMetz).yellowCards(lYellowsPsgVsMetz).week(2).build();
        lGamePsgVsMetz.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGamePsgVsMetz);
            lCrudMethods.commitTransaction();
        }


        // GAME ASSE VS MHSC

        for (CPlayerEntity lPlayer : lAsse.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_RUFFIER)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_PERRIN)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_POGBA)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_MALCUIT)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_KARAMAKO)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsAsseVsMhsc.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_CLEMENT)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_LEMOINE)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_KMP)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsAsseVsMhsc.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_ROUX)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsAsseVsMhsc.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_TANNANE)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsAsseVsMhsc.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_SAINTLOUIS)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsAsseVsMhsc.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_BERIC)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsAsseVsMhsc.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_KTC)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsAsseVsMhsc.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_PIERREGABRIEL)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lMhsc.getPlayers()){

            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_JOURDREN)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_CONGRE)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_HILTON)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_VANDENBORRE)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_ROUSSILLON)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SANSON) && lPlayer.getLastName().equals("morgan")){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SKHIRI)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_BOUDEBOUZ)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_REMY)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_MOUNIE)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsAsseVsMhsc.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_CAMARA)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }


            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_NINGA)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsAsseVsMhsc.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_BERIGAUD)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        CGameEntity lGameAsseVsMhsc = new CGameEntity.CGameBuilder().homeTeam(lAsse).awayTeam(lMhsc).homeScore(3).awayScore(1).scorers(lGoalsAsseVsMhsc).players(lPlayersAsseVsMhsc).assisters(lAssistsAsseVsMhsc).yellowCards(lYellowsAsseVsMhsc).week(2).build();
        lGameAsseVsMhsc.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameAsseVsMhsc);
            lCrudMethods.commitTransaction();
        }

        // GAME  EAG VS OM

        for (CPlayerEntity lPlayer : lGuingamp.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_JOHNSSON)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_IKOKO)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_MARCAL)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SORBON)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsEagVsOm.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_KERBRAT)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DIALLO)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DEAUX)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsEagVsOm.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals("coco")){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsEagVsOm.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_PRIVAT)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SALIBUR)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsEagVsOm.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_BRIAND)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_MANE)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_BLAS)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_ANGOUA)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lOm.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_PELE)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_SAKAI)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_HUBOCAN)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_DORIA)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsEagVsOm.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_REKIK)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_DIARRA)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_DIABY)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(69).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_CABELLA)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_SARR)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(60).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_KHAOUI)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(57).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_GOMIS)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_ISEKA)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(69).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_LOPEZ)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(60).endMinute(90).build());
                lAssistsEagVsOm.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());

            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_THAUVIN)){
                lPlayersEagVsOm.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(57).build());
                lGoalsEagVsOm.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
        }

        CGameEntity lGameGuingampVsOm = new CGameEntity.CGameBuilder().homeTeam(lGuingamp).awayTeam(lOm).homeScore(2).awayScore(1).scorers(lGoalsEagVsOm).players(lPlayersEagVsOm).assisters(lAssistsEagVsOm).yellowCards(lYellowsEagVsOm).week(2).build();
        lGameGuingampVsOm.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameGuingampVsOm);
            lCrudMethods.commitTransaction();
        }

        // GAME RENNES VS NANCY

        for (CPlayerEntity lPlayer : lRennes.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_COSTIL)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_DANZE)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsRennesVsNancy.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_MENDES)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_BENSEBAINI)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_BAAL)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsRennesVsNancy.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_ANDRE)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsRennesVsNancy.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesConcededRennesVsNancy.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_FERNANDES)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsRennesVsNancy.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_HENRIQUE)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsRennesVsNancy.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_SAID)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(72).build());
            }

            if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_GOURCUFF)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsRennesVsNancy.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_SIO)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsRennesVsNancy.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lGoalsRennesVsNancy.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_GROSICKI)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_LENJANI)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(72).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_ERASMUS)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(89).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lNancy.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_NDYASSEMBE)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_LENGLET)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_CUFFAUT)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_MURATORI)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsRennesVsNancy.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_AITBENNASSER)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(76).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_ROBIC)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesProvokedRennesVsNancy.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
                lPenaltiesMissedBastiaVsLorient.add(new CPenaltyMissedByGame.CPenaltyMissedByGameBuilder().shooter(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_NGUESSAN)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(75).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_PEDRETTI)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_CETOUT)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsRennesVsNancy.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_DALE)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(72).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_KOURA)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_PUYO)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(76).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_GUIDILEYE)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(75).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_MANDANNE)){
                lPlayersRennesVsNancy.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(72).endMinute(90).build());
            }
        }

        CGameEntity lGameRennesVsNancy = new CGameEntity.CGameBuilder().homeTeam(lRennes).awayTeam(lNancy).homeScore(2).awayScore(0).scorers(lGoalsRennesVsNancy).players(lPlayersRennesVsNancy).assisters(lAssistsRennesVsNancy).yellowCards(lYellowsRennesVsNancy).week(2).build();
        lGameRennesVsNancy.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameRennesVsNancy);
            lCrudMethods.commitTransaction();
        }

        // GAME LORIENT VS BASTIA

        for (CPlayerEntity lPlayer : lBastia.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_LECA)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_SQUILLACI)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_PEYBERNES)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_DJIKU)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsLorientVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_MARANGE)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsLorientVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_DIALLO) && lPlayer.getFirstName().equals("sadio")){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
                lAssistsLorientVsBastia.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
                lYellowsLorientVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_MOSTEFA)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsLorientVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CAHUZAC)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CRIVELLI)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsLorientVsBastia.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(2).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
                lPenaltiesMissedBastiaVsLorient.add(new CPenaltyMissedByGame.CPenaltyMissedByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_STMAXIMIN)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(84).build());
                lGoalsLorientVsBastia.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_BIFOUMA)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(63).build());
                lPenaltiesProvokedBastiaVsLorient.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_NANGIS)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(46).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CABRAL)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(84).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_COULIBALY)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(63).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lLorient.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LECOMTE)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesSavedBastiaVsLorient.add(new CPenaltySavedByGame.CPenaltySavedByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_ROSE)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesConcededBastiaVsLorient.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_BELLUGOU)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(63).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LEGOFF)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_KOFFI)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_NDONG)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(30).build());
                lRedsLorientVsBastia.add(new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_CAFU)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MESLOUB)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsLorientVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_PHILIPPOTEAUX)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(69).build());
                lYellowsLorientVsBastia.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_WARIS)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MOUKANDJO)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(82).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_JEANNOT)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(76).endMinute(90).build());
                lRedsLorientVsBastia.add(new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_FOFANA)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(69).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_BARTHELME)){
                lPlayersLorientVsBastia.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(82).endMinute(90).build());
            }
        }

        CGameEntity lGameLorientVsBastia = new CGameEntity.CGameBuilder().homeTeam(lLorient).awayTeam(lBastia).homeScore(0).awayScore(2).scorers(lGoalsLorientVsBastia).players(lPlayersLorientVsBastia).assisters(lAssistsLorientVsBastia).yellowCards(lYellowsLorientVsBastia).redCards(lRedsLorientVsBastia).week(2).build();
        lGameLorientVsBastia.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameLorientVsBastia);
            lCrudMethods.commitTransaction();
        }

        // GAME OL VS CAEN

        for (CPlayerEntity lPlayer : lOl.getPlayers()){

            if (lPlayer.getLastName().equals(CConstants.NAME_OL_LOPES)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_RAFAEL)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_NKOULOU)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_MAPOU)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsOlVsCaen.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_RYBUS)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_GONALONS)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsOlVsCaen.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_TOLISSO)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesProvokedOlVsCaen.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_DARDER)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_FEKIR)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_CORNET)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_LACAZETTE)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsOlVsCaen.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(2).build());
                lYellowsOlVsCaen.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesScoredOlVsCaen.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(2).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_FERRI)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPenaltiesProvokedOlVsCaen.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_GRENIER)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_VALBUENA)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lCaen.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_VERCOUTRE)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_YAHIA)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BENYOUSSEF)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsOlVsCaen.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesConcededOlVsCaen.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_IMOROU)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(53).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DABO)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(57).build());
                lYellowsOlVsCaen.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DASILVA)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DELAPLACE)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(78).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_FERET)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_KARAMOH)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_RODELIN)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_SANTINI)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsOlVsCaen.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lPenaltiesConcededOlVsCaen.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BESSAT)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(53).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_GENEVOIS)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(57).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_MALBRANQUE)){
                lPlayersOlVsCaen.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(78).endMinute(90).build());
                lYellowsOlVsCaen.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
        }

        CGameEntity lGameOlVsCaen = new CGameEntity.CGameBuilder().homeTeam(lOl).awayTeam(lCaen).homeScore(2).awayScore(0).scorers(lGoalsOlVsCaen).players(lPlayersOlVsCaen).assisters(lAssistsOlVsCaen).yellowCards(lYellowsOlVsCaen).week(2).build();
        lGameOlVsCaen.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameOlVsCaen);
            lCrudMethods.commitTransaction();
        }

        // GAME LILLE VS DIJON

        for (CPlayerEntity lPlayer : lLille.getPlayers()){

            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_ENEYAMA)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_CORCHIA)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_CIVELLI)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_PALMIERI)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsLilleVsDijon.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_SOUMAORO)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_AMADOU)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_AMALFITANO)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_SANKHARE)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
                lGoalsLilleVsDijon.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_DEPREVILLE)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(65).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_EDER)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsLilleVsDijon.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_MENDES)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(65).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_SUNZU)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(89).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BAUTHEAC)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(65).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BENZIA)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(65).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lDijon.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_REYNET)){
               lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
           }

            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_ABDELHAMID)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(77).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_RUFLI)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_CHAFIK)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_VARRAULT)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_MARIE)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsLilleVsDijon.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BALMONT)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsLilleVsDijon.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_SAMMARITANO)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(75).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_AMALFITANO)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(88).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BAHAMBOULA)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_TAVARES)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BERNARD)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(77).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BELA)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(75).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_RIVIERE)){
                lPlayersLilleVsDijon.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(88).endMinute(90).build());
            }
        }

        CGameEntity lGameLilleVsDijon = new CGameEntity.CGameBuilder().homeTeam(lLille).awayTeam(lDijon).homeScore(1).awayScore(0).scorers(lGoalsLilleVsDijon).players(lPlayersLilleVsDijon).assisters(lAssistsLilleVsDijon).yellowCards(lYellowsLilleVsDijon).week(2).build();
        lGameLilleVsDijon.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameLilleVsDijon);
            lCrudMethods.commitTransaction();
        }

        // GAME NICE VS ANGERS

        for (CPlayerEntity lPlayer : lNice.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NICE_CARDINALE)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BAYSSE)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_PEREIRA)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsAngersVsNice.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BODMER)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(84).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_CYPRIEN)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_HENRIQUE)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsAngersVsNice.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_SARR)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_SERI)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsAngersVsNice.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_EYSSERIC)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_KOZIELLO)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_PLEA)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsLilleVsDijon.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_WALTER)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(84).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_LUSAMBA)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(89).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lAngers.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_PETRIC)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_ANDREU)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_BOURILLON)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(56).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_TRAORE)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_THOMAS)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SAIHI)){
                lPlayersAsseVsMhsc.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_KETKEO)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_NDOYE)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MANCEAU)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_TOKOEKAMBI)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_DIEDHIOU)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(75).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_SUNU)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(66).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_SANTAMARIA)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(56).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_CAPELLE)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(75).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_PEPE)){
                lPlayersAngersVsNice.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(66).endMinute(90).build());
            }
        }

        CGameEntity lGameNiceVsAngers = new CGameEntity.CGameBuilder().homeTeam(lNice).awayTeam(lAngers).homeScore(1).awayScore(0).scorers(lGoalsAngersVsNice).players(lPlayersAngersVsNice).assisters(lAssistsAngersVsNice).yellowCards(lYellowsAngersVsNice).week(2).build();
        lGameNiceVsAngers.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameNiceVsAngers);
            lCrudMethods.commitTransaction();
        }

        // GAME TOULOUSE VS BDX

        for (CPlayerEntity lPlayer : lToulouse.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_LAFONT)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_DIOP)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsToulouseVsBdx.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_SYLLA)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_YAGO)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_MOUBANDJE)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_JULLIEN)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsToulouseVsBdx.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_TREJO)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(85).build());
                lAssistsToulouseVsBdx.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(2).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_SOMALIA)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(88).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BLIN)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BRAITHWAITE)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsToulouseVsBdx.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(2).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_TOIVONEN)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(70).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_EDOUARD)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(85).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_SIRIEIX)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(88).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_PI)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(70).endMinute(90).build());
                lAssistsToulouseVsBdx.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
        }

        for (CPlayerEntity lPlayer : lBdx.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_PRIOR)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_PALLOIS)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsToulouseVsBdx.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(2).build());
                lRedsToulouseVsBdx.add(new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_SABALY)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_GUILBERT)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_POUNDJE)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_TOULALAN)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lYellowsToulouseVsBdx.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_PLASIL)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAssistsToulouseVsBdx.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_MENEZ)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(68).build());
                lYellowsToulouseVsBdx.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_ROLAN)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(75).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_TOURE)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_MALCOLM)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_KAMANO)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(68).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_KIESETHELIN)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(75).endMinute(90).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_OUNAS)){
                lPlayersToulouseVsBdx.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(46).endMinute(90).build());
                lYellowsToulouseVsBdx.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
        }

        CGameEntity lGameToulouseVsBdx = new CGameEntity.CGameBuilder().homeTeam(lToulouse).awayTeam(lBdx).homeScore(4).awayScore(1).scorers(lGoalsToulouseVsBdx).players(lPlayersToulouseVsBdx).assisters(lAssistsToulouseVsBdx).yellowCards(lYellowsToulouseVsBdx).redCards(lRedsToulouseVsBdx).week(2).build();
        lGameToulouseVsBdx.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lGameToulouseVsBdx);
            lCrudMethods.commitTransaction();
        }





















    }
}
