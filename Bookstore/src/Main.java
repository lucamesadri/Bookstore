import java.util.List;

public class Main {
    public static void main(String[] args) {
        CreateTables createTables = new CreateTables();
        createTables.createTables();

        AuthorDAO authorDAO = new AuthorDAO();
        BookDAO bookDAO = new BookDAO();

        Author author = new Author(0, "Tae Ha Lee", "Korean");
        authorDAO.insertAuthor(author);

        Book book = new Book(0, "The Beginning After The End", 2017, 1);
        bookDAO.insertBook(book);

        List<Author> authors = authorDAO.listAuthors();
        for (Author a : authors) {
            System.out.println("Author: " + a.getAuthorName());
        }

        List<Book> books = bookDAO.listBooksByAuthor(1);
        for (Book b : books) {
            System.out.println("Book: " + b.getTitle());
        }
    }
}