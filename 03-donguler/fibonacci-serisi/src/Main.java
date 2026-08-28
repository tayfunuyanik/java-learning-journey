import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int elemanSayisi = input.nextInt();

        if (elemanSayisi < 1) {
            System.out.println("Lütfen 1 veya daha büyük bir sayı giriniz.");
            return;
        }

        long ilkSayi = 0;
        long ikinciSayi = 1;

        System.out.print("Fibonacci serisi: ");

        for (int i = 1; i <= elemanSayisi; i++) {
            System.out.print(ilkSayi + " ");
            long sonrakiSayi = ilkSayi + ikinciSayi;
            ilkSayi = ikinciSayi;
            ikinciSayi = sonrakiSayi;
        }
    }
}
