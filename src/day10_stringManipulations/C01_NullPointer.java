package day10_stringManipulations;

public class C01_NullPointer {
    public static void main(String[] args) {

        String str1="";
        String str2="    ";
        String str3;
        String str4=null;

        System.out.println(str1.length()); //0
        System.out.println(str2.length()); //4

        System.out.println(str1.isEmpty()); //True
        System.out.println(str2.isEmpty()); //False

        System.out.println(str1.isBlank()); //True
        System.out.println(str2.isBlank()); //True

        //null bir değer değil işaretçidir (null pointer)
        //null pointer: non primitive bir objenin oluşturulduğunu
        //             ancak bilinçli olarak değer atanmadığını işaretler
        //             str4'ün değeri null'dur. cümlesi YANLIŞTIR.
        //             str4 null olarak işaretlenmiştir cümlesi DOGRUDUR.

        // System.out.println(str3.length()); // değer atanmadığından uzunluğu(lengt'i) hesaplanmaz
        // System.out.println(str3.concat("Ali Can"));
        // System.out.println(str3.substring(3, 4));

        /*
        Java bir veriable yi oluşturup değer atanmamaya izin verir
        bir veriableyi değer atanmadan oluşturabilirsiniz ancak kullanamazsınız.
        değer atanmayan bir veriableyi oluşturmaya kalkarsanız
        java CTE verir.

        null pointer ise bu veriable'ye bir değer atanmadığını
        ve bunun bilinçli tercih olduğunu java'ya söyler
        dolayısıyla java kodların çalışmaya devam etmesine izin verir
        ancak değer atamadığı için metot'larla kullanmaya çalışırsanız
        NullPointerException verir.
         */

        str4=null;
        //System.out.println(str4.length()); // NullPointerException (değer oluşturuldu ama bir şey atanmadı)
        //System.out.println(str4.substring(3, 4)); //NullPointerException (değer oluşturuldu ama bir şey atanmadı)

        System.out.println(str4); // null
        System.out.println(str4 + "Ali Can"); //nullAli Can
        System.out.println(str4.concat("Ali Can")); //NullPointerException


    }
}
