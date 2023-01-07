package day03_dataCastıng_Matematikselislemler;

import java.util.Scanner;

public class C03_DatCasting {
    public static void main(String[] args) {

        System.out.println(28/5); // 5
        System.out.println(29/3); // 9


        //java bır bolme ıslemınde 2 ınt ısleme gırıyorsa sonucu ınt olarak verır.

        int sayi1=25;
        int sayi2=6;

        System.out.println(sayi1/sayi2); //4

        double dbl=6;
        System.out.println(sayi1/dbl);

        //kullanıcıdan 2 tam sayı alın
        // 1. tamsayıyı 2.ye bolup sonucu ondalık olarak yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen birbirine bolmk ıcın ıkı tamsayı giriniz");

        int ilkSayi=scan.nextInt();
        int ikinciSayi=scan.nextInt();
        System.out.println("iki sayının bölme sonucu : " + (double)ilkSayi/ikinciSayi);


    }
}
