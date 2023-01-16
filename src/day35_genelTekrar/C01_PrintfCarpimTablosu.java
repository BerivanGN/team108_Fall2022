package day35_genelTekrar;

import java.util.InputMismatchException;
import java.util.Scanner;

public class C01_PrintfCarpimTablosu {
    public static void main(String[] args) {

        // Kullanıcıdan bir rakam alın ve çarpım tablosu oluşturun

        Scanner scan= new Scanner(System.in);
        int girilenSayi=0;

        while (girilenSayi<2 || girilenSayi>9) {
            try {
                System.out.println("Çarpım tablosu oluşturmak için bir rakam giriniz");
                girilenSayi= scan.nextInt();
                if (girilenSayi>1 && girilenSayi<10){
                    break;
                }
                System.out.println("Çarpım tablosu için 1'den büyük pozitif bir rakam girmelisiniz");
            } catch (InputMismatchException e) {
                System.out.println("Çarpım tablosu için 1'den büyük pozitif bir rakam girmelisiniz");
                scan.next();
            }

        }

        for (int i = 1; i <= girilenSayi; i++) {
            for (int j = 1; j <= girilenSayi; j++) {

                int carpim=i*j;
                System.out.printf("%2d  ",carpim);
                // 2'nin önüne eksi(-) koyarsak sola dayalı olur koymazsak sağa dayalı olur.
            }
            System.out.println("");

        }

        /*
        sayıların arasında 2 space var
        sayılar da 2 karakter şeklinde yazılıp sağa dayalı yapıldı

           1   2   3   4   5
           2   4   6   8  10
           3   6   9  12  15
           4   8  12  16  20
           5  10  15  20  25

        */




    }
}
