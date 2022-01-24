import java.util.Scanner;

public class NotebookShop {
    static int HOWMANYINPUT=6;

    public static void main(String[] args) {

        DataStore dataStore = new DataStore();

        System.out.println("Wprowadz komputery" + "/n");
        Scanner scanner=new Scanner(System.in);
        String producerInput=scanner.nextLine();
        int modelInuput=scanner.nextInt();

        for (int i = 0; i < HOWMANYINPUT ; i++) {
            System.out.println("Wprowadz Producenta i Numer seryjny:");
        dataStore.addComputer(new Computer(producerInput,modelInuput));}

        dataStore.getInfo();
        System.out.println(dataStore.checkAvailability(dataStore));



    }
}
