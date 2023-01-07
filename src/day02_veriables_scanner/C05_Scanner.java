package day02_veriables_scanner;

import java.util.Locale;
import java.util.Scanner;

public class C05_Scanner {

    public static void main(String[] args) {

        // kullanıcıdan ısmını alın
        // ve girilen ismi buyuk harflerle yazdırın

        //kullanıcıdan deger almak ıcın uc ıslem yapmak gerekır
        //1. adım scanner objesi olusturmak

        Scanner scan = new Scanner(System.in);

        // 2. adım kullanıcıya ne istediginizi söyleyin

        System.out.println("isminizi yazin");

        // 3. adım kullanıcının girecegi degeri kaydedeceginiz bir veriable olusturun
        // scan objesı ile ilgili metodu kullanarak kullanıcının girdigi degeri
        //olusturdugunuz verıableye

        String girilenisim= scan.nextLine();

        // Artık kullanıcının gırdıgı deger gırılen ısım veriablesinde kayıtlı

        System.out.println(girilenisim.toUpperCase());// Büyük harfle yazdırmak için toupperCase'yi kullan
        System.out.println(girilenisim); // normal olarak yazdırır


    }
}
