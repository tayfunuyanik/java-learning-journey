import java.util.Scanner;

public class Main {
    static boolean asalMi(int sayi, int bolen) {
        if (bolen == sayi) {
            return true;
        }

        if (sayi % bolen == 0) {
            return false;
        }

        return asalMi(sayi, bolen + 1);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Bir sayı giriniz: ");
        int sayi = inp.nextInt();

        if (sayi < 2) {
            System.out.println(sayi + " asal sayı değildir.");
        } else if (asalMi(sayi, 2)) {
            System.out.println(sayi + " asal sayıdır.");
        } else {
            System.out.println(sayi + " asal sayı değildir.");
        }
    }
}
