import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Faktöriyeli hesaplanacak sayıyı giriniz: ");
        int sayi = input.nextInt();

        if (sayi < 0 || sayi > 20) {
            System.out.println("Lütfen 0 ile 20 arasında bir tam sayı giriniz.");
            return;
        }

        long faktoriyel = 1;

        for (int i = 1; i <= sayi; i++) {
            faktoriyel *= i;
        }

        System.out.println(sayi + "! = " + faktoriyel);

    }
}
