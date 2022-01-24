import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Ile liczb chcesz wprowdzić");
        int howManyNumbers = scan.nextInt();

        int sum=0;
        for (;howManyNumbers>0;howManyNumbers--)
        {
            System.out.println("Wprowadź wartości");
            sum = sum + scan.nextInt();

        }
        System.out.println("Wynik to:"+ sum);
    }
}
