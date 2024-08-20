public class Book {
    private int bookId;
    private String title;
    private int year;
    private int authorId;

    public Book(int bookId, String title, int year, int authorId) {
        this.bookId = bookId;
        this.title = title;
        this.year = year;
        this.authorId = authorId;
    }

    public int getBookId() {
        return bookId;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public int getAuthorId() {
        return authorId;
    }

    // Setters
    public void setBookId(int bookId) {
        this.bookId = bookId;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setAuthorId(int authorId) {
        this.authorId = authorId;
    }
}