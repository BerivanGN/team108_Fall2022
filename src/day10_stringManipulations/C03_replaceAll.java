package day10_stringManipulations;

public class C03_replaceAll {
    public static void main(String[] args) {

        //bu metindeki sayılardan kurtulun
        String str= "J6a1va 566G1uz6,z1e6l-d61ir1";

        System.out.println(str.replace("1", "")
                .replace("5","")
                .replace("6","")); //Java Guz,el-dir

        str="Ja1va4 56G7uz,z9el-d0ir8";


        /*
         replace() zaten istenen değişikliği verilen özelliğe uyan tüm değerler için yapar.

         eğer genellemeyi bütün sayılari, bütün spaceleri, bütün özel karakterleri
         değiştirmek istersek replace() yerine replaceAll() kullanırız

         java bu genellemeleri yazabilmemiz için regex(regular expressions) tanımlamıştır.

         //d : bütün digit'ler
         */

        str=str.replaceAll("\\d", "");
        System.out.println(str);

        //özel karakterlerden de kurtulun
        //Space de özel karakter olduğundan bu durumda space'nin yok olmaması için
        //önce space yerine metinde olayan bir değer atayalım

        str=str.replace(" ", "5");

        str=str.replaceAll("\\W",""); // JavaGuzeldir

        str.replace("5", " ");
        System.out.println(str);

        String input3= "Ali Can, Merve Star, Mark Tom";
        input3=input3.replaceAll("\\W","");
        System.out.println(input3.length()); // 22





    }
}
