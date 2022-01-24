import java.util.Scanner;

class TemperatureControl {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Podaj temperaturę aktualną:");
        double currentTemperature = input.nextInt();
        System.out.println("Podaj temperaturę docelową:");
        int targetTemperature = input.nextInt();

        while (currentTemperature != targetTemperature) {
            System.out.println("Aktualna temperatura: " + currentTemperature);
            double temperatureDiff = targetTemperature - currentTemperature;
            if (temperatureDiff > 0) {
                currentTemperature += 0.5;
            } else if (temperatureDiff < 0) {
                currentTemperature -= 0.5;
            }
        }

        System.out.println("Osiągnięto temperaturę docelową " + currentTemperature + " stopni");
    }
}