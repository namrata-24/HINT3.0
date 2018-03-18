package com.varsha.hint_30;

import android.content.Intent;
import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;



public class MainActivity extends AppCompatActivity {

    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bottomNavigationView =(BottomNavigationView)findViewById(R.id.bottomNavigationView);

        bottomNavigationView.setOnNavigationItemReselectedListener(new BottomNavigationView.OnNavigationItemReselectedListener() {
            @Override
            public void onNavigationItemReselected(@NonNull MenuItem item) {
                Fragment f = null;
                if (item.getItemId()==R.id.navigation_dashboard)
                {
                    f = new Frag1();
                     //transaction.replace(R.id.content,new Fragment1()).commit();

                }
                if (item.getItemId()==R.id.navigation_notifications)
                {

                    f = new Frag2();

                   // transaction.replace(R.id.content,new Fragment2()).commit();

                }
                if (item.getItemId()==R.id.navigation_timeline)
                {
                    f = new Frag3();
                   // transaction.replace(R.id.content,new Fragment3()).commit();
                }
                if (item.getItemId()==R.id.navigation_search)
                {
                    String urll = "https://www.google.com/maps/search/hospitals" ;
                    Uri mappy = Uri.parse(urll);

                    Intent in = new Intent(Intent.ACTION_VIEW,mappy);
                    
                    
                        startActivity(in);
                    
                    // transaction.replace(R.id.content,new Fragment3()).commit();
                }


                if(f!=null){
                    FragmentManager fragmentManager = getSupportFragmentManager();
                    FragmentTransaction transaction = fragmentManager.beginTransaction();

                    transaction.replace(R.id.content,f);
                    transaction.commit();

                }

            }
        });


    }
}
