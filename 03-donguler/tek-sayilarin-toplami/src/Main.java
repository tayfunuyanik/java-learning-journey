import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int toplam = 0;

        while (true) {
            System.out.print("Bir sayı giriniz (bitirmek için negatif sayı giriniz): ");
            int sayi = input.nextInt();

            if (sayi < 0) {
                break;
            }

            if (sayi % 2 != 0) {
                toplam += sayi;
            }
        }

        System.out.println("Girilen tek sayıların toplamı: " + toplam);
    }
}
