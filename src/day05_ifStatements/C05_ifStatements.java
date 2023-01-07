package day05_ifStatements;

import java.util.Scanner;

public class C05_ifStatements {
    public static void main(String[] args) {

       /* Soru 2- Kullanicidan bir harf alin, harf ile baslayan bir ay varsa yazdirin.
        NOT: Buyuk harf, kucuk harf hassasiyeti olmasin.
                Kullanici o veya O yazdiginda output Ocak olsun.

        */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen yazdırmak istediginiz ayın ilk harfini girin");
        char ilkHarf=scan.next().charAt(0);

        if (ilkHarf=='o' || ilkHarf=='0') System.out.println("Ocak");
        if (ilkHarf=='s' || ilkHarf=='S') System.out.println("Subat");
        if (ilkHarf=='m' || ilkHarf=='M') System.out.println("Mart veya Mayıs");
        if (ilkHarf=='n' || ilkHarf=='N') System.out.println("Nisan");
        if (ilkHarf=='h' || ilkHarf=='H') System.out.println("Haziran");
        if (ilkHarf=='t' || ilkHarf=='T') System.out.println("Temmuz");
        if (ilkHarf=='e' || ilkHarf=='E') System.out.println("Eylül veya Ekim");
        if (ilkHarf=='a' || ilkHarf=='A') System.out.println("Agustos veya Aralık");
        if (ilkHarf=='k' || ilkHarf=='K') System.out.println("Kasım");






    }
}
