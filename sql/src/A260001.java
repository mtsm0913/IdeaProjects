// --------------------------------------------------
// テーブル作成
// --------------------------------------------------
import java.sql.*;
class A260001 {
    public static void main(String[] args) {
        try {
// SQLite 接続（ファイルDB）
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:test.db"
            );
// テーブル作成（なければ）
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS users (" +
                            "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                            "name TEXT," +
                            "age INTEGER" +
                            ")"
            );
// Create（追加）
            PreparedStatement ps1 = conn.prepareStatement(
                    "INSERT INTO users (name, age) VALUES (?, ?)"
            );
            ps1.setString(1, "Taro");
            ps1.setInt(2, 20);
            ps1.executeUpdate();
//// Read（取得）
//            PreparedStatement ps2 = conn.prepareStatement(
//                    "SELECT name, age FROM users"
//            );
//            ResultSet rs = ps2.executeQuery();
//            while (rs.next()) {
//                System.out.println(
//                        rs.getString("name") + " / " + rs.getInt("age")
//                );
//            }
//// Update（更新）
//            PreparedStatement ps3 = conn.prepareStatement(
//                    "UPDATE users SET age = ? WHERE name = ?"
//            );
//            ps3.setInt(1, 25);
//            ps3.setString(2, "Taro");
//            ps3.executeUpdate();
//// Delete（削除）
//            PreparedStatement ps4 = conn.prepareStatement(
//                    "DELETE FROM users WHERE name = ?"
//            );
//            ps4.setString(1, "Taro");
//            ps4.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
