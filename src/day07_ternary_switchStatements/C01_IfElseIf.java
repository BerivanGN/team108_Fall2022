package day07_ternary_switchStatements;

import java.util.Scanner;

public class C01_IfElseIf {
    public static void main(String[] args) {


        /*
        Kullanıcıdan bir tam sayı alın
        sayı rakam ise "girilen sayı rakam"
        sayı 2 basamaklı ise "girilen sayı 2 basamaklı"
        sayı 2 basamaktan buyukse "buyuk sayi" yazdırın
         */
        /*
          Eger if else cümleleri ELSE ile bitmiyorsa
          tüm durumları kapsamaz
          yani bazı degerler için hiçbir if body çalısmayabilir.

          bu tür soruları çözerken
          sartların tamamını dikkatli yazmak gerekir.
         */


        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen bir tamsayi giriniz");
        int girilenSayi= scan.nextInt();

        if (0<=girilenSayi && girilenSayi<=9) System.out.println("girilen sayi rakam");
        else if (10<=girilenSayi && girilenSayi<=99) System.out.println("girilen sayi 2 basamakli");
        else if (girilenSayi>=100) System.out.println("Buyuk sayi");


    }
}
