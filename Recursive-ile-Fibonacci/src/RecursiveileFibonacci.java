import java.util.Scanner;

public class RecursiveileFibonacci {


    public class Main {

        static int fibo(int numb) {
            if (numb == 1 || numb == 2) {
                return 1;
            }
            return fibo(numb - 1) + fibo(numb - 2);
        }

        public static void main(String[] args) {
            System.out.print("Bir sayı giriniz: ");
            Scanner scan = new Scanner(System.in);
            int numb = scan.nextInt();
            System.out.println("Fiboniacci Sonucu: " + fibo(numb));
        }
    }// Changes
}
