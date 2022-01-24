import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

class PersonOperators {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Jan", "Kowalski", 42));
        people.add(new Person("Kasia", "Kruczkowska", 22));
        people.add(new Person("Piotr", "Adamiak", 15));
        people.add(new Person("Jan", "Zawadzki", 17));
        people.add(new Person("Krzysztof", "Wojtyniak", 16));
        people.add(new Person("Agnieszka", "Zagumna", 18));
        people.add(new Person("Basia", "Cyniczna", 28));
        System.out.println("Cała lista");
      consumeList(people,p -> System.out.println(p));
      consumeList(people,p -> p.setAge(p.getAge()+1));
        System.out.println("+1");
        consumeList(people,person -> System.out.println(person));
        System.out.println("Imie Jan");
        List<Person> JanPerson = filterAdults(people,p->"Jan".equals(p.getFirstName()));
        consumeList(JanPerson,person -> System.out.println(person));
        System.out.println("Po 18");
        List<Person> adultsPerson = filterAdults(people,p->p.getAge()>=18);
        consumeList(adultsPerson,person -> System.out.println(person));
        List<String> firstNames=convertList(people,person -> person.getFirstName());
        consumeList(firstNames,p-> System.out.println(p));



    }


    private static <T> List<T> filterAdults(List<T> people, Predicate<T> predicate) {
        List<T> result = new ArrayList<>();
        for (T person : people) {
            if (predicate.test(person)){
                result.add(person);
            }
        }
        return result;
    }
    private static <T> void consumeList(List<T>list, Consumer<T> consumer)
    {
        for (T t : list) {
            consumer.accept(t);

    }

    }
    private static <T, R> List<R> convertList(List<T> list, Function<T, R> function) {
        List<R> resultList = new ArrayList<>();
        for (T t : list) {
            R result = function.apply(t);
            resultList.add(result);
        }
        return resultList;
    }
}