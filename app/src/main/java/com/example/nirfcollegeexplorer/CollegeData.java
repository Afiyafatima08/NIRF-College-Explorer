package com.example.nirfcollegeexplorer;

import android.content.Context;

import org.json.JSONArray;
import org.json.JSONObject;
import java.io.InputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;

public class CollegeData {

    public static ArrayList<College> getColleges(Context context) {
        ArrayList<College> colleges = new ArrayList<>();
        try {
            InputStream inputStream =
                    context.getAssets().open("colleges.json");

            int size = inputStream.available();

            byte[] buffer = new byte[size];

            inputStream.read(buffer);

            inputStream.close();

            String json =
                    new String(buffer, StandardCharsets.UTF_8);

            JSONArray jsonArray =
                    new JSONArray(json);
            for (int i = 0; i < jsonArray.length(); i++) {

                JSONObject object =
                        jsonArray.getJSONObject(i);

                int rank =
                        object.getInt("rank");

                String name =
                        object.getString("name");

                String city =
                        object.getString("city");

                String state =
                        object.getString("state");

                String type =
                        object.getString("type");
                double score =
                        object.getDouble("score");
                College college =
                        new College(
                                rank,
                                name,
                                city,
                                state,
                                type,
                                score
                        );
                colleges.add(college);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        return colleges;
    }
}