package day07_ternary_switchStatements;

public class C08_SwitchStatements {
    public static void main(String[] args) {
        // Kullanıcıdan 2 sayı alın
        // ve kullanıcıya istedigi işlemi sorun
        // +, -, *, / isaretlerinden hangisini girerse
        // 2 sayı için o işlemi yapın
        // bu işaretlerden birini girmezse
        // yanlış işlem tercihi yazdırın

        int sayi1=20;
        int sayi2=10;

        char islem='+';

        // if else ile yapalım
        if (islem=='+'){
            System.out.println("Sayıların toplamı:" + (sayi1+sayi2));
        } else if (islem=='-') {
            System.out.println("Sayıların farkı:" + (sayi1-sayi2));

        } else if (islem=='*') {
            System.out.println("Sayıların çarpımı:" + (sayi1*sayi2));

        } else if (islem=='/') {
            System.out.println("Sayıların bölümü:" + (sayi1/sayi2));

        }else {
            System.out.println("yanlıs islem tercihi");
        } // char'a ne yazıldıysa o işlemi yapar

        // switc statement ile yapalım
        System.out.println("=============");

        switch (islem){
            case '+' :  System.out.println("Sayıların toplamı:" + (sayi1+sayi2)); break;
            case '-' :  System.out.println("Sayıların farkı:" + (sayi1-sayi2)); break;
            case '*' :  System.out.println("Sayıların çarpımı:" + (sayi1*sayi2)); break;
            case '/' :  System.out.println("Sayıların bölümü:" + (sayi1/sayi2));break;
            default:    System.out.println("yanlıs işlem tercihi");
        }


    }
}
