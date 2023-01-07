package day16_arrays;

import java.util.Arrays;

public class C02_Arrays {
    public static void main(String[] args) {

        // Verilen bir string array'in tüm elementlerini yazdırın

        String[] isimler= {"Hüseyin","Yusuf","Mehmet","Akile","Berivan"};

        System.out.println(Arrays.toString(isimler)); //[Hüseyin, Yusuf, Mehmet, Akile, Berivan]

        for (int i = 0; i < isimler.length; i++) {
            System.out.print(isimler[i] + " "); // Hüseyin Yusuf Mehmet Akile Berivan
        }

    }
}
