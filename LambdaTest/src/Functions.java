import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Functions {
    public static void main(String[] args) {
        String[] firstNames = {"Jan", "Karol", "Piotr", "Andrzej"};
        String[] lastNames = {"Abacki", "Kowalski", "Zalewski", "Korzeniewski"};
        int[] ages = {22, 33, 44, 55};
        Random random  = new Random();

        List<Person> randomPeople=new ArrayList<>();

        Supplier<Person> createPerson = () -> {
            String firstname = firstNames[random.nextInt(firstNames.length)];
            String lastname = lastNames[random.nextInt(lastNames.length)];
            int age = ages[random.nextInt(ages.length)];
            return  new Person(firstname,lastname,age);
        };


        System.out.println(createPerson.get());





    }
}
