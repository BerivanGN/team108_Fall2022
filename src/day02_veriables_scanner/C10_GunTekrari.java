package day02_veriables_scanner;

import java.util.Scanner;

public class C10_GunTekrari {
    public static void main(String[] args) {

        //kullanıcıdan bir sayi isteyin
        //ve sayının karesini yazdırın

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen karesini istediginiz sayıyı giriniz");
        double girilenSayi= scan.nextDouble();
        System.out.println("girilen sayinin karesi:" +girilenSayi*girilenSayi);

        //kullanıcıdan isim soyisim ve yaşını isteyip yazdırın.

        Scanner scann=new Scanner(System.in);
        System.out.println("Lütfen isminizi giriniz");
        String girilenIsim= scan.nextLine();
        System.out.println("lütfen soyisminizi giriniz");
        String girilenSoyisim= scan.nextLine();
        System.out.println("Lütfen yasinizi giriniz");
        int yas= scan.nextInt();
        System.out.println(" girilenIsim:"+girilenIsim+
                           "\ngirilenSoyisim"+girilenSoyisim+
                           "\ngirilen yas:"+yas+
                           "\nkaydınız basarıyla tamamlanmistir.");







    }
}
