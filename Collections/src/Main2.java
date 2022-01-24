import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main2 {
    static int randoms = 49;
    static int howmany=6;
    public static void main(String[] args) {
        ArrayList<Integer> userNumbers=new ArrayList<>();
        Logic logic=new Logic();
        Scanner scanner = new Scanner(System.in);
        System.out.println("Wprowadz 6 liczb w zakresie 1-49");
        for (int i = 0; i < howmany; i++) {
            userNumbers.add(scanner.nextInt());
            System.out.println("Pozostało:  "+ (howmany-i-1));
        }
        ArrayList<Integer> random = new ArrayList<>();
        random =  logic.randomize(logic.generate(randoms));
        System.out.println("Twoje liczby: " + userNumbers);
        System.out.println("Wylosowane liczby: " + random.subList(0,5));


        System.out.println("Ilość wylosowań: " + logic.checkResult(random,userNumbers));



    }}
