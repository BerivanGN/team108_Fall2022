package day34_Maps_NestedMaps;

import java.util.HashMap;
import java.util.Map;

public class C02_NestedMap {
    public static void main(String[] args) {

        /* Aşağıdaki body'i map olarak oluşturun
         (isim,soyisim,ücret,depozito,giriş-çıkış tarihleri,extra istem)

           {
             "firstname" : "Ahmet",
             "lastname" : "Bulut",
             "totalprice" : 500,
             "depositpaid" : false,
             "bookingdates" : {
                    "checkin" : "2021-06-01",
                    "checkout" : "2021-06-10"
                       },
             "additionalneeds" : "wi-fi" }
         */

        Map<String,String> bookingdatesMap = new HashMap<>();
        bookingdatesMap.put("checkin" , "2021-06-01");
        bookingdatesMap.put("checkout" , "2021-06-10");

       Map<String,Object> bookingMap = new HashMap<>();
       bookingMap.put("firstname" , "Ahmet");
       bookingMap.put("lastname" , "Bulut");
       bookingMap.put("totalprice" , 500);
       bookingMap.put("depositpaid" , false);
       bookingMap.put("bookingdates" , bookingdatesMap );
       bookingMap.put("additionalneeds" , "wi-fi");

        System.out.println(bookingMap);
        // {firstname=Ahmet, additionalneeds=wi-fi,
        // bookingdates={checkin=2021-06-01, checkout=2021-06-10},
        // totalprice=500, depositpaid=false, lastname=Bulut}

        // isim bilgisini yazdırın
        System.out.println(bookingMap.get("firstname")); // Ahmet

        // additionalneeds bilgisini yazdırın
        bookingMap.get("additionalneeds"); // wi-fi

        // check-in bilgisini yazdırın
        // booking map'indeki value data türünü object seçtik
        // dolayısıyla bookingdates key'ine ait value'yi Object olarak bize getirir
        // ama biz onun map olduğunu biliyoruz
        // casting yapabiliriz.

        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkin"));// 2021-06-01

        // cgeck-out tarihini yazdıralım

        System.out.println(((Map) bookingMap.get("bookingdates")).get("checkout"));// 2021-06-10



    }
}
