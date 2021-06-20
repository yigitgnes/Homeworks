import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("İşlem Yapmak İstediğiniz 1. Sayıyı Giriniz: ");
        double n1=scan.nextDouble();
        System.out.print("İşlem Yapmak İstediğiniz 2. Sayıyı Giriniz: ");
        double n2=scan.nextDouble();

        System.out.println("Yapmak İstediğiniz İşlemi Seçiniz:");
        System.out.println("1-Toplama");
        System.out.println("2-Çıkarma");
        System.out.println("3-Çarpma");
        System.out.println("4-Bölme");
        int select=scan.nextInt();

        switch (select){
            case 1:
                System.out.println("İşlem Sonucu: "+(n1+n2));
                break;

            case 2:
                System.out.println("İşlem Sonucu: "+(n1-n2));
                break;
            case 3:
                System.out.println("İşlem Sonucu: "+(n1*n2));
                break;
            case 4:
                System.out.println("İşlem Sonucu: "+(n1/n2));
                break;
            default:System.out.println("Hata: Geçersiz Seçim");
        }
    }
}// Changes