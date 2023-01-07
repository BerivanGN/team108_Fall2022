package day02_veriables_scanner;

import java.util.Scanner;

public class C07_Scanner {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen isminizi giriniz");

        String girilenIsim = scan.nextLine();
        System.out.println("Lütfen soyisminizi giriniz");
        String girilenSoyisim =scan.nextLine();
        System.out.println("Lütfen yasinizi giriniz");
        int girilenYas = scan.nextInt();

        System.out.println("isminiz:" + girilenIsim +
                           "\nsoyismini:" + girilenSoyisim +
                           "\nyasiniz:" + girilenYas +
                           "\nkaydınız basarıyla tamamlanmıstır.");





    }
}
