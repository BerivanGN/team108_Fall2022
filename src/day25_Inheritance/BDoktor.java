package day25_Inheritance;

public class BDoktor extends APersonel{

    /*
     Oluşturduğumuz doktor class'ında isim,soyisim gibi
     Personel class'ında oluşturduğumuz tüm özelliklerin olmasını istiyoruz
     Bu durumda 2 tercih vardır
         1 - İstenen tüm özellikleri Doktor Class'ında yeniden oluşturabiliriz.
         2 - Doktor Clss'ını personel'in child'i yapmak

     Doktor class'ını personel class'ının child'ı yaptığımızda
     Doktor class'ında oluşturulan objeler sadece kendi class'larındaki özelliklere sahip olmaz.
     Aynı zamanda parent class'ı olan personel'deki özelliklere de sahip olurlar.

     Bir chid class'tan obje oluşturduğumuzda
     o objenin özelliklerini belirlerken
     önce kendi class'ına bakılır ve o özellik varsa kullanılır.
     Eğer kendi class'ında yoksa parent class'a bakılır.

     Bir class extends keyword kullanarak başka bir class'ı
     kendisine parent edinirse

     1 - parent class'taki tüm özellikleri kullanabilir
     (isim,soyisim,telefon,özelSigorta)
     2 - İsterse parent class'ta olan bir özelliği kendisine uyarlayabilir.
     3 - İsterse parent class'ta olmayan kendisine özel yeni özellikleroluşturabilir (nöbet)

     */

    public static void main(String[] args) {

        BDoktor dok1= new BDoktor();
        dok1.isim="Kemal";
        dok1.soyisim="Bulut"; // Kemal,Bulut,Telefon atanmadı

        System.out.println(dok1.isim+ "," +dok1.soyisim+ "," +dok1.telefon);
        dok1.maas();   // Doktor maaşı (30 * 8 * 25) : 6000
        dok1.ozelSigorta(); // Tüm personelin özel sağlık sigortası yaptırılır.
        dok1.nobet();   // Doktorlar haftada bir gün nöbet tutar.

    }

    public void maas(){
        System.out.println("Doktor maaşı (30 * 8 * 25) : " + 6000 );
    }
    public void nobet(){
        System.out.println("Doktorlar haftada bir gün nöbet tutar.");
    }

}
