public class Person
{
    private String name;
    private String surname;
    private int sallary;

    public Person(String name, String surname, int sallary) {
        this.name = name;
        this.surname = surname;
        this.sallary = sallary;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public int getSallary() {
        return sallary;
    }
    public String getInfo() {
        return "Imię: " + name + ", Nazwisko: " + surname + ", Wypłata " + sallary;
    }
}
