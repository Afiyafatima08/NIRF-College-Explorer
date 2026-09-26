package com.example.nirfcollegeexplorer;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CollegeAdapter
        extends RecyclerView.Adapter<CollegeAdapter.CollegeViewHolder> {

    private List<College> collegeList;

    public CollegeAdapter(List<College> collegeList) {
        this.collegeList = collegeList;
    }

    @NonNull
    @Override
    public CollegeViewHolder onCreateViewHolder(
            @NonNull ViewGroup parent,
            int viewType) {

        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.college_item, parent, false);

        return new CollegeViewHolder(view);
    }

    @Override
    public void onBindViewHolder(
            @NonNull CollegeViewHolder holder,
            int position) {

        College college = collegeList.get(position);

        // Rank
        holder.txtRank.setText(
                "#" + college.getRank()
        );

        // College Name
        holder.txtCollegeName.setText(
                college.getName()
        );

        // Location
        holder.txtLocation.setText(
                college.getCity() + ", " + college.getState()
        );

        // Institution Type
        holder.txtType.setText(
                college.getType()
        );

        // NIRF Score
        holder.txtScore.setText(
                String.format("NIRF %.2f", college.getScore())
        );

        // Open College Details
        holder.itemView.setOnClickListener(v -> {

            Intent intent = new Intent(
                    v.getContext(),
                    CollegeDetailsActivity.class
            );

            intent.putExtra(
                    "COLLEGE_NAME",
                    college.getName()
            );

            intent.putExtra(
                    "COLLEGE_RANK",
                    college.getRank()
            );

            intent.putExtra(
                    "COLLEGE_CITY",
                    college.getCity()
            );

            intent.putExtra(
                    "COLLEGE_STATE",
                    college.getState()
            );

            intent.putExtra(
                    "COLLEGE_TYPE",
                    college.getType()
            );

            intent.putExtra(
                    "COLLEGE_SCORE",
                    college.getScore()
            );

            v.getContext().startActivity(intent);
        });
    }

    @Override
    public int getItemCount() {
        return collegeList.size();
    }

    public void updateList(List<College> newList) {

        collegeList = newList;

        notifyDataSetChanged();
    }

    public static class CollegeViewHolder
            extends RecyclerView.ViewHolder {

        TextView txtRank;
        TextView txtCollegeName;
        TextView txtLocation;
        TextView txtType;
        TextView txtScore;

        public CollegeViewHolder(
                @NonNull View itemView) {

            super(itemView);

            txtRank =
                    itemView.findViewById(R.id.txtRank);

            txtCollegeName =
                    itemView.findViewById(R.id.txtCollegeName);

            txtLocation =
                    itemView.findViewById(R.id.txtLocation);

            txtType =
                    itemView.findViewById(R.id.txtType);

            txtScore =
                    itemView.findViewById(R.id.txtScore);
        }
    }
}