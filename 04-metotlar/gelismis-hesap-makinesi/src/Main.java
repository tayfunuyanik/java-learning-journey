import java.util.Scanner;

public class Main {
    static Scanner scan = new Scanner(System.in);

    static void toplama() {
        int sayi;
        int sonuc = 0;
        int sira = 1;

        while (true) {
            System.out.print(sira++ + ". sayı: ");
            sayi = scan.nextInt();

            if (sayi == 0) {
                break;
            }

            sonuc += sayi;
        }

        System.out.println("Sonuç: " + sonuc);
    }

    static void cikarma() {
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int adet = scan.nextInt();
        int sayi;
        int sonuc = 0;

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayı: ");
            sayi = scan.nextInt();

            if (i == 1) {
                sonuc = sayi;
            } else {
                sonuc -= sayi;
            }
        }

        System.out.println("Sonuç: " + sonuc);
    }

    static void carpma() {
        int sayi;
        int sonuc = 1;
        int sira = 1;

        while (true) {
            System.out.print(sira++ + ". sayı: ");
            sayi = scan.nextInt();

            if (sayi == 1) {
                break;
            }

            if (sayi == 0) {
                sonuc = 0;
                break;
            }

            sonuc *= sayi;
        }

        System.out.println("Sonuç: " + sonuc);
    }

    static void bolme() {
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int adet = scan.nextInt();
        double sayi;
        double sonuc = 0;

        for (int i = 1; i <= adet; i++) {
            System.out.print(i + ". sayı: ");
            sayi = scan.nextDouble();

            if (i == 1) {
                sonuc = sayi;
            } else if (sayi == 0) {
                System.out.println("Bölen 0 olamaz.");
            } else {
                sonuc /= sayi;
            }
        }

        System.out.println("Sonuç: " + sonuc);
    }

    static void usluSayi() {
        System.out.print("Taban değeri giriniz: ");
        int taban = scan.nextInt();

        System.out.print("Üs değeri giriniz: ");
        int us = scan.nextInt();

        int sonuc = 1;

        for (int i = 1; i <= us; i++) {
            sonuc *= taban;
        }

        System.out.println("Sonuç: " + sonuc);
    }

    static void faktoriyel() {
        System.out.print("Sayı giriniz: ");
        int sayi = scan.nextInt();

        if (sayi < 0) {
            System.out.println("Faktöriyel negatif sayılar için hesaplanamaz.");
            return;
        }

        int sonuc = 1;

        for (int i = 1; i <= sayi; i++) {
            sonuc *= i;
        }

        System.out.println("Sonuç: " + sonuc);
    }

    static void modAlma() {
        System.out.print("Bölünen sayıyı giriniz: ");
        int bolunen = scan.nextInt();
        System.out.print("Bölen sayıyı giriniz: ");
        int bolen = scan.nextInt();
        if (bolen == 0) {
            System.out.println("Bölen 0 olamaz!");
            return;
        }
        System.out.println("Kalan: " + (bolunen % bolen));
    }

    static void dikdortgenHesaplama() {
        System.out.print("Uzun kenarı giriniz: ");
        int uzunKenar = scan.nextInt();
        System.out.print("Kısa kenarı giriniz: ");
        int kisaKenar = scan.nextInt();
        int alan = (uzunKenar * kisaKenar);
        int cevre = 2 * (uzunKenar + kisaKenar);
        System.out.println("Dikdörtgenin alanı: " + alan);
        System.out.println("Dikdörtgenin çevresi: " + cevre);
    }

    public static void main(String[] args) {
        int secim;

        String menu = """
                1- Toplama İşlemi
                2- Çıkarma İşlemi
                3- Çarpma İşlemi
                4- Bölme İşlemi
                5- Üslü Sayı Hesaplama
                6- Faktöriyel Hesaplama
                7- Mod Alma
                8- Dikdörtgen Alan ve Çevre Hesabı
                0- Çıkış Yap
                """;

        do {
            System.out.println("\n" + menu);
            System.out.print("Lütfen bir işlem seçiniz: ");
            secim = scan.nextInt();

            switch (secim) {
                case 1:
                    toplama();
                    break;
                case 2:
                    cikarma();
                    break;
                case 3:
                    carpma();
                    break;
                case 4:
                    bolme();
                    break;
                case 5:
                    usluSayi();
                    break;
                case 6:
                    faktoriyel();
                    break;
                case 7:
                    modAlma();
                    break;
                case 8:
                    dikdortgenHesaplama();
                    break;
                case 0:
                    System.out.println("Çıkış yapıldı.");
                    break;
                default:
                    System.out.println("Yanlış bir değer girdiniz, tekrar deneyiniz.");
            }
        } while (secim != 0);
    }
}
