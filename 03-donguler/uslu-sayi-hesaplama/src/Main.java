import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Taban sayıyı giriniz: ");
        int taban = input.nextInt();
        System.out.print("Üs değerini giriniz: ");
        int us = input.nextInt();

        if (us < 0) {
            System.out.println("Bu uygulama yalnızca 0 veya pozitif üs değerlerini hesaplar.");
            return;
        }

        long sonuc = 1;

        for (int i = 0; i < us; i++) {
            sonuc *= taban;
        }

        System.out.println(taban + " üzeri " + us + " = " + sonuc);
    }
}
