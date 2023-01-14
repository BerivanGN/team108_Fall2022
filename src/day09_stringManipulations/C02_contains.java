package day09_stringManipulations;

public class C02_contains {
    public static void main(String[] args) {

        String str= "Java ogren, mutlu ol";

        // str mutlu içeriyor mu?
        System.out.println(str.contains("mutlu")); //true

        //charSequence : char dizisi
        // System.out.println(str.contains('j')); char kabul etmez char dizisi kabul eder


        System.out.println(str.contains("j")); // false ( çünkü cümledeki j buyuk)

        System.out.println(str.contains(" ")); // true

        // contains metod'u kaç tane olduguna değil
        // sadece var olup olmadıgına bakar

        System.out.println(str.contains("Java") && str.contains("mutlu")); // true

    }
}
