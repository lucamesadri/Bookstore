import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class CreateTables {
    private static final String URL = "jdbc:sqlite:bookstore.db";

    public void createTables() {
        try (Connection con = DriverManager.getConnection(URL)) {
            if (con != null) {
                Statement stmt = con.createStatement();
                String sqlAuthor = """
                    CREATE TABLE IF NOT EXISTS author (
                        author_id INTEGER PRIMARY KEY AUTOINCREMENT,
                        name TEXT NOT NULL,
                        nationality TEXT
                    )
                    """;
                stmt.execute(sqlAuthor);

                String sqlBook = """
                    CREATE TABLE IF NOT EXISTS book (
                        book_id INTEGER PRIMARY KEY AUTOINCREMENT,
                        title TEXT NOT NULL,
                        year INTEGER,
                        author_id INTEGER,
                        FOREIGN KEY (author_id) REFERENCES author(author_id)
                    )
                    """;
                stmt.execute(sqlBook);

                System.out.println("Tables created successfully!");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}