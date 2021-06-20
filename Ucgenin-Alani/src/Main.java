import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] argh) {
        Scanner scan = new Scanner(System.in);
        int a=scan.nextInt();
        int b=scan.nextInt();
        int c=scan.nextInt();
        int u;
        double A;
        u=(a+b+c)/2;
        A = Math.sqrt(u*(u-a)*(u-b)*(u-c));
        System.out.println("Üçgenin Çevresi: "+2*u);
        System.out.println("Üçgenin Alanı: "+A);
    }
}

// Changes