import java.util.Arrays;
import java.util.Comparator;

public class NewMain {
    public static void main(String[] args) {
        Integer[] digit={2,3,6,87,8,93,1,4,5,7,8,4,3,79,0,654,3};

        Arrays.sort(digit, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                if (o1>o2)  return -1;
                if(o2>o1) return 1;
                return 0;
            }
        });


        System.out.println(Arrays.toString(digit));
    }
}
