//問題2：SELECT で年齢を読み取ろう
//        条件
//        • name と age を SELECT * FROM users で取得
//        • 全件を println で表示
//        • JDBC の標準パターンで書くこと

import java.sql.*;
class A260201 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:test.db"
            );

//            SELECT文では不要
//            Statement stmt = conn.createStatement();

            PreparedStatement ps = conn.prepareStatement(
                    "SELECT name, age FROM users"
            );
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                    rs.getString("name")
                    + " "
                    + rs.getInt("age")
                );
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
