package com.example.nirfcollegeexplorer;

import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.widget.Button;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;

public class RankWiseActivity extends AppCompatActivity {
    RecyclerView collegeRecyclerView;
    EditText searchCollege;
    CollegeAdapter adapter;
    Button btnBack;
    ArrayList<College> collegeList;
    ArrayList<College> filteredColleges;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_rank_wise);
        btnBack = findViewById(R.id.btnBack);

        btnBack.setOnClickListener(v -> finish());
        collegeRecyclerView = findViewById(R.id.collegeRecyclerView);
        searchCollege = findViewById(R.id.searchCollege);
        collegeRecyclerView.setLayoutManager(
                new LinearLayoutManager(this)
        );
        collegeList = CollegeData.getColleges(this);
        int minRank = getIntent().getIntExtra("MIN_RANK", 1);
        int maxRank = getIntent().getIntExtra("MAX_RANK", 100);

        // Filter colleges according to rank range
        filteredColleges = new ArrayList<>();

        for (College college : collegeList) {

            if (college.getRank() >= minRank &&
                    college.getRank() <= maxRank) {

                filteredColleges.add(college);
            }
        }
        adapter = new CollegeAdapter(filteredColleges);
        collegeRecyclerView.setAdapter(adapter);
        searchCollege.addTextChangedListener(new TextWatcher() {

            @Override
            public void beforeTextChanged(
                    CharSequence s,
                    int start,
                    int count,
                    int after) {
            }

            @Override
            public void onTextChanged(
                    CharSequence s,
                    int start,
                    int before,
                    int count) {

                String searchText =
                        s.toString().toLowerCase().trim();

                ArrayList<College> searchResults =
                        new ArrayList<>();

                for (College college : filteredColleges) {

                    if (college.getName()
                            .toLowerCase()
                            .contains(searchText)

                            || college.getCity()
                            .toLowerCase()
                            .contains(searchText)

                            || college.getState()
                            .toLowerCase()
                            .contains(searchText)) {

                        searchResults.add(college);
                    }
                }

                adapter.updateList(searchResults);
            }

            @Override
            public void afterTextChanged(Editable s) {
            }
        });
    }
}