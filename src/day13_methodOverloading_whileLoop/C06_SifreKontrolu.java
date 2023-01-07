package day13_methodOverloading_whileLoop;

import java.util.Scanner;

public class C06_SifreKontrolu {
    public static void main(String[] args) {
        //Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
        // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
        // eger tum sartlari saglarsa, “sifre basariyla kaydedildi” yazdirin
        //  - ilk harf kucuk harf olmali
        //  - son karakter rakam olmali
        //  - sifre bosluk icermemeli
        //  - uzunlugu en az 10 karakter olmali

        // Şifre kontrolünü bir metod yapıp true/false döndürün
        // main metod'ta dönen sonucu kontrol edip
        // "başarı ile oluşturuldu" yazıncaya kadar
        // şifreyi tekrar tekrar isteyin

        Scanner scan= new Scanner(System.in);

        boolean tekrarSifreIste=true;
        String sifre="";

        while (tekrarSifreIste){
            System.out.println("Lütfen şifrenizi giriniz");
            sifre= scan.nextLine();

            if (sifreKontrolEt(sifre)) { // sifre kontrolü true ise sifre başarılı
                System.out.println("Başarı ile oluşturuldu");
                //break;
                tekrarSifreIste=false; // break veya bu kod yazılabilir.
            }

        }
    }

    public static boolean sifreKontrolEt(String sifre) {

        int flag = 0;

        //  - ilk harf kucuk harf olmali
        if (!(sifre.charAt(0) >= 'a' && sifre.charAt(0) <= 'z')) {
            //ilk harf küçük değilse hatayı yazdır
            //sifre.charAt(0)<'a' || sifre.charAt(0)>'z' bu sekilde de olurdu
            System.out.println("ilk harf küçük harf olmalı");
            flag++; // bir ceza puanı aldı
        }
        //  - son karakter rakam olmali
        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9')) {
            //son karakter rakam değilse rapor yazdır
            System.out.println("son karakter rakam olmalı");
            flag++;
        }
        //  - sifre bosluk icermemeli
        if (sifre.contains(" ")) {
            System.out.println("Şifre boşluk içermemeli");
            flag++;
        }
        //  - uzunlugu en az 10 karakter olmali
        if (!(sifre.length() >= 10)) {
            System.out.println("Şifrenin uzunluğu en az 10 karakter olmalı");
            flag++;
        }
        if (flag==0){
            return true;
        }else {
            return false;
        }

    }

}
