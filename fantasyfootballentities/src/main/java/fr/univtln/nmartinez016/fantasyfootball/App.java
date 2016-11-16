package fr.univtln.nmartinez016.fantasyfootball;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.database.CQueryParameter;
import fr.univtln.nmartinez016.fantasyfootball.entities.*;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        CCrudMethods lCrud = new CCrudMethods();
        CUserEntity lUser = lCrud.find(CUserEntity.class, "117579333926755246721");
        CFantasyTeamEntity lTeam = lCrud.find(CFantasyTeamEntity.class, 34);
        System.out.println(lUser.getSelectedLeague().getName());
        lUser.changeSelectedLeague(lTeam);
        System.out.println(lUser.getSelectedLeague().getName());

    }
}
