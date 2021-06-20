import java.awt.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int numb = scanner.nextInt();

        for (int i = 1; i <= numb; i++) {
            for (int k = 0; k < (numb - i); k++) {
                System.out.print(" ");
            }

            for (int j = 1; j <= (2 * i - 1); j++) {
                System.out.print("*");
            }
            System.out.println(" ");
        }
        for (int a = numb - 1; a >= 1; a--) {
            for (int b = numb - a - 1 ; b >= 0; b--) {
                System.out.print(" ");
            }

            for (int c=(2*a-1); c>=1;c--){
                System.out.print("*");
            }
            System.out.println(" ");
        }
    }
}// Changes