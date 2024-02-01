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
public class signup extends AppCompatActivity{
    private EditText etUsername, etName, etPassword, etConfirmPassword;
    private Button btnSignup;

    @Override
    protected void onCreate( Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.signup);
            // Find views by their IDs
            etUsername = findViewById(R.id.etusername);
            etName = findViewById(R.id.etname);
            etPassword = findViewById(R.id.etpassword);
            etConfirmPassword = findViewById(R.id.etconfirmpassword);
            btnSignup = findViewById(R.id.btnSignup);

            // Set click listener for the "SIGN UP" button
            btnSignup.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Intent intent = new Intent(signup.this, home.class);
                    startActivity(intent);
                    finish();
                }
            });


    }
}
