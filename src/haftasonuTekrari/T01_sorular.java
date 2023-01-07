package haftasonuTekrari;

import java.util.Scanner;

public class T01_sorular {
    public static void main(String[] args) {

        /*
        Soru 1-)
        Dairenin alanini ve cevresini hesaplayan java kodu yaziniz.
        Ipuclari:
        * r=7;
        * Pi=3.14
        * Dairenin Cevresi : 2*Pi*r
        * Dairenin Alani : Pi*r*r

        */

        double pi=3.14;
        double yaricap=7;

        System.out.println("Dairenin Alanı:" +pi*yaricap*yaricap);

        System.out.println("Dairenin Çevresi:" +2*pi*yaricap);

        /*
        Soru-2)
        Dikdortgenin alanini ve cevresini hesaplayan kodu yaziniz.
        Ipuclari:
        * Dikdortgenin Cevresi: 2 * (uzun kenar + kisa kenar)
        * Dikdortgenin Alani : uzun kenar * kisa kenar

         */

        int uzunKenar=9;
        int kisaKenar=6;

        System.out.println("Dikdörtgenin Alanı:" +(uzunKenar*kisaKenar));

        System.out.println("Dikdörtgenin Çevresi:" +2*(uzunKenar+kisaKenar));

        /*
        Soru 3-)
        Kullanicidan 5 tane sayi alin,
        alinan bu sayilarin ortalamasini hesaplayan java kodunu yaziniz.
        Ipuclari:
        * Sayilarin ortalamasi: toplam/5

        */

        Scanner scan= new Scanner(System.in);
        int sayi1 = 12;
        int sayi2 = 8;
        int sayi3 = 17;
        int sayi4 = 23;
        int sayi5 = 30;

        System.out.println(" Lütfen 5 tam sayı giriniz:");
        int girilenSayilar= scan.nextInt();
        System.out.println("Sayıların Ortalaması:" +(sayi1+sayi2+sayi3+sayi4+sayi5)/5);


         /*
        Soru 4-)
        Kullanıcıdan bir sayı alın ve aldiginiz bu sayının küpünün yarısını konsola yazdırin.
        Ipuclari:
        * Sayinin küpü: sayi*sayi*sayi

         */

        Scanner scann=new Scanner(System.in);
        double Sayi=6;
        System.out.println("Lütfen bir tam sayı giriniz:");
        double girilenSayii= scan.nextDouble();
        System.out.println("Sayının Küpünün Yarısı:" +(Sayi*Sayi*Sayi)/2);

        /*
        Soru 5-)
        Kullanıcıdan karenin kenar uzunluğunu alın.
        Aldiginiz uzunluklarla karenin alanını ve çevresini hesaplayan kodu yazın.

         */

        Scanner kare=new Scanner(System.in);
        int kenar= 7;
        System.out.println("Lütfen bir tam sayı giriniz:");
        int girilenKenar= scan.nextInt();
        System.out.println("Karenin Alanı:" +(kenar*kenar));
        System.out.println("Karenin Çevresi:" +4*(kenar));






    }
}
