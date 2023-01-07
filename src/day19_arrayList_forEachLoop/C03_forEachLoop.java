package day19_arrayList_forEachLoop;

public class C03_forEachLoop {
    public static void main(String[] args) {

        /*
           Eğer çoklu element içeren bir yapıdaki tüm elementlere
           aynı işlemi yapmak istiyorsak index'ten bağımsız olarak
           for each loop kullanılabilir.

           for each loo'da 3 seyi belirtmemiz gerekir.
           1- getirilecek elementlerin data türü
           2- getirilen elemente verilecek isim
           3- nereden getirileceği
         */


        int[] arr={2,4,6,8,1};

        // Bu array'in tüm elementlerini yazdıralım

        for (int each: arr
             ) {
            System.out.print(each+ " ");
        }
        System.out.println("");
        // tüm elementleri toplayalım
        int toplam=0;
        for (int each:arr
             ) {
            toplam+=each;
        }
        System.out.println("Sayıların toplamı = " + toplam);

        // tüm sayıların karelerini toplayalım.

        toplam=0;

        for (int each:arr
             ) {
            toplam+=each*each;
        }
        System.out.println("Sayıların kareleri toplamı = " + toplam);

    }
}
