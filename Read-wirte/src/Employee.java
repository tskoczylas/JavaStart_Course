public class Employee extends Person {
    private int payment;

    public Employee(String name, String surname, int payment) {
        super(name, surname);
        this.payment = payment;
    }



    public int getPayment() {
        return payment;
    }

    public void setPayment(int payment) {
        this.payment = payment;
    }

    @Override
    public String toString()
    {
        return "Wypłata:   " + payment + " " + "Imię i nazwisko:  " + getName() +" "+ getSurname();
    }
}
