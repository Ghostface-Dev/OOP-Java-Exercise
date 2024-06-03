package retangulo;

public class Rectangle {
    public double width;
    public double height;

    // function

    public double Area(Rectangle x, Rectangle y) {
        double area;

        area = x.width * y.height;

        System.out.printf("AREA = %.2f%n", area);

        return area;
    };

    public static double Perimeter(Rectangle x, Rectangle y) {

        double perimeter;

        perimeter = 2*(x.width + y.height);

        System.out.printf("PERIMETER = %.2f%n", perimeter);

        return perimeter;
    };

    public static double Diagonal(Rectangle x, Rectangle y) {
        double diagonal;

        diagonal = Math.sqrt((x.width * x.width) + (y.height* y.height));

        System.out.printf("DIAGONAL = %.2f", diagonal);

        return diagonal;
    };

}
