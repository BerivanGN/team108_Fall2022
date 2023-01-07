package haftasonuTekrari2;

import java.util.Scanner;

public class T06_soru11 {
    public static void main(String[] args) {

        // Soru 11-) Kullanıcıya Adını, Soyadını ve kredi kartı numaralarını sorup bunları özel forma dönüştürün.
        // Ad ve soyadın baş harfleri büyük olmalıdır
        // Kredi kartı numarasını kontrol edin, 16 hane yoksa "Geçersiz kredi kartı numarası" yazdırın.
        // Kredi Kartı 16 Hane ise aşagıda belirtilen şekilde çıktı alın.
        // Ipucu: IF ile çözebilirsiniz. Baş harfleri alın gerisi zaten * işareti ;-)
        // Giriş :
        //		 > Gandalf Grey 563245879632
        // Çıktı :
        //		 > İsim : G****** G***
        //		 > CCN : **** **** 9632 (edited)

        Scanner scann=new Scanner(System.in);
        System.out.println("Lütfen isminizi ve soyisminizi giriniz");
        String isim= scann.nextLine();
        System.out.println("Lütfen soyisminizi ve soyisminizi giriniz");
        String soyisim= scann.nextLine();
        System.out.println("Lütfen kredi kartı numaranızı giriniz");
        String kartNo= scann.nextLine();




    }
}
