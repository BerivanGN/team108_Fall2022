package haftasonuTekrari;

import java.util.Arrays;

public class aaa {
    public static void main(String[] args) {

        String str = "Javagittikçezorlaşıyor";

        String tekrarlayanlar = "";

        for (int i = 0; i < str.length(); i++) {
            for (int j = i + 1; j < str.length(); j++) {
                if (str.charAt(i) == str.charAt(j) )
                {
                    tekrarlayanlar = tekrarlayanlar + str.charAt(i);
                }
            }
        }
        String[] tekrarlayanKarakterler = tekrarlayanlar.split("");
        System.out.println(Arrays.toString(tekrarlayanKarakterler));

    }

}
