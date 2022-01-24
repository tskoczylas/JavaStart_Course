import java.util.Scanner;

public class carApp {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);



         Car car=new Car(3,true,false,false,true);

        System.out.println(car.start());

    }

}
