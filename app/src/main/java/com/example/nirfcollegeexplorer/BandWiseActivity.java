package com.example.nirfcollegeexplorer;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

public class BandWiseActivity extends AppCompatActivity {
    Button btnBand1;
    Button btnBand2;
    Button btnBand3;
    Button btnBand4;
    Button btnBack;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_band_wise);
        btnBack = findViewById(R.id.btnBack);
        btnBack.setOnClickListener(v -> finish());
        btnBand1 = findViewById(R.id.btnBand1);
        btnBand2 = findViewById(R.id.btnBand2);
        btnBand3 = findViewById(R.id.btnBand3);
        btnBand4 = findViewById(R.id.btnBand4);

        btnBand1.setOnClickListener(v -> openRankWise(1, 10));
        btnBand2.setOnClickListener(v -> openRankWise(11, 20));
        btnBand3.setOnClickListener(v -> openRankWise(21, 50));
        btnBand4.setOnClickListener(v -> openRankWise(51, 100));
    }
    private void openRankWise(int minRank, int maxRank) {
        Intent intent = new Intent(
                BandWiseActivity.this,
                RankWiseActivity.class
        );
        intent.putExtra("MIN_RANK", minRank);
        intent.putExtra("MAX_RANK", maxRank);

        startActivity(intent);
    }
}