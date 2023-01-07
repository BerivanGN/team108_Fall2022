package day02_veriables_scanner;

import java.util.Scanner;

public class C09_Scanner {
    public static void main(String[] args) {
        /* soru7- interview- kullanıcının ıkı sayı alıp ıkısının degerlerını degıstırın(swap)
         kullanıcının gırdıgı degerler sayı1=10


         */


        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen sayi1'i giriniz ");
        int sayi1= scan.nextInt();
        System.out.println("Lütfen sayi2'i giriniz ");
        int sayi2= scan.nextInt();


        int temp;

        // 1. adim sayi2 degerini temp'e atayalim

        temp=sayi2;

        // 2. adim sayi1 degerini sayi2'ye atayalim

        sayi2=sayi1;

        //tempteki değeri sayi1'e atayalim

        sayi1=temp;

        System.out.println("sayıların degerini yer degistirdim"
                            + "\nsayi1'in yeni degeri : " + sayi1
                            + "\nsayi2'nin yeni degeri : " + sayi2);

    }
}
