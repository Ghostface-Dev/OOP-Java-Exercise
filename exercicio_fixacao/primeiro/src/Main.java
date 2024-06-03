import java.awt.geom.Area;
import java.util.Scanner;
import retangulo.Rectangle;

public class Main {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Rectangle Area = new Rectangle();
        Rectangle Perimeter = new Rectangle();
        Rectangle Diagonal = new Rectangle();

        Rectangle widthRec = new Rectangle();
        Rectangle heigthRec = new Rectangle();

        double w;
        double h;

        System.out.println("Enter rectangule width and heigth respectively: ");

        w = sc.nextDouble();
        h = sc.nextDouble();

        widthRec.width = w;
        heigthRec.height = h;

        Area.Area(widthRec, heigthRec);
        Rectangle.Perimeter(widthRec, heigthRec);

        Rectangle.Diagonal(widthRec, heigthRec);


        sc.close();

    }
}