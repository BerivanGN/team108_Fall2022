package day06_ifElseStatements;

import java.util.Scanner;

public class C08_ifElseif {
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

        if (kartVarMi=='E' && urunadedi>10 ){
            System.out.println("%20 indirimli toplam fiyat: " + urunadedi*listeFiyati*0.8);
        } else if (kartVarMi=='E' && urunadedi>0) {
            System.out.println("%15 indirimli toplam fiyat : " + urunadedi*listeFiyati*0.85);
        } else if (kartVarMi=='H' && urunadedi>10) {
            System.out.println("%15 indirimli toplam fiyat : " + urunadedi*listeFiyati*0.85);
        } else if (kartVarMi=='H' && urunadedi>0) {
            System.out.println("%10 indirimli toplam fiyat : " + urunadedi*listeFiyati*0.9);
        }else{
            System.out.println("Hatali bilgi");
        }

        }

    }

