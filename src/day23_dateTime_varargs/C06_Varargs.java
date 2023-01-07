package day23_dateTime_varargs;



public class C06_Varargs {
    public static void main(String[] args) {

        // Öyle bir metod oluşturalım ki kaç tane argüment yazarsam yazayım
        // argümentlerin toplamını versin

        topla(5,6); // 11
        topla(5,8,2); // 15
        topla(4,6,2,9,3,4,8,1,2); // 39

        /*
          Varargs array alt yapısını kullanır
          Temel hedef argüment sayısı değişse bile
          aynı data türündeki tüm argümentleri alabilecek bir parametre oluşturmaktır.
         */

    }

    private static void topla(int... sayilar) {

        int toplam1=0;
        for (int i = 0; i < sayilar.length; i++) {
            toplam1+=sayilar[i];
        }
        System.out.println(toplam1);
        
        int toplam2=0;
        for (int each:sayilar
             ) {
            toplam2+=each;
        }
        System.out.println(toplam2);
    }
}
