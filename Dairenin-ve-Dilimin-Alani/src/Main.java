import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] argh) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen Dairenin Yarıçapını Giriniz: ");
        double r = scan.nextDouble();
        double pi = 3.14;

        System.out.println("Lütfen Alanını Hesaplamak İstediğiniz Dilimin Yay Açısını Giriniz: ");
        double alfa = scan.nextDouble();
        double A = pi * r * r, C = 2 * r * pi, a = (pi * r * r * alfa) / 360;

        System.out.println("Dairenin Alanı: " + A);
        System.out.println("Dairenin Çevresi: " + C);
        System.out.println("Belirtilen Dilimin Alanı: " + a);
    }
}

