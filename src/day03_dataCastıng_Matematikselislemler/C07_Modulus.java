package day03_dataCastıng_Matematikselislemler;

public class C07_Modulus {
    public static void main(String[] args) {

        //% Modulus: Java'da bolme ıslemı sonucunda kalan sayıyı verır.

        System.out.println(15 % 4); // 3

        System.out.println(45 % 4); // 1
        /* kullanıcının gırdıgı deger cıft sayı mı ?
           girilenSayi % 2 isleminin sonucu 0 ise cift sayıdır.

           kullanıcının gırdıgı sayı 7 nın katı mı ?
           girilenSayı % 7 isleminin sonucu 0 ise 7 nın katıdır.

           kullanıcının gırdıgı sayının bırler basamagı
           kullanıcı 3426 girdi
         */

        int girilenSayi=3426;
        int birlerBasamagi= girilenSayi % 10; // 6
        System.out.println("birler basamagi : " + birlerBasamagi);

        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi); // 342

       birlerBasamagi= girilenSayi % 10; // 6
        System.out.println("birler basamagi : " + birlerBasamagi);
        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi); // 34

        birlerBasamagi= girilenSayi % 10; // 6
        System.out.println("birler basamagi : " + birlerBasamagi);
        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi); // 34

        birlerBasamagi= girilenSayi % 10; // 6
        System.out.println("birler basamagi : " + birlerBasamagi);
        girilenSayi=girilenSayi/10;
        System.out.println(girilenSayi); // 34





    }
}
