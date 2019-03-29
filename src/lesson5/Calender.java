package lesson5;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class Calender {

    public static void main(String[] args) {
        localDate();
    }
    private static void localDate(){
        LocalDate localDateOf = LocalDate.of(1993, 11, 15);
        System.out.println("LocalDateOf: " + localDateOf);

        DayOfWeek localDateDay = LocalDate.parse("1993-11-15").getDayOfWeek();
        System.out.println("Day of birth: " + localDateDay);


    }


}
