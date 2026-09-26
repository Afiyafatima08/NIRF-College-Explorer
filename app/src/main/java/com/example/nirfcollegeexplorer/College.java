package com.example.nirfcollegeexplorer;

public class College {

    private int rank;
    private String name;
    private String city;
    private String state;
    private String type;
    private double score;

    public College(
            int rank,
            String name,
            String city,
            String state,
            String type,
            double score) {

        this.rank = rank;
        this.name = name;
        this.city = city;
        this.state = state;
        this.type = type;
        this.score = score;
    }

    public int getRank() {
        return rank;
    }

    public String getName() {
        return name;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getType() {
        return type;
    }

    public double getScore() {
        return score;
    }
}