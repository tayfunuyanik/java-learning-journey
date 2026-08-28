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

        System.out.println("Girilen sayıya kadar 4'ün kuvvetleri:");
        for (int kuvvet = 1; kuvvet <= sinir; kuvvet *= 4) {
            System.out.println(kuvvet);
        }

        System.out.println("Girilen sayıya kadar 5'in kuvvetleri:");
        for (int kuvvet = 1; kuvvet <= sinir; kuvvet *= 5) {
            System.out.println(kuvvet);
        }
    }
}
