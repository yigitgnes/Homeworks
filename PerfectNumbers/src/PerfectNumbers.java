import java.util.Scanner;

public class PerfectNumbers {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Bir Sayı Giriniz: ");
        int numb = scanner.nextInt();
        int total = 0;
        if (numb == 1) {
            System.out.println("1 Mükemmler Sayı Değildir");
        } else {
            for (int i = 1; i < numb; i++) {
                if (numb % i == 0) {
                    total += i;
                }
            }
            if (total == numb) {
                System.out.println(numb + " Mükemmel Sayıdır");
            }else System.out.println(numb+" Mükemmel Sayı Değildir");
        }
    }
}// Changes
