import java.awt.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("C(n,r) Olacak Şekilde;");

        System.out.print("'n' Değerini Giriniz: ");
        int n = scanner.nextInt();

        System.out.print("'r' Değerini Giriniz: ");
        int r = scanner.nextInt();

        int nFaktor = 1, rFaktor = 1, farkFaktor = 1;

        for (int i = 1; i <= n; i++) {

            nFaktor *= i;

        }

        for (int j = 1; j <= r; j++) {

            rFaktor *= j;

        }
        int x = n - r;
        for (int l = 1; l <= x; l++) {

            farkFaktor *= l;

        }

        double C = nFaktor / (rFaktor * (farkFaktor));
        System.out.println("C(" + n + "," + r + ")= " + C);
    }
}