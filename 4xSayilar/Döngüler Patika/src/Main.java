import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int numb,sum=0;
        do {
            System.out.print("Bir Sayı Giriniz: ");
            numb=scan.nextInt();
            if(numb%4==0){
                sum=numb+sum;
            }
        }while (numb%2==0);
        System.out.println("Toplam: "+sum);

    } // Homework
    // Changes

}