package day28_exceptions;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C03_TryCatch {
    public static void main(String[] args) {

        // Kullanıcıdan toplamak üzere sayılar alın
        // Kullanıcı işlemi bitirmesi için Q'ya basmasını isteyin
        // kullanıcı Q'ya bastığında toplam kaç sayı girdiğini
        // ve bu sayıların toplamının kaç olduğunu yazdırın

        Scanner scan=new Scanner(System.in);
        int girilenSayi=0;
        int sayiAdedi=0;
        int sayilarinToplami=0;
        while (sayiAdedi<10000){

        try {

                System.out.println("Lütfen toplamak için tam sayı girin" +
                        "\nBitirmek için Q'ya basın");
                girilenSayi= scan.nextInt();
                sayilarinToplami+=girilenSayi;
                sayiAdedi++;

        } catch (InputMismatchException e) {

            String girilenDeger= scan.nextLine();

            if (girilenDeger.equalsIgnoreCase("q")){
                System.out.println("Girilen " + sayiAdedi + " sayının toplamı : " + sayilarinToplami);
                break;
            }else {
                System.out.println("geçersiz input");
            }
        }

    }}
}
