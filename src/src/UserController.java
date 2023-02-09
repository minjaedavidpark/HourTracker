package src;


import src.Entities.Day;
import src.Entities.User;

import java.util.ArrayList;

public class UserController {
    private User user;
    private UserView view;

    public UserController(User user, UserView view) {
        this.user = user;
        this.view = view;

    }

//    public void updateView(int year, int month, int day) {
//        ArrayList<Day> days = user.getDays();
//        int hours;
//
//        for (Day d : days) {
//            if (d.getYear() == year && d.getMonth() == month && d.getDay() == day) {
//                hours = d.getHours();
//                this.view.printHoursOfDay(year, month, day, hours);
//            }
//        }
//
//
//    }
}
