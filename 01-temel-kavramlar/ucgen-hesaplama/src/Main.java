import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int a = 0;
        int b = 0;
        int ucuncuKenar = 0;
        int islemSecim;

        double alaninYarisi = 0;
        double sonuc = 0;
        double hipotenus = 0;

        String kontrol;

        boolean kontrolEdiliyor = true;
        boolean islemSecimKontrol = true;

        Scanner girdi = new Scanner(System.in);

        System.out.println("Üçgen hesaplama uygulamasına hoş geldiniz. :)");

        while (islemSecimKontrol) {
            System.out.println("\nYapılabilecek işlemler:");
            System.out.println("1) Üçgen alan hesaplama");
            System.out.println("2) Dik kenar üçgen hipotenüs hesaplama");
            System.out.println("3) Çıkış");

            System.out.print("Yapılacak işlemin numarasını giriniz: ");
            islemSecim = girdi.nextInt();

            if (islemSecim == 1) {
                kontrolEdiliyor = true;

                while (kontrolEdiliyor) {
                    System.out.print("1. kenarı giriniz: ");
                    a = girdi.nextInt();

                    System.out.print("1. kenar: " + a + " (d/y): ");
                    kontrol = girdi.next();

                    if (kontrol.equalsIgnoreCase("d")) {
                        kontrolEdiliyor = false;
                    } else if (kontrol.equalsIgnoreCase("y")) {
                        continue;
                    } else {
                        System.out.println("Hatalı girdi!");
                        continue;
                    }
                }

                kontrolEdiliyor = true;

                while (kontrolEdiliyor) {
                    System.out.print("2. kenarı giriniz: ");
                    b = girdi.nextInt();

                    System.out.print("2. kenar: " + b + " (d/y): ");
                    kontrol = girdi.next();

                    if (kontrol.equalsIgnoreCase("d")) {
                        kontrolEdiliyor = false;
                    } else if (kontrol.equalsIgnoreCase("y")) {
                        continue;
                    } else {
                        System.out.println("Hatalı girdi!");
                        continue;
                    }
                }

                kontrolEdiliyor = true;

                while (kontrolEdiliyor) {
                    System.out.print("3. kenarı giriniz: ");
                    ucuncuKenar = girdi.nextInt();

                    System.out.print("3. kenar: " + ucuncuKenar + " (d/y): ");
                    kontrol = girdi.next();

                    if (kontrol.equalsIgnoreCase("d")) {
                        kontrolEdiliyor = false;
                    } else if (kontrol.equalsIgnoreCase("y")) {
                        continue;
                    } else {
                        System.out.println("Hatalı girdi!");
                        continue;
                    }
                }

                alaninYarisi = (a + b + ucuncuKenar) / 2.0;

                sonuc = Math.sqrt(
                        alaninYarisi
                                * (alaninYarisi - a)
                                * (alaninYarisi - b)
                                * (alaninYarisi - ucuncuKenar)
                );

                System.out.println("Üçgenin alanı: " + sonuc);

            } else if (islemSecim == 2) {
                kontrolEdiliyor = true;

                while (kontrolEdiliyor) {
                    System.out.print("1. dik kenarı giriniz: ");
                    a = girdi.nextInt();

                    System.out.print("1. dik kenar: " + a + " (d/y): ");
                    kontrol = girdi.next();

                    if (kontrol.equalsIgnoreCase("d")) {
                        kontrolEdiliyor = false;
                    } else if (kontrol.equalsIgnoreCase("y")) {
                        continue;
                    } else {
                        System.out.println("Hatalı girdi!");
                        continue;
                    }
                }

                kontrolEdiliyor = true;

                while (kontrolEdiliyor) {
                    System.out.print("2. dik kenarı giriniz: ");
                    b = girdi.nextInt();

                    System.out.print("2. dik kenar: " + b + " (d/y): ");
                    kontrol = girdi.next();

                    if (kontrol.equalsIgnoreCase("d")) {
                        kontrolEdiliyor = false;
                    } else if (kontrol.equalsIgnoreCase("y")) {
                        continue;
                    } else {
                        System.out.println("Hatalı girdi!");
                        continue;
                    }
                }

                hipotenus = Math.sqrt((a * a) + (b * b));

                System.out.println("Hipotenüs: " + hipotenus);

            } else if (islemSecim == 3) {
                System.out.println("Uygulama kapatıldı.");
                islemSecimKontrol = false;

            } else {
                System.out.println("Hatalı seçim!");
            }
        }
    }
}
