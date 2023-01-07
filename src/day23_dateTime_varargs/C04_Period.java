package day23_dateTime_varargs;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;

public class C04_Period {
    public static void main(String[] args) {

        LocalDate dogumTarihi= LocalDate.of(1995,9,4);
        LocalDate bugun= LocalDate.now();

        Period yas = Period.between(dogumTarihi,bugun); // P27Y3M16D (27 yıl 3 ay 16 gün)

        System.out.println(yas);
        System.out.println(yas.getYears()); // 27

        LocalDate baslangic= LocalDate.of(2010,8,5);
        LocalDate bitis= LocalDate.of(2015,7,20);

        Period sure = Period.between(baslangic,bitis);

        System.out.println(sure); // P4Y11M15D ( 4 yıl 11 ay 15 gün)

    }
}
