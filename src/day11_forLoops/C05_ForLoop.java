package day11_forLoops;

import java.util.Scanner;

public class C05_ForLoop {
    public static void main(String[] args) {

        //Soru 3- Kullanicidan baslangic ve bitis degeri olarak pozitif sayilar alin,
        // sinirlar dahil olarak aralarindaki tum sayilarin toplamini yazdirin.
        // Bitis degeri baslangic degerinden kucukse, uyari yazdirip islemi sonlandirin.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen başlangıç ve bitiş değerleri için 2 pozitif tamsayı giriniz");

        int baslangic= scan.nextInt();
        int bitis=scan.nextInt();

        if (bitis<baslangic){
            System.out.println("Başlangıç değeri bitiş değerinden küçük olmalı");
        }else {
            int toplam=0;
            for (int i = baslangic; i <=bitis; i++) {

                toplam +=i; // tümsayıları sırasıyla toplama ekledik
            }
            System.out.println(baslangic + " ile " + bitis + " arasındaki sayıların toplamı : " + toplam);
        }
    }
}
