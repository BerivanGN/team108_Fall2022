package day21_staticKeyword;

public class C03_PassByValue {
    public static void main(String[] args) {

        int s=20;

        System.out.println(s); // 20

        // int s=30;
        // bir scope'da tanımlanan bir veriable'nin yeniden tanımlanma imkanı yoktur

        // String s="Hasan";
        // data türünü değiştirerek tanımlamak da mümkün değildir
        // çünkü kullanırken veriable'nin ismini yazdığımızda hangi sayı veriable'sini kullanacağı mechul olur

        method1();

    }

    public static void method1(){
        method2(5);
        String s="Hasan";
        System.out.println(s.toLowerCase()); // hasan
    }

    public static void method2(int s){
        s=s*s;
        System.out.println(s);
    }
}
