package fr.univtln.nmartinez016;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
import fr.univtln.nmartinez016.fantasyfootball.entities.CFantasyTeamByWeek;
import fr.univtln.nmartinez016.fantasyfootball.entities.CUserEntity;

import java.io.IOException;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Hello World!" );
        CCrudMethods lCrud = new CCrudMethods();
        ObjectMapper lMapper = new ObjectMapper();
        lCrud.clearCache();
        lMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        CUserEntity lUserGotten = lCrud.find(CUserEntity.class, "117579333926755246721");
        System.out.println(lUserGotten.getCurrentFantasyTeam().getFantasyLeague().getName());
        System.out.println("point user team 1 week 1 : " + lUserGotten.getCurrentFantasyTeam().getPointsByWeekAt(1));
    }
}
