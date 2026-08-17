import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int istenenSayi = 0, bolunebilenSayiSayisi = 0, toplam = 0, ortalama = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bu program girilen sayıya kadar 3 ve 4'e tam bölünebilen sayıların ortalamasını hesaplar.\nBir sayı giriniz: ");
        istenenSayi = inp.nextInt();
        for (int i = 0; i <= istenenSayi; i++) {
            if (((i % 3 == 0) && (i % 4 == 0))) {
                toplam += i;
                bolunebilenSayiSayisi++;
            }
        }
        if (bolunebilenSayiSayisi > 0) {
            ortalama = toplam / bolunebilenSayiSayisi;
            System.out.print("Sayıların ortalaması: " + ortalama);
        } else {
            System.out.print("Uygun sayı bulunamadı!");
        }
    }
}
