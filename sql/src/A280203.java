//2.3 重複を取り除く（DISTINCT）

import java.sql.*;

class A280203 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:book.db"
            );
            String sql = "SELECT DISTINCT category FROM books";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("category"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
