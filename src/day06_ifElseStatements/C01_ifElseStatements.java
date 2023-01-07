package day06_ifElseStatements;

import java.util.Scanner;

public class C01_ifElseStatements {
    public static void main(String[] args) {

        //Soru 1- Kullanicidan bir ucgenin 3 kenar uzunlugunu alin,
        // ucgen eskenar ise “Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Ucgenin kenar uzunluklarını giriniz");
        double kenar1= scan.nextDouble();
        double kenar2= scan.nextDouble();
        double kenar3= scan.nextDouble();

        if (kenar1==kenar2 && kenar2==kenar3 && kenar1>0) {
            System.out.println("Eskenar ucgen");

        } else {
            System.out.println("Eskenar degil");
        }

        /* if ile baslayan bir kod else ile bitiyorsa
        input'un tum degerlerini kapsar
        yani her deger için mutlaka kodumuzda bir body calısır.
         */


    }
}
