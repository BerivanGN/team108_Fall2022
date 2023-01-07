package day13_methodOverloading_whileLoop;

import day12_MethodCreation.C03_AsalSayi;
import day12_MethodCreation.C07_TerseCevirme;
import day12_MethodCreation.C09_FibonacciSerisi;

public class C01_MethodCall {
    public static void main(String[] args) {

        //ilk 15 fibonacci sayısını yazdırın

        C09_FibonacciSerisi.fibonaccidenSayiYazdir(15);
        // 0 1 1 2 3 5 8 13 21 34 55 89 144 233 377

        //asagıda verilen cümlenin tersini yazdırın

        String str= "Bir kere yaparım, yan gelir yatarım";
        System.out.println(C07_TerseCevirme.metniTerseCevir(str));

        // verilen cümleyi tersine çevirin

        String tersStr=C07_TerseCevirme.metniTerseCevir(str);
        System.out.println(tersStr); // mıratay rileg nay ,mırapay erek riB

        // asagıda verilen cümlenin palindrome olup olmadığını yazdırın

        str="Java Candır";
        tersStr=C07_TerseCevirme.metniTerseCevir(str); // rıdnaC avaJ

        if (str.equals(tersStr)){
            System.out.println("palindrome");
        }else {
            System.out.println("Palindrome değil");
        }

        // aşağıda verilen sayının asal sayı olup olmadığını yazdırın

        int sayi=23;

        System.out.println(C03_AsalSayi.asalSayiMi(sayi)); // true

        // kullanıcı true/false'dan bir şey anlamaz açık şekilde yazalım dersek

        boolean sonuc=C03_AsalSayi.asalSayiMi(sayi); // true

        if (sonuc){
            System.out.println("Girilen " + sayi + " asal.");
        }else {
            System.out.println("Girilen " + sayi + " asal sayı değil.");
        }

    }
}
