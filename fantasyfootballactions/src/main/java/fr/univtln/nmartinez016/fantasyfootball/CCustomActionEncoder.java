package fr.univtln.nmartinez016.fantasyfootball;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;

import javax.websocket.EncodeException;
import javax.websocket.Encoder;
import javax.websocket.EndpointConfig;

/**
 * Created by marti on 15/10/2016.
 * Encoder with jackson to serialise the objects to pass
 * them from from the server to the client or the other way.
 */
public class CCustomActionEncoder implements Encoder.Text<CAction> {
    private ObjectMapper mObjectMapper = new ObjectMapper();

    public String encode(CAction pAction) throws EncodeException {
        try {
            String lJson = mObjectMapper.writeValueAsString(pAction);
            System.out.println(lJson);
            return lJson;
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
        return null;
    }

    public void init(EndpointConfig endpointConfig) {

    }

    public void destroy() {

    }
}