package ahmetHocaOdev;

import java.util.Scanner;

public class sayiBulma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxSayi = 100;
        int minSayi = 1;
        int rastgeleSayi = (int) Math.random() * (maxSayi - minSayi + 1) + minSayi;
        int can = 3;
        int girilenSayi;

        System.out.println("sayi tahmin oyununa hosgeldiniz.Lutfen tahmininizi yapin:");
        while (true) {
            girilenSayi = scan.nextInt();
            if (girilenSayi > rastgeleSayi) {
                System.out.println("biraz daha asgi in");
                --can;
            } else if (girilenSayi < rastgeleSayi) {
                System.out.println("biraz yukari cik");

            } else System.out.println("tebrikler sayiyi bildiniz");
            break;
        }
        if (can == 0) {
            System.out.println("kaybettiniz");
            
        }

    }
}
}
