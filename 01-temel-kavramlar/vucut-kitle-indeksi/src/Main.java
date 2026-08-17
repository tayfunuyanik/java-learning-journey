import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double boy = 0, kilo = 0, sonuc = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Boyunuzu metre cinsinden giriniz: ");
        boy = inp.nextDouble();

        System.out.print("Kilonuzu Giriniz: ");
        kilo = inp.nextDouble();

        sonuc = kilo / (boy * boy);

        System.out.print("Vücut kitle indeksiniz: " + sonuc);
    }
}
