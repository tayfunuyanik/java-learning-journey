import java.util.Scanner;

public class Main {
    static Scanner inp = new Scanner(System.in);

    static void dongu(int sayi) {
        System.out.print(sayi + " ");

        if (sayi <= 0) {
            return;
        }

        dongu(sayi - 5);

        System.out.print(sayi + " ");
    }

    public static void main(String[] args) {
        System.out.print("Bir sayı giriniz: ");
        int girdi = inp.nextInt();

        dongu(girdi);
    }
}