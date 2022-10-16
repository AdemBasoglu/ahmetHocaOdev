package ahmetHocaOdev;

import java.util.Scanner;

public class sifreKontrol {
    public static void main(String[] args) {
        /*Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin ve kullaniciya
        duzeltmesi gereken tum eksikleri soyleyin, eger tum sartlari saglarsa, "sifre
        basariyla kaydedildi" yazdirin
                - ilk harf kucuk harf olmali
                - son karakter rakam olmali
                - sifre bosluk icermemeli
                - uzunlugu en az 10 karakter olmali*/
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz : ");
        String sifre = scan.nextLine();
        int bayrak = 0;


        if (!(sifre.charAt(0) >= 'a'&& sifre.charAt(0) <= 'z'))
        {
            System.out.println("Ilk harfi kucuk harf giriniz!!!");
            bayrak++;

        }
        if (!(sifre.charAt(sifre.length() - 1) >= '0' && sifre.charAt(sifre.length() - 1) <= '9'))
        {
            System.out.println("Son karakter rakam sayi olmali!!!");
            bayrak++;
        }
        if (sifre.contains(" ")){
            System.out.println("Sifre bosluk icermemeli");
            bayrak++;

        }
        if (!(sifre.length()>= 10)) {
            System.out.println("Sifre enaz 10 karaktrer olmali");
            bayrak++;
        }
        if (bayrak == 0) {
            System.out.println("Sifrenizi basriyla kaydettiniz");
        }
    }
}
