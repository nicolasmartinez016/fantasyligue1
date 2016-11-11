package fr.univtln.nmartinez016.fantasyfootball.database;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by marti on 30/07/2016.
 */
public class CQueryParameter {
    private Map parameters = null;

    private CQueryParameter(String name, Object value){
        parameters = new HashMap();
        parameters.put(name, value);
    }

    public static CQueryParameter with(String name, Object value){
        return new CQueryParameter(name, value);
    }

    public CQueryParameter and(String name, Object value){
        parameters.put(name, value);
        return this;
    }

    public Map parameters(){
        return parameters;
    }
}
