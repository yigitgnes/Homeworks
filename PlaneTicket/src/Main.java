import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Katedilen Mesafe: ");
        double km = scan.nextDouble();

        System.out.print("Yolcu Yaşı: ");
        int age = scan.nextInt();

        System.out.println("Yolculuk Tipi Seçiniz:");
        System.out.println("1-) Tek Yön Bilet\n2-) Gidiş-Dönüş Bilet");
        int type = scan.nextInt();

        double price = km * 0.10;
        double discountPriceForChild = price * 0.5;
        double discountPriceForTeen = price * 0.9;
        double discountPriceForOld = price * 0.7;
        if (km > 0 && age > 0 && (type == 1 || type == 2)) {

            if (age < 12) {
                if (type == 2) {
                    System.out.println("Ödemeniz Gereken Tutar: " + discountPriceForChild * 0.8 * 2);
                } else System.out.println("Ödemeniz Gereken TUtar: " + discountPriceForChild);

            } else if (age >= 12 && age <= 24) {
                if (type == 2) {
                    System.out.println("Ödemeniz Gereken Tutar: " + discountPriceForTeen * 0.8 * 2);
                } else System.out.println("Ödemeniz Gereken Tutar: " + discountPriceForTeen);

            } else if (age > 24 && age <= 65) {
                if (type == 2) {
                    System.out.println("Ödemeniz Gereken Tutar: " + price * 0.8 * 2);
                } else System.out.println("Ödemeniz Gereken Tutar: " + price);

            } else if (age > 65) {
                if (type == 2) {
                    System.out.println("Ödemeniz Gereken Tutar: " + discountPriceForOld * 0.8 * 2);
                } else System.out.println("Ödemeniz Gereken Tutar: " + discountPriceForOld);
            }
        }else System.out.println("Hatalı veri girdiniz!");
    }
}// Changes