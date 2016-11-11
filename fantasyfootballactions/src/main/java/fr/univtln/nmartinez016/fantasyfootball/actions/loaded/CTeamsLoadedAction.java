package fr.univtln.nmartinez016.fantasyfootball.actions.loaded;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CTeamEntity;

import java.io.Serializable;
import java.util.List;

/**
 * Created by marti on 09/08/2016.
 * Action that the server sends to a client after receiving
 * an action CLoadTeams.
 * Contains the list of all the teams.
 */
public class CTeamsLoadedAction extends CAction implements Serializable {

    private List<CTeamEntity> mTeams;

    public CTeamsLoadedAction(){}

    public CTeamsLoadedAction(CTeamsLoadedBuilder pBuilder){
        mTeams = pBuilder.mTeams;
    }

    public List<CTeamEntity> getTeams(){
        return mTeams;
    }

    public void setTeams(List<CTeamEntity> pTeams){
        mTeams = pTeams;
    }

    public static class CTeamsLoadedBuilder{
        private List<CTeamEntity> mTeams;

        public CTeamsLoadedBuilder(){}

        public CTeamsLoadedBuilder teams(List<CTeamEntity> pTeams){
            mTeams = pTeams;
            return this;
        }

        public CTeamsLoadedAction build(){
            return new CTeamsLoadedAction(this);
        }
    }
}
