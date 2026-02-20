//2.2 列の順序と別名（AS句）

import java.sql.*;

class A280202 {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:book.db"
            );
            String sql = "SELECT title AS タイトル, price AS 値段 FROM books";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("タイトル") + " / " + rs.getInt("値段"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
