import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Pozitif bir tam sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi < 0) {
            System.out.println("Lütfen negatif olmayan bir tam sayı giriniz.");
            return;
        }

        int geciciSayi = sayi;
        int toplam = 0;

        while (geciciSayi != 0) {
            toplam += geciciSayi % 10;
            geciciSayi /= 10;
        }

        System.out.println(sayi + " sayısının basamakları toplamı: " + toplam);
    }
}
