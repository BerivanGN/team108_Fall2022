package day07_ternary_switchStatements;

public class C03_Ternary {
    public static void main(String[] args) {

        // input olarak verilen sayıyı kontrol edip
        //sayı çift ise "çift sayı"
        //değilse "tek sayı" yazdırın

        int input=33;

        //if else ile yapalım
        if (input%2==0){
            System.out.println("çift sayı");
        }else {
            System.out.println("tek sayı");
        }

        // ternary ile yapalım

        System.out.println(input%2==0 ? "Çift sayı" : "Tek sayı");

    }
}
