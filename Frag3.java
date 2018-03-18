package com.varsha.hint_30;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * Created by VARSHANI on 17-03-2018.
 */

public class Frag3 extends Fragment {

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.frag3,container,false);

        return v;

    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);


        TextView textview1=(TextView)view.findViewById(R.id.textview1);
        TextView textview2=(TextView) view.findViewById(R.id.textview2);
        TextView textview3=(TextView) view.findViewById(R.id.textview3);
        TextView textview4=(TextView) view.findViewById(R.id.textview4);
        TextView textview5=(TextView) view.findViewById(R.id.textview5);
        TextView textview6=(TextView) view.findViewById(R.id.textview6);
        TextView textview7=(TextView) view.findViewById(R.id.textview7);
        TextView textview8=(TextView) view.findViewById(R.id.textview8);
        TextView textview9=(TextView) view.findViewById(R.id.textview9);
        TextView textview10=(TextView) view.findViewById(R.id.textview10);
        TextView textview11=(TextView) view.findViewById(R.id.textview11);
        TextView textview12=(TextView) view.findViewById(R.id.textview12);
        TextView textview13=(TextView) view.findViewById(R.id.textview13);
        TextView textview14=(TextView) view.findViewById(R.id.textview14);
        TextView textview15=(TextView) view.findViewById(R.id.textview15);
        TextView textview16=(TextView) view.findViewById(R.id.textview16);
        TextView textview17=(TextView) view.findViewById(R.id.textview17);
        TextView textview18=(TextView) view.findViewById(R.id.textview18);
        TextView textview19=(TextView) view.findViewById(R.id.textview19);
        TextView textview20=(TextView) view.findViewById(R.id.textview20);
        TextView textview21=(TextView) view.findViewById(R.id.textview21);

        textview1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/skin-problems-and-treatments/acne/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/anxiety-panic/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/alzheimers/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.medicinenet.com/arthritis/article.htm#what_causes_arthritis";
                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/skin-problems-and-treatments/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/sleep-disorders/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/schizophrenia/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/women/pms/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/mental-health/eating-disorders/binge-eating-disorder/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/cancer/brain-cancer/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/cold-and-flu/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/diabetes/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview13.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/digestive-disorders/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview14.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/erectile-dysfunction/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview15.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/food-recipes/food-poisoning/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview16.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/skin-problems-and-treatments/hair-loss/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview17.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/heart-disease/heart-failure/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview18.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/hiv-aids/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview19.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/pain-management/knee-pain/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview20.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/lung-cancer/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

        textview21.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url= "https://www.webmd.com/migraines-headaches/default.htm";

                Intent i= new Intent(Intent.ACTION_VIEW);
                i.setData(Uri.parse(url));
                startActivity(i);
            }
        });

    }


    }





