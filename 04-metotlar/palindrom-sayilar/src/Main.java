import java.util.Scanner;

public class Main {
    static boolean palindromMu(int sayi) {
        int tersSayi = 0;
        int geciciSayi = sayi;

        while (geciciSayi > 0) {
            tersSayi = tersSayi * 10 + geciciSayi % 10;
            geciciSayi /= 10;
        }

        return sayi == tersSayi;
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = inp.nextInt();

        if (sayi < 0) {
            System.out.println("Lütfen negatif olmayan bir sayı giriniz.");
        } else if (palindromMu(sayi)) {
            System.out.println(sayi + " bir palindrom sayıdır.");
        } else {
            System.out.println(sayi + " bir palindrom sayı değildir.");
        }
    }
}
