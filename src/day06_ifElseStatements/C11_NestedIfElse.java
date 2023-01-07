package day06_ifElseStatements;

import java.util.Scanner;

public class C11_NestedIfElse {
    public static void main(String[] args) {
        //Soru 3- Kullanicidan aldigi urun adedi ve ve liste fiyatini alin,
        // kullaniciya musteri karti olup olmadigini sorun.
        // Musteri karti varsa 10 urunden fazla alirsa %20, yoksa %15 indirim yapin,
        // Musteri karti yoksa 10 urunden fazla alirsa %15, yoksa %10 indirim yapin

        Scanner scan= new Scanner(System.in);
        System.out.println("Lütfen ürün adedini giriniz");
        int urunadedi= scan.nextInt();

        System.out.println("ürünün liste fiyatını giriniz");
        double listeFiyati= scan.nextDouble();

        System.out.println("Müsteri kartiniz var\nE:Evet  H:Hayir");
        char kartVarMi= scan.next().charAt(0);

        // ürün miktarı ana değişken olsun

        if (urunadedi>10){ // urun sayısı 10 dan fazla
            if (kartVarMi=='E' || kartVarMi=='e') System.out.println("%20 indirimli toplam fiyat : " +urunadedi*listeFiyati*0.80);
            else if (kartVarMi=='H' || kartVarMi=='h') System.out.println("%15 indirimli toplam fiyat : " +urunadedi*listeFiyati*0.85);
            else System.out.println("hatalı kart bilgisi");


        } else if (urunadedi>0) { // urun sayısı 0 ile 10 arasında
            if (kartVarMi=='E' || kartVarMi=='e') System.out.println("%15 indirimli toplam fiyat : " +urunadedi*listeFiyati*0.80);
            else if (kartVarMi=='H' || kartVarMi=='h') System.out.println("%10 indirimli toplam fiyat : " + urunadedi*listeFiyati*0.9);
            else System.out.println("hatali kart bilgisi");



        }else { //urun sayısı 0 veya daha az
            System.out.println("hatalı ürün adedi");
        }
    }
}
