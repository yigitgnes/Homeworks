import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Matematik Nootunuz: ");
        int mat = scanner.nextInt();

        System.out.print("Fizik Notunuz: ");
        int fzk = scanner.nextInt();

        System.out.print("Türkçe Notunuz: ");
        int turk = scanner.nextInt();

        System.out.print("Kimya Notunuz: ");
        int kim = scanner.nextInt();

        System.out.print("Müzik Notunuz: ");
        int muz = scanner.nextInt();

        if (mat > 100 || mat < 0) {
            mat = 0;
        }
        if (fzk > 100 || fzk < 0) {
            fzk = 0;
        }
        if (muz > 100 || muz < 0) {
            muz = 0;
        }
        if (kim > 100 || kim < 0) {
            kim = 0;
        }
        if (turk > 100 || turk < 0) {
            turk = 0;
        }
        int y = mat + fzk + muz + turk + kim;
        int myArray[] = {mat, fzk, muz, turk, kim};
        int x = myArray.length;
        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i] == 0) {
                x--;
            }
        }
        double average = y / x;

        if (average < 55) {
            System.out.print("Sınıfta Kaldınız! Seneye Görüşmek Üzere...");
        } else System.out.print("Sınıfı Geçtiniz! Tebrikler.");

        System.out.print("Ortalamanız: " + average);
    }
}