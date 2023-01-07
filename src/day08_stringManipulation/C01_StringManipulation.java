package day08_stringManipulation;

import java.util.Scanner;

public class C01_StringManipulation {
    public static void main(String[] args) {
        //Soru 4- Kullanicidan gunu ismini girmesini isteyin,
        // girilen gun hafta ici bir gun ise “Simdi calisma zamani tatile .. gun var”
        // seklinde hafta sonu tatiline kac gun kaldigini yazdirin,
        // girilen gun hafta sonu ise “Simdi dinlenme zamani” yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen gün ismini giriniz");
        String girilenGun= scan.next();
        String kullanilacakGun=girilenGun.toLowerCase();

        /*
        string ifadeler case sensitive'dir
        kullanıcıdan Pazar, PAzar, PazaR, PAZAR... gibi 32 farklı şekilde yazma ihtimali var

        Kullanıcının girdigi degeri direkt kalıcı olarak degistirmek tercih edilmez
        bunun yerine kullanıcının girdigi degeri değiştirip yeni bir veriable'ye atama yapar
        ve kodlarımızda yeni veriable'yi kullanırız

        konsola yazdıracağımız zaman istersek kullanıcının girdigi orijinal metni yazdırırız
        istersek de bizim çevirdigimiz halini yazdırabiliriz.
         */

        switch (kullanilacakGun){
            case "pazartesi":
                System.out.println(girilenGun + " calisma zamanı, tatile 5 gun var");
                break;
            case "sali":
                System.out.println(girilenGun + " calisma zamanı, tatile 4 gun var");
                break;
            case "carsamba":
                System.out.println(girilenGun + " calisma zamanı, tatile 3 gun var");
                break;
            case "persembe":
                System.out.println(girilenGun + " calisma zamanı, tatile 2 gun var");
                break;
            case "cuma":
                System.out.println(girilenGun + " calisma zamanı, tatile 1 gun var");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println(" Simdi dinlenme zamanı");
                break;
            default:
                System.out.println("Yanlis gün ismi");

        }

    }
}
