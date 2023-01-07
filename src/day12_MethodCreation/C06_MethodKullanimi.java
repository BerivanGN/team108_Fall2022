package day12_MethodCreation;

public class C06_MethodKullanimi {
    public static void main(String[] args) {
        System.out.println(C03_AsalSayi.asalSayiMi(57)); // false

        C04_Faktoryel.faktoryelYazdir(10); //Girilen 10 için faktöryel : 3628800

        C04_Faktoryel.faktoryelYazdir(16); //Girilen 16 için faktöryel : 2004189184

        System.out.println(C05_HesapMakinesi.hesapMakinesi(9.7, 6.5, '+'));
    }
}
