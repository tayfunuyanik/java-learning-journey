import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        final double KM_BASI_UCRET = 0.10;
        double mesafe;
        int yas;
        int yolculukTipi;

        Scanner input = new Scanner(System.in);

        System.out.print("Mesafeyi km türünden giriniz: ");
        mesafe = input.nextDouble();

        System.out.print("Yaşınızı giriniz: ");
        yas = input.nextInt();

        System.out.print("Yolculuk tipini giriniz (1 => Tek Yön, 2 => Gidiş-Dönüş): ");
        yolculukTipi = input.nextInt();

        if (mesafe <= 0 || yas <= 0 || (yolculukTipi != 1 && yolculukTipi != 2)) {
            System.out.println("Hatalı Veri Girdiniz!");
            return;
        }

        double toplamTutar = mesafe * KM_BASI_UCRET;

        if (yas < 12) {
            toplamTutar *= 0.50;
        } else if (yas <= 24) {
            toplamTutar *= 0.90;
        } else if (yas > 65) {
            toplamTutar *= 0.70;
        }

        if (yolculukTipi == 2) {
            toplamTutar = toplamTutar * 0.80 * 2;
        }

        System.out.println("Toplam Tutar: " + toplamTutar + " TL");
    }
}
