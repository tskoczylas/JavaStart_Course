import com.sun.xml.internal.ws.api.model.wsdl.WSDLOutput;

import java.sql.SQLOutput;
import java.util.Scanner;

public class HospitalApp {
    public static void main(String[] args) {
        Hospital hospital = new Hospital();
        Scanner scanner = new Scanner(System.in);
        final int exit = 0;
        final int addPatient = 1;
        final int printPatient = 2;
        int option = -1;

        while (option != exit) {
            System.out.println("Dostępne opcje");
            System.out.println("Wyjście z programu:     " + exit);
            System.out.println("Dodanie nowego pacienta:      " + addPatient);
            System.out.println("Wyświetlenie listy pacientow :    " + printPatient);

            System.out.println("Dostępne opcje");
            option = scanner.nextInt();
            scanner.nextLine();

            switch (option) {
                case exit: {
                    break;
                }


                case addPatient: {
                    Patient patient=new Patient();
                    System.out.println("Imię: ");
                    patient.setFirstName(scanner.nextLine());
                    System.out.println("Nazwisko: ");
                    patient.setSecoundName(scanner.nextLine());
                    System.out.println("PESEL: ");
                    patient.setPesel(scanner.nextLine());
                    hospital.addPatient(patient);
                    break;


                }
                case (printPatient): {
                    hospital.printPatients();
                    break;

                }
                default:
                    System.out.println("Zła opcja, wybierz ponownie");
                    break;

            }

        }
        scanner.close();
    }
}
