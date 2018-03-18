package com.varsha.hint_30;

/**
 * Created by VARSHANI on 13-03-2018.
 */

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;


public class Login extends AppCompatActivity {

    DatabaseHelper helper=new DatabaseHelper(this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);


    }

    public void onButtonClick(View V)
    {
        if(V.getId()==R.id.sgnupbtn)
        {
            Intent i = new Intent(Login.this, Signup.class);
            startActivity(i);
        }


        EditText userid= (EditText) findViewById(R.id.etuserid);
        EditText password= (EditText) findViewById(R.id.etpwd);

        String useridstr=userid.getText().toString();
        String passwordstr=password.getText().toString();

        if(V.getId()==R.id.loginbtn)
        {

            String password1=helper.searchPass(useridstr);

            //check userid and password from database

            if(passwordstr.equals(password1))
            {
                //proceed further into the app
                Toast welcome=Toast.makeText(Login.this,"Welcome to HealthOL",Toast.LENGTH_SHORT);
                welcome.show();
            }
            else
            {
                Toast msg3= Toast.makeText(Login.this,"Incorrect Username or Password",Toast.LENGTH_SHORT);
                msg3.show();
            }


        }


    }



}
