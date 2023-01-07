package day02_veriables_scanner;

import java.util.Scanner;

public class C06_Scanner {
    public static void main(String[] args) {

        //kullanıcıdan bir sayi isteyin
        //ve sayının karesini yazdırın

        Scanner scan = new Scanner(System.in);
        System.out.println("Karesini almak istediginiz sayıyı giriniz");

        double girilenSayi= scan.nextDouble();

        System.out.println("girilen sayının karesi: "+girilenSayi*girilenSayi);

    }
}
