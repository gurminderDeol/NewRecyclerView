package com.example.newrecyclerview;

import android.app.AlertDialog;
import android.content.DialogInterface;
import android.content.Intent;
import android.service.autofill.FieldClassification;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Patterns;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class Login extends AppCompatActivity {

    private TextView email;
    private TextView password;
    private Button btnsubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        email=findViewById(R.id.editEmail);
        password=findViewById(R.id.editPassword);
        btnsubmit=findViewById(R.id.btnsubmit);

        btnsubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String Uemail = email.getText().toString();
                String Upassword = password.getText().toString();

               /* if (Uemail.trim().length() == 0 || TextUtils.isEmpty(Uemail)) {
                    //Toast.makeText(Login.this, "enter email", Toast.LENGTH_SHORT).show();

                    return;
                }
                else if (!Patterns.EMAIL_ADDRESS.matcher(Uemail).matches()) {
                  //  Toast.makeText(Login.this, "enter valid email", Toast.LENGTH_SHORT).show();
                    return;
                }*/
                if (Uemail.equals("gurminder25@gmail.com") && Upassword.equals("123"))
                    {
                        Intent itent = new Intent(Login.this, MainActivity.class);
                        startActivity(itent);

                    }
                else
                    {
                        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                                Login.this);

                        // set title
                        alertDialogBuilder.setTitle("Login");

                        // set dialog message
                        alertDialogBuilder
                                .setMessage("Invalid Credentials!")
                                .setCancelable(false)
                                /*.setPositiveButton("Yes",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        // if this button is clicked, close
                                        // current activity
                                        Login.this.finish();
                                    }
                                })*/
                                .setNegativeButton("Ok",new DialogInterface.OnClickListener() {
                                    public void onClick(DialogInterface dialog,int id) {
                                        // if this button is clicked, just close
                                        // the dialog box and do nothing
                                        dialog.cancel();
                                    }
                                });


                        // create alert dialog
                        AlertDialog alertDialog = alertDialogBuilder.create();

                        // show it
                        alertDialog.show();
                        email.setText(" ");
                        password.setText("");

                }

            }
        });

    }
}
