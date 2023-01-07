package day10_stringManipulations;

public class C04_replaceFirst {
    public static void main(String[] args) {

        String str= "Java heyecandır";
        // eger tüm a'ları değil de sadece ilk a'yı dğiştirmek isterseniz

        System.out.println(str.replaceFirst("a","A")); //JAva heyecandır

        // ilk harf veya rakamı * yap

        System.out.println(str.replaceFirst("\\w","*"));

    }
}
