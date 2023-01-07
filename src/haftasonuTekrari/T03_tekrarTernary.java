package haftasonuTekrari;

import java.util.Scanner;

public class T03_tekrarTernary {
    public static void main(String[] args) {

        //Kullanicidan bir tamsayi alin.
        //Sayi pozitifse, cift sayi veya cift sayi degil seceneklerinden uygun olani yazdirin
        //Sayi pozitif degilse,
        // 3 basamakli veya 3 basamakli degil seceneklerinden uygun olani yazdirin

        int sayi=-1666;
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir tam sayı giriniz");
        int girilenSayi= scan.nextInt();

        System.out.println(girilenSayi>=0 ? (sayi%2==0 ? "çift sayı" : "tek sayı") :
        (-100>=sayi && sayi>=-999 ? "3 basamaklı sayı" : "3 basamaklı değil"));

    }
}
