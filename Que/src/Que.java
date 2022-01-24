import java.util.*;

public class Que {

    public static void main(String[] args) {
        Queue<Task> que=new PriorityQueue<>(new Comparator<Task>() {
            @Override
            public int compare(Task o1, Task o2) {
                return  -Integer.compare(o1.getPiority().getPiority(),o2.getPiority().getPiority());
            }
        });
        Scanner scanner = new Scanner(System.in);
        int input =0;

    do {
        System.out.println("Wybierz opcje: \n 0 - dodaj 1- kolejne zadanie o najwyższym piorytecie \n 2  - wyjście");
         input =  scanner.nextInt();
        scanner.nextLine();

    switch (input) {
        case: Que.
            addtoQUE(que, scanner);
            break;
        case Piority.CHEAKPIORITY:
        System.out.println("Najpilniejsze zadanie to " + que.poll());
        break;
        case Piority.EXIT:
            for (Task task : que) {
                System.out.println(task);

            }


            }
        }
while (input!=Piority.EXIT);




    }
     static enum Option{
        ADD("Dodaj nowe zadanie",0),
        TAKE("Wyświetl zadania do wykoania",1),
        EXIT("Wyjście",2);

        String destription;
        int input;

        Option(String destription, int input) {
            this.destription = destription;
            this.input = input;
        }
    }

    private static void addtoQUE(Queue<Task> que, Scanner scanner) {
        System.out.println("Nazwa zadania");
        String name = scanner.nextLine();
        System.out.println("Opis");
        String destription = scanner.nextLine();
        System.out.println("Wybierz piorytet - LOW, MODERATE, HIGHT");
        String piority = scanner.nextLine();
        Piority.valueOf(piority);

        que.add(new Task(name,destription,Piority.valueOf(piority)));
    }


}
