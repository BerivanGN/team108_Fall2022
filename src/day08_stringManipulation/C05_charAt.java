package day08_stringManipulation;

public class C05_charAt {
    public static void main(String[] args) {

        String str= "Java guzeldir"; // 13 karakter barındırır.( boslugu da saydık)

        // Java'da index 0'dan baslar
        // J==>0.index, r==>12.index
        // charAt(index) ile istediğimiz index'teki char'a ulaşabiliriz

        // ilk a'yı yazdıralım
        System.out.println(str.charAt(1));

        // sondan 2. harfi yazdıralım
        System.out.println(str.charAt(13-2)); // karakter sayısı -2 . index'teki eleman

        //sondan 4. karakteri yazdıralım
        System.out.println(str.toUpperCase().charAt(13-4)); //

        //charAt() metodu bize char döndürdüğü için toUpperCase calışmaz
        // String metodlarını charAt() ile kullanmak isterseniz
        // charAT()ten önce kullanmalısınız

        //System.out.println(str.charAt(13)); // StringIndexOutOfBoundsException (string sınırların dısında)
        // eger index olarak karakter sayısı veya daha büyük bir değer girersek
        // o index'i bulamayacağı için hata verir.
    }
}
