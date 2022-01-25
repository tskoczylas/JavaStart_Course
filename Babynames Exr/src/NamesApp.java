import java.io.FileNotFoundException;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class NamesApp {
    public static void main(String[] args) throws FileNotFoundException {

        String input = "names.csv";
        Reader reader = new Reader();

        Map<String, List<Integer>> stringListMap = reader.createFemeleBirthMap(input);
        Iterator<Map.Entry<String, List<Integer>>> iterator = stringListMap.entrySet().iterator();
        Map<String,Integer> summap=new HashMap<>();
        while (iterator.hasNext()){
          String s=   iterator.next().getKey();
          if(iterator.hasNext()) {
              List<Integer> value = iterator.next().getValue();
              int sum = 0;
              for (Integer integer : value) {
                  sum += integer;

              }
              summap.put(s, sum);
              // System.out.println(s + " " + sum);
          }

        }
        summap.entrySet().stream().sorted(Comparator.comparingInt(s->-s.getValue())).limit(10).forEach(System.out::println);



        //System.out.println("Top 10 imion");
        //top10names(names);
       // System.out.println("Top 10 imion żeńskich");
       //topFemeleNames2(names,10);
        //System.out.println("Top 3 liter ");
     //  printTop3NamesLetters(names);


    }
    //private static void topFemeleNames2(List<Names> names, int top) {
      //  Stream<Names> namesstream2 = names.stream();
       // if()
        //.out.println(collect2);}

    private static void topFemeleNames(List<Names> names, int top) {
        Stream<Names> namesstream2 = names.stream();
        Map<String, Long> collect2 = namesstream2.filter(n -> n.getGender().equals("FEMALE")).map(Names::getName).collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        Set<Map.Entry<String, Long>> entries = collect2.entrySet();
        entries.stream().sorted(Comparator.comparingLong(c->-c.getValue())).limit(top).forEach(System.out::println);
    }

    private static void top10names(List<Names> names) {
        Stream<Names> namesstream = names.stream();
        Map<String, Long> collect = namesstream.map(Names::getName).collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        Set<Map.Entry<String, Long>> entries = collect.entrySet();
        entries.stream().sorted(Comparator.comparingLong(c->-c.getValue())).limit(10).forEach(System.out::println);
    }

    private static void printTop3NamesLetters(List<Names> names) {
        Stream<Names> namesstream3 = names.stream();
        Map<Character, Long> collect1 = namesstream3.map(n -> n.getName().charAt(0)).collect(Collectors.groupingBy(w -> w, Collectors.counting()));
        collect1.entrySet().stream().sorted(Comparator.comparingLong(s->-s.getValue())).limit(3).forEach(System.out::println);
    }
}