import java.util.Scanner;

public class Patient {
    private Scanner scanner=new Scanner(System.in);
    private String firstName;
    private String secoundName;
    private String pesel;

    public Patient() {

    }


    public Scanner getScanner() {
        return scanner;
    }

    public void setScanner(Scanner scanner) {
        this.scanner = scanner;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getSecoundName() {
        return secoundName;
    }

    public void setSecoundName(String secoundName) {
        this.secoundName = secoundName;
    }

    public String getPesel() {
        return pesel;
    }

    public void setPesel(String pesel) {
        this.pesel = pesel;
    }

    public Patient(Scanner scanner, String firstName, String secoundName, String pesel) {
        this.scanner = scanner;
        this.firstName = firstName;
        this.secoundName = secoundName;
        this.pesel = pesel;
    }
}

