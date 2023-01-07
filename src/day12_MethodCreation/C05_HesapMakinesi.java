package day12_MethodCreation;

import java.util.Scanner;

public class C05_HesapMakinesi {
    public static void main(String[] args) {
        // kullanıcıdan 2 sayı ve istediği işlemi alın (+ / * - )
        // bir metod oluşturup  sayılara istenen işlemi uygulayıp
        // sonucu bize döndürün
        // kullanıcı işlemi yanlış seçmişse 0 döndürün

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen 2 sayı giriniz");
        double sayi1= scan.nextDouble();
        double sayi2= scan.nextDouble();

        System.out.println("Lütfen bir işlem seçiniz +, -, /, *");
        char islem=scan.next().charAt(0);

        System.out.println(hesapMakinesi(sayi1, sayi2, islem));

        double sonuc=hesapMakinesi(5,6.5,'*');
        System.out.println(sonuc);

    }

    public static double hesapMakinesi(double sayi1, double sayi2, char islem){

        switch (islem){
            case '+':
                return sayi1+sayi2;

            case '-':
                return sayi1-sayi2;

            case '/':
                return sayi1/sayi2;

            case '*':
                return sayi1*sayi2;

            default :
                return  0;
        }

    }

}
