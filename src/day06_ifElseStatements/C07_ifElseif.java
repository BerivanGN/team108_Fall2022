package day06_ifElseStatements;

import java.util.Scanner;

public class C07_ifElseif {
    public static void main(String[] args) {
       // Soru 2- Kullanicinin kilo(kg) ve boyunu(cm) isteyip
        // vucut kitle endeksini hesaplayin (kilo*10000 / (boy *boy))
        // vucut kitle endeksi 30’dan buyukse obez,
        // 25-30 arasi ise kilolu,
        // 20-25 arasi ise normal,
        // 20’den kucukse zayif yazdirin.

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen kilonuzu kg olarak giriniz");
        double kilo= scan.nextDouble();

        System.out.println("Lütfen cm olarak boyunuzu giriniz");
        double boy= scan.nextDouble();

        double vke= kilo*10000/(boy * boy);

        System.out.println("Vücut kitle endeksiniz: " + vke);
        if (vke>=30 ) System.out.println("Obezsiniz");
        else if (vke>=25) System.out.println("Kilolusunuz, rejime baslamalısınız");
        else if (vke>=20) System.out.println("Kilonuz normal,boyle devam edin");
        else System.out.println("zayıfsınız, kilo almalısınız");

        }


        }



