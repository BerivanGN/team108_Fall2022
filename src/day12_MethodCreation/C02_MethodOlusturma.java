package day12_MethodCreation;

public class C02_MethodOlusturma {
    public static void main(String[] args) {

        // verilen 2 sayıyı çarpıp sonucu yazdıran bir metod oluşturun.
        // bir metod ancak metod call yapıldığında çalışır
        // metod call için method adı ve parametrelere uygun argument yazılmalı
        // metod call içerisinde yazılan veriable veya değerlere argüment denir

        carpYazdir(5,8); //40.0
        carpYazdir(7.4,8.6); // 63.64

        // carpYazdir("ali","veli"); argüment ve parametre uygun değilse CTE olur
                                    //yani double parametresine string argüment yazamayız.

    }

    // yeni metodu oluşturmak için main metodun dışına çıkmak lazım...

    public static void carpYazdir(double sayi1, double sayi2){


        System.out.println(sayi1 * sayi2);
    }
}
