import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir pozitif tam sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi < 1) {
            System.out.println("Lütfen pozitif bir tam sayı giriniz.");
            return;
        }

        int bolenlerToplami = 0;

        for (int bolen = 1; bolen <= sayi / 2; bolen++) {
            if (sayi % bolen == 0) {
                bolenlerToplami += bolen;
            }
        }

        if (bolenlerToplami == sayi) {
            System.out.println(sayi + " mükemmel sayıdır.");
        } else {
            System.out.println(sayi + " mükemmel sayı değildir.");
        }
    }
}
