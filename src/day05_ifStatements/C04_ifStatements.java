package day05_ifStatements;

import java.util.Scanner;

public class C04_ifStatements {
    public static void main(String[] args) {

        /*
           if cumlelerinde sart parantezinden sonra body kullanmazsak
           ilk ;'e kadar olan kismi body olarak kabul eder
           yani sadece 1 satir kodu body olarak kabul eder
         */
        /*
        Soru 3- Kullanicidan bir sayi alin,
         sayi 3 ile bolunuyorsa “Uc ile bolunebilen sayi”,
        5 ile bolunebiliyorsa “Bes ile bolunebilen sayi” yazdirin.

        Eger if body için yazılacak kod 1 satırdan fazlaysa mutlaka { } kullanılmalıdır

        */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int girilenSayi= scan.nextInt();

        if (girilenSayi%3==0) System.out.println("Uc ile bolunebilen sayi");

        if (girilenSayi%5==0) System.out.println("Bes ile bolunebilen sayi” yazdirin.");


    }
}
