import user.Student;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Student pupil = new Student();

        double g1;
        double g2;
        double g3;
        String name;

        System.out.println("Enter the Student's name and he's grade from the first the to last quarter respectively");
        name = sc.nextLine();

        g1 = sc.nextDouble();
        while (g1 > 30) {
            System.out.println("The maximum grade is 30 this Quarter");
            g1 = sc.nextDouble();
        }

        g2 = sc.nextDouble();
        while (g2 > 35) {
            System.out.println("The maximum grade is 35 this Quarter");
            g2 = sc.nextDouble();
        }
        g3 = sc.nextDouble();
        while (g3 > 35) {
            System.out.println("The maximum grade is 35 this Quarter");
            g3 = sc.nextDouble();
        }

        pupil.Grade1 = g1;
        pupil.Grade2 = g2;
        pupil.Grade3 = g3;

        pupil.Average();

        sc.close();


    }
}