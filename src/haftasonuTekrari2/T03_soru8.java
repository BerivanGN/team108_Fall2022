package haftasonuTekrari2;

import java.util.Scanner;

public class T03_soru8 {
    public static void main(String[] args) {

        // Soru-8)  Kullanicidan üc basamaklı bir sayı alin.
        // Kullanicidan alinan bu sayinin basamaklari toplamini ekranda yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 3 basamaklı bir sayı giriniz");
        int sayi= scan.nextInt();

        int birlerBasamagi=0;
        int rakamlarToplami=0;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi=sayi/10;

        birlerBasamagi=sayi%10;
        rakamlarToplami+=birlerBasamagi;
        sayi=sayi/10;

        System.out.println("Girilen sayının basamakları toplamı : " + rakamlarToplami);

    }
}
