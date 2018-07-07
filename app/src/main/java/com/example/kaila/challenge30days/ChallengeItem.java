package com.example.kaila.challenge30days;

/**
 * Created by kaila on 6/6/2018.
 */

public class ChallengeItem {

    // pulls Day & month of task completed

    private int day;
    private int month;

    public ChallengeItem(int month, int day){
        this.month = month;
        this.day = day;
    }

    public int getDay() {
        return day;
    }

    public int getMonth() {
        return month;
    }
}
