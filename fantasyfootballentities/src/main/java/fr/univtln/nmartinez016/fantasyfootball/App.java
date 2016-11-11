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
        System.out.println(lUser.getSelectedLeague());
        ObjectMapper lMapper = new ObjectMapper();
        lMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);
        try {
            String lJson = lMapper.writeValueAsString(lUser);
            System.out.println(lJson);
            CUserEntity lUser2 = lMapper.readValue(lJson, CUserEntity.class);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
