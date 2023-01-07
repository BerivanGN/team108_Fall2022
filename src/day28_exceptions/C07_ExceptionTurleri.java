package day28_exceptions;

public class C07_ExceptionTurleri {
    public static void main(String[] args) {

        String str="234";

        // str'a sayısal olarak 5 ekleyip yazdırın

        System.out.println(Integer.parseInt(str)+5);

        // Eğer str içinde sayı olmayan bir karakter olursa NumberFormatException olur

        Object sayiObj=str;

        Integer sayiInt=(Integer) sayiObj;

        System.out.println(sayiInt); // ClassCastException

    }
}
