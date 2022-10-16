package ahmetHocaOdev;

import java.util.Scanner;

public class kareSayi {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        int bayrak = 0;


        for (int i = 0; i < sayi; i++) {
            if (sayi == i * i) {
                bayrak++;
                break;
            }
        }
        if (bayrak > 0) {
            System.out.println("sayi kare sayidir");

        } else System.out.println("sayi kare degildir");
    }
}