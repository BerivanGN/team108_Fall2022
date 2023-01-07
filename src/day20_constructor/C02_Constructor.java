package day20_constructor;

public class C02_Constructor {
    public C02_Constructor() {
    }

    public static void main(String[] args) {

        /*
          Bir obje oluşturulurken
          istediğimiz özellikleri direkt atayabilirsek
          sonradan tekrar bir atama işlemi yapmaya gerek kalmaz

          Bu durumda atamayı tek tek bizim yapmamız yerine
          constructor'un atama yapmasını istemeliyiz

          atama yapmak için constructor'a parametre göndermeliyiz
         */

        karesiniYazdir(5); // 25
        karesiniYazdir(10); // 100

        Car car1= new Car("BMW","5.20",2020,15000,"Beyaz");
        /*
                Car{marka='BMW'
                , model='5.20'
                , yil=2020
                , km=15000
                , renk='Beyaz'}

         */
        System.out.println(car1);

        Car car2=new Car("Tofas","Sahin",2010);
        System.out.println(car2);
        /*
            Car{marka='Tofas'
            , model='Sahin'
            , yil=2010
            , km=0
            , renk='Renk seçilmedi'}
         */

        Car car3=new Car("Toyota","Corolla",2016,"gri"); // 4 parametreli bir const. yok oluşturmak lazım
        // car clasında 4 parametreli bir const. oluşturduk >> code / generate / constructor>>> bu şekilde oluştu.
        System.out.println(car3);
        /*
          Car{marka='Toyota'
          , model='Corolla'
          , yil=2016
          , km=0
          , renk='gri'}

         */


    }

    public static void karesiniYazdir(int sayi){
        System.out.println(sayi*sayi);
    }

}
