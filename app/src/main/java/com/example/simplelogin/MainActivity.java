package com.example.simplelogin;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.media.Image;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    TextView textView;
    Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        textView = findViewById(R.id.username_input);
        textView = findViewById(R.id.password_input);
        button = findViewById(R.id.btn_login);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getApplicationContext(), homepage.class);
                startActivity(intent);
                finish();
                //create the string
                String email;
                String password;
                //Read the email and the password
                email = textView.getText().toString();
                password= textView.getText().toString();
                //if the email is empty
                if (TextUtils.isEmpty(email)){
                    Toast.makeText(MainActivity.this, "Please Enter Email", Toast.LENGTH_SHORT).show();
                }
                //if it Fails
                if (TextUtils.isEmpty(password)){
                    Toast.makeText(MainActivity.this, "Empty Password", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}