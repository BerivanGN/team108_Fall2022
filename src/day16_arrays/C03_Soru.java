package day16_arrays;

import java.util.Arrays;

public class C03_Soru {
    public static void main(String[] args) {

        // Verilen bir int array'daki tüm elementleri 5 arttırın

        int[] arr={2,4,6,8};

        for (int i = 0; i < arr.length; i++) {

            arr[i] +=5;
        }
        System.out.println(Arrays.toString(arr));

    }
}
