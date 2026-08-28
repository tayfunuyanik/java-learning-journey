import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Toplam eleman sayısını giriniz (n): ");
        int n = input.nextInt();
        System.out.print("Seçilecek eleman sayısını giriniz (r): ");
        int r = input.nextInt();

        if (n < 0 || r < 0 || r > n || n > 20) {
            System.out.println("Geçersiz değer girdiniz. n, 0 ile 20 arasında; r ise 0 ile n arasında olmalıdır.");
            return;
        }

        long nFaktoriyel = 1;
        long rFaktoriyel = 1;
        long farkFaktoriyel = 1;

        for (int i = 1; i <= n; i++) {
            nFaktoriyel *= i;
        }

        for (int i = 1; i <= r; i++) {
            rFaktoriyel *= i;
        }

        for (int i = 1; i <= n - r; i++) {
            farkFaktoriyel *= i;
        }

        long kombinasyon = nFaktoriyel / (rFaktoriyel * farkFaktoriyel);
        System.out.println("C(" + n + ", " + r + ") = " + kombinasyon);
    }
}
