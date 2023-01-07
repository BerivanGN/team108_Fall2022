package day12_MethodCreation;

public class C08_Palindrome {
    public static void main(String[] args) {
        // Verilen bir Stringin Palindrom olup olmadıgını yazdırın
        // polindrome : düz okunuşu ile tersten okunuşu aynı olan

        String str= "1234321";

        String tersStr=C07_TerseCevirme.metniTerseCevir(str);

        if (str.equals(tersStr)){
            System.out.println("Verilen metin palindrome");
        }else {
            System.out.println("Verilen metin palindrome değil");
        }
    }
}
