import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Birinci pozitif tam sayıyı giriniz: ");
        int sayi1 = input.nextInt();
        System.out.print("İkinci pozitif tam sayıyı giriniz: ");
        int sayi2 = input.nextInt();

        if (sayi1 <= 0 || sayi2 <= 0) {
            System.out.println("Lütfen pozitif tam sayılar giriniz.");
            return;
        }

        int geciciSayi1 = sayi1;
        int geciciSayi2 = sayi2;

        while (geciciSayi2 != 0) {
            int kalan = geciciSayi1 % geciciSayi2;
            geciciSayi1 = geciciSayi2;
            geciciSayi2 = kalan;
        }

        int ebob = geciciSayi1;
        long ekok = (long) sayi1 * sayi2 / ebob;

        System.out.println("EBOB: " + ebob);
        System.out.println("EKOK: " + ekok);
    }
}
