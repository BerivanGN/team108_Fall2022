package haftasonuTekrari2;

import java.util.Scanner;

public class T05_soru10 {
    public static void main(String[] args) {

        // Soru 10-)  Klasik Soru
        // Kullanıcıdan kilosunu ve boyunu isteyin ve kütleyi hesaplayan bir program yazın
        // **indeks Hesaplama: İPUCU :
        // Vücut Kitle İndeksi = Ağırlık (kg) / Boy uzunluğunun karesi (m) // If konusunu hatırlayın!***
        // Kullanıcıya aşağıdaki gibi mesaj verin:
        // Eğer VKİ 18.5'ten az ise --> zayıfsınız
        // Eğer VKİ 18.5 ile 25 arasında ise --> kilo idealdir
        // Eğer VKİ 25 ila 30 arasındaysa --> şişmansınız
        // VKİ 30'a eşit veya daha fazlaysa --> obez
        // ÖRNEK :
        // Ağırlık : 71
        // Yükseklik : 1,72
        // ÇIKTI :
        // VKİ değeriniz : 23.99945916711736

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen kg cinsinden kilonuzu giriniz");
        double kilo= scan.nextDouble();
        System.out.println("Lütfen metre cinsinden boyunuzu giriniz");
        double boy= scan.nextDouble();

        double VKI=kilo/(boy*boy);

        if (VKI<18.5) System.out.println("VKI değeriniz : " + VKI + " Zayıfsınız");
        else if (VKI>=18.5 && VKI<25) System.out.println("VKI değeriniz : " + VKI + " Kilo idealdir");
        else if (VKI>=25 && VKI<30) System.out.println("VKI değeriniz : " + VKI + " Şişmansınız");
        else if (VKI>=30) System.out.println("VKI değeriniz : " + VKI + " Obez");




    }
}
