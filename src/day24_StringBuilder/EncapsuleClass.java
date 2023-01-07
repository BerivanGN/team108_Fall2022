package day24_StringBuilder;

public class EncapsuleClass {

    /* Java class üyelerine erişimin write and read olarak ayrılması istendiğinde
       Encapsulation kullanılır.

       Bunun için öncelikle bu class üyelerine normal yollarla erişim kapatılır.

       sonra istediğimiz yetkiyi verecek public method oluştururuz
    */

    private int satis;
    private int toplamSatis=0;
    private int halkaAcikSayi=10;

    public int getHalkaAcikSayi(){
        return halkaAcikSayi;
    }
    public void setHalkaAcikSayi(int satis){
        this.halkaAcikSayi=halkaAcikSayi;

    }public void setSatis(int satis){
        this.satis=satis;
        toplamSatis+=this.satis;
    }

}
