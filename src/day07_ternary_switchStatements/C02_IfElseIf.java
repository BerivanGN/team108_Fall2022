package day07_ternary_switchStatements;

import java.util.Scanner;

public class C02_IfElseIf {
    public static void main(String[] args) {

        /*
        Kullanıcıdan bir tam sayı alın
        sayı negatif ise " negatif sayı"
        sayı rakam ise "girilen sayı rakam"
        sayı 2 basamaklı ise "girilen sayı 2 basamaklı"
        sayı 2 basamaktan buyukse "buyuk sayi" yazdırın

         */
        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi<0) System.out.println("Negatif sayi");
        else if (girilenSayi<=9) System.out.println("Girilen sayı rakam");
        else if (girilenSayi<=99) System.out.println("Girilen sayı 2 basamaklı");
        else System.out.println("büyük sayı");



    }
}
