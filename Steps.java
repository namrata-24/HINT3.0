package com.varsha.hint_30;

import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

public class Steps extends AppCompatActivity {
    TextView tv_steps;
    SensorManager sensorManager;
    boolean running = false;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_steps);
        tv_steps = (TextView)findViewById(R.id.tv_steps);
        sensorManager =(SensorManager)getSystemService(Context.SENSOR_SERVICE);


    }

    @Override
    public void onResume() {
        super.onResume();
        running = true;
        Sensor countSensor = sensorManager.getDefaultSensor(Sensor.TYPE_STEP_COUNTER);
        if(countSensor != null)
        {
            sensorManager.registerListener((SensorEventListener) this,countSensor,SensorManager.SENSOR_DELAY_UI);

        }
        else
        {
            Toast toast = Toast.makeText(getApplicationContext(),"sensor is not responding",Toast.LENGTH_SHORT);
            toast.show();
        }


    }
    @Override
    public void onPause() {
        super.onPause();
        running=false;

    }

    public void onSensorChanged(SensorEvent event)
    {
        if (running)
        {
            tv_steps.setText(String.valueOf(event.values[0]));

        }



    }

}
