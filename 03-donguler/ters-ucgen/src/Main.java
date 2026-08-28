import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Basamak sayısını giriniz: ");
        int basamakSayisi = input.nextInt();

        if (basamakSayisi < 1) {
            System.out.println("Lütfen 1 veya daha büyük bir sayı giriniz.");
            return;
        }

        for (int yildizSayisi = 2 * basamakSayisi - 1; yildizSayisi >= 1; yildizSayisi -= 2) {
            for (int yildiz = 1; yildiz <= yildizSayisi; yildiz++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
