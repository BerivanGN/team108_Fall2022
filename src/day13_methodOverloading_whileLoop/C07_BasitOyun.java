package day13_methodOverloading_whileLoop;

import java.util.Random;
import java.util.Scanner;

public class C07_BasitOyun {
    public static void main(String[] args) {
        /*
          random olarak 1 ile 100 arasında bir sayı oluşturun
          kullanıcıdan bu sayıyı bilmesini isteyin
          kullanıcı her değer girdiğinde
          tuttuğumuz sayı ile karşılaştırıp tahmini büyüt/küçüt diyelim
          kullanıcı tuttuğumuz sayıyı bildiğinde
          tahmin sayısını ve

          -  3 veya daha az tahminde bildiyse "Vaowww"
          -  4-8 tahminde bildiyse "Aferin"
          -  daha fazla tahminde bildiyse "Başarısız"
          yazdırın
         */

        Random rnd= new Random();
        int tutulanSayi= rnd.nextInt(100);
        int sayac=1;
        int tahmin=0;

        Scanner scan=new Scanner(System.in);

        while (tutulanSayi != tahmin){

            System.out.println("Lütfen bir tahmin giriniz");
            tahmin= scan.nextInt();

            if (tutulanSayi==tahmin){ // sayıyı bulduysa
                System.out.println(sayac + " tahmin ile tuttuğum sayıyı buldun ");
            if (sayac<=3){
                System.out.println("Vaowww");
            } else if (sayac<=8) {
                System.out.println("Aferin");
            }else {
                System.out.println("Başarısız");
            }
            break;
        }else if (tahmin<tutulanSayi){
            System.out.println("Sayıyı büyüt");
            sayac++;
        }else {
            System.out.println("Sayıyı küçült");
            sayac++;
        }}

    }
}
