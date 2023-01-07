package day03_dataCastıng_Matematikselislemler;

import java.util.Scanner;

public class C06_DataCasting {
    public static void main(String[] args) {

        // soru5: kullanıcıdan bır double bır tam sayı alın,
        // double sayıyı tam sayıya  bolun
        //ve bolum ıslemının sonucu tam sayı kısmını yazdırın.
        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir ondalıklı sayı giriniz");
        double sayidbl= scan.nextDouble();

        System.out.println("Lütfen bir tam sayı giriniz");
        int sayiInt= scan.nextInt();

        System.out.println((int) sayidbl/sayiInt);  // sonucu int yazdırır.
        System.out.println(sayidbl/sayiInt); // sonucu double yazdırır.








    }
}
