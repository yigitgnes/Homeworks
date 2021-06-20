import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Bir Sayı Giriniz: ");
        int numb = scan.nextInt();
        double ave = 0, sum = 0, x;
        for (int i = 0; i <= numb; i++) {

            if (i>2 && (i % 3 == 0 || i % 4 == 0)) {
                System.out.println(i);
                ave++;
                sum += i;
            } else continue;
        }

        x = sum / ave;
        System.out.println("Girilen Sayıya Kadar Olan Sayılardan 3 ve 4 e Bölünebilenlerin Ortalaması: " + x);
    }
}// Changes