
public class test {
    public static void main(String[] args) {
        int targetTemperature = 11;
        int currentTemperature = 55;

        while (targetTemperature != currentTemperature) {

            double temperatureDiff = targetTemperature - currentTemperature;
            if (temperatureDiff > 0) {
                currentTemperature += 0.5;
            } else if (temperatureDiff < 0) {
                currentTemperature -= 0.5;
            }
            System.out.println(currentTemperature);

        }
    }
}
