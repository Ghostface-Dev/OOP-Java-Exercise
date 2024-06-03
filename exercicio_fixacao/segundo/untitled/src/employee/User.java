package employee;

public class User {
    public String Name;
    public double GrossSalary;
    public double Tax;

    // function

    public double NetSalary() {
        double netSalary;

        netSalary = this.GrossSalary - this.Tax;

        System.out.printf("%s, $ %.2f%n", this.Name, netSalary);

        return netSalary;
    };

    public void IncreaseSalary(double percentage) {
        double calc = this.GrossSalary * (percentage/100);
        double newSalary = NetSalary() + calc;

        System.out.printf("Updated data: %s, %.2f",this.Name, newSalary);
    }

}
