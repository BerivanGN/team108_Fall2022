package day27_overriding;

public class HExceptions {
    public static void main(String[] args) {

        String str="Java neredeyse bitiyor";

        Integer[] arr={1,2,3,4,5};

        int strIndex=33;
        int arrIndex=12;

        System.out.println(""+str.charAt(strIndex) + arr[arrIndex]);
        // Bound of exception verir... ilk str 'de hatayı gördüğü için
        // devamını okumaz sadece orada hata verir
        // (arraydakine yetişemediğinden oradaki hatayı vermez.)

    }
}
