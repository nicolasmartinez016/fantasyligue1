package fr.univtln.nmartinez016;

import com.fasterxml.jackson.databind.ObjectMapper;
import fr.univtln.nmartinez016.fantasyfootball.CCustomActionDecoder;
import fr.univtln.nmartinez016.fantasyfootball.CCustomActionEncoder;
import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.load.CLoadPlayersAction;
import org.glassfish.tyrus.client.ClientManager;

import javax.websocket.*;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URI;

/**
 * Created by marti on 13/10/2016.
 */

@ClientEndpoint(encoders = {CCustomActionEncoder.class},
        decoders = {CCustomActionDecoder.class})
public class CClientTest {
    public final static String SERVER_IP;
    public final static int SERVER_PORT;

    public CClientTest() {

    }

    static {
        String ip = null;
        int port = 8025;
        try {
            ip = System.getProperty("fr.univtln.nmartinez016.ip");
        } catch (NullPointerException e) {
        }

        try {
            port = Integer.parseInt(System.getProperty("fr.univtln.nmartinez016.port"));
        } catch (NullPointerException e) {
        } catch (NumberFormatException e) {
        }
        if (ip == null) ip = "localhost";
        SERVER_IP = ip;
        SERVER_PORT = port;
        System.out.println("Server IP:" + SERVER_IP + " Port: " + SERVER_PORT);
    }

    private Session session;

    @OnOpen
    public void onOpen(final Session session, EndpointConfig endpointConfig) throws IOException, EncodeException {
        this.session = session;
        ObjectMapper lMapper = new ObjectMapper();
        CAction lAction = new CLoadPlayersAction.CLoadPlayersBuilder().ageOk(1).age(12).build();
        String lJson = lMapper.writeValueAsString(lAction);
        System.out.println(lJson);
        System.out.println("I am " + session.getId());
        System.out.println("Sending Hello message to server");
        session.getBasicRemote().sendObject(lAction);
        //session.getBasicRemote().sendObject(lAction);
    }

    @OnMessage
    public void OnMessage(CAction bean) {
        System.out.println("RECU !");

    }

    @OnClose
    public void OnClose(final Session session, EndpointConfig endpointConfig) {
        System.out.println("Session closed");
    }

    public void closeSession() throws IOException {
        if (session.isOpen())
            session.close(new CloseReason(CloseReason.CloseCodes.NORMAL_CLOSURE, "OK"));
    }

    public void sendMessage(String message) {
        CAction bean = null;

        try {
            session.getBasicRemote().sendObject(bean);

        } catch (IOException e) {
            e.printStackTrace();
        } catch (EncodeException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        CClientTest beanClient = new CClientTest();
        try {
            final ClientManager client = ClientManager.createClient();
            client.connectToServer(
                    beanClient,
                    URI.create("ws://" + SERVER_IP + ":" + SERVER_PORT + "/echo")
            );

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
            System.out.println("Send empty line to stop the client.");
            String line;
            do {
                line = reader.readLine();
                if (!"".equals(line))
                    beanClient.sendMessage(line);
            } while (!"".equals(line));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            try {
                beanClient.closeSession();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
