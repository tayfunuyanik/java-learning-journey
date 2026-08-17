import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int gun = 0, ay = 0, maksimumGun = 0;
        String burc = "";
        Scanner inp = new Scanner(System.in);

        System.out.println("Burç bulma uygulamasına hoş geldiniz.");

        while (true) {
            System.out.print("Doğduğunuz ayın numarasını giriniz (1-12): ");
            ay = inp.nextInt();

            if (ay > 12 || ay < 1) {
                System.out.println("Hatalı ay numarası!");
                continue;
            } else {
                break;
            }
        }

        if (ay == 2) {
            maksimumGun = 29;
        } else if (ay == 4 || ay == 6 || ay == 9 || ay == 11) {
            maksimumGun = 30;
        } else {
            maksimumGun = 31;
        }

        while (true) {
            System.out.print("Doğduğunuz günü giriniz: ");
            gun = inp.nextInt();

            if (gun > maksimumGun) {
                System.out.println("Girilebilecek gün en fazla " + maksimumGun + " olabilir!");
                continue;
            } else if (gun < 1) {
                System.out.println("Gün 1'den küçük olamaz!");
                continue;
            } else {
                break;
            }
        }

        if (ay == 1) {
            burc = gun >= 22 ? "Kova" : "Oğlak";
        } else if (ay == 2) {
            burc = gun >= 20 ? "Balık" : "Kova";
        } else if (ay == 3) {
            burc = gun >= 21 ? "Koç" : "Balık";
        } else if (ay == 4) {
            burc = gun >= 21 ? "Boğa" : "Koç";
        } else if (ay == 5) {
            burc = gun >= 22 ? "İkizler" : "Boğa";
        } else if (ay == 6) {
            burc = gun >= 23 ? "Yengeç" : "İkizler";
        } else if (ay == 7) {
            burc = gun >= 23 ? "Aslan" : "Yengeç";
        } else if (ay == 8) {
            burc = gun >= 23 ? "Başak" : "Aslan";
        } else if (ay == 9) {
            burc = gun >= 23 ? "Terazi" : "Başak";
        } else if (ay == 10) {
            burc = gun >= 23 ? "Akrep" : "Terazi";
        } else if (ay == 11) {
            burc = gun >= 22 ? "Yay" : "Akrep";
        } else {
            burc = gun >= 22 ? "Oğlak" : "Yay";
        }

        System.out.println("Burcunuz: " + burc);
    }
}