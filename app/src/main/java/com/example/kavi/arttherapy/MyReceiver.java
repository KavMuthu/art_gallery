package com.example.kavi.arttherapy;
import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.support.v7.app.NotificationCompat;
import android.util.Log;

/**
 * Created by Kavi on 2/25/16.
 */
public class MyReceiver extends BroadcastReceiver {
    Context context = null;
    @Override
    public void onReceive(Context context, Intent intent) {

        this.context = context;
        if (intent.getAction() != null) {
            if( intent.getAction().equals(Intent.ACTION_USER_PRESENT)) {

                //launches the main activity
                PendingIntent contentIntent = PendingIntent.getActivity(context, 0,
                        new Intent(context, MainActivity.class), 0);

               //notification when the phone unlocks
                NotificationCompat.Builder mBuilder =
                        (NotificationCompat.Builder) new NotificationCompat.Builder(context)
                                .setSmallIcon(android.R.drawable.ic_menu_day)
                                .setContentTitle("Art Therapy")
                                .setContentText("Continue drawing!");
                mBuilder.setContentIntent(contentIntent);
                mBuilder.setDefaults(Notification.DEFAULT_SOUND);
                mBuilder.setAutoCancel(true);
                NotificationManager mNotificationManager =
                        (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
                mNotificationManager.notify(1, mBuilder.build());
            }
        }



    }
}
