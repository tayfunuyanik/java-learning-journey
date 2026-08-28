import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = input.nextInt();

        if (sayi < 0) {
            System.out.println("Lütfen negatif olmayan bir tam sayı giriniz.");
            return;
        }

        int basamakSayisi = 0;
        int geciciSayi = sayi;

        if (sayi == 0) {
            basamakSayisi = 1;
        }

        while (geciciSayi != 0) {
            geciciSayi /= 10;
            basamakSayisi++;
        }

        geciciSayi = sayi;
        int toplam = 0;

        while (geciciSayi != 0) {
            int basamak = geciciSayi % 10;
            int kuvvetSonucu = 1;

            for (int i = 1; i <= basamakSayisi; i++) {
                kuvvetSonucu *= basamak;
            }

            toplam += kuvvetSonucu;
            geciciSayi /= 10;
        }

        if (toplam == sayi) {
            System.out.println(sayi + " bir Armstrong sayısıdır.");
        } else {
            System.out.println(sayi + " bir Armstrong sayısı değildir.");
        }
    }
}
