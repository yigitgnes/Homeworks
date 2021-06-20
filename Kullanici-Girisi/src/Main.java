import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Kullanıcı Adınız: ");
        String userName = scanner.nextLine();

        System.out.print("Şifreniz: ");
        String password = scanner.nextLine();

        switch (userName) {
            case "patika":
                switch (password) {
                    case "java123":
                        System.out.println("Giriş Yaptınız !");
                        break;
                    default:
                        System.out.println("Hatalı Giriş !");
                }
                break;
            default:
                System.out.println("Hatalı Giriş !");

        }

        if (userName != "patika" || password != "java123") {
            System.out.println("Yeni şifre oluşturmak ister misiniz?");
            System.out.println("Evet için - 1 \nHayır için - 2");
            int a = scanner.nextInt();
            if (a == 1) {

                System.out.print("Yeni Şifrenizi Giriniz: ");
                String newPassword = scanner.next();

                if (newPassword.equals(password)) {
                    System.out.println("Şifre oluşturulamadı: Lütfen Başka Bir Şifre Giriniz !");
                } else if (newPassword.equals("java123")) {
                    System.out.println("Şifre Oluşturulamadı: Yeni Şifreniz Eskisiyle Aynı Olamaz !");
                } else System.out.println("Yeni Şifre Başarıyla Oluşturuldu!\nSiteyi Yenileyip Giriş Yapınız");
            } else if (a == 2) {
                System.out.println("Çıkış Yapılıyor...");
            }else System.out.println("Hata: Geçersiz Seçim Yapıldı !");
        }
    }
}// Changes