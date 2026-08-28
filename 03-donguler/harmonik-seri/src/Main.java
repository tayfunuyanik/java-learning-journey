import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Harmonik seri için eleman sayısını giriniz: ");
        int elemanSayisi = input.nextInt();

        if (elemanSayisi < 1) {
            System.out.println("Lütfen 1 veya daha büyük bir sayı giriniz.");
            return;
        }

        double toplam = 0;

        for (int i = 1; i <= elemanSayisi; i++) {
            toplam += 1.0 / i;
        }

        System.out.println(elemanSayisi + " elemanlı harmonik seri toplamı: " + toplam);
    }
}
