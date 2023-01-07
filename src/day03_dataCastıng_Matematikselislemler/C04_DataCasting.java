package day03_dataCastıng_Matematikselislemler;

import java.util.Scanner;

public class C04_DataCasting {
    public static void main(String[] args) {

        /*
        char data turunun extra bir özelligi vardır
        eger matematiksel bir islemde char data turunden bır deger kullanırsanız
        java o char ın ascii degerini göz onunde bulundurarak
         */

        System.out.println('a'+'b'); // 97+98=195

        System.out.println('a'-32); // 97-32=65

        //'a'-32'nin char olarak sonucunu yazdırın

        System.out.println((char)('a'-32)); // A

        // kullanıcıdan bir char alıp
        // ascii table'dan kullanıcının gırdıgı char'in sonrasındakı
        //3 karakteri yazdırın
        //ornek input : a output : b,c,d

        Scanner scan=new Scanner((System.in));
        System.out.println("Lütfen bir karakter giriniz");
        char girilenkarakter=scan.next().charAt(0);

        System.out.println((char) (girilenkarakter+1) +","+
                            (char)(girilenkarakter+2) +","+
                            (char) (girilenkarakter+3) );


    }
}
