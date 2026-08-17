import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sayi1 = 0;
        double sayi2 = 0;
        double sonuc = 0;

        int islemSecimi = 0;

        String yN;
        String secilenIslemStr = "";

        boolean islemSecimiDevamEdiyor = true;
        boolean bolmeIslemiDevamEdiyor;

        Scanner inp = new Scanner(System.in);

        System.out.println("Hesap makinesi uygulamasına hoş geldiniz.");

        while (islemSecimiDevamEdiyor) {
            System.out.print(
                    "\nMatematik İşlemleri\n" +
                            "1) Toplama\n" +
                            "2) Çıkarma\n" +
                            "3) Çarpma\n" +
                            "4) Bölme\n" +
                            "5) Çıkış\n"
            );

            System.out.print("Yapmak istediğiniz işlemi seçiniz: ");
            islemSecimi = inp.nextInt();

            if (!(islemSecimi == 1
                    || islemSecimi == 2
                    || islemSecimi == 3
                    || islemSecimi == 4
                    || islemSecimi == 5)) {

                System.out.println("Hatalı işlem!");
                continue;
            }

            if (islemSecimi == 5) {
                islemSecimiDevamEdiyor = false;
                continue;
            }

            switch (islemSecimi) {
                case 1:
                    secilenIslemStr = "Toplama";
                    break;
                case 2:
                    secilenIslemStr = "Çıkarma";
                    break;
                case 3:
                    secilenIslemStr = "Çarpma";
                    break;
                case 4:
                    secilenIslemStr = "Bölme";
                    break;
            }

            System.out.print(
                    "Seçmiş olduğunuz işlem: "
                            + secilenIslemStr
                            + " (y/n): "
            );

            yN = inp.next();

            if (yN.equalsIgnoreCase("n")) {
                continue;
            } else if (!yN.equalsIgnoreCase("y")) {
                System.out.println("Hatalı seçim!");
                continue;
            }

            bolmeIslemiDevamEdiyor = true;

            while (bolmeIslemiDevamEdiyor) {
                System.out.print("İlk sayıyı giriniz: ");
                sayi1 = inp.nextDouble();

                System.out.print("İkinci sayıyı giriniz: ");
                sayi2 = inp.nextDouble();

                switch (islemSecimi) {
                    case 1:
                        sonuc = sayi1 + sayi2;
                        bolmeIslemiDevamEdiyor = false;
                        break;
                    case 2:
                        sonuc = sayi1 - sayi2;
                        bolmeIslemiDevamEdiyor = false;
                        break;
                    case 3:
                        sonuc = sayi1 * sayi2;
                        bolmeIslemiDevamEdiyor = false;
                        break;
                    case 4:
                        if (sayi2 == 0) {
                            System.out.println("Bir sayı 0'a bölünemez!");
                            continue;
                        }

                        sonuc = sayi1 / sayi2;
                        bolmeIslemiDevamEdiyor = false;
                        break;
                }
            }

            System.out.println("Sonuç: " + sonuc);
        }

        System.out.println("\nÇıkış yapılıyor...");
        System.out.println("Başarıyla çıkış yapıldı.");
    }
}
