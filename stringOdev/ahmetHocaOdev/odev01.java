package ahmetHocaOdev;

import java.util.Scanner;

public class odev01 {
    public static void main(String[] args) {
        /*Kullanicidan aldigi urun adedi ve ve liste fiyatini alin, kullaniciya musteri
        karti olup olmadigini sorun. Musteri karti varsa 10 urunden fazla alirsa
                %20, yoksa %15 indirim yapin, Musteri karti yoksa 10 urunden fazla
        alirsa %15, yoksa %10 indirim yapin*/

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir urun adedini giriniz");
        String str = scan.nextLine();

        System.out.println("lutfen urunun  liste fiyatini giriniz");
        double adet = scan.nextDouble();

        System.out.println("lutfen kartiniz varsa 'E' giriniz");
        double fiyat = scan.nextDouble();
        char kart = scan.next().toUpperCase().charAt(0);
        System.out.println(kart);
        double hesap = adet * fiyat;

       /* if (kart'E') {
            if (adet > 10) {
                System.out.println(hesap = hesap * 0.2);
            }
        }*/
    }
}