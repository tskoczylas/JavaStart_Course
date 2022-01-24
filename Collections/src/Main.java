import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {
    static int randoms = 49;
    public static void main(String[] args) {
        ArrayList<Integer> userNumbers=new ArrayList<>();
        int result = 0;
        int howmany = 0;
        String s;
do {



    System.out.println("Wpisz dowolną ilość licz w przedziale 1-49, aby losować wpisz dowolną inną cyfrę lub liczbe");
    Scanner scanner = new Scanner(System.in);
    s = scanner.nextLine();
    if (Character.isDigit( s.charAt(0)))
    {
        userNumbers.add(Integer.parseInt(s));
    } else {}
}
        while (Character.isDigit( s.charAt(0)));



      do {





          Logic logic = new Logic();
        ArrayList<Integer> l = logic.generate(randoms);
        System.out.println(l);
        ArrayList<Integer> random = logic.randomize(l);
        System.out.println(random);
        System.out.println(userNumbers);
        result = logic.checkResult(random,userNumbers);
          System.out.println(result);
      howmany++;
      }


        while (result!=6);
      System.out.println(howmany);





}}
