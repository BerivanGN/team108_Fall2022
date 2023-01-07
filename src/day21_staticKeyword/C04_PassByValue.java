package day21_staticKeyword;

public class C04_PassByValue {
    public static void main(String[] args) {

        int fiyat=100;

        // %10 , %20 ve %30 indirim uygulayıp indirimli fiyatı yazdıran 3 metod oluşturalım

        indirimyap10(fiyat); // 90
        indirimyap20(fiyat); // 80
        indirimyap30(fiyat); // 70

        System.out.println(fiyat); // 100

    }

    public static void indirimyap10(int fiyat){

        fiyat=fiyat*90/100;

        System.out.println("%10 indirimli fiyat : " +fiyat);
    }

    public static void indirimyap20(int fiyat){

        fiyat=fiyat*80/100;

        System.out.println("%20 indirimli fiyat : " +fiyat );
    }

    public static void indirimyap30(int fiyat){

        fiyat=fiyat*70/100;

        System.out.println("%30 indirimli fiyat : " +fiyat );
    }


}
