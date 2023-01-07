package day18_arrayLists;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C06_Soru {
    public static void main(String[] args) {

        // verilen bir array'deki tekrar eden elementleri silip
        // array'i unique(benzersiz) değerlerden oluşan bir array haline getirin.


        int [] arr = { 4,3,6,7,3,5,3,6,7,3,5,4,6,4,7,7,7,5};


        List<Integer> benzersizElementlerList= new ArrayList<>();

        // array'deki tüm elementleri alıp
        // Listede var mı diye kontrol edelim
        // ve olmayanları ekleyelim

        for (int i = 0; i < arr.length; i++) {

            if (!benzersizElementlerList.contains(arr[i])){

                benzersizElementlerList.add(arr[i]);
            }
        }
        System.out.println(benzersizElementlerList); // [4, 3, 6, 7, 5]

        arr=new int[benzersizElementlerList.size()]; // [0, 0, 0, 0, 0]

        for (int i = 0; i < arr.length; i++) {
           arr[i] =benzersizElementlerList.get(i); // get "getir" metodudur
        }
        System.out.println("Array'in son hali : " + Arrays.toString(arr));

    }
}
