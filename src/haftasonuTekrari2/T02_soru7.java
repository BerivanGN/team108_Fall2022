package haftasonuTekrari2;

import java.util.Scanner;

public class T02_soru7 {
    public static void main(String[] args) {

        // Soru 7-)  Kullanicidan Double türünde bir sayi alin.
        // Alinan bu sayiyi tam sayiya cevirerek konsolda yazdirin.
        // (Istege bagli) Float degerinde bir sayi alin
        // bu sayiyi da short degisken türünde bir sayiya döndürün

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen double(virgüllü) bir sayı giriniz");
        double sayi= scan.nextDouble();

        System.out.println("girilen double sayı = " + (int)sayi);

    }
}
