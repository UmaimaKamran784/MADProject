package com.example.cornercrave;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.content.Intent;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class signin extends AppCompatActivity{


        private EditText etUsername, etPassword;
        private Button btnSignIn;
        private TextView clickableNext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signin);

        etUsername = findViewById(R.id.etusername);
        etPassword = findViewById(R.id.etpassword);
        btnSignIn = findViewById(R.id.btnSignin);
        clickableNext = findViewById(R.id.clickablenext);
        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
            }
        });
        clickableNext.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Handle the signup text click event
                // Add your logic here
            }
        });
        ImageView backArrow = findViewById(R.id.back);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(signin.this, home.class);
                startActivity(intent);
                finish();
            }
        });
    }
}
