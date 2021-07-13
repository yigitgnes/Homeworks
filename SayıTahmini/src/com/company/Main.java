package com.company;

import java.util.Random;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Random random = new Random();
        int number = random.nextInt(10);
        Scanner scanner = new Scanner(System.in);



        int count=0;

        while (count<3){
            System.out.print("Sayı Tahmini Alalım: ");
            int luck = scanner.nextInt();

            if (luck == number){
                System.out.println("Bildiniz!! Tebrikler");
                break;
            }else count++;

            if (luck<number && count !=3){
                System.out.println("Daha Büyük Bir Sayı Tahmininde Bulununuz");
            }
            if (luck>number && count !=3){
                System.out.println("Daha Küçük Bir Sayı Tahmininde Bulununuz");
            }
            if (count==3){
                System.out.println("Hakkınız Doldu :(");
            }
        }


    }
}
