package day14_doWhileLoop_scope;

import java.util.Scanner;

public class C02_DoWhileLoop {
    public static void main(String[] args) {

        // kullanıcıdan istediği kadar sayı alın ve toplayın
        // kullanıcı değer olarak 0'a basarsa işleni bitirin

        int girilenSayi=-9;
        int toplam=0;
        Scanner scan=new Scanner(System.in);

        do {
            System.out.println("Lütfen toplamak için bir sayı giriniz");
            girilenSayi= scan.nextInt();
            toplam += girilenSayi;
        }while (girilenSayi!=0);

        System.out.println("Girilen sayıların toplamı : " + toplam);

        /*
          While loop da ilk şart sağlanmazsa loop body hiç çalışmaz
          do-While loop'da önce body çalıştığı için sart yanlış olsa bile
          loop body'si en az 1 kere çalışmış olur
         */

    }
}
