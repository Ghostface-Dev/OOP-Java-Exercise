import employee.User;
import java.util.Scanner;


public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        User name = new User();

        String nameI;
        double grossI;
        double taxI;
        double percentage;

        System.out.println("Enter the name, salary and tax respectively");

        nameI = sc.nextLine();
        grossI = sc.nextDouble();
        taxI = sc.nextDouble();

        name.Name = nameI;
        name.GrossSalary = grossI;
        name.Tax = taxI;


        name.NetSalary();

        System.out.println("Witch the percentage to increase salary? ");

        percentage = sc.nextDouble();

        name.IncreaseSalary(percentage);

        sc.close();

    }
}