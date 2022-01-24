import java.util.Scanner;

public class ShopApp {
    public static void main(String[] args) {
        o
        textInput();




    }

    public static void Orders() {
        Order order[] = new Order[5];
        order[0] = (new Order("Samsung S10", 2310, Status.DELIVERED));
        order[1] = (new Order("Lenovo LKNK0", 3219, Status.SHIPPED));
        order[2] = (new Order("Asus s50", 2130, Status.NEW));
        order[3] = (new Order("Acer s50", 3413, Status.SHIPPED));
        order[4] = (new Order("Surface s50", 5775, Status.DELIVERED));
    }

    public static void textInput() {
        System.out.println("Podaj status zamówień do wyświetlenia (NEW PAID SHIPPED DELIVERED CANCELLED )");
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
    }

    public static void findOrder(Order[] order, String input) {
        for (int i = 0; i < order.length; i++) {
            if (order[i].getStatus() == Status.valueOf(input)) {
                System.out.println(order[i]);
            } else {
            }
        }
    }
}




