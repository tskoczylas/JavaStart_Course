import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;
import java.util.stream.Collectors;

public class TeleBook {

    Set<Contact> contactsbook = new HashSet<>();
    private Scanner scanner = new Scanner(System.in);


    void addnewContact(){
        System.out.println("Podaj imię i naziwsko");
        String name = scanner.nextLine();
        System.out.println("Podaj numer telefonu ");
        String number = scanner.nextLine();
        if(!name.isEmpty()&&name!=null&&!number.isEmpty()&&number!=null)
        {contactsbook.add(new Contact(name,number));
            System.out.println("Rekord dodany ");}
        else {
            System.out.println("Nazwa ani numer telefonu nie mogą być puste");
            addnewContact();
        }
    }

    void deletecontactbyName(){
        System.out.println("Podaj nazwę kontaktu do usunięcia: ");
        String deleteString = scanner.nextLine();
        Iterator<Contact> iterator = contactsbook.iterator();
        while (iterator.hasNext()){
            Contact iteratorConctact = iterator.next();
            String name = iteratorConctact.getName();
            if (name.equals(deleteString)){
                System.out.println("Kontakt " + name + " został usunięty.");
                                iterator.remove();
        }

    }}
    
    public  Set<Contact> searchbyname( ){
        System.out.println("Podaj nazwę kontaktu do wyszukania: ");
        String name = scanner.nextLine();
        return contactsbook.stream().filter(s -> s.getName().contains(name)).collect(Collectors.toSet());
    }
    public  Set<Contact> searchbynumber(){
        System.out.println("Podaj numer kontaktu do wyszukania: ");
        String number = scanner.nextLine();
        return contactsbook.stream().filter(s ->s.getNumber().contains(number)).collect(Collectors.toSet());
    }



}
