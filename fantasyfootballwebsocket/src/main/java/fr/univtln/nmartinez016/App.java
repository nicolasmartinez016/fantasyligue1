package fr.univtln.nmartinez016;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.univtln.nmartinez016.fantasyfootball.database.CCrudMethods;
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
        lMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        CUserEntity lUserGotten = lCrud.find(CUserEntity.class, "117579333926755246721");
        try {
            String lJson = lMapper.writeValueAsString(lUserGotten);
            CUserEntity lUserDeser = lMapper.readValue(lJson, CUserEntity.class);
            System.out.println(lUserDeser.getCurrentFantasyTeam());
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
