import com.sun.xml.internal.bind.v2.runtime.output.FastInfosetStreamWriterOutput;

import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.TreeMap;

public class CompanyApp {

   final static int add=0;
    final static int  search = 1;
    final static int end = 2;

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        Company company = new Company();
int intro = -2;

    do {
        try {
        switch (intro = company.introduction(scanner)) {

            case 0: {
                Employee workers = company.addEmployee(scanner);
                company.map.put(new Employee(workers.getName(), workers.getSurname()), new Employee(workers.getName(), workers.getSurname(), workers.getPayment()));
                break;
            }
            case search: {
                System.out.println(company.map.get(company.search(scanner)));
                break;
            }
            case end: {
                for (Employee value : company.map.values()) {
                    System.out.println(value);
                }
                break;
            }
        }}

    catch(InputMismatchException s){
            System.out.println("Nieproprawny format");
            scanner.nextLine();
        }
    }

    while (intro != end);
}

    }
