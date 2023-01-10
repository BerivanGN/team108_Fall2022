package day31_collections;

import java.util.*;

public class C01_LinkedList {
    public static void main(String[] args) {

        /*
           collection objeleri bir arada tutan yapılardır
           Gerçek hayattaki ihtiyaçlara göre Java farklı collection yapıları oluşturmuştur.
           Bir uygulamada hangi collection'u kullanacağımıza istediğimiz özelliklere
           göre karar veririz.
           Collection temelde 3 ana gruba ayrılır ve 3 interface ile kuralları belirlenmiştir.
              - List
              - Queue
              - Set
           Ancak interface'lerden obje oluşturulamayacağı için
           child clasların costructorları kullanılır.
           Burada özellikleri belirleyen constructor değil Data türü olarak seçilen collectiondur.

            Örneğin LinkedList oluştururken seçeceğimiz data türü ile
            Queue, Deque, List veya tümünün özelliklerini taşıyan LinkedList'ler oluşturabiliriz

         */

        LinkedList<String> ll1= new LinkedList<>();
        List<String> ll2= new LinkedList();
        Queue<String > ll3= new LinkedList<>();
        Deque<String> ll4= new LinkedList<>();

    }
}
