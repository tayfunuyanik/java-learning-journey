import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double kmUcret = 2.20, tutar = 0, gidilenKm = 0;
        Scanner inp = new Scanner(System.in);
        boolean kontrol = true, ikinciKontrol = true;
        String kabulMu;

        System.out.println("KM başına ücret 2.20 TL'dir. Taksimetre açılış ücreti 10 TL'dir. Minimum ödenecek tutar 20 TL'dir; 20 TL altındaki tutarlar 20 TL olarak alınır.");
        while (kontrol) {
            System.out.print("Bilgilendirmeyi okuyup kabul ediyorsanız (y/n): ");
            kabulMu = inp.next();
            if (kabulMu.equalsIgnoreCase("y")) {
                System.out.println("İşleminize devam ediliyor!");
                kontrol = false;
            } else if (kabulMu.equalsIgnoreCase("n")) {
                System.out.println("Çıkış yapılıyor...");
                kontrol = false;
                ikinciKontrol = false;
            } else {
                System.out.println("Hatalı seçim!");
                continue;
            }
        }
        while (ikinciKontrol) {
            System.out.print("Gidilen KM: ");
            gidilenKm = inp.nextDouble();
            System.out.println("Gidilen KM: " + gidilenKm + "(y/n): ");
            kabulMu = inp.next();
            if (kabulMu.equalsIgnoreCase("y")) {
                System.out.println("İşleminize devam ediliyor...");
                tutar = (kmUcret * gidilenKm) + 10;
                if (tutar < 20) {
                    tutar = 20;
                }
            } else if (kabulMu.equalsIgnoreCase("n")) {
                continue;
            } else {
                System.out.println("Hatalı seçim!");
                continue;
            }
            System.out.print("Ödenecek tutar:" + tutar);
            ikinciKontrol = false;
        }

    }
}
