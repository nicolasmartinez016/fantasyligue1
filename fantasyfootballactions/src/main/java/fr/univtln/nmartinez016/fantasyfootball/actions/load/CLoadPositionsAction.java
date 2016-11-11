package fr.univtln.nmartinez016.fantasyfootball.actions.load;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;

import java.io.Serializable;

/**
 * Created by marti on 02/09/2016.
 * Action that a client sends to the server to
 * get all the positions where players can be put at.
 */
public class CLoadPositionsAction extends CAction implements Serializable {

    public CLoadPositionsAction(){}
}
