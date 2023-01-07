package day27_overriding;

public class GExceptions {
    public static void main(String[] args) {

        int a=20;
        int b=0;



        // Bölen sayının 0 olması bu kodda bu kodda öngörülebilecek risktir
        // ve kodu yazarken bu riski çözecek şekide kod yazabiliriz.

        if (b != 0){
            System.out.println("iki sayının bölümü : " + a/b);
        }else {
            System.out.println("Bölecek sayı 0 olamaz");
        }
    }
}
