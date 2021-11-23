package com.company.EnumeratedTypes;

public class Task1 {
    public static void main(String[] args) {
        System.out.println("Saturday is holiday: " +
                Weekday.SATURDAY.isHoliday());
        System.out.println("Firday is weekday: " +
                Weekday.FRIDAY.isWeekDay());
        Weekday.TUESDAY.whichIsGreater(Weekday.FRIDAY);
    }

}

enum Weekday{
    MONDAY,
    TUESDAY,
    WENSDAY,
    THURSDAY,
    FRIDAY,
    SATURDAY,
    SUNDAY;
boolean isHoliday(){
    if (this == SATURDAY || this == SUNDAY){
        return true;
    }else return false;
}
    boolean isWeekDay(){
        if (this != SATURDAY || this != SUNDAY){
            return true;
        }   else return false;
    }
    void whichIsGreater(Weekday weekday) {
        if (this.ordinal() < weekday.ordinal()) {
            if (this.compareTo(weekday)<0) {
            System.out.println("Before " + weekday);
        } else {
            System.out.println("After " + weekday);
        }
    }}}
