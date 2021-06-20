import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] argh) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lütfen Boyunuzu (Metre) Giriniz: ");
        double boy=scan.nextDouble();
        System.out.println("Lütfen Kilonuzu Giriniz: ");
        double kilo=scan.nextDouble();
        double indeks=kilo/(boy*boy);
        System.out.println("Vücut Kitle İndeksiniz: "+indeks);
    }
}

// Changes