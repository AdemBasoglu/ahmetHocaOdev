package ahmetHocaOdev;

import java.util.Scanner;

public class ternary {
    public static void main(String[] args) {
        int sayi = 10;
        System.out.println(sayi>10 ? sayi+5 : sayi/2);

        int b=20;
        b= b<15 ? b*2 : b/3;
        System.out.println(b);
        System.out.println("------------------------------------------");

        /*Kullanicidan bir sayi isteyin, sayiyi kontrol edip 5 ile bolunebiliyorsa
“Sayi 5’in tam kati” yazdirin.*/

        Scanner scan= new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int num = scan.nextInt();
        System.out.println(num%5==0 ? "Sayi 5’in tam kati" : "5 in kati degildir");


        System.out.println("---------------------------------");

        /*Kullanicidan bir ucgenin 3 kenar uzunlugunu alin, ucgen eskenar ise
“Eskenar ucgen” yazdirin, degilse “Eskenar degil” yazdirin.*/
        Scanner scan2= new Scanner(System.in);
        System.out.println("lutfen ucgenin 3 kosesinin uzunluklarini giriniz");
        double kenar1=scan2.nextDouble();
        double kenar2=scan2.nextDouble();
        double kenar3=scan2.nextDouble();

        System.out.println(kenar1==kenar2&&kenar2==kenar3 ? "Eskenar ucgen" : "Eskenar degil");
    }
}
