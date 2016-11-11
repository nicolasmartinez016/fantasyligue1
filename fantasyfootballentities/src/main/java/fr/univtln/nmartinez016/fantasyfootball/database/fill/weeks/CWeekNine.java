package fr.univtln.nmartinez016.fantasyfootball.database.fill.weeks;

import fr.univtln.nmartinez016.fantasyfootball.CConstants;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.database.CQueryParameter;
import fr.univtln.nmartinez016.fantasyfootball.entities.*;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by marti on 10/10/2016.
 */
public class CWeekNine {
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

        List<CPlayerByGame> lToulouseVsMonacoPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lNiceVsOlPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lNancyVsPsgPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lBastiaVsAngersPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lGuingampVsLoscPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lLorientVsNantesPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lMhscVsCaenPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lRennesVsBdxPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lAsseVsDijonPlayers = new ArrayList<CPlayerByGame>();
        List<CPlayerByGame> lOmVsMetzPlayers = new ArrayList<CPlayerByGame>();

        List<CGoalsByGame> lToulouseVsMonacoGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lNiceVsOlGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lNancyVsPsgGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lBastiaVsAngersGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lGuingampVsLoscGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lLorientVsNantesGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lMhscVsCaenGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lRennesVsBdxGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lAsseVsDijonGoals = new ArrayList<CGoalsByGame>();
        List<CGoalsByGame> lOmVsMetzGoals = new ArrayList<CGoalsByGame>();

        List<CAssistByGame> lToulouseVsMonacoAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lNiceVsOlAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lNancyVsPsgAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lBastiaVsAngersAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lGuingampVsLoscAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lLorientVsNantesAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lMhscVsCaenAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lRennesVsBdxAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lAsseVsDijonAssists = new ArrayList<CAssistByGame>();
        List<CAssistByGame> lOmVsMetzAssists = new ArrayList<CAssistByGame>();

        List<CSaveByGame> lToulouseVsMonacoSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lNiceVsOlSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lNancyVsPsgSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lBastiaVsAngersSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lGuingampVsLoscSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lLorientVsNantesSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lMhscVsCaenSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lRennesVsBdxSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lAsseVsDijonSaves = new ArrayList<CSaveByGame>();
        List<CSaveByGame> lOmVsMetzSaves = new ArrayList<CSaveByGame>();

        List<CYellowCardByGame> lToulouseVsMonacoYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lNiceVsOlYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lNancyVsPsgYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lBastiaVsAngersYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lGuingampVsLoscYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lLorientVsNantesYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lMhscVsCaenYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lRennesVsBdxYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lAsseVsDijonYellowCards = new ArrayList<CYellowCardByGame>();
        List<CYellowCardByGame> lOmVsMetzYellowCards = new ArrayList<CYellowCardByGame>();



    }
}
