package ahmetHocaOdev;

import java.util.Scanner;

public class mesafeCevirme {
    public static void main(String[] args) {

        /*Kullanicidan mesafeyi kilometre olarak alin ve cevirmek istedigi birimi
        sorun, istedigi birim metre veya santimetre ise cevirip yazdirin, yoksa
“istediginiz birim sisteme kayitli degil” yazdirin.*/

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mesafeyi km olarak giriniz");
        double mesafe = scan.nextDouble();

        System.out.println("lutfen cevirmek istediginiz olcu birimini yaziniz 'metre(m), dekametre(dm), santimetre(cm)'");
        String birim = scan.next().toLowerCase();

        if (birim.equals("m")) {
            System.out.println(mesafe + " km " + (mesafe * 1000) + " metredir.");
        } else if (birim.equals("cm")) {
            System.out.println(mesafe + " km " + (mesafe * 100000) + " santimetredir.");

        }else System.out.println("istediginiz birim sisteme kayitli degil");
    }
}
