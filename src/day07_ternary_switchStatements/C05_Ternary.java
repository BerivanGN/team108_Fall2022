package day07_ternary_switchStatements;

public class C05_Ternary {
    public static void main(String[] args) {
        /*
           Ternary işleminin sonucunu yazdıracaksak
           boolean sartın true veya false olması durumunda yazdıracagımız datalar farklı data turunde olabilir

           Ancak atama yapacaksak
           true veya false olması durumunda alacagı degerler
           atayacagım veriable'nin data turune uygun olmalıdır.
         */

        int sayi=12;

        System.out.println(sayi>10 ? "büyük sayı" : sayi+2);

        /*
        int b= sayi>10 ? "büyük sayı" : sayi+2; //int denmnişse buyuk sayı olan kısım hata verir.
        String c= sayi>10 ? "büyük sayı" : sayi+2 // string denmişse sayı+2 olan kısım hata verir.

        */

    }
}
