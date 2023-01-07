package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C05_forEachLoopSoru {
    public static void main(String[] args) {

        // Soru 1- Verilen bir array’de tekrar eden elementler icin,
        // mukerrer olanlari silip
        // tum elemanlardan sadece 1 tane yapip eski array’e yeni halini atayip yazdirin.

        Integer[] arr={2,3,4,6,3,4,6,1,8,5,4};
        List<Integer> List=new ArrayList<>();

        for (Integer each:arr
             ) {
            if (!List.contains(each)){
                List.add(each);
            }
        }
        // List olarak unique(benzersiz) değerlerden oluşan bir list oluşturduk.

        arr=new Integer[List.size()];
       
        // şimdi list'teki elementleri array'e kopyalayalım
        // Array'e atama yapmak için index'e ihtiyacımız olduğundan 
        // For each loop kullanmak pratik değildir.

        for (int i = 0; i < arr.length; i++) {
            arr[i]=List.get(i);
        }
        System.out.println("Array'in yeni hali : " + Arrays.toString(arr)); // [2, 3, 4, 6, 1, 8, 5]



    }
}
