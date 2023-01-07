package haftasonuTekrari2;

import java.util.Scanner;

public class T04_soru9 {
    public static void main(String[] args) {

        // Soru 9-)  Girilen zamanı saniyeye çeviriniz.
        // Örnek: 2 saat 3 dakika 10 saniye ==>	 7390 saniye

        Scanner scannn=new Scanner(System.in);
        System.out.println("Lütfen saati giriniz");
        int saat= scannn.nextInt();
        System.out.println("Lütfen dakikayı giriniz");
        int dakika= scannn.nextInt();
        System.out.println("Lütfen saniyeyi giriniz");
        int saniye= scannn.nextInt();

        int toplamSaniye= (saat*60*60) + (dakika*60) + (saniye);

        System.out.println("girilen saatin saniye değeri : " + toplamSaniye + " saniye ");

    }
}
