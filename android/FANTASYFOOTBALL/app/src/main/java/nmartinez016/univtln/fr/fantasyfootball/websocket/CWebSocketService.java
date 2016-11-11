package nmartinez016.univtln.fr.fantasyfootball.websocket;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.app.Service;
import android.content.Intent;
import android.os.Binder;
import android.os.Handler;
import android.os.IBinder;
import android.os.Messenger;
import android.support.annotation.Nullable;
import android.util.Log;

import nmartinez016.univtln.fr.fantasyfootball.R;
import nmartinez016.univtln.fr.fantasyfootball.activities.CTabsActivity;

/**
 * Created by marti on 01/08/2016.
 */


public class CWebSocketService extends Service {
    private static NotificationManager mNotificaitonManager;
    private final IBinder mBinder = new LocalBinder();

    private CTyrusClient mClientTyrus = new CTyrusClient(this);

    private Handler mHandler;
    private Runnable mRunnable;

    private static Messenger mClientMessenger;


    private int NOTIFICATION = 12;

    @Override
    public void onCreate() {
        Log.d("tag", "dans websocketservice");
        mNotificaitonManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);
        Log.d("tag", "dans websocketservice2");
        mClientTyrus.start();
        Log.d("tag", "dans websocketservice3");
        mHandler = new Handler();
        Log.d("tag", "dans websocketservice4");
    }

    public void showNotification(String pMsg){
        CharSequence lText = pMsg;

        PendingIntent lContentIntent = PendingIntent.getActivity(this, 0, new Intent(this, CTabsActivity.class), 0);

        Notification lNotification = new Notification.Builder(this).
                setSmallIcon(R.mipmap.ic_launcher)
                .setTicker(lText)
                .setWhen(System.currentTimeMillis())
                .setContentTitle("notif!")
                .setContentText(lText)
                .setContentIntent(lContentIntent)
                .build();

        mNotificaitonManager.notify(NOTIFICATION, lNotification);

    }


    public class LocalBinder extends Binder {
        CWebSocketService getService(){
            return CWebSocketService.this;
        }
    }

    @Nullable
    @Override
    public IBinder onBind(Intent intent) {
        return mBinder;
    }

    @Override
    public void onDestroy() {
        super.onDestroy();

    }
}