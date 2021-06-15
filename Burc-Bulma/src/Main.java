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
        System.out.print("Doğduğunuz Gün: ");
        int day = scan.nextInt();
        System.out.print("Doğduğunuz Ay: ");
        String month = scan.next();

        if ((day > 20 && month.equals("Mart")) || (day < 21 && month.equals("Nisan"))) {

            System.out.println("Burcunuz Koç");

        } else if ((day > 20 && month.equals("Nisan")) || (day < 22 && month.equals("Mayıs"))) {

            System.out.println("Burcunuz Boğa");

        } else if ((day > 21 && month.equals("Mayıs")) || (day < 23 && month.equals("Haziran"))) {

            System.out.println("Burcunuz İkizler");

        } else if ((day > 22 && month.equals("Haziran")) || (day < 23 && month.equals("Temmuz"))) {

            System.out.println("Burcunuz Yengeç :( Seni çok özledim Zeynep");

        } else if ((day > 22 && month.equals("Temmuz")) || (day < 23 && month.equals("Ağustos"))) {

            System.out.println("Burcunuz Aslan");

        } else if ((day > 22 && month.equals("Ağustos")) || (day < 23 && month.equals("Eylül"))) {

            System.out.println("Burcunuz Başak");

        } else if ((day > 22 && month.equals("Eylül")) || (day < 22 && month.equals("Ekim"))) {

            System.out.println("Burcunuz Terazi");

        } else if ((day > 22 && month.equals("Ekim")) || (day < 23 && month.equals("Kasım"))) {

            System.out.println("Burcunuz Akrep");

        } else if ((day > 21 && month.equals("Kasım")) || (day < 23 && month.equals("Aralık"))) {

            System.out.println("Burcunuz Yay");

        } else if ((day > 21 && month.equals("Aralık")) || (day < 23 && month.equals("Ocak"))) {

            System.out.println("Burcunuz Oğlak");

        } else if ((day > 22 && month.equals("Ocak")) || (day < 23 && month.equals("Şubat"))) {

            System.out.println("Burcunuz Kova");

        } else if ((day > 19 && month.equals("Şubat")) || (day < 23 && month.equals("Mart"))) {

            System.out.println("Burcunuz Balık");

        }

    }
}