import java.util.Scanner;

public class University {
    public static int HowManyStudents;

    public static void main(String[] args) {

        Student student = new Student();
        Scanner scanner = new Scanner(System.in);
        final int studentsMax = 10;


        for (int i = 0; i < studentsMax; i++) {

            System.out.println("Dodaj studenta");
            System.out.println("Imię");
            student.setName(scanner.nextLine());
            System.out.println("Nazwisko");
            student.setSurname(scanner.nextLine());
            System.out.println("Numer indeksu");
            student.setIndexNumber(scanner.nextLine());
            HowManyStudents++;
            if (HowManyStudents >= 2) {
                System.out.println("Ilość studentów w bazie");
                System.out.println(HowManyStudents);
            }


        }
    }
}