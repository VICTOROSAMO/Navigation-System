package com.example.eventnavigationsystem;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    private Button SignUpButton;

    EditText username;
    EditText password;
    Button loginButton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

       SignUpButton=(Button) findViewById(R.id.SignUpButton);
       SignUpButton.setOnClickListener(new View.OnClickListener() {
           @Override
           public void onClick(View v) {
               openSingUp();
           }
       });



        username= findViewById(R.id.username);
        password= findViewById(R.id.password);
        loginButton= findViewById(R.id.loginButton);

        loginButton.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View view) {
                if (username.getText().toString().equals("user") && password.getText().toString().equals("1234")) {

                    Toast.makeText(MainActivity.this,  "Login Successful", Toast.LENGTH_SHORT).show();
                }else {
                    Toast.makeText( MainActivity.this, "Login Failed", Toast.LENGTH_SHORT).show();
                };
            }

        });

    }

    public void openSingUp(){

        Intent intent = new Intent(this,SignUp.class);
        startActivity(intent);

    }
}