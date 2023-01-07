package day23_dateTime_varargs;

public class C09_Varargs {
    public static void main(String[] args) {

        /*
          Argüment olarak tam sayılar alıp
          son argüment hariç geriye kalanları toplayıp
          bulunan toplamı son argüment ile çarpıp sonucu yazdıran bir metod oluşturun.

          Not: Argüment sayısı değişken olabilir.
         */

       //  islemYap(3,4,5,8,1,2);// 42 (21*2)

        /*
        Varargs sınırsız sayıda element alma özelliğine sahiptir
        dolayısıyla varargs olarak tanımlanan bir parametreden sonra
        parametre kullanırsanız CTE oluşur

        Çünkü varargs tüm argümentleri almak ister
        bu durumda sondaki parametreye element kalmaz.

        Kural : Bir metod'da parametre olarak varargs kullanılacaksa
        son parametre olarak kullanılmalıdır

                Bu kural göz önüne alındığında bir metod'da parametre olarak
                birden fazla varargs kullanılamaz

                Parametrelerin data türünün değişmesi bu kuralı etkilemez
         */



    /*
    private static void islemYap(int... geriyeKalanlar, int sonSayi) {


        int geriyeKalanlarToplami=0;

     */


    }
}
