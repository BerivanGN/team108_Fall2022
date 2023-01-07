package day28_exceptions;

import java.util.Scanner;

public class C01_TryCatch {
    public static void main(String[] args) {

        // Kullanıcıdan 2 tam sayı alıp
        // sayıları birbirine bölüp sonucu yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Birbirine bölmek için 2 tam sayı giriniz.");

        int sayi1= scan.nextInt();
        int sayi2= scan.nextInt();


        try {
            // 1-try bölümü : yapmak istediğimiz ama exc. riski oluşturan kodlar
            System.out.println("İki sayının bölümü = " + sayi1/sayi2);
        } catch (Exception e)
                // 2-catch() : beklediğimiz muhtemel exc. ve
                //           bu exc. gerçeklerşirse hata dokümanını store edebileceğimiz veriable'dir.
        {
            System.out.println("Bölecek sayı 0 olamaz");
            e.printStackTrace();

            // catch blogu : exception gerçekleşirse gerçekleşmesini istediğimiz kodlar
            //               burayı yazarken öncelikle
            //               exc. oluşturduğumuzda kodların çalışması dursun mu?
            //               yoksa devam mı etsin? karar vermeliyiz
        }


    }
}
