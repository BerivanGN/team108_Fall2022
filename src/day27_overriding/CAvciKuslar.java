package day27_overriding;

public class CAvciKuslar extends BKuslar{

    protected void hareket( ){
        System.out.println("ucarlar");
    }
    protected void beslenme( ) {
        System.out.println(" et yerler");
    }
    protected void pence( ) {
        System.out.println("pencelidir");
    }
    protected void gaga( ) {
        System.out.println("sivri gagali");
    }

    public static void main(String[] args) {

        CAvciKuslar krt1= new CAvciKuslar();

        krt1.hareket(); // C class'ından alır (ucarlar)
        krt1.beslenme(); // C et yerler
        krt1.pence(); // C pencelidir
        krt1.gaga(); // C sivri gagali
        krt1.kanat(); // B kanatlidirlar
        krt1.solunum(); // B akcigerle nefes alirlar
        krt1.cogalma(); // B yumurtayla cogalirlar
        krt1.omur(); // A yasar ve olurler
        // Eğer constructor ile data türü aynı ise
        // özelliğin veriable olmasına bakılmaksızın
        // o class'a gidilir, o class veya parent class'larda
        // bulunan ilk değer kullanılır.

        BKuslar krt2= new CAvciKuslar();
        krt2.hareket(); // C class'ından alır (ucarlar)(overriding edildi)(sonraki klastaysa overr.edilir demek)
        krt2.beslenme(); // C et yerler (overriding edildi)
        // krt2.pence(); // BKuslar veya parent class'ta yok CTE verir.
        krt2.gaga(); // C sivri gagali (overriding edildi)
        krt2.kanat(); // B kanatlidirlar
        krt2.solunum(); // B akcigerle nefes alirlar
        krt2.cogalma(); // B yumurtayla cogalirlar
        krt2.omur(); // A yasar ve olurler

        AHayvanlar krt3=new CAvciKuslar();
        krt3.hareket(); // C class'ından alır (ucarlar)(overriding edildi)(sonraki klastaysa overr.edilir demek)
        krt3.beslenme(); // C et yerler (overriding edildi)
        // krt3.pence(); // A class'ında yok CTE verir(data da hiç oluşturulmadıysa override da edemez.)
        // krt3.gaga(); // A class'ında yok CTE verir
        // krt3.kanat(); // A class'ında yok CTE verir
        krt3.solunum(); // B akcigerle nefes alirlar
        krt3.cogalma(); // B yumurtayla cogalirlar
        krt3.omur(); // A yasar ve olurler

    }


}
