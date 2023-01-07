package haftasonuTekrari;

import java.util.Arrays;
import java.util.Scanner;

public class aa {
    public static void main(String[] args) {

        /*
        //Soru 31-)
        //Kullanıcıdan Arrayin uzunlugunu isteyin.
        //Ardından kullanıcıdan Arrayin elemanlarını girmesini isteyin.

         */
        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen array'in uzunlugunu giriniz.");
        int arrayUzunluk=scan.nextInt();
        int[] arr = new int[arrayUzunluk];

        for (int  each:arr
        ) {
            System.out.println("Lütfen array'in elemanlarını giriniz:");
            int girilen=scan.nextInt();
            arr[each]=girilen;

            if(arr[each]==arrayUzunluk)
                break;
        }
        System.out.println(Arrays.toString(arr));

    }
}
