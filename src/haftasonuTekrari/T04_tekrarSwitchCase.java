package haftasonuTekrari;

public class T04_tekrarSwitchCase {
    public static void main(String[] args) {

        // Kullanıcıdan 2 sayı alın
        // ve kullanıcıya istedigi işlemi sorun
        // +, -, *, / isaretlerinden hangisini girerse
        // 2 sayı için o işlemi yapın
        // bu işaretlerden birini girmezse
        // yanlış işlem tercihi yazdırın

        int sayi1=70;
        int sayi2=20;

        char islem='*';

        if (islem=='+') System.out.println("Sayıların Toplamı:" + (sayi1+sayi2));
        else if (islem=='-') System.out.println("Sayıların Farkı:" + (sayi1-sayi2));
        else if (islem=='*') System.out.println("Sayıların Çarpımı:" + (sayi1*sayi2));
        else if (islem=='/') System.out.println("Sayıların Bölümü:" + (sayi1/sayi2));
        else {
            System.out.println("Yanlış işlem tercihi");
        }

        System.out.println("============");

        // switch case ile...

        switch (islem){
            case '+': System.out.println("Sayıların Toplamı:" + (sayi1+sayi2));break;
            case '-': System.out.println("Sayıların Farkı:" + (sayi1-sayi2));break;
            case '*': System.out.println("Sayıların Çarpımı:" + (sayi1*sayi2));break;
            case '/': System.out.println("Sayıların Bölümü:" + (sayi1/sayi2));break;
            default: System.out.println("Yanlış işlem tercihi");

        }

    }
}
