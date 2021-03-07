package com.uwaterloo.smartpantry;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.uwaterloo.smartpantry.ui.login.LoginActivity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

public class RegLogin extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_register);
        Button registerButton = (Button) findViewById(R.id.base_register);
        Button loginButton = (Button) findViewById(R.id.base_login);

        registerButton.setOnClickListener(new View.OnClickListener() {
            // OnClick -> the login_register activity
            @Override
            public void onClick(View v) {
                Intent registerIntent = new Intent(RegLogin.this, RegisterActivity.class);
                startActivity(registerIntent);
            }
        });

        loginButton.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent loginIntent = new Intent(RegLogin.this, LoginActivity.class);
                startActivity(loginIntent);
            }
        });
        // setContentView(R.layout.activity_register);
        // setContentView(R.layout.activity_login);
        // setContentView(R.layout.activity_main);
        // BottomNavigationView navView = findViewById(R.id.nav_view);
        // Passing each menu ID as a set of Ids because each
        // menu should be considered as top level destinations.
        // AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.navigation_home, R.id.navigation_dashboard, R.id.navigation_notifications).build();
        // NavController navController = Navigation.findNavController(this, R.id.nav_host_fragment);
        // NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);
        // NavigationUI.setupWithNavController(navView, navController);
    }
}