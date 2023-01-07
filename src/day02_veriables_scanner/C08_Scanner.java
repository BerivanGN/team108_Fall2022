package day02_veriables_scanner;

import java.util.Scanner;

public class C08_Scanner {
    public static void main(String[] args) {

        /* soru4- kullanıcıdan bir dikdörtgenin 2 kenar uzunlugunu alıp dıkdortgenın alanını
        yazdırın.

         */

        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen dikdörtgenin iki kenar uzunlugunu girin");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();

        System.out.println("dikdörtgenin alanı : " + kenar2*kenar1);

    }
}
