import java.util.NoSuchElementException;
import java.util.Scanner;

public class ShapeCalculator {
    Scanner sc = new Scanner(System.in);

    void closeScaner() {
        sc.close();
    }

    private Triangle readTriangle() {
        System.out.println("Podaj informacje o trójkat.");
        System.out.println("Podaj długość boku A:");
        double a = sc.nextDouble();
        System.out.println("Podaj długość boku B:");
        double b = sc.nextDouble();
        System.out.println("Podaj długość boku C:");
        double c = sc.nextDouble();
        System.out.println("Podaj wysokość:");
        double h = sc.nextDouble();

        return new Triangle(a, b, c, h);
    }

    private Rectangle readRectangle(){
        System.out.println("Podaj informacje o prostokącie.");
        System.out.println("Podaj długość boku A:");
        double a = sc.nextDouble();
        System.out.println("Podaj długość boku B:");
        double b = sc.nextDouble();
        return new Rectangle(a,b); }

        private Circle readCicle()
        {  System.out.println("Podaj informacje o kole.");
            System.out.println("Podaj promień:");
            double r = sc.nextDouble();
           return new Circle(r);
        }

        public Shape createShape() {
            int shapeType = sc.nextInt();
            switch (shapeType) {
                case Shape.RECTANGLE:
                    return readRectangle();
                case Shape.CIRCLE:
                    return readCicle();
                case Shape.TRIANGLE:
                    return readTriangle();
                default:
                    throw new NoSuchElementException();
            }

        }
public void clearBuffer(){
        sc.nextLine();
}
}


