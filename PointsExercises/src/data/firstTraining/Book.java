package data.firstTraining;

class Book {
        String title;
        String author;
        int releaseDate;
        int pages;
        String publisher;
        String isbn;

         Book(String title, String author, int releaseDate, int pages, String publisher, String isbn) {
            this(title,author,releaseDate,pages,publisher);
            this.isbn = isbn;
        }

         Book(String title, String author, int releaseDate, int pages, String publisher) {
            this.title = title;
            this.author = author;
            this.releaseDate = releaseDate;
            this.pages = pages;
            this.publisher = publisher;
        }

        void printItOut()
            {
                System.out.println(title+author+releaseDate+pages+publisher+isbn);
            }



    }