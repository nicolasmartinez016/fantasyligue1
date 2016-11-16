package nmartinez016.univtln.fr.fantasyfootball.websocket;

import android.os.Handler;
import android.os.Looper;
import android.util.Log;

import org.glassfish.tyrus.client.ClientManager;

import java.io.IOException;
import java.net.URI;

import javax.websocket.ClientEndpoint;
import javax.websocket.DeploymentException;
import javax.websocket.EncodeException;
import javax.websocket.EndpointConfig;
import javax.websocket.OnClose;
import javax.websocket.OnOpen;
import javax.websocket.Session;

import fr.univtln.nmartinez016.fantasyfootball.CCustomActionDecoder;
import fr.univtln.nmartinez016.fantasyfootball.CCustomActionEncoder;
import fr.univtln.nmartinez016.fantasyfootball.CCustomActionDecoder;
import fr.univtln.nmartinez016.fantasyfootball.CCustomActionEncoder;
import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;

/**
 * Created by marti on 01/08/2016.
 */


/*
@ClientEndpoint(encoders = {CPayloadBean.PayloadBeanCode.class},
        decoders = {CPayloadBean.PayloadBeanCode.class})*/
@ClientEndpoint(encoders = {CCustomActionEncoder.class},
        decoders = {CCustomActionDecoder.class})
public class CTyrusClient extends Thread{

    private String LOG_TAG = "tag";
    private String IP_ADRESS_EMULATOR = "10.0.3.2";
    private String IP_ADRESS_FAC = "10.21.174.206";
    private String IP_ADRESS = "192.168.1.19";
    private String PORT = "8025";
    private CWebSocketService mServiceWS;
    private static Handler mHandler = new Handler();
    private static ClientManager mClientManager = ClientManager.createClient();
    private static Session mSession;
    public CTyrusClient(){}

    public CTyrusClient(final CWebSocketService pService){
        mServiceWS = pService;
    }

    public boolean isConnectedToServer(){
        return mSession != null;
    }

    @OnOpen
    public void onOpen(final Session pSession, EndpointConfig endpointConfig) throws IOException, EncodeException {
        Log.d(LOG_TAG, "Connection opened.");
        pSession.addMessageHandler(new CMessageHandler(mServiceWS));
        mSession = pSession;
    }

    @OnClose
    public void OnClose(final Session session, EndpointConfig endpointConfig) {
        Log.d(LOG_TAG, "Session closed.");
        mSession = null;
    }

    public void run() {
        Log.d(LOG_TAG, "appel de run");
        Looper.prepare();
        mHandler = new Handler();
        URI uri = URI.create("ws://" + IP_ADRESS/*_FAC*/ + ":" + PORT +"/echo");
        try {
            mClientManager.connectToServer(this, uri);
        } catch (DeploymentException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Looper.loop();
        Log.d(LOG_TAG, "Connecting to " + uri + ".");
    }

    public static void sendMessage(final CAction pAction){
        mHandler.postDelayed(new Runnable() {
            @Override
            public void run() {
                try {
                    if (mSession != null){
                        mSession.getBasicRemote().sendObject(pAction);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } catch (EncodeException e) {
                    e.printStackTrace();
                }
            }
        }, 500);

    }


}