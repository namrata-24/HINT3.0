package com.varsha.hint_30;

import android.app.Activity;
import android.content.Context;
import android.hardware.Sensor;
import android.hardware.SensorEvent;
import android.hardware.SensorEventListener;
import android.hardware.SensorManager;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AlertDialog;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

/**
 * Created by VARSHANI on 17-03-2018.
 */

public class Frag1 extends Fragment{

    int bmi;


    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {

        View v = inflater.inflate(R.layout.frag1,container,false);

        EditText weight = (EditText) v.findViewById(R.id.weight);
        EditText height = (EditText) v.findViewById(R.id.height);
        EditText days = (EditText) v.findViewById(R.id.days);
        EditText hours = (EditText) v.findViewById(R.id.hours);
        EditText exp_weight = (EditText) v.findViewById(R.id.exp_weight);
        Spinner gender = (Spinner) v.findViewById(R.id.gender);

        String w = weight.getText().toString();
        String h = height.getText().toString();
        String d = days.getText().toString();
        String ho = hours.getText().toString();
        String ew = exp_weight.getText().toString();
        String g =  gender.getSelectedItem().toString();


        try{
            int w1 = Integer.parseInt(w);

            int h1 = Integer.parseInt(h);
            int d1 = Integer.parseInt(d);
            int ho1 = Integer.parseInt(ho);
            int ew1 = Integer.parseInt(ew);





        }catch (NumberFormatException ex){}
















        if (bmi<25)
        {


            AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());
            builder.setMessage("Hey ya! you are perfectly healthy ");

        }














        return v ;
    }







}
