import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) {

     IntStream.iterate(0,x->x+1)
             .filter(x -> x > 100 && x < 1000)
             .map(x->x*3)
             .filter(x -> x % 5 == 0)
             .limit(10)
             .forEach(System.out::println);
    }
}
