import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int yil;
        boolean artikYil;

        Scanner input = new Scanner(System.in);

        System.out.print("Yıl giriniz: ");
        yil = input.nextInt();

        artikYil = yil % 400 == 0 || (yil % 4 == 0 && yil % 100 != 0);

        if (artikYil) {
            System.out.println(yil + " bir artık yıldır!");
        } else {
            System.out.println(yil + " bir artık yıl değildir!");
        }
    }
}
