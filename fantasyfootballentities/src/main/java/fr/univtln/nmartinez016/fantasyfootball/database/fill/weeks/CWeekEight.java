package fr.univtln.nmartinez016.fantasyfootball.database.fill.weeks;

import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.database.CQueryParameter;
import fr.univtln.nmartinez016.fantasyfootball.entities.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 05/10/2016.
 */
public class CWeekEight {
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


        List<CPlayerByGame> lRennesVsGuingampPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lPsgVsBdxPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lCaenVsToulousePlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lDijonVsMhscPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lLoscVsNancyPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lMetzVsMonacoPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lNantesVsBastiaPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lAngersVsOmPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lNiceVsLorientPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lOlVsAssePlayers = new ArrayList<CPlayerByGame>();

        List<CGoalsByGame> lRennesVsGuingampGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lPsgVsBdxGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lCaenVsToulouseGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lDijonVsMhscGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lLoscVsNancyGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lMetzVsMonacoGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lNantesVsBastiaGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lAngersVsOmGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lNiceVsLorientGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lOlVsAsseGoals = new ArrayList<CGoalsByGame>();

        List<CAssistByGame> lRennesVsGuingampAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lPsgVsBdxAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lCaenVsToulouseAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lDijonVsMhscAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lLoscVsNancyAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lMetzVsMonacoAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lNantesVsBastiaAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAngersVsOmAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lNiceVsLorientAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lOlVsAsseAssists = new ArrayList<CAssistByGame>();

        List<CYellowCardByGame> lRennesVsGuingampYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lPsgVsBdxYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lCaenVsToulouseYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lDijonVsMhscYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lLoscVsNancyYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lMetzVsMonacoYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lNantesVsBastiaYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lAngersVsOmYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lNiceVsLorientYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lOlVsAsseYellowCards = new ArrayList<CYellowCardByGame>();

        List<CSaveByGame> lRennesVsGuingampSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lPsgVsBdxSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lCaenVsToulouseSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lDijonVsMhscSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lLoscVsNancySaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lMetzVsMonacoSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lNantesVsBastiaSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lAngersVsOmSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lNiceVsLorientSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lOlVsAsseSaves = new ArrayList<CSaveByGame>();

        List<CRedCardByGame> lRennesVsGuingampRedCards = new ArrayList<CRedCardByGame>();
        List<CRedCardByGame> lMetzVsMonacoRedCards = new ArrayList<CRedCardByGame>();



        // game rennes vs guingamp

