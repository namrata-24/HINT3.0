package com.varsha.hint_30;

/**
 * Created by VARSHANI on 18-03-2018.
 */
        import android.app.AlarmManager;
        import android.app.PendingIntent;
        import android.content.BroadcastReceiver;
        import android.content.Context;
        import android.content.Intent;

        import java.util.Calendar;

/**
 * Created by lenovo on 3/17/2018.
 */

class AlarmReceiver extends BroadcastReceiver {

    private Context mContext;


    @Override
    public void onReceive(Context context, Intent intent) {
        mContext = context ;
        Calendar cal = Calendar.getInstance();


    }

}
