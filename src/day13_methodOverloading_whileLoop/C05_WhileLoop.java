package day13_methodOverloading_whileLoop;

import java.util.Scanner;

public class C05_WhileLoop {
    public static void main(String[] args) {

        // Kullanıcıdan toplamak üzere sayı alın
        // girilen sayıların toplamı 500 olur veya geçerse
        // " Bu kadar sayı yeter " deyip toplamı yazdırın

        //bu soruyu illa da for loop ile yapalım dersek
        // adım sayısını tahmin edip biraz abartabiliriz

        Scanner scan= new Scanner(System.in);
        int toplam=0;
        int sayi=0;

        for (int i = 1; i <10000; i++) {

            System.out.println("toplamak üzere tam sayı giriniz");
            sayi= scan.nextInt();

            toplam += sayi;

            if (toplam>=500){
                System.out.println("Bu kadar sayı yeter. Toplamları " + toplam + " oldu");
                break;
            }
        }

        // aynı soruyu while loop ile yapalım

        toplam=0;
        sayi=0;
        while (toplam<500){
            System.out.println("toplamak üzere tam sayı giriniz");
            sayi= scan.nextInt();
            toplam += sayi;
        }
        System.out.println("Bu kadar sayı yeter. Toplamları " + toplam + " oldu");
    }
}
