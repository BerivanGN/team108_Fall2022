package day04_increment_Concatenation;

public class C02_Pre_Postincrement {
    public static void main(String[] args) {

        int a = 10;

        int b = a++;

        int c = ++a;


        System.out.println(a + "," + b + "," + c); // 12, 10, 12


        int x = 20;
        int y = ++x;
        int z = y++;
        System.out.println(x + "," + y + "," + z); // 21, 22, 21


        int k = 30;

        System.out.println(k++); //önce k var 30 yazar

        System.out.println(++k); //hem önceki artırma hem simdiki artırma(2 artırma)  k 32

        System.out.println(k++); // önce k var 32 yazar

        System.out.println(k); // önceki artırmayı şimdiye uygular 1 artırır 33 olur


        int sayi1 = 40;

        int sayi2 = sayi1++;

        int sayi3 = --sayi2;

        int sayi4 = --sayi1;

        System.out.println(sayi1 + "," + sayi2 + "," + sayi3 + "," + sayi4); //40,39,39,40







    }
}
