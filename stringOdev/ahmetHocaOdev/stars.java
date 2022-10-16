package ahmetHocaOdev;

public class stars {
    public static void main(String[] args) {
        /*soru9 kullanicidan bir string alin ve ters yazdirin

         */
        String input = "Java ne kadar guzel";

        for (int i = input.length() - 1; i >= 0; i--) {
            System.out.print(input.charAt(i));
        }
        System.out.println("--------------------------------");

        String stringInput = "Java her gecen gun guzellesiyor";
        String tersInput = "";

        for (int i = stringInput.length() - 1; i >= 0; i--) {
            tersInput += stringInput.substring(i, i + 1);

        }
        System.out.println("Ters hali : " + tersInput);

        System.out.println("-----------------..");

        int sayi = 10;

        for (int i = sayi; i >= 0; i--) {
            System.out.print(i + " ");

        }
        System.out.println("");
        for (int i = 0; i <= sayi; i++) {
            System.out.print(i + " ");
        }
    }
}