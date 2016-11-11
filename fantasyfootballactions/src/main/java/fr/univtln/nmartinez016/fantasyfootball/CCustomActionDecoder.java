package fr.univtln.nmartinez016.fantasyfootball;

import com.fasterxml.jackson.databind.DeserializationFeature;
import com.fasterxml.jackson.databind.ObjectMapper;
import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;

import javax.websocket.DecodeException;
import javax.websocket.Decoder;
import javax.websocket.EndpointConfig;
import java.io.IOException;

/**
 * Created by marti on 15/10/2016.
 * Decoder with jackson to deserialize the json encoded
 * and get the object passed.
 */

public class CCustomActionDecoder implements Decoder.Text<CAction> {
    private ObjectMapper mObjectMapper = new ObjectMapper();

    /**
     * @see javax.websocket.Decoder#init(javax.websocket.EndpointConfig)
     */
    public void init(EndpointConfig config) {
    }

    /**
     * @see javax.websocket.Decoder#destroy()
     */
    public void destroy() {
    }

    /**
     * @see javax.websocket.Decoder.Text#decode(java.lang.String)
     */
    public CAction decode(String pActionJson) throws DecodeException {
        try {
            mObjectMapper.configure(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES, false);

            System.out.println("decode");
            return mObjectMapper.readValue(pActionJson, CAction.class);
        } catch (IOException e) {
            e.printStackTrace();
            System.out.println(e.getMessage());
        }
        return null;
    }


    public boolean willDecode(String s) {
        return true;
    }
}
