package com.example.petshop;

import java.util.Date;

public class HappyMood extends Mood {

    public HappyMood() {
        super(); // default date
    }

    public HappyMood(Date date) {
        super(date);
    }

    @Override
    public String getMoodString() {
        return "happy";
    }
}
