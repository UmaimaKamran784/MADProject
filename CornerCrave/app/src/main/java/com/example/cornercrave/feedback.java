package com.example.cornercrave;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import android.content.Intent;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
public class feedback extends AppCompatActivity {
    private EditText etFeedback;
    private Button btnSubmit;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.feedback);

        etFeedback = findViewById(R.id.etfeedback);
        btnSubmit = findViewById(R.id.btnsubmit);
        ImageView btnHome = findViewById(R.id.btnhome);
        ImageView btnCategory = findViewById(R.id.btncategory);
        ImageView btnProfile = findViewById(R.id.btnProfile);
        ImageView btnFeedback = findViewById(R.id.btnFeedback);


        btnSubmit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                submitFeedback();
            }
        });

        ImageView backArrow = findViewById(R.id.back);
        backArrow.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(feedback.this, home.class);
                startActivity(intent);
                finish();
            }
        });

        btnHome.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(feedback.this, home.class);
                startActivity(intent);
                finish();
            }
        });

        btnCategory.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(feedback.this, category.class);
                startActivity(intent);
                finish();
            }
        });

        btnProfile.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(feedback.this, profile.class);
                startActivity(intent);
                finish();
            }
        });

        btnFeedback.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(feedback.this, feedback.class);
                startActivity(intent);
                finish();
            }
        });

    }
    private void submitFeedback() {
        String userFeedback = etFeedback.getText().toString().trim();

        if (!userFeedback.isEmpty()) {

            // Show a toast message or perform any other actions
            Toast.makeText(this, "Feedback submitted successfully", Toast.LENGTH_SHORT).show();

            // Clear the EditText after submission
            etFeedback.setText("");
        } else {
            // Inform the user that feedback cannot be empty
            Toast.makeText(this, "Please enter your feedback", Toast.LENGTH_SHORT).show();
        }
    }
}
