package data.firstTraining;

class Library {
        public static void main(String[] args) {
            final String appName = "Biblioteka v0.2";

            Book book1 = new Book("W pustyni i w puszczy","Henryk Sienkiewicz",2010,296,"Greg","9788373271890");
            Book book2 = new Book("Zacmienie","Lynchz",2012,333,"Adol","98837749938388");
            Book book3 = new Book("Uspienie","Korwin",2011,123,"Amol");

            book1.printItOut();
            book2.printItOut();
            book3.printItOut();
        }
    }
