import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadz wyraz");
        Scanner scanner=new Scanner(System.in);
        String input =scanner.nextLine();
        System.out.println("Największa liczba:  "  + Logic.findMax(input)  + " "
                + "Ilość cyfr:  " + Logic.countDigit(input)  + " "
                + "Ilość liter:   " + Logic.countLetters(input));








        }
}



