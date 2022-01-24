import java.util.*;

public class Company {
    HashMap<Employee,Employee> map = new HashMap<>();

    public int introduction(Scanner scanner){
        System.out.println("Witaj 0 - dodanie pracownika do bazy  ");
        System.out.println("Witaj 1 -szukaj informacji o pracowniku ");
        System.out.println("Witaj 2 -wyjdz z progrmau ");
        int input = scanner.nextInt();
        scanner.nextLine();
        return  input;
    }

    public Employee search(Scanner scanner){
        System.out.println("Wporwadz szukane imię: ");
        String name = scanner.nextLine();
        System.out.println("Wporwadz szukane nazwisko: ");
        String surnane = scanner.nextLine();
        return new Employee(name,surnane);

    }

    public Employee addEmployee(Scanner scanner){
        System.out.println("Wporwadz imię:  ");
         String name = scanner.nextLine();
        System.out.println("Wporwadz nazwisko:  ");
         String surnane = scanner.nextLine();
        System.out.println("Wporwadz płatność:  ");
        int payment = scanner.nextInt();
        scanner.nextLine();
        return new Employee(name,surnane,payment);

    }




}
