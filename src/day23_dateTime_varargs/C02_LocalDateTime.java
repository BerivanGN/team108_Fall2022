package day23_dateTime_varargs;

import java.time.LocalDateTime;
import java.time.ZoneId;

public class C02_LocalDateTime {
    public static void main(String[] args) {

        LocalDateTime ldt= LocalDateTime.now();

        System.out.println(ldt); // 2022-12-20T12:28:44.586595700

        System.out.println(ldt.getDayOfWeek()); // TUESDAY
        System.out.println(ldt.withYear(2030)); // 2030-12-20T12:33:36.901591600
        System.out.println(ldt.withYear(2011)); // 2011-12-20T12:35:13.937997500


    }
}
