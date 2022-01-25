import java.nio.charset.IllegalCharsetNameException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Main7 {
    public static void main(String[] args) {
        Integer[] tab2 = {5,6,8,4,3,2,1};
        Integer[] tab={3,4,5,6,7,11,8,10};
        List<Integer> list = Arrays.asList(tab);
        int sumless = list.stream().mapToInt(i-> i).sum();

        int min = list.stream().min(Integer::compareTo).get();
        int max = list.stream().max(Integer::compareTo).get();
        int sum=0;
        for (int i = min; i <=max ; i++) {
            sum+=i;
        }
        System.out.println(sum-sumless);




        }




    }

