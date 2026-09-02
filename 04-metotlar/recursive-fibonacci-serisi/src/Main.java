import java.util.Scanner;

public class Main {
    static long fibonacci(int sira) {
        if (sira == 0 || sira == 1) {
            return sira;
        }

        return fibonacci(sira - 1) + fibonacci(sira - 2);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        System.out.print("Fibonacci serisinin eleman sayısını giriniz: ");
        int elemanSayisi = inp.nextInt();

        if (elemanSayisi < 1) {
            System.out.println("Eleman sayısı en az 1 olmalıdır.");
            return;
        }

        System.out.print(elemanSayisi + " elemanlı Fibonacci serisi: ");
        for (int i = 0; i < elemanSayisi; i++) {
            System.out.print(fibonacci(i) + " ");
        }
    }
}
