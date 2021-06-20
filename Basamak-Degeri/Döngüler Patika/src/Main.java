import java.awt.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int number = scanner.nextInt();

        int tempNumber = number;
        int numbCount = 0, numbValue;
        int result=0;
        while (tempNumber != 0) {

            tempNumber/=10;
            numbCount++;

        }tempNumber=number;

        for (int i = 0; i<numbCount; i++){
            numbValue=tempNumber%10;
            result+=numbValue;
            tempNumber/=10;
        }System.out.println("Basamak değerleri toplamı: "+result);
    }
}// Changes