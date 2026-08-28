import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int matematik = 0;
        int fizik = 0;
        int turkce = 0;
        int kimya = 0;
        int muzik = 0;
        int gecerliNotSayisi = 0;
        int toplamNot = 0;
        double notOrtalamasi = 0;
        Scanner inp = new Scanner(System.in);

        System.out.println("ÖNEMLİ NOT: 0 ve 100 arasında olmayan notlar geçersiz sayılacaktır!");
        System.out.print("Matematik Notunuz:");
        matematik = inp.nextInt();

        System.out.print("Fizik Notunuz: ");
        fizik = inp.nextInt();

        System.out.print("Türkçe Notunuz: ");
        turkce = inp.nextInt();

        System.out.print("Kimya Notunuz: ");
        kimya = inp.nextInt();

        System.out.print("Müzik Notunuz: ");
        muzik = inp.nextInt();

        //Matematik
        if (matematik >= 0 && matematik <= 100) {
            toplamNot = toplamNot + matematik;
            gecerliNotSayisi++;
        } else {
            System.out.println("Matematik notu geçersiz, ortalamaya eklenmedi.");
        }

        //Fizik
        if (fizik >= 0 && fizik <= 100) {
            toplamNot = toplamNot + fizik;
            gecerliNotSayisi++;
        } else {
            System.out.println("Fizik notu geçersiz, ortalamaya eklenmedi.");
        }

        //Turkce
        if (turkce >= 0 && turkce <= 100) {
            toplamNot = toplamNot + turkce;
            gecerliNotSayisi++;
        } else {
            System.out.println("Türkçe notu geçersiz, ortalamaya eklenmedi.");
        }

        //Kimya
        if (kimya >= 0 && kimya <= 100) {
            toplamNot = toplamNot + kimya;
            gecerliNotSayisi++;
        } else {
            System.out.println("Kimya notu geçersiz, ortalamaya eklenmedi.");
        }

        //Muzik
        if (muzik >= 0 && muzik <= 100) {
            toplamNot = toplamNot + muzik;
            gecerliNotSayisi++;
        } else {
            System.out.println("Müzik notu geçersiz, ortalamaya eklenmedi.");
        }

        if (gecerliNotSayisi > 0) {
            notOrtalamasi = (double) toplamNot / gecerliNotSayisi;
            if (notOrtalamasi >= 55) {
                System.out.println("Not ortalamanız: " + notOrtalamasi);
                System.out.print("Geçtiniz.");
            } else {
                System.out.println("Not ortalamanız: " + notOrtalamasi);
                System.out.println("Kaldınız");
            }
        }  else {
            System.out.println("Geçerli not girilmediği için ortalama hesaplanamadı!");
        }
    }
}
