import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik = 0,  fizik = 0,  kimya = 0,   biyoloji = 0,   edebiyat = 0,  tarih = 0;

        Scanner inp = new Scanner(System.in);
        boolean notGirisiDevamEdiyor = true;
        while (notGirisiDevamEdiyor) {
            System.out.print("Matematik Notunuz:");
            matematik = inp.nextInt();

            System.out.print("Fizik Notunuz: ");
            fizik = inp.nextInt();

            System.out.print("Kimya Notunuz: ");
            kimya = inp.nextInt();

            System.out.print("Biyoloji Notunuz: ");
            biyoloji = inp.nextInt();

            System.out.print("Edebiyat Notunuz: ");
            edebiyat = inp.nextInt();

            System.out.print("Tarih Notunuz: ");
            tarih = inp.nextInt();

            System.out.println("Matematik Notunuz: " + matematik);
            System.out.println("Fizik Notunuz: " + fizik);
            System.out.println("Kimya Notunuz: " + kimya);
            System.out.println("Biyoloji Notunuz: " + biyoloji);
            System.out.println("Edebiyat Notunuz: " + edebiyat);
            System.out.println("Tarih Notunuz: " + tarih);

            while (true){
                System.out.print("Girmiş olduğunuz notlar yukarıdaki gibi. Lütfen kontrol edin! (d/y): ");
                String kontrol = inp.next();
                if (kontrol.equalsIgnoreCase("d")) {
                    notGirisiDevamEdiyor = false;
                    break;
                } else if (kontrol.equalsIgnoreCase("y")){
                    System.out.println("Notları tekrar giriniz!");
                    break;
                } else {
                    System.out.println("Geçersiz seçim!");
                }
            }
        }
        double ortalama = ((matematik + fizik + kimya + biyoloji + edebiyat + tarih) / 6.0);



        String durum = ortalama >= 60 ? "Tebrikler Geçtiniz!" : "Kaldınız!";

        System.out.println("Not Ortalamanız: " + ortalama);
        System.out.print("Durum: " + durum);

    }
}
