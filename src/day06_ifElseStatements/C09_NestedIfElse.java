package day06_ifElseStatements;

import java.util.Scanner;

public class C09_NestedIfElse {
    public static void main(String[] args) {
        //Soru 1- Kullanicidan cinsiyetini ve yasini alin,
        // Kadin, 60 yas ve uzeri , Erkek 65 yas ve uzeri emekli olabilir.
        // Cinsiyet ve yasini dikkate alarak “Emekli olabilirsin” veya
        // “Emekli olmak icin .. Yil daha calisman gerekir” yazdirin.

        /*
           eger degişken sayısı birden fazla ise
           degişkenlerden birini öncelige alarak
           ona göre bir if else yapısı kurulur
           örnegin bu soruda kadın/erkek degişimini ana degişken yapalım
         */

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen cinsiyetinizi giriniz\nK: Kadin, E: Erkek ");
        char cinsiyet=scan.next().charAt(0);
        System.out.println("Lütfen tam sayi olarak yasinizi giriniz");
        int yas=scan.nextInt();

        if (cinsiyet=='K' || cinsiyet=='k'){ // kadın olanlar için bu bölüm çalışacak
            if (yas<18 || yas>80) System.out.println("Gecersiz yas");
            else if (yas>=60) System.out.println("Emekli olabilirsin");
            else System.out.println("Emekli olmak icin " + (60-yas) + "yil daha calismalisin");

        } else if (cinsiyet=='E' || cinsiyet=='e') { // erkek olanlar için bu bölüm çalışacak
            if (yas<18 || yas>80) System.out.println("Gecersiz yas");
            else if (yas>=65) System.out.println("Emekli olabilirsin");
            else System.out.println("Emekli olmak icin " + (65-yas) + "yil daha calismalisin");

        }else {
            System.out.println("cinsiyet bilgisi hatali");
        }
    }
}
