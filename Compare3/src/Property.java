import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Property {
    private String city;
    private double sqm;
    private double price;

    public double getPriceForSqm() {
        return priceForSqm;
    }

    public void setPriceForSqm(double priceForSqm) {
        this.priceForSqm = priceForSqm;
    }

    private double priceForSqm;

    public Property(String city, double sqm, double price) {
        this.city = city;
        this.sqm = sqm;
        this.price = price;
        this.priceForSqm = this.price/this.sqm;
    }

    @Override
    public String toString() {
        return "Property{" +
                "city='" + city + '\'' +
                ", sqm=" + sqm +
                ", price=" + price + " cena za metr m2:   "+
                priceForSqm +
                '}';
    }

    public Property() {
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public double getSqm() {
        return sqm;
    }

    public void setSqm(double sqm) {
        this.sqm = sqm;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }


    public int lines(String name) throws FileNotFoundException {
        int lines=0;
        File file=new File(name);
        Scanner scanner = new Scanner(file);
        while (scanner.hasNextLine())
        {scanner.nextLine();
            lines++; }
        return lines;

    }

}
