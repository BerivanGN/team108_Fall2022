package day09_stringManipulations;

public class C03_startsWith {
    public static void main(String[] args) {

        String  str= "Java mutluluktur";
        System.out.println(str.startsWith("Java")); // true
        System.out.println(str.startsWith("j")); // false

        System.out.println(str.startsWith("Java mutluluktur")); // true

        System.out.println(str.startsWith("")); //true (hiçlikle mi başlar diye sorulur cevap evettir.)


        System.out.println(str.contains("mutlu")); // true (mutlu içerir mi diye sorar cevap evet)
        System.out.println(str.startsWith("mutlu")); // false (mutlu ile baslar mı cevap hayır)

        System.out.println(str.startsWith("mutlu", 5)); //2. index ve sonrası mutlu ile başlar mı

        System.out.println(str.startsWith("v",2)); // 2. index ve sonrası "v" ile başlar mı

    }
}
