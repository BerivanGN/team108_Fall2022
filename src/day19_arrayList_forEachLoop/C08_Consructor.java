package day19_arrayList_forEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C08_Consructor {
    public static void main(String[] args) {

        List<Integer> sayilar=new ArrayList<>();

        // Sayılar ArrayList class'ından oluşturduğumuz bir objedir
        // ve oluşturulduğu class'daki tüm özelliklere(metod ve veriable'lere) sahiptir.

        /*
           Bir class'dan bir obje oluşturduğumuzda
           o class'daki tüm instance veriablelerin bir kopyası oluşturulup
           objemizle ilişkilendirilir.

           Ayrıca class'da bulunan tüm metod'larda objemizle ilişkilendirilir

           Bu işlemleri sağlayan Java yapısı >>> Constructors'dur.
           Bu işleme de initialize(ilk değer ataması) denir.

           new keyword ile obje oluşturulurken
           eşitliğin sağına new ile birlikte "classIsmi()" yazılır

           işte bu classIsmi() yazan o class'ın constructor'udur.
           constructor, bugüne kadar gördüğümüz yapılardan farklıdır.

           constructor, bir obje oluşturmak istediğimizde devreye girer
           ve ilgili sınıfın tüm özelliklerini obje ile ilişkilendirir(initialize)
         */

    }
}
