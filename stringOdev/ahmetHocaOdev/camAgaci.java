package ahmetHocaOdev;

public class camAgaci {
    public static void main(String[] args) {

        int distance = 10;// başlangıçta ilk satırda oluşturulan boşluk

        for (int i = 1; i <= 8; i++) {
            for (int space = 0; space < distance; space++) {
                System.out.print(" ");
            }
            for (int j = 0; j < i; j++) {
                System.out.print(" " + "*");
            }
            distance--;
                /* ilk satırdan sonraki her satırd başında başlangıçta belirlenen

                boşluk bir azaltılır ki  düzgün üçgen şeklini alsın*/
            System.out.println();
        }
    }
}


