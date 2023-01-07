package day20_constructor;

public class Car {

    /*
      Bir class'tan oluşturulabilecek objelerin özelliklerini
       veriable veya metodlarla belirleyebiliriz


     */

    String marka = "Marka belirtilmemiş";
    String model = "Model belirtilmemiş";
    int yil=1900;
    int km;
    String renk="Renk seçilmedi";

    public Car(String marka, String model, int yil) {
        this.marka=marka;
        this.model=model;
        this.yil=yil;
    }


    public static void hareket(){
        System.out.println("Tüm arabalar hareket eder");
        return;
    }public Car(){

    }

    public Car(String mrk,String mdl,int yl,int kmetre,String rnk){

        marka=mrk;
        model=mdl;
        yil=yl;
        km=kmetre;
        renk=rnk;

    }

    public Car(String marka, String model, int yil, String renk) {
        this.marka = marka;
        this.model = model;
        this.yil = yil;
        this.renk = renk;
    }

    /*
       Bir class'ta görünür bir constructor yazdığımızda
       Java default constructoru siler
       Bu durumda daha önceden default constructur'u kullanarak obje oluşturan class'larda CTE oluşur
       Bu tür sorunlara sebep olmamak için
       biz herhangi bir constructor oluşturduğumuzda
       bir tane de parametresiz constructor oluştururuz.
       ((((public Car(){ } >>>> şekline üstte boş bir tane oluşturduk
       böylece C01 class'ındaki hata düzeldi))))

       Constructor'da parametre olarak kullanıcıdan gelen değeri
       class level'deki instance veriable'ye atamalıyız
       eğer parametre ismi ile instance veriable ismi farklı ise sorun yok
       java otomatik olarak atamamızı anlayacaktır..

        marka=mrk;
        model=mdl;
        yil=yl;
        km=kmetre;
        renk=rnk;

        Eğer parametre isimleri anlaşılır olması için instance veriable ile aynı yaparsak
        Java aynı isimdeki 2 veriable'nin hangisinin parametre hangisinin instance olduğunu bilmesi gerekir
        Bu durumda instance veriable'yi belirlemek için başına this. yazarız.

        this.marka=marka;
        this.model=model;
        this.yil=yil;

     */









    @Override
    public String toString() {
        return "Car{" +
                "marka='" + marka + '\'' +
                "\n, model='" + model + '\'' +
                "\n, yil=" + yil +
                "\n, km=" + km +
                "\n, renk='" + renk + '\'' +
                '}';
    }



}
