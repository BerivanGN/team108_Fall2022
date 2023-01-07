package day22_immutableClasses;

import java.io.LineNumberInputStream;
import java.util.ArrayList;
import java.util.List;

public class C01_PassByValue {
    public static void main(String[] args) {

        // verilen bir List'de değişiklik yapan 2 metod oluşturun
        // 1. metod list'in elementlerine yeni değer atayıp yazdırsın
        // 2. metod lis'e yeni bir list değeri atayıp yeni list'e
        // elementler ekleyip yazdırsın
        // her iki metodu çağırdıktan sonra main metod'daki list'i yazdıralım

        List<Integer> sayilar= new ArrayList<>();
        sayilar.add(10);
        sayilar.add(34);
        sayilar.add(45);
        System.out.println(sayilar); // [10, 34, 45]

        elemanlariDegistir(sayilar);

        System.out.println("1.metod call'dan sonra sayılar : " + sayilar); // [25, 54, 67]

        yeniListAta(sayilar);

        System.out.println("2.metod call'dan sonra sayılar : " + sayilar); // [25, 54, 67]

    }

    public static void elemanlariDegistir(List<Integer> sayilar){
        sayilar.set(0,25);
        sayilar.set(1,54);
        sayilar.set(2,67);
        System.out.println("elemanları değiştir metodunda list : " + sayilar); // [25, 54, 67]
    }

    public static void yeniListAta(List<Integer> sayilar){

        sayilar=new ArrayList<>();

        sayilar.add(34);
        sayilar.add(98);
        sayilar.add(11);
        System.out.println("Yeni list ata metodunda sayılar list'inin son hali : " + sayilar); // [34, 98, 11]

    }
}
