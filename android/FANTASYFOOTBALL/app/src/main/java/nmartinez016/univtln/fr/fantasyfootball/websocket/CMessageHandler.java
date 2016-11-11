package nmartinez016.univtln.fr.fantasyfootball.websocket;

import android.content.Intent;
import android.util.Log;

import java.util.List;

import javax.websocket.MessageHandler;

import fr.univtln.nmartinez016.fantasyfootball.actions.CAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CBuyingErrorPlayerTooExpensive;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CBuyingErrorPlayerTooMuchPlayersAndPlayerTooExpensive;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CBuyingErrorTooMuchPlayers;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CConnectedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayerBoughtAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayerMovedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayerPutOnFieldAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayersLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPlayersLoadedByGoals;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CPositionsLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.actions.loaded.CTeamsLoadedAction;
import fr.univtln.nmartinez016.fantasyfootball.entities.CPlayerEntity;

/**
 * Created by marti on 01/08/2016.
 */


public class CMessageHandler implements MessageHandler.Whole<CAction> {

    private CWebSocketService mWebSocketService;
    public static String TYPE = "type";
    public static String PLAYERS = "players";
    public static String TEAMS = "teams";
    public static String POSITIONS = "positions";
    public static String INTENT_TYPE = "intent_type";
    public static String PLAYERS_BY_GOALS = "playersbygoals";
    public static String PLAYER_PUT_ON_FIELD = "player_put_on_field";
    public static String PLAYER_MOVED = "player_moved";
    public static final String CONNECTED = "connected";
    public static final String PLAYER_BOUGHT = "player_bought";


    public CMessageHandler(CWebSocketService pService){
        mWebSocketService = pService;
    }

    @Override
    public void onMessage(CAction pAction) {

        /*
         * When the server sends an action CPlayersLoaded, just
         * send the object to the other activities so they can use
         * the list of players inside.
         */

        if (pAction instanceof CPlayersLoadedAction){
            Log.i("tag", "c est un type players loaded");
            CPlayersLoadedAction lPlayersLoaded = (CPlayersLoadedAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CPlayersLoadedAction.class.getName());
            lIntent.putExtra(PLAYERS, lPlayersLoaded);
            mWebSocketService.sendBroadcast(lIntent);
        }

        if (pAction instanceof CTeamsLoadedAction){
            Log.i("teams", "dans msghandler teamsloaded");
            CTeamsLoadedAction lTeamsLoadedAction = (CTeamsLoadedAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CTeamsLoadedAction.class.getName());
            lIntent.putExtra(TEAMS, lTeamsLoadedAction);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * When the server sends an action CPositionsLoaded, just
         * send to the activities the object so they can use the list of
         * positions inside.
         */

        if (pAction instanceof CPositionsLoadedAction){
            CPositionsLoadedAction lPositionsLoadedAction = (CPositionsLoadedAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CPositionsLoadedAction.class.getName());
            lIntent.putExtra(POSITIONS, lPositionsLoadedAction);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * When the server sends an action CPlayersLoadedByGoals, just
         * send to the activities the object so they can use the list of
         * players inside.
         */
        if (pAction instanceof CPlayersLoadedByGoals){
            CPlayersLoadedByGoals lPlayersLoadedByGoals = (CPlayersLoadedByGoals) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CPlayersLoadedByGoals.class.getName());
            lIntent.putExtra(PLAYERS_BY_GOALS, lPlayersLoadedByGoals);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * When the server sends an action CPlayerPutOnField, just
         * send to the squad management the object so it can update
         * the static user and reload the field view
         */

        if (pAction instanceof CPlayerPutOnFieldAction){
            CPlayerPutOnFieldAction lPlayerPutOnField = (CPlayerPutOnFieldAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CPlayerPutOnFieldAction.class.getName());
            lIntent.putExtra(PLAYER_PUT_ON_FIELD, lPlayerPutOnField);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * When the server sends an action CPlayerMoved, just
         * send to the squad management the object so it can update
         * the static user and reload the field view
         */

        if (pAction instanceof CPlayerMovedAction){
            CPlayerMovedAction lPlayerMoved = (CPlayerMovedAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CPlayerMovedAction.class.getName());
            lIntent.putExtra(PLAYER_MOVED, lPlayerMoved);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * When the server sends an action CConnected, just
         * send to the authentification activity the object so it can
         * update the static user and start the game activity
         */

        if (pAction instanceof CConnectedAction){
            CConnectedAction lConnectedAction = (CConnectedAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CConnectedAction.class.getName());
            lIntent.putExtra(CONNECTED, lConnectedAction);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * player bought
         */

        if (pAction instanceof CPlayerBoughtAction){
            CPlayerBoughtAction lPlayerBoughtAction = (CPlayerBoughtAction) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CPlayerBoughtAction.class.getName());
            lIntent.putExtra(PLAYER_BOUGHT, lPlayerBoughtAction);
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * error player bought too expensive
         */

        if (pAction instanceof CBuyingErrorPlayerTooExpensive){
            CBuyingErrorPlayerTooExpensive lBuyingErrorPlayerTooExpensive = (CBuyingErrorPlayerTooExpensive) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CBuyingErrorPlayerTooExpensive.class.getName());
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * error player bought too much player
         */

        if (pAction instanceof CBuyingErrorPlayerTooExpensive){
            CBuyingErrorTooMuchPlayers lBuyingErrorPlayerTooMuchPlayers = (CBuyingErrorTooMuchPlayers) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CBuyingErrorTooMuchPlayers.class.getName());
            mWebSocketService.sendBroadcast(lIntent);
        }

        /*
         * error player bought both
         */

        if (pAction instanceof CBuyingErrorPlayerTooMuchPlayersAndPlayerTooExpensive){
            CBuyingErrorPlayerTooMuchPlayersAndPlayerTooExpensive lBuyingErrorPlayerTooMuchPlayersAndTooExpensive = (CBuyingErrorPlayerTooMuchPlayersAndPlayerTooExpensive) pAction;
            Intent lIntent = new Intent(INTENT_TYPE);
            lIntent.putExtra(TYPE, CBuyingErrorPlayerTooMuchPlayersAndPlayerTooExpensive.class.getName());
            mWebSocketService.sendBroadcast(lIntent);
        }

    }
}