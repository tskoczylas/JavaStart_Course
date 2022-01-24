import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Wprowadz liczbe wyrazów: ");
      int howMany= scanner.nextInt();
        scanner.nextLine();


        String[] word = new String[howMany];
        for (int i = 0; i < word.length; i++) {
            word[i]=scanner.nextLine();
        }


        StringBuilder bulid = new StringBuilder();
        for (int i = 0; i <howMany ; i++) {
            bulid.append(word[i].charAt(word[i].length() - 1));

        }

        System.out.println(bulid.toString());

        scanner.close();


      
    }
}
