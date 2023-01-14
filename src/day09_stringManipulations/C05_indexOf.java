package day09_stringManipulations;

public class C05_indexOf {
    public static void main(String[] args) {

        String str= "Java ile kodlama cok kolay";

        // str "cok" içeriyor mu
        System.out.println(str.contains("cok")); // true

        // kullanıcıdan aldıgımız cümle "çok"  ile başlayan ilk kelimeyi yazdırın

        System.out.println(str.endsWith("cok")); // false

        System.out.println(str.indexOf('a')); // 1(ilk a'nın indexini yazdırır)
        System.out.println(str.indexOf("v")); // 2

        System.out.println(str.indexOf("cok")); // 17

        System.out.println(str.indexOf("a", 5));

        // 2 . o'nun indexini yazdırın
        //önce ilk o'nun indexini buluruz
        // sonra o index'ten sonrasında 2. o'yu aratırız.

        int ilkOindexi=str.indexOf("o"); // 10
        int ikinciOindexi=str.indexOf("o", ilkOindexi+1);
        // +1 koymazsak ilk o'yu bulur

        System.out.println(ilkOindexi+ " " +ikinciOindexi);


    }
}
