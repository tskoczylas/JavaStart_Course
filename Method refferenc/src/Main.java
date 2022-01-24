import java.util.*;
import java.util.function.Consumer;

public class Main {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Paweł");
        list.add("Gaweł");
        list.add("Konfacy");
        list.add("Mariusz");
        list.add("Karol");



list.sort(String::compareToIgnoreCase);
list.forEach(System.out::println);

}}
