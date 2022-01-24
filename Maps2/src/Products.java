import java.util.Objects;

public class Products implements Comparable<Products> {
    String category;
    String name;
    double price;

    public Products(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Products(String category, String name, double price) {
        this.category = category;
        this.name = name;
        this.price = price;

    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public Products(String category) {
        this.category = category;
    }

    @Override
    public String toString() {
        return "Nazwa: " + name +", " +
                "Cena: " + price;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public Products() {
    }



    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Products products = (Products) o;
        return Double.compare(products.price, price) == 0 &&
                Objects.equals(category, products.category) &&
                Objects.equals(name, products.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(category, name, price);
    }

    @Override
    public int compareTo(Products o) {
        return Double.compare(this.price,o.getPrice());
    }
}
