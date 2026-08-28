public class Main {
    public static void main(String[] args) {
        System.out.println("1 ile 100 arasındaki asal sayılar:");

        for (int sayi = 2; sayi <= 100; sayi++) {
            boolean asalMi = true;

            for (int bolen = 2; bolen < sayi; bolen++) {
                if (sayi % bolen == 0) {
                    asalMi = false;
                    break;
                }
            }

            if (asalMi) {
                System.out.print(sayi + " ");
            }
        }
    }
}
