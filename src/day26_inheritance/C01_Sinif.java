package day26_inheritance;



 class Okul{
    String okulIsmi="Yıldız Koleji";
    String telefon="3123456543";
 }


public class C01_Sinif extends Okul{
     String sinif="11-C";
     String telefon="3122343434";

     C01_Sinif(String telefon){

         System.out.println(telefon); // 4222342323 (scope'taki)
         System.out.println(this.telefon); // 3122343434 (class'taki)
         System.out.println(super.telefon); // 3123456543 (parent'taki)

         System.out.println(okulIsmi); // 4222342323 (scope'taki) // Yıldız Koleji
         System.out.println(this.okulIsmi); // 3122343434 (class'taki) // Yıldız Koleji
         System.out.println(super.okulIsmi); // 3123456543 (parent'taki) // Yıldız Koleji

         System.out.println(sinif); // 11-C
         System.out.println(this.sinif); // 11-C
         // System.out.println(super.sinif); // Parent'ta yok CTE verir.
         // Java'da parent'ta bulamadığını gidip child'a sorayım OLMAZ.
         // Parent class'ta aranan sınıf değeri olmadığından CTE verir.

     }

    public static void main(String[] args) {

         C01_Sinif obj=new C01_Sinif("4222342323");
    }
}
