package src.Entities;

import java.util.ArrayList;

/**
 * User has one piece of information,
 * 1. weeks, which is a list of weeks that this User has.
 */
public class User {
    ArrayList<Week> weeks;

    public User() {
        this.weeks = new ArrayList<Week>();

    }

    public ArrayList<Week> getWeeks() {
        return this.weeks;
    }

    public void addWeeks(int howMany){
        int numOfWeeks = weeks.size();
        int i;

        for (i=1; i <= howMany; i++) {
            Week e = new Week(numOfWeeks + i);
            this.weeks.add(e);
        }
    }


}