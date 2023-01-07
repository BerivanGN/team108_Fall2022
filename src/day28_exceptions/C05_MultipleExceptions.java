package day28_exceptions;

import java.util.Scanner;

public class C05_MultipleExceptions {
    public static void main(String[] args) {

        /*
           Eğer birden fazla exception oluşma ihtimali varsa
           bu exceptionlar birbirinden bağımsız ise

           1 - Tek try istenen kadar catch yapılabilir
           2 - ikisi için iç içe try catch yapılabilir
           3 - iki exception'u da kapsayan tek bir catch yapılabilir.

         */

        String str="Java'da çok fazla exception var";
        int[] arr= {3,5,1,3,2,6,3,6,8,5,2};

        // Kullanıcıdan bir tam sayı alın ve
        // girilen sayıyı index olarak kullanıp
        // str ve arr'den o index'teki elementleri yazdırın.

        Scanner scan=new Scanner(System.in);
        System.out.println("Lütfen bir idex girin");
        int index= scan.nextInt();

        // System.out.println("String'den istenen index'teki element : " + str.substring(index,index+1));
        // System.out.println("Array'den istenen element : " + arr[index]);

        /* 1. Çözüm

        try {
            System.out.println("String'den istenen index'teki element : " + str.substring(index,index+1));
            System.out.println("Array'den istenen element : " + arr[index]);
        }catch (StringIndexOutOfBoundsException e){
            System.out.println("İstenen index Stringin sınırları dışında");
        }catch (ArrayIndexOutOfBoundsException e2){
            System.out.println("İstenen index Array'in sınırları dışında");
        }

         */

        /* 2. çözüm

        try {
            try {
                System.out.println("String'den istenen index'teki element : " + str.substring(index,index+1));
                System.out.println("Array'den istenen element : " + arr[index]);
            } catch (Exception e) {
                System.out.println("İstenen index Stringin sınırları dışında");
            }
        } catch (Exception e) {
            System.out.println("İstenen index Array'in sınırları dışında");
        }

         */

        // 3. çözüm tek ama daha kapsamlı exception kullanma

        try {
            System.out.println("String'den istenen index'teki element : " + str.substring(index,index+1));
            System.out.println("Array'den istenen element : " + arr[index]);
        } catch (RuntimeException e) {

            System.out.println("İndex String ve/veya Array'in sınırları dışında");
            e.printStackTrace();
        }



    }
}
