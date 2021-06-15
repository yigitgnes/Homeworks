import java.io.*;
import java.sql.Array;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.print("Kaç Tane Sayı Sıralamak İstiyorsunuz: ");
        int a = scan.nextInt();
        System.out.println("Sayıları Giriniz");
        int myArray[] = new int[a];
        for (int i = 0; i < a; i++) {
            myArray[i] = scan.nextInt();
        }
        int sort;
        for (int j = 0; j < a; j++) {
            for (int l = j + 1; l < a; l++) {
                sort = 0;
                if (myArray[j] < myArray[l]) {
                    sort = myArray[j];
                    myArray[j] = myArray[l];
                    myArray[l] = sort;
                }
            }
            System.out.println(myArray[j]);
        }
    }
}
