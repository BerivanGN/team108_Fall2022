package day12_MethodCreation;

public class C03_AsalSayi {
    public static void main(String[] args) {

        // verilen bir sayının asal olup olmadığını true-false olarak döndüren
        // bir metod oluşturun


        //asalSayiMi metodu boolean sonuç döndürdüğünden
        //bu metodu çalıştırdığımızda
        //ya direkt yazdırmalıyız
        System.out.println(asalSayiMi(34));

        //ya da method call'un getireceği sonucu atamak için bir veriable oluşturabiliriz

        boolean asalMiSonucu59=asalSayiMi(59);
        System.out.println("59 için sonuç : " + asalMiSonucu59); //true

    }

    public static boolean asalSayiMi(int input){

        boolean asalSayiMi=true;
        for (int i = 2; i <input; i++) {
           if (input%i==0) { // eger burası çalışırsa asal sayı değil
               asalSayiMi = false;
               break;
           }
        }
        return asalSayiMi;
    }

}
