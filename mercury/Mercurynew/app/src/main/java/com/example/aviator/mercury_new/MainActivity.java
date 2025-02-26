package com.example.aviator.mercury_new;


import android.content.Intent;
import android.support.design.widget.NavigationView;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends AppCompatActivity {

    private DrawerLayout mDrawerLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        //Button & EditText Views declaration
        Button login = (Button) findViewById(R.id.Loginbtn);
        Button signup =(Button) findViewById(R.id.SignUpbtn);
        EditText email =(EditText) findViewById(R.id.Emailtxt);
        EditText password =(EditText) findViewById(R.id.Passwordtxt);
        NavigationView navigationView = findViewById(R.id.nav_Bar);

        //Listeners
        login.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent activityChangeIntent = new Intent(MainActivity.this, Browse.class);
                startActivity(activityChangeIntent);
            }
        });

        signup.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                // Do something in response to button click
                Intent activityChangeIntent = new Intent(MainActivity.this, SignUp.class);
                startActivity(activityChangeIntent);
            }
        });

        navigationView.setNavigationItemSelectedListener(
                new NavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(MenuItem menuItem) {
                        // set item as selected to persist highlight
                        menuItem.setChecked(true);
                        // close drawer when item is tapped
                        mDrawerLayout.closeDrawers();

                        // Add code here to update the UI based on the item selected
                        // For example, swap UI fragments here

                        return true;
                    }
                });
    }
}

