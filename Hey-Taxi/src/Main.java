import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] argh) {
        Scanner scan = new Scanner(System.in);
        double km = scan.nextDouble();
        double b = 2.20, c = 10+km*b;
        if (c<20 && c>0){
            System.out.println("Taksi Ücreti: "+20+" TL'dir.");
        }else if (c>20){
            System.out.println("Taksi Ücreti: "+c+" TL'dir.");
        }else System.out.println("Hata! Lütfen Geçerli Bir Sayı Giriniz.");

    }
}

