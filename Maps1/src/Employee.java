import java.util.Objects;

public class Employee {
    String name;
    String surname;
    int payment;

    public Employee(String name, String surname) {
        this.name = name;
        this.surname = surname;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Employee employee = (Employee) o;
        return payment == employee.payment &&
                Objects.equals(name, employee.name) &&
                Objects.equals(surname, employee.surname);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, surname, payment);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    public Employee(String name, String surname, int payment) {
        this.name = name;
        this.surname = surname;
        this.payment = payment;
    }

    public Employee() {
    }

    @Override
    public String toString() {
        return
                "Imię:  " + name + " " +
                "Nazwisko:  " + surname  + " " +
                "Płatność:  " + payment;
    }
}
