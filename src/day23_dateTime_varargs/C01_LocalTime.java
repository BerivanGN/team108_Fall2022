package day23_dateTime_varargs;

import java.time.LocalTime;

public class C01_LocalTime {
    public static void main(String[] args) {

        LocalTime zaman= LocalTime.now();
        System.out.println(zaman); // 12:07:37.209661600

        System.out.println(zaman.getMinute()); // 8

        System.out.println(zaman.withSecond(0).withNano(0)); // 12:08
        System.out.println(zaman.withSecond(1).withNano(1)); // 12:09:01.000000001

        System.out.println(zaman.plusHours(100).plusMinutes(250)); // 20:20:38.893221200

        // Bir for loop ile birden 10,000'e kadar olan sayıları yan yana yazdırın
        // Bu işlem için geçen zamanı bulun

        LocalTime basZamani=LocalTime.now();
        System.out.println("başlangıç " + basZamani); // 12:17:40.797883400
        for (int i = 1; i <=10000 ; i++) {
            System.out.print(i+ " ");
        }
        LocalTime bitZamani=LocalTime.now();
        System.out.println("");
        System.out.println("bitiş " + bitZamani); // 12:17:40.989764500

        System.out.println("İşlem süresi : " +
                (bitZamani.getNano()- basZamani.getNano())
                + " nano saniye"); // -821112000

        /*
          Oluşturduğumuz time veya date güncel zamanı veya tarihi tutmaya devam eden bir sayaç değil
          oluşturduğumuz satırdaki zamanı veya tarihi sisyemden alıp kaydeden bir veriable'dir

          ilerleyen satırlarda güncel zaman veya tarihe ihtiyacımız olduğunda
          yeni bir time veya data objesi oluşturup
          o andaki değeri alabiliriz.
         */
    }
}
