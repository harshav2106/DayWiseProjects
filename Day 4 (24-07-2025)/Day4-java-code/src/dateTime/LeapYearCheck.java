package dateTime;

import java.time.LocalDate;
import java.time.Year;

public class LeapYearCheck {
    public static void main(String[] args) {
        LocalDate date = LocalDate.of(2025, 7, 24);
        int year = date.getYear();
        boolean isLeap = Year.isLeap(year);
        System.out.println(year + (isLeap ? " is a leap year." : " is not a leap year."));
    }
}
