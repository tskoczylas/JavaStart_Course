import java.sql.SQLOutput;
import java.util.Scanner;

public class Calc {


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz pierwszą liczbę");


        int firstNumber = scanner.nextInt();
        scanner.nextLine();
        System.out.println("Co chesz zrobić");
        String operationSymbol = scanner.nextLine();

        System.out.println("Wprowadz drugą liczbę");

        int secoundNumber = scanner.nextInt();
        scanner.nextLine();
        CaclLogic calc=new CaclLogic();
        boolean error=true;
        do {
        try {
            System.out.println(calc.calculator(operationSymbol,firstNumber,secoundNumber));
            error=false;
        }
        catch (UnknownOperatorException e) { System.out.println(e.getMessage()); scanner.nextLine(); }
        catch (ArithmeticException w){ System.err.println("Nie można dzielić przez 0"); scanner.nextLine(); }   }
        while (error);
        scanner.close();




    }
}
