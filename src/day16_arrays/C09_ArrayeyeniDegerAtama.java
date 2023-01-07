package day16_arrays;

import java.util.Arrays;

public class C09_ArrayeyeniDegerAtama {
    public static void main(String[] args) {

        int[] arr1= {1,2,3};

       // arr1={3,6,1,8}; >>>> uzunluk değiştirilemez
       // arr1={5,7,1}; >>>>> bu şekilde farklı değer de atanamaz

        // arr1=new int[5]; // atama ancak bu şekilde olur
        //System.out.println(Arrays.toString(arr1)); // [0, 0, 0, 0, 0]

        // 13. satırdaki atama ile java arr1'in pointer'ini eski array'den silip
        // new keyword ile oluşturduğumuz yeni array'e yönlendirir.

        // eski elementleri de korumak istersek ne yapmalıyız?
        // o zaman atama yapmadan önce yeni array'i hazırlamalıyız
        // bunun için boş bir yeni array oluşturup
        // eski array'daki elementleri yeni array'a taşıyıp
        // sonra atamayı yapabiliriz

        int[] temp=new int[5];

        for (int i = 0; i < arr1.length; i++) {

            temp[i]=arr1[i];
        }
        System.out.println(Arrays.toString(arr1)); //[1, 2, 3]
        System.out.println(Arrays.toString(temp)); //[1, 2, 3, 0, 0]

        arr1=temp;
        System.out.println(Arrays.toString(arr1)); //[1, 2, 3]
        System.out.println(Arrays.toString(temp)); //[1, 2, 3, 0, 0]
    }
}
