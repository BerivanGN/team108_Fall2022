package day23_dateTime_varargs;

public class C08_Varargs {
    public static void main(String[] args) {

        /*
          Argüment olarak tam sayılar alıp
          ilk argüment hariç geriye kalanları toplayıp
          bulunan toplamı ilk argüment ile çarpıp sonucu yazdıran bir metod oluşturun.

          Not: Argüment sayısı değişken olabilir.
         */

        islemYap(3,4,5,8,1,2);// 60 ( 3*20)
        islemYap(5,1); // 5
        islemYap(4); // 0 ( geriye kalanları 0 belirledi)
        islemYap(3,4,5,6); // 45

    }

    private static void islemYap(int ilkSayi, int...geriyekalanlar) {

        int geriyeKalanlarToplami=0;

        for (int each:geriyekalanlar
             ) {
            geriyeKalanlarToplami+=each;
        }
        System.out.println(geriyeKalanlarToplami*ilkSayi);
    }
}
