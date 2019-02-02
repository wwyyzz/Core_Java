package v1.ch4;

import java.text.DateFormatSymbols;
import java.util.*;

public class CalendarTest {
    public static void main(String[] args) {
        GregorianCalendar d = new GregorianCalendar();

        int today = d.get(Calendar.DAY_OF_MONTH);
        int month = d.get(Calendar.MONDAY);

        d.set(Calendar.DAY_OF_MONTH, 1);

        int weekday = d.get(Calendar.DAY_OF_WEEK);
        int firstDayofWeek = d.getFirstDayOfWeek();

        int indent = 0;
        while (weekday != firstDayofWeek){
            indent++;
            d.add(Calendar.DAY_OF_MONTH, -1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }

        String[] weekdayNames = new DateFormatSymbols().getShortWeekdays();

        do {
            System.out.printf("%4s", weekdayNames[weekday]);
            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);
        }
        while (weekday != firstDayofWeek);
        System.out.println();

        for (int i = 1; i < indent; i++) {
            System.out.print("    ");
        }

        d.get(Calendar.DAY_OF_MONTH);
        do {
            int day = d.get(Calendar.DAY_OF_MONTH);
            System.out.printf("%3d",day);

            if (day == today) System.out.println("*");
            else System.out.print("  ");

            d.add(Calendar.DAY_OF_MONTH, 1);
            weekday = d.get(Calendar.DAY_OF_WEEK);

            if (weekday == firstDayofWeek) System.out.println();
        }

        while (d.get(Calendar.MONTH) == month);

        if (weekday != firstDayofWeek) System.out.println();
    }
}
