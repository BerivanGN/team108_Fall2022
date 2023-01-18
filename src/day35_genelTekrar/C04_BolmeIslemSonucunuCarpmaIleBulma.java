package day35_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C04_BolmeIslemSonucunuCarpmaIleBulma {
    public static void main(String[] args) {

        // Kullanıcıdan bölünecek sayı ve ve bölecek sayıyı alıp
        // bölme işleminin sonucunu çarpma işlemi ile bulan ve
        // yazdıran bir metod oluşturun.
        // Bu işlemi kullanıcı Q'ya basana kadar devam ettirin.

        Scanner scan=new Scanner(System.in);
        boolean devamEdelimMi=true;
        int bolunecekSayi=1;
        int bolenSayi=1;

        do {
            System.out.println("Lütfen bölünecek tamsayıyı girin,\nbitirmek için Q'ya basın");
            try {
                bolunecekSayi= scan.nextInt();
                System.out.println("Lütfen bölecek sayıyı giriniz");
                bolenSayi= scan.nextInt();
                bolumSonucunuYazdir(bolunecekSayi,bolenSayi);

            } catch (InputMismatchException e) {

                String girilenStr= scan.nextLine();
                // 22. satırda nextInt() ile değeri alamadıysa exception olacak
                // bu satıra gelecek ve biz o değeri nextLine() ile alacağız.

                if (girilenStr.equalsIgnoreCase("Q")){
                    devamEdelimMi=false;
                }else {
                    System.out.println("Bölünecek sayı tam sayı olmalıdır");
                }
            }

        }while (devamEdelimMi);

    }

    private static void bolumSonucunuYazdir(int bolunecekSayi, int bolenSayi) {

        // Bölünecek sayı ve bölen sayı negatif veya pozitif olabilir.
        // Bu durumda öncelikle işaret kontrolü yapmamız lazım.
        // İşaret sorununu çözmek için
        // Önce işlem sonucunun işaretini belirleyip
        // Sonra sayıları işaretten bağımsız hale getirelim.

        int sonucIsareti=1;

        if (bolunecekSayi*bolenSayi<0){
            sonucIsareti=-1;
        }

        // Sonra sayıları işaretten bağımsız hale getirelim.

        bolunecekSayi=bolunecekSayi>=0 ? bolunecekSayi : bolunecekSayi*(-1);
        bolenSayi=bolenSayi>=0 ? bolenSayi : bolenSayi*(-1);

        int bolumSonucu=1;

        while (bolumSonucu*bolenSayi<bolunecekSayi){
            bolumSonucu++;
        }
        if(bolumSonucu*bolenSayi==bolunecekSayi){
            System.out.println("Bölme işileminin sonucu = " + bolumSonucu*sonucIsareti);
        }else {
            System.out.println("Bölme işileminin sonucu = " + (bolumSonucu-1)*sonucIsareti);
        }


    }
}
