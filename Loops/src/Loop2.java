import java.util.Scanner;

public class Loop2 {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        System.out.println("Ile liczb chcesz wprowdzić");
        int howManyNumbers = scan.nextInt();

        int sum=0;
       while(howManyNumbers>0)
       {
           sum=sum + scan.nextInt();

           howManyNumbers--;

       }
        System.out.println("Wynik to:"+ sum);
    }
}
