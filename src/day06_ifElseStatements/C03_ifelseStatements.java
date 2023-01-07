package day06_ifElseStatements;

import java.util.Scanner;

public class C03_ifelseStatements {
    public static void main(String[] args) {
        //Soru 5- Kullanicidan bir harf isteyin,
        //girilen karakter kucuk harf ise onu buyuk harf olarak yazdirin,
        //yoksa girilen harfi yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("lütfen bir karakter giriniz");
        char girilenKarakter=scan.next().charAt(0);

        if (girilenKarakter>='a' && girilenKarakter<='z'){
            // kucuk harf ise buyuk harf olarak yazdıralım
            System.out.println((char) (girilenKarakter-32));
            System.out.println(Character.toUpperCase(girilenKarakter));
        }else{
            // kucuk harf degılse gırılen harfi yazdıralım
            System.out.println(girilenKarakter);
        }



    }
}
