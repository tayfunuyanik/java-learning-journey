import java.util.Scanner;

public class Main {
    static long usHesapla(int taban, int us) {
        if (us == 0) {
            return 1;
        }

        return taban * usHesapla(taban, us - 1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Taban değerini giriniz: ");
        int taban = inp.nextInt();

        System.out.print("Üs değerini giriniz: ");
        int us = inp.nextInt();

        if (us < 0) {
            System.out.println("Üs değeri negatif olamaz.");
            return;
        }

        System.out.println("Sonuç: " + usHesapla(taban, us));
    }
}
