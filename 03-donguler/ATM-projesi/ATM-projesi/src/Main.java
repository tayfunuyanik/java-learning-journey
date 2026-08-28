import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String kullaniciAdi = "patika", sifre = "dev123", inpKullaniciAdi, inpSifre;
        boolean atmCalisiyor = false, islemDevamEdiyor = false;
        int hak = 3, yapilacakIslem = 0;
        double bakiye = 1500, kullaniciInpBakiye = 0;
        Scanner inp = new Scanner(System.in);
        System.out.println("ATM'ye hoş geldiniz.");
        while (!atmCalisiyor) {
            System.out.print("Kullanıcı Adı: ");
            inpKullaniciAdi = inp.next();
            System.out.print("Şifre: ");
            inpSifre = inp.next();
            if ((inpKullaniciAdi.equals(kullaniciAdi)) && (inpSifre.equals(sifre))) {
                System.out.println("Giriş başarılı.");
            } else {
                System.out.println("Hatalı kullanıcı adı veya şifre!");
                hak --;
                if (hak == 0) {
                    System.out.println("Çok sayıda hatalı giriş nedeniyle hesabınız bloke oldu. Banka ile iletişime geçiniz!");
                    atmCalisiyor = true;
                    continue;
                } else {
                    System.out.println("Kalan hakkınız: " + hak);
                    continue;
                }
            }
            while (!islemDevamEdiyor) {
                System.out.println("\nMevcut bakiyeniz: " + bakiye + " TL");
                System.out.print("İşlemler\n1) Para çek\n2) Para yatır\n3) Bakiye sorgula\n4) Çıkış yap\nSeçiminiz: ");
                yapilacakIslem = inp.nextInt();
                switch (yapilacakIslem) {
                    case 1: // Para cekme
                        while (true) {
                            System.out.print("Çekilecek tutarı giriniz: ");
                            if (!inp.hasNextDouble()) {
                                System.out.println("Lütfen sayı giriniz!");
                                inp.next();
                                continue;
                            }
                            kullaniciInpBakiye = inp.nextDouble();
                            if (kullaniciInpBakiye <= 0) {
                                System.out.println("Geçersiz değer!");
                                continue;
                            }
                            else if (bakiye < kullaniciInpBakiye) {
                                System.out.println("Yetersiz bakiye!");
                                continue;
                            } else {
                                bakiye = bakiye - kullaniciInpBakiye;
                                System.out.println("Para çekme işlemi başarılı.\nMevcut bakiye: " + bakiye + " TL\nParanızı almayı unutmayın.");
                                break;
                            }
                        }
                        break;
                    case 2: // Para yatirma
                        while (true) {
                            System.out.print("Yatırılacak tutarı giriniz: ");
                            if (!inp.hasNextDouble()) {
                                System.out.println("Lütfen sayı giriniz!");
                                inp.next();
                                continue;
                            }
                            kullaniciInpBakiye = inp.nextDouble();

                            if (kullaniciInpBakiye <= 0) {
                                System.out.println("Geçersiz değer!");
                                continue;
                            }
                            bakiye = bakiye + kullaniciInpBakiye;
                            System.out.println("Para yatırma işlemi başarılı.\nGüncel bakiyeniz: " + bakiye + " TL");
                            break;
                        }
                        break;
                    case 3: // Bakiye gorme
                        System.out.println("Bakiyeniz: " + bakiye + " TL");
                        break;
                    case 4: // Cikis
                        System.out.println("Çıkış yapılıyor...");
                        islemDevamEdiyor = true;
                        break;
                    default:
                        System.out.println("Hatalı seçim!");
                        continue;

                }
            }
            System.out.println("Başarıyla çıkış yapıldı.");
            atmCalisiyor = true;
        }
    }
}
