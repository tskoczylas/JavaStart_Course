import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Scanner;

public class MainApp {
    public static void main(String[] args) {


        String name = "namespl.txt";
        HashSet<String> h1=new HashSet<>();
        readfromFile(name);

    }
    static  HashSet<String> readfromFile(String name){
        File file = new File(name);
        HashSet<String> h1=new HashSet<>();
        Scanner scanner;
        int lines = 0;

        try
        {scanner = new Scanner(file);
            while (scanner.hasNextLine()) {
                h1.add(scanner.nextLine());
                lines++;
                 return h1;

            }


        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return h1;


    }
}


