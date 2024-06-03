package user;

public class Student {
    public String Name;
    public double Grade1;
    public double Grade2;
    public double Grade3;

    // function

    public void Average() {
        double sum = (this.Grade1 + this.Grade2 + this.Grade3);
        System.out.println("FINAL GRADE = "+ sum);

        if (sum < 60) {
            System.out.println("FAILED");
            double rest = 60 - sum;
            System.out.println("MISSING " + rest + " POINTS");
        } else {
            System.out.println("PASS");
        }

    }

}
