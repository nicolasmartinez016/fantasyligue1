package fr.univtln.nmartinez016.fantasyfootball.database.fill.weeks;

import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.database.CQueryParameter;
import fr.univtln.nmartinez016.fantasyfootball.entities.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 14/08/2016.
 */
public class CWeekOne {

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


        List<CGoalsByGame> lGoalsDijonVsNantes = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsBastiaVsPsg = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsNancyVsLyon = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsMonacoVsGuingamp = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsMetzVsLille = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsMontpellierVsAngers = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsBordeauxVsAsse = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsCaenVsLorient = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGoalsNiceVsRennes = new ArrayList<CGoalsByGame>();

        List<CPlayerByGame> lDijonVsNantesPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lBastiaVsPsgPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lNancyVsLyonPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lMonacoVsGuingampPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lMetzVsLillePlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lMontpellierVsAngersPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lBordeauxVsAssePlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lCaenVsLorientPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lNiceVsRennesPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lMarseilleVsToulousePlayers = new ArrayList<CPlayerByGame>();

        List<CAssistByGame> lDijonVsNantesAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lNancyVsLyonAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lMonacoVsGuingampAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lMetzVsLilleAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lMontpellierVsAngersAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lBordeauxVsAsseAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lCaenVsLorientAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lNiceVsRennesAssists = new ArrayList<CAssistByGame>();

        List<CYellowCardByGame> lDijonVsNantesYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lNancyVsLyonYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lBastiaVsPsgYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lMonacoVsGuingampYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lMetzVsLilleYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lMontpellierVsAngersYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lBordeauxVsAsseYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lCaenVsLorientYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lNiceVsRennesYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lMarseilleVsToulouseYellowCards = new ArrayList<CYellowCardByGame>();

        List<CSaveByGame> lDijonVsNantesSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lNancyVsLyonSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lBastiaVsPsgSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lMonacoVsGuingampSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lMetzVsLilleSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lMontpellierVsAngersSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lBordeauxVsAsseSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lCaenVsLorientSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lNiceVsRennesSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lMarseilleVsToulouseSaves = new ArrayList<CSaveByGame>();

        List<CPenaltyConcededByGame> lMonacoVsGuingampPenaltiesConceded = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltyProvokedByGame> lMonacoVsGuingampPenaltiesProvoked = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyScoredByGame> lMonacoVsGuingampPenaltiesScored = new ArrayList<CPenaltyScoredByGame>();

        List<CPenaltyConcededByGame> lCaenVsLorientPenaltiesConceded = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltyProvokedByGame> lCaenVsLorientPenaltiesProvoked = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyScoredByGame> lCaenVsLorientPenaltiesScored = new ArrayList<CPenaltyScoredByGame>();

        List<CPenaltyConcededByGame> lMetzVsLillePenaltiesConceded = new ArrayList<CPenaltyConcededByGame>();
        List<CPenaltyProvokedByGame> lMetzVsLillePenaltiesProvoked = new ArrayList<CPenaltyProvokedByGame>();
        List<CPenaltyScoredByGame> lMetzVsLillePenaltiesScored = new ArrayList<CPenaltyScoredByGame>();



        List<CRedCardByGame> lCaenVsLorientRedCards = new ArrayList<CRedCardByGame>();

        List<CTotwPlayerEntity> lTotwPlayers = new ArrayList<CTotwPlayerEntity>();

        // GAME DIJON NANTES

