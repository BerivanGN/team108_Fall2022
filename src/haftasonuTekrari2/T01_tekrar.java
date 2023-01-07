package haftasonuTekrari2;

import java.util.Scanner;

public class T01_tekrar {
    public static void main(String[] args) {

        // Soru 6-)  Kullanıcıya günde ne kadar çay içtiğini ve
        // ne kadar şeker kullandığını sorun.
        // Yılda kaç çay içtigini ve kaç kg şeker kullandığını hesaplayın
        // ve bunları ekranda yazdırın.
        // 1 şeker = 1.5 gr
        // 1 kg = 1000 gram olarak hesaplayın
        // Ipuclari:
        // Önce gram cinsinden yıllık ne kadar seker kullandıgını bulun ve kiloya çevirin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 1 günde tükettiğiniz çay sayısını giriniz");
        int caySayisi= scan.nextInt();
        System.out.println("Lütfen tükettiğiniz her çay için kullandığınız şeker adedini giriniz");
        double sekerSayisi= scan.nextDouble();

        double yillikCay=caySayisi*365;
        double yillikSeker=sekerSayisi*(1.5)*(365)*caySayisi;

        System.out.println("Yıllık tükettiğiniz çay miktari : " + yillikCay + " bardak çay");
        System.out.println("Yıllık tükettiğiniz şeker miktarı : " + yillikSeker/1000 + " kg şeker");



        }

    }

