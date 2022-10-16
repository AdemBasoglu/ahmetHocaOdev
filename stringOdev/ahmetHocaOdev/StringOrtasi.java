package ahmetHocaOdev;

import java.util.Scanner;

public class StringOrtasi {
    public static void main(String[] args) {
        /*Kullanicidan alinan bir String alin,
        String’in uzunlugu cift sayi ise tam ortasina :) ekleyin,
        String’in uzunlugu tek sayi ise ortadaki harfi silin ve yerine :(
                yazdirin.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir string giriniz");
        String str = scan.nextLine();
        String ilkBolum = (str.substring(0, str.length() / 2));

        String ikinciBolum = (str.substring(str.length() / 2));


        if (str.length() % 2 == 0) {
            System.out.println(ilkBolum + ":)" + ikinciBolum);
        } else {
            System.out.println(ilkBolum + ":(" + ikinciBolum.substring(1));
        }
    }
}
