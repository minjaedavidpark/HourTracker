
package src.Entities;

import java.io.Serializable;
import java.util.ArrayList;


/**
 * User has two pieces of information.
 * 1. weeks, which is a list of weeks that this User has.
 * 2. targetHours, which is the target work/study hours of each week of this User.
 */
public class User implements Serializable {
    ArrayList<Week> weeks;
    int targetHours;

    public User(int targetHours) {
        this.weeks = new ArrayList<Week>();
        this.targetHours = targetHours;
    }

    public ArrayList<Week> getWeeks() {
        return this.weeks;
    }

    public void addWeeks(int howMany){
        int numOfWeeks = weeks.size();
        int i;

        for (i=1; i <= howMany; i++) {
            Week e = new Week(numOfWeeks + i, this.targetHours);
            this.weeks.add(e);
        }
    }

    public int getTargetHours() {
        return this.targetHours;
    }

    public void setTargetHours(int newHours) {
        this.targetHours = newHours;
    }
}