import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.util.stream.Stream;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("1.txt"));
        Stream<String> sc = scanner.tokens();
        //getStringWithoutComaandDot(sc);
        System.out.println(countfirstLetters(sc));


    }

    private static void getStringWithoutComaandDot(Stream<String> sc) {
        sc
              .map(m->m.replace(",",""))
              .map(m->m.replace(".",""))

                .forEach(System.out::println);
    }

    private static long countfirstLetters  (Stream<String> sc) {
         return  sc
                .filter(s -> s.startsWith("s"))
                .count();

    }

    private static long cound5letters (int sentencelenght, Stream<String> sc) {
        return  sc
                .map(m->m.replace(",",""))
                .map(m->m.replace(".",""))
                .filter(m->m.length()==sentencelenght)
                .count();
    }


}
