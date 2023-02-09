package src.Entities;

import src.Entities.Day;

import java.util.ArrayList;

/**
 * Week contains 7 days; each day corresponds to each day of the week (e.g. Monday, Tuesday, etc.)
 * Week also has weekNum, which is an identifier.
 * weekNum starts from 1 - meaning week 1.
 */




public class Week {
    static final String mon = "MONDAY";
    static final String tue = "TUESDAY";
    static final String wed = "WEDNESDAY";
    static final String thr = "THURSDAY";
    static final String fri = "FRIDAY";
    static final String sat = "SATURDAY";
    static final String sun = "SUNDAY";
    private ArrayList<Day> days;
    private final int weekNum;


    public Week(int weekNum) {
        // initialize the week with the seven days from Monday to Sunday.
        Day monday = new Day(mon, weekNum);
        Day tuesday = new Day(tue, weekNum);
        Day wednesday = new Day(wed, weekNum);
        Day thursday = new Day(thr, weekNum);
        Day friday = new Day(fri, weekNum);
        Day saturday = new Day(sat, weekNum);
        Day sunday = new Day(sun, weekNum);


        ArrayList<Day> days = new ArrayList<Day>();

        days.add(monday);
        days.add(tuesday);
        days.add(wednesday);
        days.add(thursday);
        days.add(friday);
        days.add(saturday);
        days.add(sunday);

        this.days = days;
        this.weekNum = weekNum;
    }

    public ArrayList<Day> getDays() {
        return this.days;
    }

    public int getWeekNum() {
        return this.weekNum;
    }
}
