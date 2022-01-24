import java.io.File;
import java.io.FileNotFoundException;
import java.util.Comparator;
import java.util.HashSet;
import java.util.Scanner;
import java.util.TreeSet;

public class MainApp2 {
    public static void main(String[] args) throws FileNotFoundException {

        String name = "namespl.txt";
        File file = new File(name);
        int lines=0;
        TreeSet<String> h1 = new TreeSet<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return  o1.compareTo(o2);
            }
        });
        Scanner scanner;


            scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                h1.add(scanner.nextLine());
                lines++;

            }
        System.out.println(h1);
        System.out.println(h1.first());
        System.out.println(h1.size());
        System.out.println(h1.last());
        System.out.println(lines);
        System.out.println(lines-h1.size());

    }
    }
