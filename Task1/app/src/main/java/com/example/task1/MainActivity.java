package com.example.task1;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.material.textfield.TextInputLayout;

public class MainActivity extends AppCompatActivity {
EditText Email,Password;
Button login;

String Username = "GSDC-Ronit@gmail.com";
String password = "12345678";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
       
        
        Email=findViewById(R.id.email);
        login=findViewById(R.id.button);
        Password=findViewById(R.id.editTextTextPersonName3);

        
    }
    public void Login(View view){
        if (Password.getText().toString().equals(password))
            if (Email.getText().toString().equals(Username)) {
                Intent i = new Intent(MainActivity.this, MainActivity2.class);
                i.putExtra("Email", Email.getText().toString());
                startActivity(i);
                Toast.makeText(this, "login Successful", Toast.LENGTH_SHORT).show();
            }
    }

}