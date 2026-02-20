import java.sql.Connection;
import java.sql.DriverManager;

class Main {
    public static void main(String[] args) {

        // SQLiteはファイルDB。存在しなければ自動生成される
        String url = "jdbc:sqlite:test.db";

        try {
            Connection conn = DriverManager.getConnection(url);
            System.out.println("接続成功");
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
