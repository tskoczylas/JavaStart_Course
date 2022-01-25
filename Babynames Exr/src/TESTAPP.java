import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class TESTAPP {
    static String[] getFile() throws FileNotFoundException {
        Scanner scanner = new Scanner(new File("1.txt"));
        String[] randoms = null;
        while (scanner.hasNext()) {
            randoms = scanner.nextLine().split(" ");
        }
        return randoms;
    }
    static String randomSentence (String[] array){
        Random random = new Random();
        String randomtext= array[random.nextInt(array.length)];


        return randomtext;
    }
    public static void main(String[] args) throws FileNotFoundException {

        System.out.println(randomSentence(getFile()));



    }
}
