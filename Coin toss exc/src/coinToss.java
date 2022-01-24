import java.util.Random;
import java.util.Scanner;

public class coinToss {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int wylosowanaLiczba=random.nextInt(2);
        System.out.println(wylosowanaLiczba);
        System.out.println("Wbierz czy Reszka - wciskając 0,czy Orzeł - wciskając 1");
        int wybierzLiczbe = scanner.nextInt();
        if (wylosowanaLiczba==wybierzLiczbe)
        {
            System.out.println("Wygrałeś");
        }
        else
        {
            System.out.println("Przegrales");
        }



    }

}
