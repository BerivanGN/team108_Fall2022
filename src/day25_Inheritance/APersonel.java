package day25_Inheritance;

public class APersonel {

   protected String isim="Isim atanmadı";
   protected String soyisim="Soyisim atanmadı";
   protected String telefon="Telefon atanmadı";

    protected void maas(){
        System.out.println("Hastanemizde uygulanan asgari ucret : " + 1700);
    }
    public void ozelSigorta(){
        System.out.println("Tüm personelin özel sağlık sigortası yaptırılır.");
    }
    private void privateMethod(){

    }

}
