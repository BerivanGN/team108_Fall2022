package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C01_DoWhileLoop {
    public static void main(String[] args) {

        // kullanıcıdan istediği kadar sayı alın ve toplayın
        // kullanıcı değer olarak 0'a basarsa işleni bitirin

        int girilenSayi=-9;
        int toplam=0;
        Scanner scan=new Scanner(System.in);

        while (girilenSayi!=0){
            System.out.println("Lütfen toplamak için bir tam sayı giriniz");
            girilenSayi= scan.nextInt();

            toplam +=girilenSayi;


        }
        System.out.println("Girilen sayıların toplamı : " + toplam);

        /*
           while loop'un 2 tane negatif yönü vardır
           1- Loop'tan önce oluşturduğumuz ve loop'ta kullanacağımız veriable'lera
           yanlış bir değer verirsek
           bu negatif yönler onu kullanılamaz yapacak büyüklükte değildir
           ancak bu negatifliklerden kurtulmak istersek do-while loop kullanabiliriz
         */

    }
}
