package ahmetHocaOdev;

import java.util.Scanner;

public class isimSoyisimCevirme {
    /*
Soru 5 : Kullanicidan isim ve soyismini ayri ayri alin.
- ismi daha uzun ise, isim ve soyismi ilk harf buyuk kalanlar kucuk seklinde
yazdirin
- soyisim daha uzun ise ismi ilk harf buyuk digerleri kucuk, soyismi buyuk
harflerle yazdirin.*/

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen isim giriniz");
        String isim = scan.nextLine();
        System.out.println("Lutfen soyisim giriniz");
        String soyisim = scan.nextLine();

        if (isim.length() > soyisim.length()) {
            isim = isim.substring(0, 1).toUpperCase() +
                    isim.toLowerCase().substring(1);
            soyisim = soyisim.substring(0, 1).toUpperCase() +
                    soyisim.toLowerCase().substring(1);
            System.out.println(isim + " " + soyisim);

        } else if (isim.length() < soyisim.length()) {
            isim = isim.substring(0, 1).toUpperCase() +
                    isim.toLowerCase().substring(1);
            soyisim = soyisim.toUpperCase();

            System.out.println("isim soyisim : "+isim + " " + soyisim);
        }

    }
}
