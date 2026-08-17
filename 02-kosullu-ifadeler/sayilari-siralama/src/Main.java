import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double sayi1 = 0;
        double sayi2 = 0;
        double sayi3 = 0;

        Scanner inp = new Scanner(System.in);

        System.out.print("1. sayıyı giriniz: ");
        sayi1 = inp.nextDouble();

        System.out.print("2. sayıyı giriniz: ");
        sayi2 = inp.nextDouble();

        System.out.print("3. sayıyı giriniz: ");
        sayi3 = inp.nextDouble();

        if (sayi1 >= sayi2 && sayi1 >= sayi3) {
            if (sayi2 >= sayi3) {
                System.out.println("Küçükten büyüğe sıralama: " + sayi3 + " < " + sayi2 + " < " + sayi1);
            } else {
                System.out.println("Küçükten büyüğe sıralama: " + sayi2 + " < " + sayi3 + " < " + sayi1);
            }

        } else if (sayi2 >= sayi1 && sayi2 >= sayi3) {
            if (sayi1 >= sayi3) {
                System.out.println("Küçükten büyüğe sıralama: " + sayi3 + " < " + sayi1 + " < " + sayi2);
            } else {
                System.out.println("Küçükten büyüğe sıralama: " + sayi1 + " < " + sayi3 + " < " + sayi2);
            }

        } else {
            if (sayi1 >= sayi2) {
                System.out.println("Küçükten büyüğe sıralama: " + sayi2 + " < " + sayi1 + " < " + sayi3);
            } else {
                System.out.println("Küçükten büyüğe sıralama: " + sayi1 + " < " + sayi2 + " < " + sayi3);
            }
        }
    }
}
