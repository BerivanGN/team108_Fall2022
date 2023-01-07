package day25_Inheritance;

public class ECorolla extends DToyota {

    ECorolla(){
        System.out.println("Parametresiz Corolla constructor'ı çalıştı");
    }

    ECorolla(String pram1){
        super("Gri");
        System.out.println("Parametreli Corolla constructor çalıştı");
    }

    String model="Corolla";
    String uretimYeri="Türkiye";

    public static void main(String[] args) {

        ECorolla cor1=new ECorolla("Mavi");


    }
    /*
       Bir obje oluşturulduğunda ilk değer ataması yapılabiliyorsa
       constructor çalışmalıdır.

       Inheritance'de biliyoruz ki
       child class'tan oluşturulan her obje
       parent class'taki özelliklere de sahip olur.

       Parent class'taki özelliklere sahip olabilmesi için
       parent class'taki constructorlar'da çalışmalıdır.

       Java bu çalışmayuı super() sayesinde sağlar.

       Java'da her oluşturulan class'ta görünmese de default constructor olduğu gibi
       extends keyword kullanılan her class'ta oluşturulan her constructor'un
       ilk satırında görünmese de super() (constructor call) vardır.
     */
}
