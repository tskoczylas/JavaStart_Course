import java.util.InputMismatchException;
import java.util.LinkedHashSet;
import java.util.Scanner;

public class BaseApp {
    final static int run =0;
    final static int end =1;
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        LinkedHashSet<Products> link = new LinkedHashSet<>();
        int option=-1;

        while (option!=end) {
            try {
                option = getOption(scanner);

                switch (option) {
                    case run: {
                        Products products = newProudct(scanner);
                        if (link.contains(products)) {
                            repleceProducts(scanner, link, products);
                        } else {
                            link.add(products);
                            System.out.println("Zapisano do bazy");
                        }
                    }
                    break;

                    case end: {
                        System.out.println(link);
                    }
                    break;

                }
            }
            catch (InputMismatchException h){
                System.out.println("Niepoprawny wybór");
                scanner.nextLine();
            }
        }

    }

    private static void repleceProducts(Scanner scanner, LinkedHashSet<Products> link, Products products) {
        System.out.println("Masz już ten produkt");
        System.out.println("Zastąp produkt - 0" + "\n" + "Nie zachowój produkt - 1");
        int choice = scanner.nextInt();
        scanner.nextLine();
        switch (choice) {
            case 0: {
                link.remove(products);
                link.add(products);
                System.out.println("Zastąpiono rekord");

            }
            break;
            case 1: {
            }

        }
    }


        private static int getOption (Scanner scanner){
            int option;
            System.out.println("Nowy produkt - 0" + "\n" + "Koniec programu - 1");
            System.out.println("Wybierz opcje:");
            option = scanner.nextInt();
            scanner.nextLine();
            return option;
        }

        private static Products newProudct (Scanner scanner){
            System.out.println("Nazwa produktu");
            String name = scanner.nextLine();
            System.out.println("Cena");
            double price = scanner.nextDouble();
            scanner.nextLine();
            return new Products(name, price);
        }
        //  private static LinkedHashSet<Products> hasProduct()
    }
