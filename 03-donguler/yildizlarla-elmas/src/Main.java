import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Elmasın yarı yüksekliğini giriniz: ");
        int yukseklik = input.nextInt();

        if (yukseklik < 1) {
            System.out.println("Lütfen 1 veya daha büyük bir sayı giriniz.");
            return;
        }

        for (int satir = 1; satir <= yukseklik; satir++) {
            for (int bosluk = 1; bosluk <= yukseklik - satir; bosluk++) {
                System.out.print(" ");
            }

            for (int yildiz = 1; yildiz <= 2 * satir - 1; yildiz++) {
                System.out.print("*");
            }

            System.out.println();
        }

        for (int satir = yukseklik - 1; satir >= 1; satir--) {
            for (int bosluk = 1; bosluk <= yukseklik - satir; bosluk++) {
                System.out.print(" ");
            }

            for (int yildiz = 1; yildiz <= 2 * satir - 1; yildiz++) {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
