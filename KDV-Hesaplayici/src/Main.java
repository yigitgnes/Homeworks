import java.util.*;
import java.io.*;


class Main {
    public static void main(String[] argh) {
        System.out.println("İşlem Ücretini Giriniz: ");
        Scanner scan=new Scanner(System.in);
        int a = scan.nextInt();
        if (a<=1000 && 0<a){
            double b= a*0.18;
            double d = a*1.18;

            System.out.println("KDV'siz Fiyat: "+a);
            System.out.println("KDV Tutarı: " +b);
            System.out.println("KDV'li Fiyat: "+d);
        }else if (a>1000){
            double b= a*0.08;
            double d = a*1.08;

            System.out.println("KDV'siz Fiyat: "+a);
            System.out.println("KDV Tutarı: " +b);
            System.out.println("KDV'li Fiyat: "+d);
        }else {System.out.println("Error");}
    }
}
// Changes
