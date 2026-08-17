import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String kayak = "Hava soğuk.\n1) Kayak yapabilirsin.\n2) Evde film izleyebilirsin.";
        String sinema = "Hava serin.\n1) Sinemaya gidebilirsin.\n2) Bir kafede vakit geçirebilirsin.";
        String piknik = "Hava güzel.\n1) Piknik yapabilirsin.\n2) Yürüyüşe çıkabilirsin.";
        String yuzme = "Hava sıcak.\n1) Yüzmeye gidebilirsin.\n2) Dondurma yemeye gidebilirsin.";
        double sicaklik = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("Sıcaklığa göre tavsiye uygulamasına hoş geldiniz.");
        System.out.print("Hava kaç derece: ");
        sicaklik = inp.nextDouble();

        if (sicaklik < 5) {
            System.out.println(kayak);
        } else if (sicaklik < 15) {
            System.out.println(sinema);
        } else if (sicaklik <= 25) {
            System.out.println(piknik);
        } else {
            System.out.println(yuzme);
        }
    }
}
