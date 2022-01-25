import java.util.Optional;
import java.util.Scanner;

class ContactApp {
    public static void main(String[] args) {
        ContactManager contactManager = ContactReader.readFile("contacts.csv.tx1t");
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj adres email do wyszukania kontaktu:");
        String email = scanner.nextLine();
       Optional<Contact> contactByEmail
        = contactManager.findByEmail(email);
        contactByEmail.ifPresentOrElse(c-> {
            contactManager.findByEmail(email);
        },()-> System.out.println("Nieznaleziony adres email"));;
        contactByEmail.ifPresent(s->System.out.println("Kontakt o wskazanym adresie email: " + contactByEmail));

    }
}