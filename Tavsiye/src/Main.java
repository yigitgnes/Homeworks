import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        int heat = scan.nextInt();

        boolean suggestion = heat < 5;
        boolean suggestion1 = 5 < heat && heat <= 15;
        boolean suggestion2 = 10 < heat && heat <= 25;
        boolean suggestion3 = 25<heat;
        switch (suggestion + "") {
            case "true":
                System.out.println("Kayak Yapmaya Gidebilirsiniz");
                break;
        /*    case "false":
                System.out.println("Kayak İçin Hava Pek Uygun Değil");

         */
        }
        switch (suggestion1 + "") {
            case "true":
                System.out.println("Sinemaya Gidebilirsiniz");
                break;
        }
        switch (suggestion2 + "") {
            case "true":
                System.out.println("Pikniğe Gidebilirsiniz");
                break;

        }
        switch (suggestion3+""){
            case "true":
                System.out.println("Yüzmeye Gidebilirsiniz");
                break;
        }
    }// Changes
}
