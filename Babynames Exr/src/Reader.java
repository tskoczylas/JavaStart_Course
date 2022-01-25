import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Stream;

public class Reader {
    Map<String,List<Integer>> createFemeleBirthMap (String input) throws FileNotFoundException {
        int sum = 0;
        Map<String,List<Integer>> map = new HashMap<>();
        Scanner scanner = new Scanner(new File(input));
        while (scanner.hasNextLine()) {
            String csv = scanner.nextLine();
            String[] split = csv.split(",");
            String gender = split[1];
            String names = split[3].toUpperCase();
            int count = Integer.parseInt(split[4]);

            if(map.containsKey(names) ){

                map.get(names).add(count);

            }

            else {List<Integer> list = new ArrayList<>();
                list.add(count);

                map.put(names,list);}
        }
        return map;

    }
    Map<String,List<Integer>> createbirthMap (String input) throws FileNotFoundException {
        int sum = 0;
        Map<String,List<Integer>> map = new HashMap<>();
        Scanner scanner = new Scanner(new File(input));
        while (scanner.hasNextLine()) {
            String csv = scanner.nextLine();
            String[] split = csv.split(",");
            String gender = split[2];
            String names = split[3].toUpperCase();
            int count = Integer.parseInt(split[4]);
            if(map.containsKey(names)){

                map.get(names).add(count);

            }

            else {List<Integer> list = new ArrayList<>();
            list.add(count);

                map.put(names,list);}
}
        return map;

    }




}


