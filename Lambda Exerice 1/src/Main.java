import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Main {
    static int APTONUMBERS = 10;
    public static void main(String[] args) {
        Random random = new Random();
        List<Integer> randomList = new ArrayList<>();
       generateRandomList(randomList,APTONUMBERS,()->random.nextInt(100));
       consume(randomList,r-> System.out.print(r + " " ));
       predictate(randomList,r->r%2!=0);
        System.out.println();
        consume(randomList,r-> System.out.print(r + " " ));





    }

    static <T> void  predictate(List<T> list, Predicate<T> predicate){
        Iterator<T> it = list.iterator();
        while (it.hasNext()){
            if( predicate.test(it.next()))
            {  it.remove();}
        }
    }

    static <T> void consume (List<T> list, Consumer<T> consumer){
        for (T t : list) {
            consumer.accept(t);

        }
    }

    static <T> void generateRandomList(List<T> list, int numbers, Supplier<T> supplier) {
        for (int i = 0; i < numbers ; i++) {
            list.add(supplier.get()); }

    }


}
