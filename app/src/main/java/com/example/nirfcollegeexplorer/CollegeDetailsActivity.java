package com.example.nirfcollegeexplorer;

import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class CollegeDetailsActivity extends AppCompatActivity {
    TextView txtDetailsScore;
    TextView txtDetailsName;
    TextView txtDetailsRank;
    TextView txtDetailsCity;
    TextView txtDetailsState;
    TextView txtDetailsType;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_college_details);
        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());

        txtDetailsName = findViewById(R.id.txtDetailsName);
        txtDetailsRank = findViewById(R.id.txtDetailsRank);
        txtDetailsCity = findViewById(R.id.txtDetailsCity);
        txtDetailsState = findViewById(R.id.txtDetailsState);
        txtDetailsType = findViewById(R.id.txtDetailsType);
        txtDetailsScore = findViewById(R.id.txtDetailsScore);

        String name = getIntent().getStringExtra("COLLEGE_NAME");
        int rank = getIntent().getIntExtra("COLLEGE_RANK", 0);
        double score = getIntent().getDoubleExtra("COLLEGE_SCORE", 0);
        String city = getIntent().getStringExtra("COLLEGE_CITY");
        String state = getIntent().getStringExtra("COLLEGE_STATE");
        String type = getIntent().getStringExtra("COLLEGE_TYPE");
        txtDetailsName.setText(name);
        txtDetailsRank.setText(
                "NIRF Rank: #" + rank
        );
        txtDetailsScore.setText(
                String.format("NIRF Score: %.2f", score)
        );

        txtDetailsCity.setText(
                "City: " + city
        );
        txtDetailsState.setText(
                "State: " + state
        );
        txtDetailsType.setText(
                "Institution Type: " + type
        );
    }
}