package day14_doWhileLoop_scope;

public class C05_Scope {

    int sayi=10;
    static  int number;


    public static void main(String[] args) {
        String mainStr="Java";
        number=10;
        // sayi=20;
        // System.out.println(method2Str);

        for (int i = 0; i < 10; i++) {
            int toplam= i;
        }

         // System.out.println(toplam);for loop içinde oldukları için loop dışında yazdırılamazlar.
         // System.out.println(i);

        // static int mainSayi=29;>>>locale de static kullanılmaz
    }

    public static void method1(){
        String method1Str="Güzeldir";
        number=20;
        // sayi=14;
        // System.out.println(mainStr);
        // System.out.println(method2Str);
    }

    public void method2(){
        String method2Str="Candır";
        number=30;
        sayi=30;
        // System.out.println(mainStr);
    }
}
