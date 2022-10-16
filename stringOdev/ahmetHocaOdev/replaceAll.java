package ahmetHocaOdev;

public class replaceAll {
    public static void main(String[] args) {
        // Kullanicinin girdigi metinde
        // harf disinda kalan tum karakterleri temizleyen bir kod yazin
        // NOT : space silinmemeli

        String input = "9%H2av*(a  co_k 1*guzel";

        input = input.replaceAll("\\d", "");
        input = input.replace(" ", "5");
        input = input.replaceAll("\\W","");
        input = input.replace("_", "");
        input = input.replace("5", " ");
        input=input.replaceAll("\\s+"," ");

        System.out.println(input);


    }
}
