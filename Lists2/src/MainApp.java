import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {

        List<Integer> list=new ArrayList<>();
     readfromConsole(list);
        System.out.println(list);
        System.out.println("suma liczb:  " +countAndDisplay(list)+"średnia z liczb:   " + avarageDisplay(list)+ "ilość liczb   " + list.size());



    }

    static void readfromConsole(List list){

        try
        {Scanner scanner= new Scanner(System.in);
            System.out.println("Wprowadz liczbę podzielną przez 5 i mniejszą od 0 ");
            int input = scanner.nextInt();

            if (input > 0 && input % 5 == 0) {
                list.add(input);
                readfromConsole(list);

            } else {
                countAndDisplay(list);
                avarageDisplay(list);
            }
        }
        catch (InputMismatchException s )
        {
            System.out.println("Nieporwany znak");
            readfromConsole(list);
        }





    }

    private static int avarageDisplay(List list) {
        return countAndDisplay(list)/list.size();

    }

    private static int countAndDisplay(List list) {
        int sum=0;
        for (int i = 0; i < list.size(); i++) {
           sum= (int) list.get(i) + sum;


        }
        return sum;
    }





    }

