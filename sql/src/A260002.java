// --------------------------------------------------
// 全件出力
// --------------------------------------------------
import java.sql.*;
class A260002 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:test.db"
            );
            String sql = "SELECT * FROM users";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                    rs.getString("name")
                    + " / "
                    + rs.getInt("age")
                );
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
