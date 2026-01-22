public class Main {
    public static void main(String[] args) {
        Book book1 = new Book();
        book1.title = "The Lord Of The Rings";
        book1.author = "J.R.R Tolkien";
        book1.isbn = "978-054-400-341-5";
        book1.publicationDate = "August 14, 2012";

        Book book2 = new Book();
        book2.title = "He's Into Her Season 1";
        book2.author = "Maxinejiji";
        book2.isbn = "978-971-401-356-2";
        book2.publicationDate = "February 2014";

        System.out.println("\nFAVORITE BOOKS\n\nBook1: ");
        book1.printBookInfo();
        System.out.println("\nBook2: ");
        book2.printBookInfo();

        Book Book3 = new Book("The Alchemist", "Paulo Coelho", "978-006-112-241-5 ", "1988");
        Book Book4 = new Book("Queen of Crime", "Agatha Christie", "978-280-800-515-9", "February 7, 2018");

        System.out.println("\nBook3: ");
        Book3.printBookInfo();
        System.out.println("\nBook4: ");
        Book4.printBookInfo();
    }
}
