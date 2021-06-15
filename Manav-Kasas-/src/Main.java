import java.util.*;


class Main {
    public static void main(String[] argh) {

        Scanner scan=new Scanner(System.in);
        System.out.print("Armut kaç kilo? : ");
        double armut=scan.nextDouble();

        System.out.print("Elma kaç kilo? : ");
        double elma=scan.nextDouble();

        System.out.print("Domates kaç kilo? : ");
        double domates=scan.nextDouble();

        System.out.print("Muz kaç kilo? : ");
        double muz=scan.nextDouble();

        System.out.print("Palıcan kaç kilo? : ");
        double patlıcan=scan.nextDouble();

        System.out.println("Toplam Tutar: "+(domates*1.11+armut*2.14+elma*3.67+muz*0.95+patlıcan*5));

    }
}

