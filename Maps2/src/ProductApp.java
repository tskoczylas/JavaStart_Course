import java.io.FileNotFoundException;
import java.util.*;

public class ProductApp {
    public static void main(String[] args) throws FileNotFoundException {
        String name = "1.txt";
        ProductsBase productsBase = new ProductsBase();
        System.out.println("Podaj nazwę do wyświetlenia satystyki");

        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        TreeSet<Products> set = productsBase.createMap(name).get(input);
        printMap(set);
        System.out.println("średnia cena: " + averegePrice(set) +"\n" +
                "najniższa cena: " + lowestset(set) + "\n" +
                "najwyższa cena " + higestset(set)
        );


    }

    private static Products higestset(TreeSet<Products> set) {
        return set.last();
    }

    private static Products lowestset(TreeSet<Products> set) {
        return set.first();
    }

    private static void printMap(TreeSet<Products> set) {
        for (Products products : set) {
            System.out.println(products);
        }
    }

    private static double averegePrice(TreeSet<Products> set) {
        double price=0;
        System.out.println("Srednia cena produktów:");
        for (Products products : set) {
           price+=products.getPrice();

        }
        return price/set.size();
    }
}

