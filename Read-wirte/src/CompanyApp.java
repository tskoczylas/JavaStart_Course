import com.sun.media.jfxmediaimpl.HostUtils;

import java.io.*;
import java.util.Scanner;

public class CompanyApp {
    public final static int READ_INPUT=1;
    public final static int WRITE_INPUT=0;


    public static void main(String[] args) throws IOException, ClassNotFoundException {


        Company company=new Company();


        switch (getInput()) {
            case WRITE_INPUT:
            {company.addEmployess(readFromConsol());
                company.addEmployess(readFromConsol());
                company.addEmployess(readFromConsol());
                writeToFile(company);}
                break;
            case READ_INPUT:
            { Company company1=readFromFile();
                for (Employee employee : company1.employees) {
                    System.out.println(employee);}}
                    break;

        }



        }

    private static int getInput() {
        System.out.println("Wprowadz opcje 0 - WPISZ DO PLIKU - 1 - ODCZYTAJ Z PLIKU");
        Scanner sr=new Scanner(System.in);
        int input = sr.nextInt();
        sr.nextLine();
        return input;
    }


    public static Company readFromFile() throws IOException, ClassNotFoundException {
        String fileName="person.obj";
        try(
        FileInputStream fi = new FileInputStream(fileName);
        ObjectInputStream ob = new ObjectInputStream(fi);)
        {
        return (Company)ob.readObject();

        }

    }

    private static void writeToFile(Company company) {
        String fileName="person.obj";
        try (
                FileOutputStream fos = new FileOutputStream(fileName);
                ObjectOutputStream ous = new ObjectOutputStream(fos);)
        {ous.writeObject(company);
            System.out.println("Zapisano do pliku");
        } catch (IOException e) {
            System.out.println("Błąd zapisu");
            e.printStackTrace();
        }
    }


    public static void closeScanner(){
        Scanner sc=new Scanner(System.in);

        sc.close();
    }

    public static Employee readFromConsol()

    {               Scanner sc=new Scanner(System.in);

        Employee employee = null;
        System.out.println("Wproadz imię");
        String name = sc.nextLine();
        System.out.println("Wproadz naziwsko");
        String surname = sc.nextLine();
        System.out.println("Wprowadz kwotę");
        int payment = sc.nextInt();
        sc.nextLine();

        return new Employee(name, surname, payment);
    }

}
