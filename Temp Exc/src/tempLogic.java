import com.sun.deploy.security.SelectableSecurityManager;

import java.sql.SQLOutput;
import java.util.Scanner;

public class tempLogic {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final double temperatureChange = 0.5;

        System.out.println("Wpisz początkową temperaturę");
        double currentTemperature = scanner.nextInt();
        System.out.println("Wpisz oczekiwaną temperaturę");
        double expetingTemperature = scanner.nextInt();

        if (currentTemperature > expetingTemperature)
        {       double  temperaureDifrance = currentTemperature-expetingTemperature;
        double howManyDoIt=temperaureDifrance/temperatureChange;
            System.out.println(howManyDoIt);

        for (int i = 0; i <howManyDoIt ; i++) {
            double halTemperature=  temperatureChange*i;
            double temperatureMoment = currentTemperature-halTemperature;
            System.out.println("Aktualna temperatura" + temperatureMoment);
        }
            System.out.println("Końcowa temperatura = " + expetingTemperature);
        }
         else if (currentTemperature<expetingTemperature){
            double  temperaureDifrance = expetingTemperature-currentTemperature;
            double howManyDoIt=temperaureDifrance/temperatureChange;
            System.out.println(howManyDoIt);

            for (int i = 0; i <howManyDoIt ; i++) {
                double halTemperature=  temperatureChange*i;
                double temperatureMoment = currentTemperature+halTemperature;
                System.out.println("Aktualna temperatura" + temperatureMoment);

        }
        }
        System.out.println("Końcowa temperatura = " + expetingTemperature);



    }}

