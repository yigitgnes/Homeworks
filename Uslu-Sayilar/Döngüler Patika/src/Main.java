import java.awt.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Üssünü Almak İstediğiniz Sayıyı Giriniz: ");
        int numb=scanner.nextInt();

        System.out.print("Kuvveti: ");
        int pow=scanner.nextInt();

        int total=1;

        for (int i=0; i<pow;i++){
            total*=numb;
        }
        System.out.print("Sonuç: " + total);
    }// Changes
}