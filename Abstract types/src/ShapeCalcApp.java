import java.util.InputMismatchException;
import java.util.NoSuchElementException;

public class ShapeCalcApp {
    public static void main(String[] args) {
       ShapeCalculator shapeCalculator=new ShapeCalculator();
       Shape shape = null;

       boolean readcomplete=false;



    while (!readcomplete) {
        try {
            printOptions();
            shape = shapeCalculator.createShape();
            readcomplete = true;
        } catch (InputMismatchException e) {
            System.out.println("Wprowadziłeś niepoprawny symbol");
        } catch (NoSuchElementException s) {
            System.out.println("Wybór poza zakresem");
        } finally {
            shapeCalculator.clearBuffer();
        }
    }

        System.out.println(shape);








            }
    private static void printOptions() {
        System.out.println("Wybierz figurę, dla której chcesz obliczyć pole i obwód");
        System.out.println(Shape.RECTANGLE + " - prostokąt");
        System.out.println(Shape.CIRCLE + " - koło");
        System.out.println(Shape.TRIANGLE + " - trójkąt");
    }
        }




