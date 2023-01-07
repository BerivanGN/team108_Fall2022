package day03_dataCastıng_Matematikselislemler;

import java.util.Scanner;

public class C08_SayininRakamlarToplaminiBulma {
    public static void main(String[] args) {

        // kullanıcıdan 4 basamaklı pozitif bir tamsayı alın
        //sayının rakamlar toplamını bulun

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen 4 basamaklı bır tamsayı giriniz");
        int girilenSayi= scan.nextInt(); //2457

        //soru icin lazım olacak veriableleri hazırlayalım
        int birlerBasamagi=0;
        int rakamlarToplami=0;

        //sırasıyla her bir basamagı elde edip rakamlar toplamına ekleyelim.

        birlerBasamagi=girilenSayi%10;
        rakamlarToplami=rakamlarToplami+birlerBasamagi; // 0+7=7
        girilenSayi=girilenSayi/10; //245

        birlerBasamagi=girilenSayi%10; // 5
        rakamlarToplami=rakamlarToplami+birlerBasamagi; // 7+5= 12
        girilenSayi=girilenSayi/10; //24

        birlerBasamagi=girilenSayi%10; //4
        rakamlarToplami=rakamlarToplami+birlerBasamagi; // 12+4=16
        girilenSayi=girilenSayi/10; // 2

        birlerBasamagi=girilenSayi%10; // 2
        rakamlarToplami=rakamlarToplami+birlerBasamagi; // 16+2=18
        girilenSayi=girilenSayi/10; // 0

        System.out.println("girilen sayinin rakamlar toplamı: "+ rakamlarToplami);



    }
}
