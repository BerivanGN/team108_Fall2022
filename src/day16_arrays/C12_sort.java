package day16_arrays;

import java.util.Arrays;

public class C12_sort {
    public static void main(String[] args) {

        //verilen bir array'i Natural Order'a göre sıralayıp yazdırın

        String [] isimler= {"Hüseyin","Yusuf","Mehmet","Akile","Said","ahmet"};

        System.out.println(Arrays.toString(isimler)); //[Hüseyin, Yusuf, Mehmet, Akile, Said, ahmet]
        Arrays.sort(isimler);
        System.out.println(Arrays.toString(isimler)); // [Akile, Hüseyin, Mehmet, Said, Yusuf, ahmet]

        // Eğer büyükten küçüğe sıralam istersek
        // önce sort kullanarak natural order'a göre sıralar
        // sonra geçici bir array kullanarak sıralamayı terse çeviririz

    }
}
