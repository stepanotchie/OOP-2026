public class Book{
    String title;
    String author;
    String isbn;
    String publicationDate;
    
    void printBookInfo(){
        System.out.printf("""
                Title: %s
                Author: %s
                ISBN: %s
                Publication Date: %s
                """, title, author, isbn, publicationDate);
    }

    public Book() {

    }  

    public Book(String title, String author, String isbn, String publicationDate) {
        this.title = title;
        this.author = author;
        this.isbn = isbn;
        this.publicationDate = publicationDate;
    }
}