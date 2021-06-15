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
        System.out.print("Bir Sayı Giriniz n1: ");
        int n1 = scan.nextInt();
        System.out.print("Bir Sayı Giriniz n2: ");
        int n2 = scan.nextInt();
        int x, y, i, ebob = 0;

        if (n1 > n2) {
            x = n2;
            y = n1;
        } else {
            x = n1;
            y = n2;
        }
        i=x-1;
        while (i > 0) {
            if (x % i == 0 && y % i==0){
                ebob=i;
                break;
            }i--;
        }System.out.println("EBOB: "+ebob);
        int ekok=(n1*n2)/ebob;
        System.out.println("EKOK: "+ekok);
    }
}