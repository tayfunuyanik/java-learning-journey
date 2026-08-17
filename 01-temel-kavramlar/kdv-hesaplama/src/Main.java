import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double tutar = 0, yuksekKdv = 0.18, dusukKdv =0.08, kdvliTutar = 0, eklenenKdv = 0, kullanilanKdv = 0;
        Scanner input = new Scanner(System.in);
        boolean fiyatGirisiDevamEdiyor = true;
        while (fiyatGirisiDevamEdiyor) {
            System.out.print("Ürün Fiyatını Giriniz: ");

            if (!input.hasNextDouble()) {
                System.out.println("Tutar sadece sayı olmalıdır!");
                input.next();
                continue;
            }

            tutar = input.nextDouble();

            if (tutar < 0) {
                System.out.println("Tutar 0'dan küçük olamaz!");
                continue;
            }

            System.out.print("Girmiş olduğunuz tutar:" + tutar + "\nEmin misiniz? (y/n): ");
            String kontrol = input.next();
            if (kontrol.equalsIgnoreCase("y")) {
                System.out.println("Tutar " + tutar + " olarak tanımlandı.");
                fiyatGirisiDevamEdiyor = false;

            } else if (kontrol.equalsIgnoreCase("n")) {
                continue;
            } else {
                System.out.println("Geçersiz seçim!");
                continue;
            }

        }

        if (tutar > 1000) {
            kdvliTutar = tutar + (tutar * dusukKdv);
            System.out.println("Ürün tutarı 1000₺'yi geçtiği için fiyat %8 KDV oranıyla hesaplanıyor.\n");
            kullanilanKdv = dusukKdv;
        } else {
            kdvliTutar = tutar + (tutar * yuksekKdv);
            System.out.println("Ürün tutarı 1000₺'yi geçmediği için fiyat %18 KDV oranıyla hesaplanıyor.\n");
            kullanilanKdv = yuksekKdv;
        }

        eklenenKdv = kdvliTutar - tutar;

        System.out.println("Ürünün tutarı: " + tutar);
        System.out.println("KDV oranı: " + kullanilanKdv);
        System.out.println("Ürünün KDV'li tutarı: " + kdvliTutar);
        System.out.print("Ürüne eklenen KDV: " + eklenenKdv );
    }
}
