package com.example.aviator.mercury_new;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Sign_UpINFO extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign__up_info);

        Button uploadPic = (Button) findViewById(R.id.UploadPic);
        Button next = (Button) findViewById(R.id.Next);

        uploadPic.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent activityChangeIntent = new Intent(Sign_UpINFO.this, Browse.class);
                startActivity(activityChangeIntent);
            }
        });

        next.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent activityChangeIntent = new Intent(Sign_UpINFO.this, Browse.class);
                startActivity(activityChangeIntent);
            }
        });
    }
}
