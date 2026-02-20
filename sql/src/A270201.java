//問題2
//問題1を「価格が高い順」に並べて表示せよ。
//ヒント：
//ORDER BY ______ DESC

import java.sql.*;

class A270201 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:book.db"
            );
            String sql =
                    "SELECT * FROM books " +
                    "WHERE price >= ? " +
                    "ORDER BY price DESC"
            ;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, 3000);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                        rs.getString("title")
                        + " / "
                        + rs.getString("price")
                );
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
