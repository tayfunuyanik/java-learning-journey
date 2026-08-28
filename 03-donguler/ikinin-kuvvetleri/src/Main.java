import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sinir = input.nextInt();

        if (sinir < 1) {
            System.out.println("Lütfen 1 veya daha büyük bir sayı giriniz.");
            return;
        }

        System.out.println("Girilen sayıya kadar 2'nin kuvvetleri:");
        for (int kuvvet = 1; kuvvet <= sinir; kuvvet *= 2) {
            System.out.println(kuvvet);
        }
    }
}
