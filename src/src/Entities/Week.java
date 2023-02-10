package src.Entities;


import java.io.Serializable;
import java.util.ArrayList;

/**
 * Week contains 7 days; each day corresponds to each day of the week (e.g. Monday, Tuesday, etc.)
 * Week also has weekNum, which is an identifier.
 * weekNum starts from 1 - meaning week 1.
 */




public class Week implements Serializable {
    static final String MONDAY = "MONDAY";
    static final String TUESDAY = "TUESDAY";
    static final String WEDNESDAY = "WEDNESDAY";
    static final String THURSDAY = "THURSDAY";
    static final String FRIDAY = "FRIDAY";
    static final String SATURDAY = "SATURDAY";
    static final String SUNDAY = "SUNDAY";
    private ArrayList<Day> days;
    private final int weekNum;
    int targetHours;
    private boolean isHappy;


    public Week(int weekNum, int targetHours) {
        // initialize the week with the seven days from Monday to Sunday.
        Day monday = new Day(MONDAY, weekNum);
        Day tuesday = new Day(TUESDAY, weekNum);
        Day wednesday = new Day(WEDNESDAY, weekNum);
        Day thursday = new Day(THURSDAY, weekNum);
        Day friday = new Day(FRIDAY, weekNum);
        Day saturday = new Day(SATURDAY, weekNum);
        Day sunday = new Day(SUNDAY, weekNum);


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
        this.targetHours = targetHours;
    }

    public ArrayList<Day> getDays() {
        return this.days;
    }

    public int getWeekNum() {
        return this.weekNum;
    }

    public void getIsHappy() {
        this.isHappy = (this.getWeekHours() >= targetHours);
    }

    public int getWeekHours() {
        int total = 0;
        for (Day day : this.days) {
            total = total + day.getHours();
        }
        return total;
    }

}
