import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        int istenenSayi = 0, bolunebilenSayiSayisi = 0, toplam = 0, ortalama = 0;
        Scanner inp = new Scanner(System.in);
        System.out.print("Bu program girilen sayiya kadar 3 ve 4'e tam bolunebilen sayilarin ortalamasini hesaplar.\nBir sayi giriniz: ");
        istenenSayi = inp.nextInt();
        for (int i = 1; (i <= istenenSayi); i++) {
            if (((i % 3 == 0) && (i % 4 == 0))) {
                toplam += i;
                bolunebilenSayiSayisi++;
            }
        }
        if (bolunebilenSayiSayisi > 0) {
            ortalama = toplam / bolunebilenSayiSayisi;
            System.out.print("Sayilarin ortalamasi: " + ortalama);
        }else {
            System.out.print("uygun sayı bulunamadi!");
        }
    }
}