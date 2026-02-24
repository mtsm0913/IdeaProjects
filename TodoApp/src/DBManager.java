import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class DBManager {

    // データベースファイルのパス
    private static final String DB_URL = "jdbc:sqlite:todo.db";

    // データベースへの接続を取得する
    public static Connection getConnection() throws SQLException {
        // TODO: DriverManager.getConnection()を使ってDB_URLに接続し、返す
        return DriverManager.getConnection(DB_URL);
    }

    // テーブルが存在しない場合は作成する
    public static void initializeDatabase() throws SQLException {
        String createTableSQL = """
            CREATE TABLE IF NOT EXISTS todos (
                id INTEGER PRIMARY KEY AUTOINCREMENT,
                title TEXT NOT NULL,
                memo TEXT,
                done INTEGER NOT NULL,
                created_at TEXT NOT NULL
            )
        """;

        // TODO: getConnection()で接続を取得し、createTableSQLを実行する
        // ヒント: try-with-resources を使う
        // ヒント: Statement の execute() メソッドを使う
        try (
                Connection conn = getConnection();
                Statement stmt = conn.createStatement()
        ) {
            stmt.execute(createTableSQL);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// 模範解答
//public static Connection getConnection() throws SQLException {
//    return DriverManager.getConnection(DB_URL);
//}
//
//public static void initializeDatabase() throws SQLException {
//    try (Connection conn = getConnection();
//         Statement stmt = conn.createStatement()) {
//        stmt.execute(createTableSQL);
//    }
//}
