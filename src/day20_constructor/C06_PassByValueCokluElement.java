package day20_constructor;

import java.util.Arrays;

public class C06_PassByValueCokluElement {
    public static void main(String[] args) {

        int[] arr= {3,6,8};
        // bir metod oluşturun
        // metod'ta array'e 5 elementli yeni bir array atayın
        // ve yazdırın
        // main metoda döndükten sonra yine array'i yazdırın

        arrayiDegistir(arr);
        System.out.println(Arrays.toString(arr)); // [3, 6, 8]

    }

    public static void arrayiDegistir(int[] b){

        b=new int[5];
        System.out.println(Arrays.toString(b)); // [0, 0, 0, 0, 0]
    }

}
