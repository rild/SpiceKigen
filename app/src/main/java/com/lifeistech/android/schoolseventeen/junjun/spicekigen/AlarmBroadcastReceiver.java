package com.lifeistech.android.schoolseventeen.junjun.spicekigen;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.media.RingtoneManager;
import android.net.Uri;
import android.os.Build;
import android.util.Log;
import android.widget.Toast;

import com.google.android.gms.games.internal.constants.NotificationChannel;

import java.text.SimpleDateFormat;
import java.util.Locale;

/**
 * Created by junekelectric on 2018/01/26.
 */

public class AlarmBroadcastReceiver extends BroadcastReceiver {

    public static String NOTIFICATION_ID = "notificationId";
    public static String NOTIFICATION_CONTENT = "content";

    @Override
    public void onReceive(Context context, Intent intent) {
        NotificationManager notificationManager = (NotificationManager) context.getSystemService(Context.NOTIFICATION_SERVICE);
        int id = intent.getIntExtra(NOTIFICATION_ID, 0);
        String content = intent.getStringExtra(NOTIFICATION_CONTENT);
        notificationManager.notify(id, buildNotification(context, content));
    }

    private Notification buildNotification(Context context, String content) {
        Notification.Builder builder = new Notification.Builder(context);
        builder.setContentTitle("Notification!!")
                .setContentText(content)
                .setSmallIcon(android.R.drawable.sym_def_app_icon);

        return builder.build();
    }
}

