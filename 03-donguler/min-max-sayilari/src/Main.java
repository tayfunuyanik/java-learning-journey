import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Kaç tane sayı gireceksiniz: ");
        int sayiAdedi = input.nextInt();

        if (sayiAdedi < 1) {
            System.out.println("Lütfen en az bir sayı gireceğinizi belirtiniz.");
            return;
        }

        System.out.print("1. sayıyı giriniz: ");
        int girilenSayi = input.nextInt();
        int enKucuk = girilenSayi;
        int enBuyuk = girilenSayi;

        for (int i = 2; i <= sayiAdedi; i++) {
            System.out.print(i + ". sayıyı giriniz: ");
            girilenSayi = input.nextInt();

            if (girilenSayi < enKucuk) {
                enKucuk = girilenSayi;
            }

            if (girilenSayi > enBuyuk) {
                enBuyuk = girilenSayi;
            }
        }

        System.out.println("En büyük sayı: " + enBuyuk);
        System.out.println("En küçük sayı: " + enKucuk);
    }
}
