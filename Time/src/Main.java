import org.w3c.dom.ls.LSOutput;

import java.time.Duration;
import java.time.Instant;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Wciśnij ENTER aby zaczać pomiar");
        scanner.nextLine();
        Instant i1 = Instant.now();

        System.out.println("Wciśnij ENTER aby zakończyć pomiar");
        scanner.nextLine();
        Instant i2 = Instant.now();
        Duration duration = Duration.between(i1, i2);
        System.out.println(
                "Zmierzony czas to : " +
                duration.getSeconds() + "s");

}}
