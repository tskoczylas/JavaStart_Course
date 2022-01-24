import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class Test {
    public static void main(String[] args) {


    String surce = "        DAK        ";
        Function<String,String> func = s -> s.toLowerCase().trim();
        String result = func.apply(surce);
        System.out.println(result);

        Consumer<String> con = s -> {System.out.println(s); System.out.println(s); System.out.println(s);};
        con.accept(func.apply(surce));

        Predicate<Integer> cheakAge= x -> x>=18;
        System.out.println(cheakAge.test(30));

        }




}
