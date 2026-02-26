import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManagerTest {

    private static final String TEST_DB =
            "jdbc:sqlite:C:/Users/puser01/IdeaProjects/TodoApp/todo_test.db";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(TEST_DB);
    }

    public static void initializeDatabase() throws SQLException {
        String drop = "DROP TABLE IF EXISTS todos";
        String create = """
            CREATE TABLE todos (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                title TEXT NOT NULL,
                memo TEXT,
                done INTEGER NOT NULL,
                created_at TEXT NOT NULL
            )
        """;

        try (Connection c = getConnection();
             Statement s = c.createStatement()) {
            s.execute(drop);
            s.execute(create);
        }
    }
}
