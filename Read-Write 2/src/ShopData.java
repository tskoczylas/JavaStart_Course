public class ShopData {
String name;
String surname;
String country;
double ammount;
int id;

    public ShopData() {
    }

    @Override
    public String toString() {
        return
                "Numer:" + " " + id + " " +
                "Imię" + " " + name + " " +
                "Nazwisko" + " " + surname + " " +
                "Kraj" + " " + country + " " +
                "Kwota" + " " + ammount ;

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

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public double getAmmount() {
        return ammount;
    }

    public void setAmmount(double ammount) {
        this.ammount = ammount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public ShopData(String name, String surname, String country, double ammount, int id) {
        this.name = name;
        this.surname = surname;
        this.country = country;
        this.ammount = ammount;
        this.id = id;
    }
}
