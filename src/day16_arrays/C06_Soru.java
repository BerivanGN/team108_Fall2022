package day16_arrays;

public class C06_Soru {
    public static void main(String[] args) {

        // Bir marketin fiyatlarını tutan bir array var
        // Bu marketteki en yüksek ve en düşük fiyatları yazdıran bir metod oluşturun

        double[] fiyatlar={23, 34.5, 42.1, 5.7, 3.4, 23.5};
        enYuksekEnDusukFiyatYazdir(fiyatlar);

    }

    public static void enYuksekEnDusukFiyatYazdir(double[] fiyatlar){

         double enDusukFiyat=fiyatlar[0];
         double enYuksekFiyat=fiyatlar[0];

        for (int i = 0; i < fiyatlar.length; i++) {

            if (fiyatlar[i]<enDusukFiyat){
                enDusukFiyat=fiyatlar[i];
            }
            if (fiyatlar[i]>enYuksekFiyat){
                enYuksekFiyat=fiyatlar[i];
            }
        }
        System.out.println("Listedeki en düşük fiyat : " + enDusukFiyat);
        System.out.println("Listedeki en yüksek fiyat : " + enYuksekFiyat);

    }

}
