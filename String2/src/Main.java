import java.util.Scanner;
import java.util.regex.Pattern;

import static sun.plugin.cache.FileVersion.regEx;

public class Main {
    public static void main(String[] args) {
        System.out.println("Wprowadz wyraz");
Scanner scanner=new Scanner(System.in);
        StringBuilder stringBuilder=new StringBuilder();
        String input = scanner.nextLine();
        char a = input.charAt(0);
        if( Character.isUpperCase(a)) {
            String s = input.toUpperCase();
            System.out.println(s);
        }
        else if(Character.isLowerCase(a))
        {
            String s = input.toLowerCase();
            System.out.println(s);
        }
        else
        {
            System.out.println(input);
        }

}}
