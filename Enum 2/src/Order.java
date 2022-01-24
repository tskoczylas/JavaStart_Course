import java.util.Objects;

public class Order {
    private  String order;
    private int price;
    private Status status;


    public Order(String  order, int price, Status status) {
        this.price = price;
        this.order = order;
        this.status=status;
    }

    public Order() {
    }

    public String getOrder() {
        return order;
    }

    public void setOrder(String order) {
        this.order = order;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Order order = (Order) o;
        return status == order.status;
    }

    @Override
    public int hashCode() {
        return Objects.hash(status);
    }

    @Override
    public String toString() {
        return
                "Produkt:  " + order + '\'' +
                "Cena:  " + price +
                ", Status :  " + status.description +
                '}';
    }
}
