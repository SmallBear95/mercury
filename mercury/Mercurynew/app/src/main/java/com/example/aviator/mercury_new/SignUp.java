package com.example.aviator.mercury_new;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        //buttons
        Button singup = (Button) findViewById(R.id.SginUpButton);
        Button cancel =(Button) findViewById(R.id.Cancel);
        EditText email =(EditText) findViewById(R.id.SignupEmail);
        EditText password =(EditText) findViewById(R.id.SignupPassword);
        EditText username =(EditText) findViewById(R.id.SignupUsername);

        final String usernamev=username.getText().toString();
        final String passwordv=password.getText().toString();



        //listeners
        singup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click


                Intent activityChangeIntent = new Intent(SignUp.this, Sign_UpINFO.class);
                startActivity(activityChangeIntent);
            }
        });
        cancel.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent activityChangeIntent = new Intent(SignUp.this, MainActivity.class);
                startActivity(activityChangeIntent);
            }
        });
    }
}
