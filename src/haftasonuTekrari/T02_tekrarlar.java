package haftasonuTekrari;

import java.util.Scanner;

public class T02_tekrarlar {
    public static void main(String[] args) {

        //ögrenciden notunu rakam olarak alıp harf olarak yazdırın
        // 0-49,9999 DD
        // 50-64,999 CC
        // 65-84,999 BB
        // 85-100 AA

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen notunuzu giriniz.");
        double not= scan.nextDouble();

        if (0<=not && not<50.) System.out.println("Notunuz DD, Maalesef kaldınız.");
        if (50<=not && not<65.) System.out.println("Notunuz CC, Tebrikler geçtiniz.");
        if (65<=not && not<85.) System.out.println("Notunuz BB, Tebrikler geçtiniz");
        if (85<=not && not<=100.) System.out.println("Notunuz AA, Tebrikler derece yaptınız.");
        else {
            System.out.println("Geçersiz Not");
        }

    }
}
