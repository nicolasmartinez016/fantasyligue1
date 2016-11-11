package fr.univtln.nmartinez016.fantasyfootball.actions.load;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;

import java.io.Serializable;

/**
 * Created by marti on 25/09/2016.
 * Action that a client sends to the server to
 * get the 15 best players ranked by the amount of pks
 * they saved.
 */
public class CLoadPlayersByPenaltiesSaved extends CAction implements Serializable {

    public CLoadPlayersByPenaltiesSaved(){}
}
