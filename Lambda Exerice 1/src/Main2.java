import java.util.*;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main2 {
    static int LOTERYNUMBERS= 10;

    public static void main(String[] args) {


        Random random = new Random();
        int x=5;
        List<Integer> list = new ArrayList<>();
        supply(LOTERYNUMBERS,list,()-> random.nextInt(100));
        consume(list,r-> System.out.print(r + " "));
        predicate(list,r->r%2==0);
        System.out.println(" ");
        consume(list,r-> System.out.print(r + " "));





    }
    static  <T> void supply  (int lotteryNumbers, List<T> list, Supplier<T> supplier) {
        for (int i = 0; i <lotteryNumbers ; i++) {
            list.add(supplier.get()); } }

    static <T> void consume (List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);
        }
    }
    static <T> void predicate (List<T> list, Predicate<T> predicate){
        list.removeIf(predicate);

    }

}
