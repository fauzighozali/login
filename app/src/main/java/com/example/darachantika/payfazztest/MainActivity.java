package com.example.darachantika.payfazztest;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    private EditText username, password;
    private Button buttonLogin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        username = (EditText) findViewById(R.id.edit_text_username);
        password = (EditText) findViewById(R.id.edit_text_password);
        buttonLogin = (Button) findViewById(R.id.button_login);

        buttonLogin.setOnClickListener(v->{
            if (username.getText().toString().equals("admin") && password.getText().toString().equals("password")){
                Toast.makeText(getApplicationContext(), "Success",Toast.LENGTH_SHORT).show();
            }else {
                Toast.makeText(getApplicationContext(), "Failed",Toast.LENGTH_SHORT).show();
            }
        });
    }
}
