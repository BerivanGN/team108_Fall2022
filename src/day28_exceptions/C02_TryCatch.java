package day28_exceptions;

import java.util.Scanner;

public class C02_TryCatch {
    public static void main(String[] args) {
        /*
            Try catch bloklarının amacı
            riski sıfır yapmak değil
            kodun iyi analiz yapıp javanın çözemeyeceği
            durumlarda ne yapmasını istediğimizi kendisine söylemektir.

            java try blogunda basedemeyeceği bir sorunla karşılaşırsa
            siz o sorunu deklare edinceye kadar
            yani catch() satırına kadar çalışmayı durdurur.

            Bu durumda sorun olan satır ile catch
         */

        // Kullanıcıdan 2 tam sayı alıp
        // sayıları birbirine bölüp sonucu yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Birbirine bölmek için 2 tam sayı giriniz.");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();

        try {
            System.out.println("İki sayının bölümü = " + sayi1/sayi2);

            System.out.println("Kont1");
            System.out.println("Kont2");
            System.out.println("Kont3");

        } catch (ArithmeticException e) {
            System.out.println("Bölen sayı 0 olamaz");
            e.printStackTrace();
        }


    }
}
