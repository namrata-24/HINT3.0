package com.varsha.hint_30;

/**
 * Created by VARSHANI on 13-03-2018.
 */

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.view.View;
import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Calendar;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by VARSHANI on 06-01-2018.
 */

public class Signup extends Login {

    DatabaseHelper helper=new DatabaseHelper(this);
    private static final String TAG = "MainActivity";
    private TextView mDisplayDate;
    private DatePickerDialog.OnDateSetListener mDateSetListener;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
        mDisplayDate = (TextView) findViewById(R.id.etdob);

        mDisplayDate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Calendar cal = Calendar.getInstance();
                int year = cal.get(Calendar.YEAR);
                int month = cal.get(Calendar.MONTH);
                int day = cal.get(Calendar.DAY_OF_MONTH);

                DatePickerDialog dialog = new DatePickerDialog(
                        Signup.this,
                        android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        mDateSetListener,
                        year,month,day);
                dialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                dialog.show();
            }
        });

        mDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int day) {
                month = month + 1;
                Log.d(TAG, "onDateSet: mm/dd/yyy: " + month + "/" + day + "/" + year);

                String date = month + "/" + day + "/" + year;
                mDisplayDate.setText(date);
            }
        };



        EditText a = (EditText) findViewById(R.id.etpwd);
        a.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                if (!isValidPassword(s.toString())) {
                    ((TextView) findViewById(R.id.pass_text)).setText("The password should have atleat one a capital letter ,small letter,number,special chatacter");
                } else {
                    ((TextView) findViewById(R.id.pass_text)).setText("");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }







        });




        EditText b = (EditText) findViewById(R.id.etid);
        b.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!isValidemail(s.toString())) {
                    ((TextView) findViewById(R.id.emailmsg)).setText("not a proper mail id");
                } else {
                    ((TextView) findViewById(R.id.emailmsg)).setText("");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });
        EditText c = (EditText) findViewById(R.id.etphn);
        c.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {

                if (!isValidcontact(s.toString())) {
                    ((TextView) findViewById(R.id.contactmsg)).setText("not a proper phone number");
                } else {
                    ((TextView) findViewById(R.id.contactmsg)).setText("");
                }

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });






    }

    public void onButtonClick(View V)
    {
        if(V.getId()==R.id.submitbtn) {
            int res=0;

            EditText uname = (EditText) findViewById(R.id.etname);
            EditText uemailid = (EditText) findViewById(R.id.etid);
            EditText upassw = (EditText) findViewById(R.id.etpwd);
            EditText ucpassw = (EditText) findViewById(R.id.etcpwd);
            EditText uphone = (EditText) findViewById(R.id.etphn);

            EditText udob = (EditText) findViewById(R.id.etdob);

            String namestr = uname.getText().toString();
            String emailstr = uemailid.getText().toString();
            String pwdstr = upassw.getText().toString();
            String cpwdstr = ucpassw.getText().toString();

            String phnstr = uphone.getText().toString();

            String dobstr = udob.getText().toString();


            if ((!pwdstr.equals(cpwdstr))||namestr.isEmpty()||emailstr.isEmpty()||pwdstr.isEmpty()||cpwdstr.isEmpty()||phnstr.isEmpty()||dobstr.isEmpty()) {
                if (!pwdstr.equals(cpwdstr)) {
                    //popup
                    Toast msg = Toast.makeText(this, "Passwords do not match!!", Toast.LENGTH_SHORT);
                    msg.show();
                    res = 0;
                } else {
                    Toast msg2 = Toast.makeText(this, "All Fields required!!", Toast.LENGTH_SHORT);
                    msg2.show();
                    res = 0;
                }
            }
            else res=1;

            if (res == 1) {
                //upload data to database
                Contact c = new Contact();
                c.setName(namestr);
                c.setEmail(emailstr);
                c.setPassword(pwdstr);
                c.setPhone(phnstr);

                c.setDob(dobstr);

                helper.insertContact(c);
                Toast reg = Toast.makeText(Signup.this, "Successfully Registered", Toast.LENGTH_SHORT);
                reg.show();
            }
        }


        else if(V.getId()==R.id.clrbtn)
        {
            ((EditText)findViewById(R.id.etname)).setText("");
            ((EditText)findViewById(R.id.etpwd)).setText("");
            ((EditText)findViewById(R.id.etcpwd)).setText("");
            ((EditText)findViewById(R.id.etid)).setText("");
            ((EditText)findViewById(R.id.etphn)).setText("");


        }

        else if(V.getId()==R.id.tvback)
        {
            Intent intent=new Intent(Signup.this,Login.class);
            startActivity(intent);

        }

    }


    //password
    public boolean isValidPassword(final String password) {

        Pattern pattern;
        Matcher matcher;

        final String PASSWORD_PATTERN = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[@#$%^&+=])(?=\\S+$).{4,}$";

        pattern = Pattern.compile(PASSWORD_PATTERN);
        matcher = pattern.matcher(password);

        return matcher.matches();

    }
    public boolean isValidemail(final String email) {

        Pattern pattern;
        Matcher matcher;

        final String EMAIL_PATTERN ="^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";

        pattern = Pattern.compile(EMAIL_PATTERN);
        matcher = pattern.matcher(email);

        return matcher.matches();

    }
    public boolean isValidcontact(final String contact) {

        Pattern pattern;
        Matcher matcher;

        final String CONTACT_PATTERN = "[0-9]{10}";

        pattern = Pattern.compile(CONTACT_PATTERN);
        matcher = pattern.matcher(contact);

        return matcher.matches();

    }













}

