package com.example.nirfcollegeexplorer;
import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    Button btnRankWise;
    Button btnBandWise;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

        btnRankWise = findViewById(R.id.btnRankWise);
        btnBandWise = findViewById(R.id.btnBandWise);

        btnRankWise.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    RankWiseActivity.class
            );
            startActivity(intent);
        });
        btnBandWise.setOnClickListener(v -> {

            Intent intent = new Intent(
                    MainActivity.this,
                    BandWiseActivity.class
            );
            startActivity(intent);
        });
    }
}