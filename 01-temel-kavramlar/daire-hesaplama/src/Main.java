import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double piSayisi = 3.14, yariCap= 0, merkezAcisi = 0, alan = 0, cevre = 0, dilimAlani = 0;
        Scanner inp = new Scanner(System.in);

        System.out.print("Dairenin yarıçapını giriniz: ");
        yariCap = inp.nextDouble();

        System.out.print("Dairenin merkez açısını giriniz: ");
        merkezAcisi = inp.nextDouble();

        alan = piSayisi * yariCap * yariCap;
        cevre = 2 * piSayisi * yariCap;
        dilimAlani = (piSayisi * yariCap * yariCap * merkezAcisi) / 360;

        System.out.println("Dairenin alanı: " + alan);
        System.out.println("Dairenin çevresi: " + cevre);
        System.out.println("Dairenin dilim alanı: " + dilimAlani);
    }
}
