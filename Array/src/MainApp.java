import java.util.Arrays;

public class MainApp {
    public static void main(String[] args) {
        String  inuput= "7";
        PersonDatabase personDatabase=new PersonDatabase();
        personDatabase.addPerson(new Person("Kamil","Zarnowicz","1"));
        personDatabase.addPerson(new Person("Kamilk","Kowalskik","2"));
        personDatabase.addPerson(new Person("Wacław","Mackiewicz","3"));
        personDatabase.addPerson(new Person("Aleksander","Kowalski","4"));
        personDatabase.addPerson(new Person("Kamiljhhjh","Kowcxcalski","5"));
        personDatabase.addPerson(new Person("Wccacław","Mackiewicccz","6"));
        personDatabase.addPerson(new Person("Aleksacnder","Kowalsccki","7"));
        personDatabase.addPerson(new Person("Kamccil","Kowalscci","8"));
        personDatabase.addPerson(new Person("Wacłccaw","Mackieccwicz","9"));
        personDatabase.addPerson(new Person("Kamccil","Kowalsccki","10"));

        //System.out.println(personDatabase.get(3));
      //  System.out.println(personDatabase.size());

        System.out.println(Arrays.toString(personDatabase.peoples));
        personDatabase.remove((new Person("Aleksander","Kowalski","4")));


        System.out.println(Arrays.toString(personDatabase.peoples));





    }
}
