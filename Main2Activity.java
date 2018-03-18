package com.varsha.hint_30;

/**
 * Created by VARSHANI on 18-03-2018.
 */


        import android.app.AlarmManager;
        import android.app.PendingIntent;
        import android.content.Context;
        import android.content.Intent;
        import android.hardware.Sensor;
        import android.hardware.SensorManager;
        import android.support.v7.app.AppCompatActivity;
        import android.os.Bundle;
        import android.view.View;
        import android.widget.Button;
        import android.widget.TextView;

        import java.util.Calendar;

public class Main2Activity extends AppCompatActivity {

    private TextView textView;
    private Context mcontext ;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);
        Button BtnStart = (Button) findViewById(R.id.btn_start);
        BtnStart.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View arg0) {
                Calendar cal =  Calendar.getInstance();
                cal.set(cal.get(Calendar.YEAR),cal.get(Calendar.MONTH),cal.get(Calendar.DAY_OF_MONTH),5,50);
                setalarm(cal.getTimeInMillis());
            }
        });



    }
    void setalarm(long milli){
        AlarmManager am = (AlarmManager)mcontext.getSystemService(Context.ALARM_SERVICE);
        Intent in = new Intent(this, AlarmReceiver.class);
        PendingIntent pi = PendingIntent.getBroadcast(mcontext,0,in,0);
        am.set(AlarmManager.RTC,milli,pi);
    }
}
