import java.awt.*;
import java.util.*;


class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String userName, password;
        int right = 3, balance = 1500;
        int select;

        while (right > 0) {

            System.out.print("Kullanıcı Adınız: ");
            userName = scanner.nextLine();
            System.out.print("Parolanız: ");
            password = scanner.nextLine();

            boolean a = userName.equals("ceren") ? true : false;
            boolean b = password.equals("ceren123") ? true : false;


            if (a == true && b == true) {
                System.out.println("Giriş Başaryıla Sağlandı");
                do {
                    System.out.println("1-) Para Çekmek\n2-) Para Yatırmak\n3-) Bakiye Sorgulama\n4-) Çıkış");
                    System.out.print("Lütfen Yapmak İstediğiniz İşlemi Seçiniz: ");
                    select = scanner.nextInt();
                    switch (select) {
                        case 1:
                            System.out.print("Çekmek İstediğiniz Tutarı Giriniz: ");
                            int value = scanner.nextInt();
                            boolean c = value > balance ? true : false;
                            switch (c + "") {
                                case "true":
                                    System.out.println("Yetersiz Bakiye! Lütfen Tekrar Deneyiniz");
                                    break;
                                case "false":
                                    balance -= value;
                                    System.out.println("Para Çekildi, Güncel Bakiye: " + balance);
                                    break;
                            }
                            break;
                        case 2:
                            System.out.println("Yatırmak İstediğiniz Tutarı Giriniz: ");
                            int payment = scanner.nextInt();
                            balance += payment;
                            System.out.println("Güncel Bakiyeniz: " + balance);
                            break;
                        case 3:
                            System.out.println("Güncel Bakiyeniz: " + balance);
                            break;
                    }
                } while (select != 4);
                System.out.println("Çıkış Yapıldı");
                break;
            } else {
                right--;
                if (right == 0) {
                    System.out.println("3 Defa Hatalı Giriş Yaptınız! Kartınıza El Konulmuştur, Lütfen Bankanız İle İletişime Geçin");
                } else {
                    System.out.println("Hatalı Giriş Yaptınız, Lütfen Tekrar Deneyiniz!");
                    System.out.println("Kalan Giriş Hakkınız: "+right);
                }
            }
        }
    }
}