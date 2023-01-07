package day16_arrays;

import java.util.Arrays;

public class C04_Soru {
    public static void main(String[] args) {

        // Verilen bir String array'da
        // istenen bir harfi içeren kelimeleri silip yerine null yazdırın

        String[] isimler= {"Hüseyin","Yusuf","Mehmet","Akile","Said"};
        String silinecekHarf= "u";

        for (int i = 0; i < isimler.length; i++) {

            if (isimler[i].contains(silinecekHarf)){
                isimler[i]=null;
            }
        }
        System.out.println(Arrays.toString(isimler)); // [Hüseyin, null, Mehmet, Akile, Said]

    }
}
