package day16_arrays;

import java.util.Arrays;

public class C13_binarySearch {
    public static void main(String[] args) {

        // binary tree javanın kullandığı özel bir sıralama yöntemidir
        // binarySearch method'u binaryTree(ağaç oluşturma-sıralama) özelliğini kullandığından
        // sıralı olmayan array'lerde doğru sonuç döndürmeyebilir
        // eğer binarySearch() kullanılacaksa
        // öncesinde mutlaka sort()>> sıralama kullanılmalıdır.

        int[] arr={2,6,9,3,15,1,7};
        System.out.println(Arrays.binarySearch(arr,1)); // -1 (bulamadı sıralama yok çünkü)

        Arrays.sort(arr);
        System.out.println(Arrays.toString(arr)); // [1, 2, 3, 6, 7, 9, 15]

        System.out.println(Arrays.binarySearch(arr, 7)); //  4 yazar (indeksini yazar)

    }
}
