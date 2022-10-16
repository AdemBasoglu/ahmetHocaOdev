package ahmetHocaOdev;

public class String_Manipulations {
    public static void main(String[] args) {
        String isim = "Adem Basoglu";

        System.out.println(isim.charAt(0));//ilk karakteri cagir
        System.out.println(isim.length());//karakter uzunlugu bul
        System.out.println(isim.charAt(isim.length()-1));//son karakteri yazdir
        System.out.println(isim.charAt(isim.length()-5));// sondan belli bir siradaki karakteri yazdir
        System.out.println(isim.substring(5,8));//arasini yazdir baslangic ve bitis indexi
        System.out.println(isim.substring(5,isim.length()-4));//arasini yazdira bitis indexini otomatik ver
        System.out.println(isim.substring(5,8).toUpperCase());//aradaki karakterleri buyuk yazdir

        // kelimeleri topla ve bir cumle yaz
        String str1 = "Java";
        String str2 = " ";
        String str3 = "guzeldir";
        String str4 = "2";
        String str5 = "8";
        System.out.println(str1.concat(str2).concat(str3).concat(str2).concat(str4).concat(str5));
        String cumle= "Java ile hayat cok guzel";
        System.out.println(cumle.startsWith("Ja"));//true strip ja ile mi basliyor
        System.out.println(cumle.startsWith("ile",5));// 5. karakter "ile" kelimesi ile mi basliyor


    }




}
