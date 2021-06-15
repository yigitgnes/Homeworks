import javax.lang.model.type.NullType;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int math, phy, che, turk, his, mus;

        Scanner scan = new Scanner(System.in);

        System.out.println("Grade of the Mathematics: ");
        math = scan.nextInt();

        System.out.println("Grade of the Physics: ");
        phy = scan.nextInt();

        System.out.println("Grade of the Chemistry: ");
        che = scan.nextInt();

        System.out.println("Grade of the Turkish: ");
        turk = scan.nextInt();

        System.out.println("Grade of the History: ");
        his = scan.nextInt();

        System.out.println("Grade of the Music: ");
        mus = scan.nextInt();

        double result;
        result = (math + phy + che + mus + his + turk) / 6;
        System.out.println("Your Point Grade Average: " + result);

        String isStudentPass = result>60 ? "You Passed" : "You Failed";
        System.out.println(isStudentPass);

      /*
        // Optional boolean and switch-case bug :)

        boolean isStudentPassed = result > 60.0;

        switch (isStudentPassed + ".") {
            case "true.":

                System.out.println("Student Passed");
                break;
            case "false.":
                System.out.println("Student failed");
                break;
        }*/
    }
}