import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Main {


    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Yıl Giriniz: ");
        int year = scan.nextInt();
        int a = year % 4;
        if (a == 0) {
            System.out.println(year + " Bir Artık Yıldır !");
        } else System.out.println(year + " Bir Artık Yıl Değildir !");

    }
}