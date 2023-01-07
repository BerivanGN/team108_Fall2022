package day04_increment_Concatenation;

public class C01_Pre_Postincrement {
    public static void main(String[] args) {

        int sayi=20;

        // sayiyi 3 artırın

        sayi=sayi+3;
        sayi+=3;

        sayi++;
        sayi++;
        sayi++;

        System.out.println(sayi);  //29

        // sayinin degerini 2 azaltın

        sayi=sayi-2;

        sayi-= 2;

        sayi--;
        sayi--;

        System.out.println(sayi); //23

        sayi=10 ;
        //sayinin degerini önce 1 azaltın ve sonra yazdırın

        sayi--;
        System.out.println(sayi); //9
        // bu islemde ekranda gördugumuz 9, sayının degeri de 9


        sayi=10;
        //sayiyi önce yazdırın sonra 1 azaltın

        System.out.println(sayi); //10
        sayi--;

        // ekranda görülen 10 ama sayının son degeri 9 (cıkarmadan sonra yazdırmadık)
        System.out.println(sayi); //9 (simdi ekranda görünen 9 olur)




        sayi=10;
        sayi++; //sayiyi 1 artırır
        ++sayi; //sayiyi 1 artırır
        System.out.println(sayi); // 12



        sayi=10;
        System.out.println(sayi++); // 10
        //java aynı satırda 2 ıslem oldugundan sıralama yapar
        //eger ++ veriableden(sayıdan) sonra ise artırma islemını sonra yapar
        //bu durumda önce yazdırma sonra artırma islemi yapar. (sayı 10 görünür)

        System.out.println(sayi); //11


        sayi=10;
        System.out.println(++sayi); //11
        // ++ veriableden(sayıdan) önce ise artırma islemini önce yapar.
        // bu durumda java önce artırma sonra yazdırma islemi yapar.

        System.out.println(sayi); //11



    }
}
