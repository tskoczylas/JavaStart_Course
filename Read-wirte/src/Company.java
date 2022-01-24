import java.io.Serializable;
import java.sql.SQLOutput;
import java.util.Arrays;
import java.util.Scanner;

public class Company implements Serializable {
    static int MAXWORKERS = 3;
    Employee[] employees = new Employee[MAXWORKERS];
     int currentWorkers = 0;

    void addEmployess(Employee employee) {
        if (currentWorkers < MAXWORKERS) {
            employees[currentWorkers] = employee;
            currentWorkers++;
        }
    }



}

