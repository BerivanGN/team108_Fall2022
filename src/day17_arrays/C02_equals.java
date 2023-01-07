package day17_arrays;

import java.util.Arrays;

public class C02_equals {
    public static void main(String[] args) {

        int[] arr1={3, 8, 0};
        int[] arr2={8, 3, 0};

        System.out.println(Arrays.equals(arr1, arr2)); // False

        // equals metodu hem elementleri hem de indexleri kontrol eder
        // aynı indexlerde aynı elementler varsa true yoksa false döner.

        // Eğer sıralamadan dolayı false dönmesini istemiyorsak
        // önce iki array'i de sort(sıralama) yapabiliriz

        Arrays.sort(arr1); // [ 0, 3, 8]
        Arrays.sort(arr2); // [ 0, 3, 8]

        System.out.println(Arrays.equals(arr1, arr2)); // True

    }
}