        for (CPlayerEntity lPlayer : lRennes.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_COSTIL)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lRennesVsGuingampSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_MEXER)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_MENDES)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_ANDRE)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_BAAL)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_DANZE)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_FERNANDES)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_HUNOU)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(79).build());
                lRennesVsGuingampYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_NTEP)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_GROSICKI)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_SIO)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(60).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_DIAKHABY)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(79).endMinute(90).build());
                lRennesVsGuingampGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(90).build());
                lRennesVsGuingampYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_HENRIQUE)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(89).endMinute(90).build());
                lRennesVsGuingampAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_RENNES_SAID)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(60).build());
            }
        }

        for (CPlayerEntity lPlayer : lGuingamp.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_JOHNSSON)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lRennesVsGuingampSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(4).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_IKOKO)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_ANGOUA)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SORBON)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_KERBRAT)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DIALLO)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lRennesVsGuingampYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(2).build());
                lRennesVsGuingampRedCards.add(new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DEAUX)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_COCO)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
                lRennesVsGuingampYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_GIRESSE)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(66).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SALIBUR)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(84).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_BRIAND)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_DEPAUW)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(89).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_BLAS)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(66).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_GUINGAMP_SANKOH)){
                lRennesVsGuingampPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(84).endMinute(90).build());
            }
        }

        CGameEntity lRennesVsGuingampGame = new CGameEntity.CGameBuilder().homeTeam(lRennes).awayTeam(lGuingamp).homeScore(1).awayScore(0).assisters(lRennesVsGuingampAssists).scorers(lRennesVsGuingampGoals).yellowCards(lRennesVsGuingampYellowCards).redCards(lRennesVsGuingampRedCards).saves(lRennesVsGuingampSaves).players(lRennesVsGuingampPlayers).build();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lRennesVsGuingampGame);
            lCrudMethods.commitTransaction();
        }

        // game psg vs bdx

        for (CPlayerEntity lPlayer : lParis.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_PSG_AREOLA)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_SILVA)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MARQUINHOS)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MEUNIER)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPsgVsBdxYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_KURZAWA)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPsgVsBdxAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_VERRATTI)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(73).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_LUCAS)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(79).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MOTTA)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_MATUIDI)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_CAVANI)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPsgVsBdxGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(3).build());
                lPsgVsBdxGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(30).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_DIMARIA)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
                lPsgVsBdxAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_RABIOT)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(73).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_BENARFA)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(79).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_PSG_IKONE)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(89).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lBdx.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_BDX_CARRASSO)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_CONTENTO)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_PALLOIS)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lPsgVsBdxYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_LEWCZUK)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_SABALY)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_TOULALAN)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_PLASIL)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(57).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_SERTIC)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_MENEZ)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(82).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_ROLAN)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_MALCOLM)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(74).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_OUNAS)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(57).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_LABORDE)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(82).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BDX_TOURE)){
                lPsgVsBdxPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(74).endMinute(90).build());
            }
        }

        CGameEntity lPsgVsBdxGame = new CGameEntity.CGameBuilder().homeTeam(lParis).awayTeam(lBdx).homeScore(2).awayScore(0).players(lPsgVsBdxPlayers).scorers(lPsgVsBdxGoals).assisters(lPsgVsBdxAssists).yellowCards(lPsgVsBdxYellowCards).build();
        if (lCrudMethods.openTransaction()){
            lCrudMethods.create(lPsgVsBdxGame);
            lCrudMethods.commitTransaction();
        }

        // game caen vs toulouse

        for (CPlayerEntity lPlayer : lCaen.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_VERCOUTRE)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_YAHIA)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_IMOROU)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DASILVA)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_GENEVOIS)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DIOMANDE)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_DELAPLACE)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_FERET)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_KARAMOH)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_RODELIN)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_SANTINI)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_BAZILE)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_CAEN_SANE)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
        }

        for (CPlayerEntity lPlayer : lToulouse.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_LAFONT)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_DIOP)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_JULLIEN)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_SYLLA)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_MOUBANDJE)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_MICHELIN)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_TREJO)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_DURMAZ)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BODIGER)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_BLIN)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_EDOUARD)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_AMIANADOU)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_TOULOUSE_TOIVONEN)){
                lCaenVsToulousePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(0).build());
            }
        }

        // game dijon vs mhsc

        for (CPlayerEntity lPlayer : lDijon.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_REYNET)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_LANG)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_RUFLI)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_CHAFIK)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_VARRAULT)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_LEESMELOU)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_MARIE)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_ABEID)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_SAMMARITANO)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BAHAMBOULA)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_DIONY)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_RIVIERE)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_GASTIEN)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_DIJON_BELA)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lMhsc.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_JOURDREN)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_HILTON)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_VANDENBORRE)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_REMY)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_ROUSSILLON)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SYLLA)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SANSON)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_BOUDEBOUZ)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SKHIRI)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_MOUNIE)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_NINGA)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_SESSEGNON)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_MHSC_DEPLAGNE)){
                lDijonVsMhscPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        // game losc vs nancy

        for (CPlayerEntity lPlayer : lLille.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_ENEYAMA)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_CORCHIA)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_CIVELLI)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BASA)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_SANKHARE)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_AMALFITANO)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BAUTHEAC)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_PALMIERI)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_LOPES)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_MAVUBA)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_SOUMAORO)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_BISSOUMA)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LOSC_AMADOU)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lNancy.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_NDYASSEMBE)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_LENGLET)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_BADILA)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_MAOUASSA)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_CHRETIEN)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_CABACO)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_CETOUT)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_AITBENNASSER)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_MARCHETTI)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_DALE)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_KOURA)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_DIA)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_MANDANNE)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANCY_PUYO)){
                lLoscVsNancyPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        // game metz vs monaco

        for (CPlayerEntity lPlayer : lMetz.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DIDILLON)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsMonacoSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(5).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_BISEVAC)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsMonacoYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_FALETTE)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_SIGNORINO)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_BALLIU)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_HEIN)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(66).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DOUKOURE)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(60).build());
                lMetzVsMonacoRedCards.add(new CRedCardByGame.CRedCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MANDJECK)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_COHADE)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsMonacoYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_ERDING)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(73).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_SARR)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_ASSOUEKOTTO)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(46).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_DIALLO)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(66).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_METZ_MOLLET)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(73).endMinute(90).build());
            }



        }

        for (CPlayerEntity lPlayer : lMonaco.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ASM_SUBASIC)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsMonacoSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(6).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_FABINHO)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsMonacoGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(68).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_JEMERSON)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_SIDIBE)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsMonacoYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_GLIK)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_TOURE)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsMonacoAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_MOUTINHO)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
                lMetzVsMonacoAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_BERNARDO)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(72).build());
                lMetzVsMonacoGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(40).build());
                lMetzVsMonacoAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_LEMAR)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsMonacoGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(8).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_CARILLO)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lMetzVsMonacoGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(72).build());
                lMetzVsMonacoGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(83).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_GERMAIN)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(82).build());
                lMetzVsMonacoGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(23).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_NDORAM)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(46).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_BOSCHILIA)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(72).endMinute(90).build());
                lMetzVsMonacoGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(89).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASM_MBAPPE)){
                lMetzVsMonacoPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(82).endMinute(90).build());
                lMetzVsMonacoAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }

        }

        // game nantes vs bastia

        for (CPlayerEntity lPlayer : lNantes.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_RIOU)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNantesVsBastiaSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(5).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_DUBOIS)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_CARLOS)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_VIZCARRONDO)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNantesVsBastiaYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_LIMA)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_GILLET)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_HARIT)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNantesVsBastiaYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_THOMSEN)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_KACANIKLIC)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_SALA)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNantesVsBastiaAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
                lNantesVsBastiaYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_STEPINSKI)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNantesVsBastiaGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).quantity(1).minute(18).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_BAMMOU)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNantesVsBastiaYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_MOIMBE)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NANTES_THOMASSON)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lBastia.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_VINCENSINI)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNantesVsBastiaSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(5).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_PEYBERNES)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_BENGTSSON)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_MARANGE)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNantesVsBastiaYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CIONI)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_DIALLO)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_MOSTEFA)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNantesVsBastiaYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_CAHUZAC)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_COULIBALY)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNantesVsBastiaYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_STMAXIMIN)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_BIFOUMA)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_NANGIS)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_BASTIA_ACHEAMPONG)){
                lNantesVsBastiaPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
        }

        // angers vs om

        for (CPlayerEntity lPlayer : lAngers.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_PETRIC)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAngersVsOmSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(2).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_ANDREU)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAngersVsOmYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_TRAORE)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_THOMAS)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MANGANI)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_NDOYE)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_SANTAMARIA)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(70).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_MANCEAU)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_TOKOEKAMBI)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_DIEDHIOU)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(81).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_PEPE)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(59).endMinute(59).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_CAPELLE)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(70).endMinute(90).build());
                lAngersVsOmGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_NWAKAEME)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(81).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ANGERS_SUNU)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(59).endMinute(90).build());
            }
        }

        for (CPlayerEntity lPlayer : lOm.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_OM_PELE)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAngersVsOmSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(4).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_DORIA)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_SAKAI)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_FANNI)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_BEDIMO)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_CABELLA)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(70).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_SARR)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(89).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_VAINQUEUR)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_THAUVIN)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lAngersVsOmGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(64).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_ZAMBO)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(83).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_GOMIS)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_MACHACH)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(70).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_ISEKA)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(89).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OM_ROLANDO)){
                lAngersVsOmPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(83).endMinute(90).build());
            }
        }

        // game nice vs lorient

        for (CPlayerEntity lPlayer : lNice.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_NICE_CARDINALE)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BAYSSE)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_PEREIRA)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNiceVsLorientGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(11).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BODMER)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(76).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_HENRIQUE)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(63).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_DANTE)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_SARR)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNiceVsLorientYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BELHANDA)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_SERI)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_CYPRIEN)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNiceVsLorientAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_BALOTELLI)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNiceVsLorientYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(2).build());
                lNiceVsLorientGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(86).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_PLEA)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(76).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_NICE_EYSSERIC)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(63).build());
                lNiceVsLorientYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
        }

        for (CPlayerEntity lPlayer : lLorient.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LECOMTE)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_TOURE)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_BELLUGOU)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(64).build());
                lNiceVsLorientYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_CIANI)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MOREIRA)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_LEGOFF)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MVUEMBA)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(85).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_CAFU)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNiceVsLorientYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MARA)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lNiceVsLorientAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_CABOT)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MOUKANDJO)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(72).build());
                lNiceVsLorientGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(61).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_MESLOUB)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(64).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_BENKHEMIS)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(85).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_LORIENT_WARIS)){
                lNiceVsLorientPlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(72).endMinute(90).build());
            }
        }

        // game ol vs asse

        for (CPlayerEntity lPlayer : lOl.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_OL_LOPES)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lOlVsAsseSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(4).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_NKOULOU)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_MAMMANA)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_MOREL)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lOlVsAsseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_RYBUS)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_TOLISSO)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_TOUSARD)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_FERRI)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lOlVsAsseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_DARDER)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lOlVsAsseGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(41).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_VALBUENA)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(63).build());
                lOlVsAsseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_FEKIR)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(88).build());
                lOlVsAsseAssists.add(new CAssistByGame.CAssistByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_KALULU)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(88).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_OL_GHEZZAL)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(63).endMinute(90).build());
                lOlVsAsseGoals.add(new CGoalsByGame.CGoalsByGameBuilder().player(lPlayer).minute(89).build());
            }
        }

        for (CPlayerEntity lPlayer : lAsse.getPlayers()){
            if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_RUFFIER)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lOlVsAsseSaves.add(new CSaveByGame.CSaveByGameBuilder().player(lPlayer).quantity(4).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_MALCUIT)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_PAJOT)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_DABO)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_VERETOUT)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_SELNAES)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_LACROIX)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
                lOlVsAsseYellowCards.add(new CYellowCardByGame.CYellowCardByGameBuilder().player(lPlayer).quantity(1).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_HAMOUMA)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(26).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_KMP)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_BERIC)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(46).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_NORDIN)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(0).endMinute(75).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_TANNANE)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(26).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_SODERLUND)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(46).endMinute(90).build());
            }
            else if (lPlayer.getLastName().equals(CConstants.NAME_ASSE_ROUX)){
                lOlVsAssePlayers.add(new CPlayerByGame.CPlayerByGameBuilder().player(lPlayer).startMinute(75).endMinute(90).build());
            }

        }

    }
}
