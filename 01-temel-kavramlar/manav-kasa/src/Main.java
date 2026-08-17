import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        double armutFiyat = 2.14;
        double elmaFiyat = 3.67;
        double domatesFiyat = 1.11;
        double muzFiyat = 0.95;
        double patlicanFiyat = 5.00;

        double armutKg = 0;
        double elmaKg = 0;
        double domatesKg = 0;
        double muzKg = 0;
        double patlicanKg = 0;
        double toplamTutar = 0;

        Scanner inp = new Scanner(System.in);

        boolean kontrolEdiliyor = true;
        String kontrol;

        System.out.println("Fiyat Listesi");
        System.out.println(
                "Armut: " + armutFiyat + " TL\n" +
                        "Elma: " + elmaFiyat + " TL\n" +
                        "Domates: " + domatesFiyat + " TL\n" +
                        "Muz: " + muzFiyat + " TL\n" +
                        "Patlıcan: " + patlicanFiyat + " TL"
        );

        while (kontrolEdiliyor) {
            System.out.print("\nArmut kaç kilo: ");
            armutKg = inp.nextDouble();

            System.out.print("Elma kaç kilo: ");
            elmaKg = inp.nextDouble();

            System.out.print("Domates kaç kilo: ");
            domatesKg = inp.nextDouble();

            System.out.print("Muz kaç kilo: ");
            muzKg = inp.nextDouble();

            System.out.print("Patlıcan kaç kilo: ");
            patlicanKg = inp.nextDouble();

            System.out.println("\nAldığınız ürünler:");
            System.out.println("Armut: " + armutKg + " kg");
            System.out.println("Elma: " + elmaKg + " kg");
            System.out.println("Domates: " + domatesKg + " kg");
            System.out.println("Muz: " + muzKg + " kg");
            System.out.println("Patlıcan: " + patlicanKg + " kg");

            System.out.print("Bilgiler doğru mu (d/y): ");
            kontrol = inp.next();

            if (kontrol.equalsIgnoreCase("d")) {
                toplamTutar = (armutKg * armutFiyat)
                        + (elmaKg * elmaFiyat)
                        + (domatesKg * domatesFiyat)
                        + (muzKg * muzFiyat)
                        + (patlicanKg * patlicanFiyat);

                System.out.println("Toplam Tutar: " + toplamTutar + " TL");
                kontrolEdiliyor = false;

            } else if (kontrol.equalsIgnoreCase("y")) {System.out.println("Ürünleri tekrar giriniz.");
            } else {System.out.println("Hatalı seçim!");
            }
        }
    }
}
