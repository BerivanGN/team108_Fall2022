package day17_arrays;

public class C05_MDA {
    public static void main(String[] args) {

        int[][] arr={{1,2},{3,4,5},{6,7,4,5},{2},{1,2,3,4,5}};

        // verilen multi dimensional array(mda)'deki tüm sayıların toplamını yazdıran bir method oluşturun

        tumSayilariTopla(arr); // 54


    }

    public static void tumSayilariTopla(int[][] arr){

        int toplam=0;
        for (int i = 0; i <arr.length; i++) { // outher array(dışarıdaki array) için for

            for (int j = 0; j <arr[i].length; j++) { // inner array(içerideki array) için for

                toplam+= arr[i][j];

            }
        }
        System.out.println("Array'daki tüm sayıların toplamı : " + toplam);
    }

}
