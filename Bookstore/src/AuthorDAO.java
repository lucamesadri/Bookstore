import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AuthorDAO {
    private Connection connection;

    public AuthorDAO() {
        this.connection = DatabaseConnection.getInstance().getConnection();
    }

    public void insertAuthor(Author author) {
        String sql = "INSERT INTO author (name, nationality) VALUES (?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, author.getAuthorName());
            stmt.setString(2, author.getAuthorNationality());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Author> listAuthors() {
        List<Author> authors = new ArrayList<>();
        String sql = "SELECT * FROM author";
        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Author author = new Author(
                        rs.getInt("author_id"),
                        rs.getString("name"),
                        rs.getString("nationality")
                );
                authors.add(author);
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return authors;
    }
}