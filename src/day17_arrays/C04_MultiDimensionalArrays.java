package day17_arrays;

import java.util.Arrays;

public class C04_MultiDimensionalArrays {
    public static void main(String[] args) {

        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};

        System.out.println(arr.length); // 5
        System.out.println(arr[2].length); // 4
        System.out.println(arr[2][1]); // 7

        System.out.println(arr[3]); // [I@48140564

        // Multi dimensional array ile çalışırken dikkat etmemiz gereken en önemli konu
        // yazdırdığımız kodun bir array mi yoksa yazdırabileceğimiz bir element mi döndürdüğüdür

        System.out.println(Arrays.toString(arr[3])); // [2]

        // 19. satırdaki 2 elementini yazdırmak istersek

        System.out.println(arr[3][0]); // 2

        // MDA'in tümünü yazdırmak isterseniz
        // tek katlı array'leri yazdırmak için kullandığımız yöntem yeterli olmaz
        // yazdırmak için Arrays.deeptoString methodunu kullanmalıyız

        System.out.println(Arrays.toString(arr));//[[I@58ceff1, [I@7c30a502, [I@49e4cb85, [I@48140564, [I@2133c8f8]
        System.out.println(Arrays.deepToString(arr));// [[1, 2], [3, 4, 5], [6, 7, 4, 5], [2], [1, 2, 3, 4, 5]]

    }
}
