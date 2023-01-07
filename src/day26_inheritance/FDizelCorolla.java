package day26_inheritance;



public class FDizelCorolla extends ECorolla{

    String motor="1.6 Dizel motor";
    String  yakit="Dizel";
    String guvenlik="Abs";
    String renk="Renk belirtilmedi";


    public static void main(String[] args) {


        // Bazen child class'tan obje oluşturmakla beraber
        // bu child class'ın parent class'ındaki hangi özellikleri
        // aldığını bilmek isteriz
        // Bu durumda data türünü constructor'u kullanılan class'ın
        // parent class'larından seçebiliriz.

        DToyota c3=new FDizelCorolla();
        // Sadece toyotadaki özellikler kalır diğerleri CTE verir.
        // Çünkü ilk data türüne göre yazdırma yapar.

        System.out.println(c3.motor); // T Motor belirtilmedi
        System.out.println(c3.yakit);// T Yakıt belirtilmedi
        // System.out.println(c2.guvenlik); // CTE
        // System.out.println(c2.renk); // CTE


        System.out.println(c3.model); // T Model belirtilmedi
        // System.out.println(c3.uretimYeri); // T CTE
        // System.out.println(c3.teker); // T CTE
        // System.out.println(c3.vites); // T CTE

        System.out.println(c3.marka); // T Toyota


        ECorolla c2=new FDizelCorolla();

        System.out.println(c2.motor); // T Motor belirtilmedi
        System.out.println(c2.yakit);// T Yakıt belirtilmedi
        // System.out.println(c2.guvenlik); // CTE
        // System.out.println(c2.renk); // CTE


        System.out.println(c2.model); // C Corolla
        System.out.println(c2.uretimYeri); // C Türkiye
        System.out.println(c2.teker); // C 200.55 teker
        System.out.println(c2.vites); // C Vites belirtilmedi

        System.out.println(c2.marka); // T Toyota

        FDizelCorolla c1=new FDizelCorolla();

        System.out.println(c1.motor); // DC 1.6 Dizel motor
        System.out.println(c1.yakit);// DC Dizel
        System.out.println(c1.guvenlik); // DC Abs
        System.out.println(c1.renk); // DC Renk belirtilmedi


        System.out.println(c1.model); // C Corolla
        System.out.println(c1.uretimYeri); // C Türkiye
        System.out.println(c1.teker); // C 200.55 teker
        System.out.println(c1.vites); // C Vites belirtilmedi

        System.out.println(c1.marka); // C Toyota




    }
}
