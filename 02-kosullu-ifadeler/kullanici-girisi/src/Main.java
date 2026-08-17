import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String mevcutSifre = "myname";
        String yeniSifre;
        String yeniSifreTekrar;
        String girilenSifre;
        String sifreSifirlamakIstiyorMu;

        boolean girisDevamEdiyor = true;

        Scanner inp = new Scanner(System.in);

        System.out.println("Hoş geldiniz.");

        while (girisDevamEdiyor) {
            System.out.print("Şifrenizi giriniz: ");
            girilenSifre = inp.next();

            if (girilenSifre.equals(mevcutSifre)) {
                System.out.println("Başarıyla giriş yapıldı!");
                girisDevamEdiyor = false;

            } else {
                System.out.print(
                        "Şifre yanlış. Şifrenizi sıfırlamak ister misiniz (y/n): "
                );
                sifreSifirlamakIstiyorMu = inp.next();

                if (sifreSifirlamakIstiyorMu.equalsIgnoreCase("y")) {
                    while (true) {
                        System.out.print("Yeni şifre: ");
                        yeniSifre = inp.next();

                        if (yeniSifre.equals(mevcutSifre)) {
                            System.out.println(
                                    "Yeni şifre eski şifre ile aynı olamaz. " +
                                            "Farklı bir şifre giriniz."
                            );
                            continue;
                        }

                        System.out.print("Yeni şifreyi tekrar giriniz: ");
                        yeniSifreTekrar = inp.next();

                        if (!yeniSifre.equals(yeniSifreTekrar)) {
                            System.out.println(
                                    "Şifreler eşleşmiyor. Yeni şifreyi tekrar giriniz."
                            );
                            continue;
                        }

                        mevcutSifre = yeniSifre;
                        System.out.println("Şifre başarıyla oluşturuldu.");
                        break;
                    }

                } else if (sifreSifirlamakIstiyorMu.equalsIgnoreCase("n")) {
                    System.out.println("Tekrar şifre girebilirsiniz.");
                    continue;

                } else {
                    System.out.println("Hatalı seçim!");
                    continue;
                }
            }
        }
    }
}
