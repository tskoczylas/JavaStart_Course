public class Property {
   private String city;
    private double sqm;
    private double price;

    @Override
    public String toString() {
        return "Property{" +
                "city='" + city + '\'' +
                ", sqm=" + sqm +
                ", price=" + price +
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

    public Property(String city, double sqm, double price) {
        this.city = city;
        this.sqm = sqm;
        this.price = price;
    }
}
