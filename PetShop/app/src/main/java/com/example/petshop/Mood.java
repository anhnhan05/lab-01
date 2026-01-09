package com.example.petshop;

import java.util.Date;

public abstract class Mood {
    private Date date;

    // Constructor 1: default date (now)
    public Mood() {
        this.date = new Date();
    }

    // Constructor 2: date provided
    public Mood(Date date) {
        this.date = date;
    }

    // Encapsulation: getter + setter
    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    // Each mood must return a string representing that mood
    public abstract String getMoodString();
}

