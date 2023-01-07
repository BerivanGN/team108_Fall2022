package day05_ifStatements;

import java.util.Scanner;

public class C02_ifStatements {
    public static void main(String[] args) {

        /*
            Basit if cümleleri kodun geri kalanından bagımsızdır
            sadece 1 şarta odaklanır
            o şart true ise if body çalısır
            sart false ise if body çalısmaz (kod çalısır)

            birden fazla bagımsız if cümleleri kullanılmıssa
            her cümle birbirinden bagımsız olacagından
            bazı degerler icin tüm if body'lerii calısırken
            bazı degerler için hicbir if body'si calısmaz
         */

        //kullanıcıdan bir sayı alıp
        //pozitif ise pozitif sayı
        //100 ile 999 arasında ise (sınırlar dahil) "pozitif 3 basamaklı sayı"
        //3 ile bölünebiliyorsa "3'ün katı"
        // birler basamagı 7 ise "Mükemmel"
        //seceneklerinden uygun olanı yazdırın.


        Scanner scan= new Scanner(System.in);

        System.out.println("Lütfen bir tam sayı giriniz");

        int sayi= scan.nextInt();

        //pozitif ise pozitif sayı
        if ( sayi>0){
            System.out.println("sayi pozitif");
        }
        //100 ile 999 arasında ise (sınırlar dahil) "pozitif 3 basamaklı sayı"
        if (100<=sayi && sayi<=999){
            System.out.println("Pozitif 3 basamklı sayı");
        }
        //3 ile bölünebiliyorsa "3'ün katı"
        if (sayi%3==0){
            System.out.println("3'ün katı");
        }
        // birler basamagı 7 ise "Mükemmel"
        if (sayi%10==7 || sayi%10==-7){
            System.out.println("Mükemmel");
        }



    }
}
