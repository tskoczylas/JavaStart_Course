import java.util.Scanner;

public class Pizzeria {
    public static void main(String[] args) {

        System.out.println("Dostępne pizzę:");

        Pizza[] values = Pizza.values();
        for (Pizza value : values) {
            System.out.println(value.name()+"  " +value);}

            System.out.println("Wybierz pizzę: ");

            Scanner scanner= new Scanner(System.in);
            String input = scanner.nextLine();
            Pizza.valueOf(input);
        System.out.println("Twój wybót to " + input +"  "+ Pizza.valueOf(input));


        }


    }
