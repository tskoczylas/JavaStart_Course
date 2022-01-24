import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.MatchResult;
import java.util.regex.Matcher;

public class Main  {
    public static void main(String[] args) {
        int count=0;
        ArrayList<Integer> list = new ArrayList<>();
        int a=0;
        System.out.println("Wpisz liczby które chcesz dodać, gdy chcesz zakończyć i je sumować prowadz Exit");
        do {
            Scanner scanner = new Scanner(System.in);
            String input = scanner.nextLine();
            try {
                if (input.equals("Exit")) {
                    for (int i = 0; i < list.size(); i++) {
                        a = list.get(i) + a;
                    }
                    System.out.println(a);
                    count++;
                } else {
                    list.add(Integer.parseInt(input));
                }
            }
            catch ( NumberFormatException s)
            {System.out.println("Wpisałeś nieporawną liczbę");}




        }
    while (count!=1);

    }}
