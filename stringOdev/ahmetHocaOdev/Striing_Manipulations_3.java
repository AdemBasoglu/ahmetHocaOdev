package ahmetHocaOdev;

public class Striing_Manipulations_3 {
    public static void main(String[] args) {
        String str1 = "Java cok guzel, cok.";
        System.out.println(str1.indexOf('c'));// karakterin ilk defa nerede gectigini bulur
        System.out.println(str1.indexOf("c", 6));// ilk c nin 5 de oldugunu biliyoruz i;inciyi aramaya 6 dan baslatiyoruz
        System.out.println(str1.indexOf("tava"));//aranan kelime yoksa java -1 yazdirir

        /*Soru 2 : Kullanicidan bir String ve aranacak metin alin. Aranan metnin String
        icerisinde kullanimini kontrol ederek asagidaki cumlelerden uygun olanini yazdirin.
                - String aranan metni icermiyor
                - Aranan metin String’de sadece 1 kere kullanilmis
        - Aranan metin String’de sadece 1’den fazla kullanilmis*/

        String yeniCumle = "Java her gun daha daha guzel ";
        String aranacakMetin = "daha";

        if (!yeniCumle.contains(aranacakMetin)) {
            System.out.println("String aranan metni icermiyor");

        } else {
            int ilkIndex = yeniCumle.indexOf(aranacakMetin);
            int ikinciIndex = yeniCumle.indexOf(aranacakMetin, ilkIndex + 1);
            if (ilkIndex == (-1)) {
                System.out.println("Aranan metin String’de sadece 1 kere kullanilmis");

            } else System.out.println("Aranan metin String’de sadece 1’den fazla kullanilmis");
        }
    }
}