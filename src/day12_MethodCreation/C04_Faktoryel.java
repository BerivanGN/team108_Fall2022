package day12_MethodCreation;

public class C04_Faktoryel {
    public static void main(String[] args) {
        //verilen bir sayının 15'ten küçük bir pozitif tam sayı olduğunu kontrol edin
        //küçük ise bir metod oluşturup faktöryel değerini yazdırın
        //sayı istenen aralıkta değilse uyarı yazdırın

        int input=12;
        if (input>0 && input<15){
            faktoryelYazdir(input);
        }else {
            System.out.println("Girilen sayı 15'ten küçük pozitif tam sayı olmalıdır");
        }
    }
    public static void faktoryelYazdir(int sayi){

        int faktoryelSonucu=1;
        for (int i = sayi; i >=1; i--) {

            faktoryelSonucu*=i; // her loop'ta gelen sayıyı önceki değer ile çarpalım
        }
        System.out.println("Girilen " + sayi + " için faktöryel : " + faktoryelSonucu);
    }
}
