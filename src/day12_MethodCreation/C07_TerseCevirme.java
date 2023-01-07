package day12_MethodCreation;

public class C07_TerseCevirme {
    public static void main(String[] args) {

        // Verilen bir String'i terse çevirip
        // o halini bize döndüren bir metod oluşturun

        System.out.println(metniTerseCevir("Java candir"));
    }

    public static String metniTerseCevir(String str){

        String tersStr="";

        for (int i =str.length()-1; i >=0; i--) {

            tersStr +=str.charAt(i);
        }
        return tersStr;
    }
}
