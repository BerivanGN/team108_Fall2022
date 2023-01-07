package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class C02_ArraydenListYapma {
    public static void main(String[] args) {

        Integer[] arr={2,3,4,6,3,4,6,1,8,5,4};

        /*
           Verilen bir array'i list'e çevirmek için 2 yöntem vardır
           1- Loop ile tüm elementleri List'e kopyaladık
           2- asList() kullanmak
              çok tavsiye etmiyoruz. Çünkü 2 büyük dezavantajı var.
              - asList ile oluşturuluan list array'den dönüstürüldüğü için
                add, remove gibi size(uzunluk)'ı değiştiren metodlar kullanılamaz.
              - asList ile oluşturulan list ile bağlı olduğu array birbirinden ayrılmıyor
                birinde yapacağımız değişiklik otomatik olarak diğerini de etkiliyor.
         */

        List<Integer>List1=new ArrayList<>();
        for (int i = 0; i < arr.length; i++) {

            List1.add(arr[i]);
        }
        System.out.println("Loop ile taşınan list : " + List1 ); // [2, 3, 4, 6, 3, 4, 6, 1, 8, 5, 4]


        List<Integer> list2= Arrays.asList(arr);
        System.out.println("aslist ile oluşturulan list : " + list2); // [2, 3, 4, 6, 3, 4, 6, 1, 8, 5, 4]

        // list2.add(6); asList'e ekleme yapılmaz

        arr[0]=10;

        System.out.println(Arrays.toString(arr)); // [10, 3, 4, 6, 3, 4, 6, 1, 8, 5, 4]
        System.out.println(list2); // [10, 3, 4, 6, 3, 4, 6, 1, 8, 5, 4]
        // list2'de değişiklik yapmadığımız halde değişti sebep aslist'le oluşmuş olması



    }
}
