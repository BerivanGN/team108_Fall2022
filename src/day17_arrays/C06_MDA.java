package day17_arrays;

public class C06_MDA {
    public static void main(String[] args) {

        // verilen 2 katlı String bir array'de
        // istenen metni içeren elementleri yazdıran bir method oluşturun.

        String [][] arr= {{"Ali","Zafer"},{"Betül","Hüseyin","Hasan"},{"Said"}};

        String arananMetin="a";

        istenenElementleriYazdir(arr,arananMetin);// Zafer Hasan Said
        istenenElementleriYazdir(arr,"e"); // Zafer Betül Hüseyin
        istenenElementleriYazdir(arr,"Ali"); // Ali



    }
    public static void istenenElementleriYazdir(String[][] arr, String arananMetin){

        for (int i = 0; i < arr.length; i++) {

            for (int j = 0; j <arr[i].length; j++) {

                if (arr[i][j].contains(arananMetin)){
                    System.out.print(arr[i][j] + " ");
                }
            }
        }
        System.out.println("");

    }
}