        for (CPlayerEntity lPlayer : lNantes.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_RIOU)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lDijonVsNantesSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(2).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_DUBOIS)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_VIZCARRONDO)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_CARLOS)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_LIMA)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_GILLET)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_RONGIER)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_HARIT)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_ILOKI)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lDijonVsNantesYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lDijonVsNantesAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_THOMSEN)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(87).build());
                lDijonVsNantesYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lGoalsDijonVsNantes.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_BAMMOU)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(70).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_MOIMBE)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(87).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_SALA)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(70).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lDijon.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_REYNET)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_CHAFIK)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_VARRAULT)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_ABDELHAMID)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BERNARD)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BALMONT)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_MARIE)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_SAMMARITANO)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(68).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BAHAMBOULA)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_AMALFITANO)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(57).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_TAVARES)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(86).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_DIONY)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(57).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BELA)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(68).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_RIVIERE)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(86).endMinute(90).build());
            }
        }


        CGameEntity lDijonVSNantes = new CGameEntity.CGameBuilder().week(1).homeTeam(lDijon).awayTeam(lNantes).homeScore(0).awayScore(1).scorers(lGoalsDijonVsNantes).assisters(lDijonVsNantesAssists).yellowCards(lDijonVsNantesYellowCards).players(lDijonVsNantesPlayers).saves(lDijonVsNantesSaves).build();
        lDijonVSNantes.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lDijonVSNantes);
            lCrudMethods.commitTransaction();
        }

        // GAME METZ VS LILLE

        for (CPlayerEntity lPlayer : lMetz.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DIDILLON)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsLilleSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(2).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_FALETTE)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MILAN)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_BALLIU)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(65).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_RIVIEREZ)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DOUKOURE)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsLilleYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_COHADE)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsLilleYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_JOUFFRE)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsMetzVsLille.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lMetzVsLillePenaltiesScored.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MOLLET)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(70).build());
                lMetzVsLilleAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_NGUETTE)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_ERDING)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(82).build());
                lGoalsMetzVsLille.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(2).build());
                lMetzVsLillePenaltiesScored.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_SARR)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(70).endMinute(90).build());
                lMetzVsLillePenaltiesProvoked.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals("basin")){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(65).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DIALLO)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(82).endMinute(90).build());
                lMetzVsLillePenaltiesProvoked.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
        }

        for (CPlayerEntity lPlayer : lLille.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_ENEYAMA)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsLilleYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lMetzVsLillePenaltiesConceded.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_CIVELLI)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_SOUMAORO)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_CORCHIA)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsLillePenaltiesConceded.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_PALMIERI)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsLilleAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_AMADOU)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_AMALFITANO)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(68).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_OBBADI)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(74).build());
                lMetzVsLilleYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_LOPES)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsMetzVsLille.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(2).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BAUTHEAC)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(68).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_EDER)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsLilleAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_SANKHARE)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(68).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_MAVUBA)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(74).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_MENDES)){
                lMetzVsLillePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(68).endMinute(90).build());
            }
        }


        CGameEntity lMetzVSLille = new CGameEntity.CGameBuilder().week(1).homeTeam(lMetz).awayTeam(lLille).homeScore(3).awayScore(2).scorers(lGoalsMetzVsLille).assisters(lMetzVsLilleAssists).yellowCards(lMetzVsLilleYellowCards).players(lMetzVsLillePlayers).saves(lMetzVsLilleSaves).build();
        lMetzVSLille.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMetzVSLille);
            lCrudMethods.commitTransaction();
        }

        // GAME BDX VS ASSE

        for (CPlayerEntity lPlayer : lBdx.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_PRIOR)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lBordeauxVsAsseSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_GUILBERT)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_PALLOIS)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_SABALY)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_POUNDJE)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_PLASIL)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_VADA)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(84).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_TOURE)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lBordeauxVsAsseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lBordeauxVsAsseAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_MALCOLM)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsBordeauxVsAsse.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());

            }
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_ROLAN)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(73).build());
                lGoalsBordeauxVsAsse.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_LABORDE)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(79).build());
                lGoalsBordeauxVsAsse.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lBordeauxVsAsseAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_OUNAS)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(79).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_MENEZ)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(73).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_TRAORE)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(84).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lAsse.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_RUFFIER)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lBordeauxVsAsseSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(3).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_PERRIN)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lBordeauxVsAsseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_POGBA)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_KTC)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_MBENGUE)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(10).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_SELNAES)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_PAJOT)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_CORGNET)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(64).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_HAMOUMA)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lBordeauxVsAsseAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
                lGoalsBordeauxVsAsse.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_TANNANE)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(73).build());
                lBordeauxVsAsseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_BERIC)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_POLOMAT)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(10).endMinute(90).build());
                lBordeauxVsAsseAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());

            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_SODERLUND)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(73).endMinute(90).build());
                lGoalsBordeauxVsAsse.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_KMP)){
                lBordeauxVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(64).endMinute(90).build());
            }

        }


        CGameEntity lBdxVSAsse = new CGameEntity.CGameBuilder().week(1).homeTeam(lBdx).awayTeam(lAsse).homeScore(3).awayScore(2).scorers(lGoalsBordeauxVsAsse).assisters(lBordeauxVsAsseAssists).yellowCards(lBordeauxVsAsseYellowCards).players(lBordeauxVsAssePlayers).saves(lBordeauxVsAsseSaves).build();
        lBdxVSAsse.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBdxVSAsse);
            lCrudMethods.commitTransaction();
        }

        // GAME PSG VS BASTIA

        for (CPlayerEntity lPlayer : lParis.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_PSG_TRAPP)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_AURIER)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_LUIZ)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_KIMPEMBE)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_KURZAWA)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsBastiaVsPsg.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lBastiaVsPsgYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());

            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MOTTA)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(75).build());
                lBastiaVsPsgYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_RABIOT)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_PASTORE)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(75).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_DIMARIA)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_LUCAS)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_BENARFA)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(65).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MATUIDI)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(65).endMinute(90).build());
                lBastiaVsPsgYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_VERRATTI)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(75).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_JESE)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(75).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lBastia.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_LECA)){
                lDijonVsNantesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lBastiaVsPsgYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lBastiaVsPsgSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(5).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_DJIKU)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_SQUILLACI)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lBastiaVsPsgYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_PEYBERNES)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_MARANGE)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_MOSTEFA)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CAHUZAC)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lBastiaVsPsgYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_COULIBALY)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_STMAXIMIN)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_DIALLO) && lPlayer.getFirstName().equals("sadio")){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(58).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CRIVELLI)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(81).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_DANIC)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(58).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_BIFOUMA)){
                lBastiaVsPsgPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(81).endMinute(90).build());
            }
        }


        CGameEntity lBastiaVSPsg = new CGameEntity.CGameBuilder().week(1).homeTeam(lBastia).awayTeam(lParis).homeScore(0).awayScore(1).scorers(lGoalsBastiaVsPsg).yellowCards(lBastiaVsPsgYellowCards).players(lBastiaVsPsgPlayers).saves(lBastiaVsPsgSaves).build();
        lBastiaVSPsg.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lBastiaVSPsg);
            lCrudMethods.commitTransaction();
        }

        // GAME CAEN VS LORIENT

        for (CPlayerEntity lPlayer : lCaen.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_VERCOUTRE)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lCaenVsLorientSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(3).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_YAHIA)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lCaenVsLorientYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BENYOUSSEF)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DABO)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lCaenVsLorientPenaltiesConceded.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_IMOROU)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DASILVA)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BAZILE)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(69).build());
                lCaenVsLorientAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_FERET)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DELAPLACE)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(71).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_RODELIN)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(77).build());
                lGoalsCaenVsLorient.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_SANTINI)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsCaenVsLorient.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(2).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BESSAT)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(69).endMinute(90).build());
                lCaenVsLorientAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_MALBRANQUE)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(71).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_KARAMOH)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(73).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lLorient.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LECOMTE)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lCaenVsLorientSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(8).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_TOURE)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lCaenVsLorientRedCards.add(new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LAUTOA)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_ROSE)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LEGOFF)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lCaenVsLorientYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MESLOUB)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(30).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_NDONG)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MOUKANDJO)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(78).build());
                lGoalsCaenVsLorient.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(2).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
                lCaenVsLorientPenaltiesScored.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_CAFU)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_PHILIPPOTEAUX)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lCaenVsLorientPenaltiesProvoked.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_WARIS)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(75).build());
                lCaenVsLorientAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_JEANNOT)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(75).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_KOFFI)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(30).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_SELEMANI)){
                lCaenVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(72).endMinute(90).build());
                lCaenVsLorientYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_MOREIRA)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }

        }

        CGameEntity lCaenVSLorient = new CGameEntity.CGameBuilder().week(1).homeTeam(lCaen).awayTeam(lLorient).homeScore(3).awayScore(2).scorers(lGoalsCaenVsLorient).players(lCaenVsLorientPlayers).assisters(lCaenVsLorientAssists).yellowCards(lCaenVsLorientYellowCards).saves(lCaenVsLorientSaves).build();
        lCaenVSLorient.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lCaenVSLorient);
            lCrudMethods.commitTransaction();
        }


        // GAME MHSC ANGERS

        for (CPlayerEntity lPlayer : lMhsc.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_JOURDREN)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMontpellierVsAngersSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(3).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_CONGRE)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_HILTON)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_VANDENBORRE)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(86).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_ROUSSILLON)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SKHIRI)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SANSON) && lPlayer.getFirstName().equals("morgan")){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(80).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_MOUNIE)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMontpellierVsAngersYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_BOUDEBOUZ)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsMontpellierVsAngers.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_NINGA)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(60).build());
                lMontpellierVsAngersAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_CAMARA)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_DEPLAGNE)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(86).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_REMY)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(60).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_BERIGAUD)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(80).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lAngers.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_PETRIC)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMontpellierVsAngersSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(4).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_TRAORE)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_THOMAS)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMontpellierVsAngersYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_ANDREU)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MANCEAU)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_SANTAMARIA)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_NDOYE)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_CAPELLE)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(58).build());
                lMontpellierVsAngersYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_SUNU)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(65).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_TOKOEKAMBI)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_DIEDHIOU)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(71).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_NWAKAEME)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(71).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_PEPE)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(65).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_KETKEO)){
                lMontpellierVsAngersPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(58).endMinute(90).build());
            }
        }

        CGameEntity lMhscVSAngers = new CGameEntity.CGameBuilder().week(1).homeTeam(lMhsc).awayTeam(lAngers).homeScore(1).awayScore(0).scorers(lGoalsMontpellierVsAngers).players(lMontpellierVsAngersPlayers).assisters(lMontpellierVsAngersAssists).yellowCards(lMontpellierVsAngersYellowCards).saves(lMontpellierVsAngersSaves).build();
        lMhscVSAngers.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMhscVSAngers);
            lCrudMethods.commitTransaction();
        }

        // GAME MONACO GUINGAMP

        for (CPlayerEntity lPlayer : lMonaco.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_SUBASIC)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMonacoVsGuingampSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(3).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_SIDIBE)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_GLIK)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_JEMERSON)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_MENDY)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(80).build());
                lMonacoVsGuingampYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_FABINHO)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsMonacoVsGuingamp.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lMonacoVsGuingampYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lMonacoVsGuingampPenaltiesScored.add(new CPenaltyScoredByGame.CPenaltyScoredByGameBuilder().shooter(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_BAKAYOKO)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(64).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_DIRAR)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMonacoVsGuingampAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
                lMonacoVsGuingampYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_LEMAR)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_MBAPPE)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(41).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_CARILLO)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_MOUTINHO)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(80).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_BERNARDO)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(41).endMinute(90).build());
                lGoalsMonacoVsGuingamp.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lMonacoVsGuingampPenaltiesProvoked.add(new CPenaltyProvokedByGame.CPenaltyProvokedByGameBuilder().provoker(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_CAVALEIRO)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(64).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lGuingamp.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_JOHNSSON)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMonacoVsGuingampSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(7).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_IKOKO)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMonacoVsGuingampYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_KERBRAT)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMonacoVsGuingampYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SORBON)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_ANGOUA)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DIALLO)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsMonacoVsGuingamp.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lMonacoVsGuingampYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DEAUX)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMonacoVsGuingampAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_COCO)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(88).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SALIBUR)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(81).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_PRIVAT)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(64).build());
                lGoalsMonacoVsGuingamp.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_BRIAND)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMonacoVsGuingampAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_BLAS)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(64).endMinute(90).build());
                lMonacoVsGuingampYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
                lMonacoVsGuingampPenaltiesConceded.add(new CPenaltyConcededByGame.CPenaltyConcededByGameBuilder().fouler(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_MANE)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(88).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_GIRESSE)){
                lMonacoVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(81).endMinute(90).build());
            }
        }


        CGameEntity lMonacoVsGuingamp = new CGameEntity.CGameBuilder().week(1).homeTeam(lMonaco).awayTeam(lGuingamp).homeScore(2).awayScore(2).scorers(lGoalsMonacoVsGuingamp).players(lMonacoVsGuingampPlayers).assisters(lMonacoVsGuingampAssists).yellowCards(lMonacoVsGuingampYellowCards).saves(lMonacoVsGuingampSaves).build();
        lMonacoVsGuingamp.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lMonacoVsGuingamp);
            lCrudMethods.commitTransaction();
        }

        for (CPlayerEntity lPlayer : lNancy.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_NDYASSEMBE)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNancyVsLyonSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_CUFFAUT)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNancyVsLyonYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_DIAGNE)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_LENGLET)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_MURATORI)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
                lNancyVsLyonYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_PEDRETTI)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_NGUESSAN)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNancyVsLyonYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_AITBENNASSER)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_ROBIC)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_KOURA)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(69).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_DALE)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_BADILA)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(46).endMinute(90).build());
                lNancyVsLyonYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_PUYO)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(69).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_MANDANNE)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(46).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lOl.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_OL_LOPES)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNancyVsLyonAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
                lNancyVsLyonSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(5).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_RAFAEL)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNancyVsLyonYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_MAPOU)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_NKOULOU)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNancyVsLyonYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_MOREL)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_GONALONS)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_TOLISSO)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(81).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_DARDER)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(84).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_FEKIR)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(77).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_CORNET)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_LACAZETTE)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsNancyVsLyon.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(3).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_FERRI)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(81).endMinute(90).build());
                lNancyVsLyonAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_GRENIER)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(84).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_VALBUENA)){
                lNancyVsLyonPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(77).endMinute(90).build());
            }
        }



        CGameEntity lNancyVsLyon = new CGameEntity.CGameBuilder().week(1).homeTeam(lNancy).awayTeam(lOl).homeScore(0).awayScore(3).scorers(lGoalsNancyVsLyon).players(lNancyVsLyonPlayers).assisters(lNancyVsLyonAssists).yellowCards(lNancyVsLyonYellowCards).saves(lNancyVsLyonSaves).build();
        lNancyVsLyon.attributePoints();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNancyVsLyon);
            lCrudMethods.commitTransaction();
        }

        // GAME NICE VS RENNES

        for (CPlayerEntity lPlayer : lNice.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NICE_CARDINALE)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNiceVsRennesSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_SOUQUET)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_SARR)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lGoalsNiceVsRennes.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).build());
                lTotwPlayers.add(new CTotwPlayerEntity.CTotwPlayerBuilder().player(lPlayer).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BAYSSE)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_HENRIQUE)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_WALTER)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_KOZIELLO)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_SERI)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNiceVsRennesAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_MARCEL)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(64).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_LUSAMBA)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(88).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_PLEA)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(58).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BODMER)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(88).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_CYPRIEN)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(64).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_DONIS)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(58).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lRennes.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_COSTIL)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNiceVsRennesSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(1).build());
            }

            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_MENDES)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNiceVsRennesYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_BENSEBAINI)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_BAAL)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_FERNANDES)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(79).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_ANDRE)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_CHANTOME)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(24).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_SAID)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_GOURCUFF)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_SIO)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(70).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_GROSICKI)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(24).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_DIAKHABY)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(70).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_ERASMUS)){
                lNiceVsRennesPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(79).endMinute(90).build());
            }
        }

        CGameEntity lNiceVsRennes = new CGameEntity.CGameBuilder().week(1).homeTeam(lNice).awayTeam(lRennes).homeScore(1).awayScore(0).scorers(lGoalsNiceVsRennes).players(lNiceVsRennesPlayers).assisters(lNiceVsRennesAssists).yellowCards(lNiceVsRennesYellowCards).saves(lNiceVsRennesSaves).build();
        lNiceVsRennes.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lNiceVsRennes);
            lCrudMethods.commitTransaction();
        }

        // GAME OM VS TOULOUSE

        for (CPlayerEntity lPlayer : lOm.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_PELE)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMarseilleVsToulouseSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(3).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_DORIA)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMarseilleVsToulouseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_HUBOCAN)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_SAKAI)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_BEDIMO)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(18).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_DIARRA)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_DIABY)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(61).build());
                lMarseilleVsToulouseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_SARR)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_CABELLA)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMarseilleVsToulouseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_THAUVIN)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_GOMIS)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_REKIK)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(18).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_MACHACH)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(61).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_KHAOUI)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(46).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lToulouse.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_LAFONT)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMarseilleVsToulouseSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(2).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_DIOP)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_JULLIEN)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals("amian adou")){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_MOUBANDJE)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BODIGER)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(57).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BLIN)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_TREJO)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_SOMALIA)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_SYLLA)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(74).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BRAITHWAITE)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_PI)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(89).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_EDOUARD)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(74).endMinute(90).build());
            }
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_TOIVONEN)){
                lMarseilleVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(57).endMinute(90).build());
                lMarseilleVsToulouseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
        }

        CGameEntity lOmVsToulouse = new CGameEntity.CGameBuilder().week(1).homeTeam(lOm).awayTeam(lToulouse).homeScore(0).awayScore(0).players(lMarseilleVsToulousePlayers).yellowCards(lMarseilleVsToulouseYellowCards).saves(lMarseilleVsToulouseSaves).build();
        lOmVsToulouse.attributePoints();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lOmVsToulouse);
            lCrudMethods.commitTransaction();
        }


        /*



*/

/*












        CTotwEntity lTotw1 = new CTotwEntity.CTotwBuilder().week(1).totwPlayers(lTotwPlayers).build();

        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lTotw1);
            lCrudMethods.commitTransaction();
        }*/
    }
}
