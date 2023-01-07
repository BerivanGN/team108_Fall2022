package day07_ternary_switchStatements;

public class C04_Ternary {
    public static void main(String[] args) {
        //kullanıcıdan alınan deger
        //100'den büyükse sayıyı 2 ile çarpın
        //100'e esit veya küçük ise sayıya 10 ekleyin

        int input = 45;

        // if else ile yapalım

        if (input>100){
            input*=2;
        }else {
            input+=10;
        }
        System.out.println("if else ile : " +input);

        input=145;

        input=input>100 ? input*2 : input+10 ;

        System.out.println("ternary ile : " +input);
        /*
        Verilen inputu inceleyin
        eger 100'den büyükse 5'e bölüp bolum sonucunun tek sayı olup olmadıgını kontrol edin
        eger 100'den büyük degilse 10 ile bölüünden kalanı bulup bu kalanı 5 arttırın


        bu tür  komplex işlemleri ternary ile YAPAMAYIZ
         */



    }
}
