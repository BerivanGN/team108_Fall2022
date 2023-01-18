package day36_geneltekrar;

public class C02_StringManipulations {
    public static void main(String[] args) {

        // Verilen bir cümlede istenen kelimenin kaç kere geçtiğini
        // bulup yazdıran bir metod oluşturalım.

        String cumle="Java başladı ve bitti. Java meğer ne güzelmiş. Ne phyton ne C,Java en iyisi";

        String istenenKelime="Java";

        //kullanimSayisiBul1(cumle,istenenKelime);
        kullanimSayisiBul2(cumle,istenenKelime);
        kulanimSayisiBul3(cumle,istenenKelime);

    }

    private static void kulanimSayisiBul3(String cumle, String istenenKelime) {

        // Java buldukça silerek yapıldı
        // ama Jajavava varsa buradan 2 java buluyor.
        // bunun yerine replaceFirst'ün içindeki ikinci kısma hiçlik yerine - kullandık sorun çözldü

        int kullanimSayisi=0;

        while (cumle.contains(istenenKelime)){
            kullanimSayisi++;
            //cumle=cumle.replaceFirst(istenenKelime,"");
            cumle=cumle.replaceFirst(istenenKelime,"_");
        }
        if (kullanimSayisi==0){
            System.out.println("Cümlede aranan kelime yok ");
        }else {
            System.out.println("Kelime cümlede " + kullanimSayisi + " adet kullanılmıştır");
        }
    }

    private static void kullanimSayisiBul2(String cumle, String istenenKelime) {

        // forLoop ve substring ile yapalım
        int kullanimSayisi=0;
        for (int i = 0; i < (cumle.length()-istenenKelime.length()) ; i++) {

            if (cumle.substring(i,i+istenenKelime.length()).equals(istenenKelime)){
                kullanimSayisi++;
            }

        }
        if (kullanimSayisi==0){
            System.out.println("Cümlede aranan kelime yok ");
        }else {
            System.out.println("Kelime cümlede " + kullanimSayisi + " adet kullanılmıştır");
        }
    }

   /* private static void kullanimSayisiBul1(String cumle, String istenenKelime) {

        int kullanimSayisi=0;
        int index=0;

        while (index<cumle.length()){

            index=cumle.indexOf(istenenKelime,index);

            if (index==-1){
                if (kullanimSayisi==0){
                System.out.println("Cümlede aranan kelime yok ");
                break;
                }else {
                    System.out.println("Kelime cümlede " + kullanimSayisi + " adet kullanılmıştır");
                    break;
                }
            }else {
                kullanimSayisi++;
                index++;
            }
        }

    }
    */
}
