import java.util.Arrays;

public class PersonDatabase {
    Person person = new Person();
    static int MaxPersons = 10;
    private int currentRecords = 0;
    private int firstRecord = MaxPersons;
    Person[] peoples = new Person[MaxPersons];
    private Person[] newpeoples = new Person[peoples.length * 2];
    private Person[] newpeoples2 = new Person[peoples.length * 2];


    public void addPerson(Person person) {
        if (person.equals(null)) throw new NullPointerException();
        if (MaxPersons > currentRecords) {
            peoples[currentRecords] = person;
            currentRecords++;
        } else if (MaxPersons == currentRecords) {
            System.arraycopy(peoples, 0, newpeoples, 0, peoples.length);
            newpeoples[firstRecord] = person;
            firstRecord++;
            peoples = newpeoples;
        }


    }

    public void remove(Person person1) {
        for (int i = 0; i < peoples.length-1; i++) {

        if (peoples[i].equals(person1)) {
            System.arraycopy(newpeoples, i, newpeoples2, i-1, 1);
            //System.arraycopy(newpeoples, 0, newpeoples2, 0, i-1);
          //  System.arraycopy(newpeoples, i+1, newpeoples2, i, peoples.length-i-1);



        }

        }
        peoples = newpeoples2;

    }
   public Person get(int index){
        Person person1=peoples[index-1];
        return person1;
    }
    public int size() {
        if(firstRecord>=currentRecords&&currentRecords==MaxPersons)
        {return firstRecord;}
        else
        {return currentRecords;}


    }}
