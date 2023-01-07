package day09_stringManipulations;

import java.util.Scanner;

public class C04_endsWith {
    public static void main(String[] args) {
        String str="Java ogrenen issiz kalmaz";

        System.out.println(str.endsWith("kalmaz")); // true (str kalmazla biter mi? diye soruyor cevap evet)

        System.out.println(str.endsWith("Java ogrenen issiz kalmaz")); // true

        System.out.println(str.endsWith("")); // true


        /*
         soru :
         kullanıcıdan bir mail alın
         - mail @ icermiyorsa "gecersiz mail"
         - mail @gmail.com icermiyorsa, "mail gmail olmalı"
         - mail @gmail.com ile bitmiyorsa, "mailde yazim hatasi var" yazdirin.
        */

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen mailinizi giriniz");
        String girilenMail=scan.nextLine();

        if (!girilenMail.contains("@")){
            System.out.println("gecersiz mail");
        } else if (!girilenMail.contains("@gmail.com")) {
            System.out.println("mail gmail olmalı");

        } else if (!girilenMail.endsWith("@gmail.com")) {
            System.out.println("mailde yazım hatası var");

        }
    }
}
