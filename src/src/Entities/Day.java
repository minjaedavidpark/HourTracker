package src.Entities;

/**
 * Day has three pieces of information.
 * 1. hours represents the hours of study/work that's done on the day.
 * 2. whatDay represents what day is this day (e.g. Monday).
 * 3. weekNum represents the same weekNum that this Day object is in.
 * For example, if we have a Day object with weekNum == 3 and whatDay = "MON", it means this Day object represents
 * Monday in Week 3.
 */
public class Day {

    private int hours;
    private final String whatDay;
    private final int weekNum;

    public Day(String whatDay, int weekNum) {
        this.whatDay = whatDay;
        this.weekNum = weekNum;
        this.hours = 0;
    }

    public int getWeekNum() {
        return this.weekNum;
    }

    public String getWhatDay() {
        return this.whatDay;
    }

    public void add_hours(int hours) {
        this.hours += 1;
    }

    public int getHours() {
        return this.hours;
    }

    public void setHours(int h) {
        this.hours = h;
    }


}
