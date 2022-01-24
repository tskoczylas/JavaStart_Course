import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;

class EmailManager {
    public static void main(String[] args) {
        Email email=new Email();
        List<Email> emailList = createEmailList();
        //tylko wysłane emaile

        List<Email> sentEmails = filter(emailList,p->p.isSent());
        //filtrowanie maili, w których nadawca lub odbiorca ma wskazany adres email
        List<Email> bartEmails =filter(emailList,e->(e.getSender().equals("bart@example.com") || e.getRecipient().equals("bart@example.com")));
        System.out.println(bartEmails);

    }



    private static<T> List<T> filter (List<T> list, Predicate<T> predicate) {
        List<T> result = new ArrayList();
        for (T t : list) {
            if (predicate.test(t)) {
                result.add(t);
            }
        }
        return result;

    }


    private static List<Email> createEmailList() {
        List<Email> emails = new ArrayList<>();
        emails.add(new Email(
                "joe@example.com",
                "barbara@example.com",
                "Kup bułki",
                "Cześć!, Kup proszę bułki, gdy będziesz wracać z pracy.",
                false)
        );
        emails.add(new Email(
                "carl@example.com",
                "joe@example.com",
                "Nowa inwestycja",
                "Siema! Musimy omówić temat nowej inwestycji, pasuje Ci jutro?",
                true)
        );
        emails.add(new Email(
                "joe@example.com",
                "bart@example.com",
                "Wypad na miasto",
                "Cześć. Idziemy dzisiaj wieczorem z chłopakami na miasto. Dołączasz do nas?",
                true)
        );
        return emails;
    }
}