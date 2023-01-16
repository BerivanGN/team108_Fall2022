package day35_genelTekrar;

import java.util.Scanner;

public class C02_PrintfOndalikliSayi {
    public static void main(String[] args) {

        // Kullanıcıdan boy ve kilosunu alıp
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

        // System.out.println("Vücut kitle endeksiniz: " + vke);

        System.out.printf("Vücut kitle endeksiniz: %.2f %n",vke);

        if (vke>=30 ) System.out.println("Obezsiniz,geç kalmadan diyetisyene gitmelisiniz");
        else if (vke>=25) System.out.println("Kilolusunuz, rejime başlamalısınız");
        else if (vke>=20) System.out.println("Kilonuz normal,böyle devam edin");
        else System.out.println("zayıfsınız, kilo almalısınız");

    }
}
