//問題1：INSERT をしてみよう
//        条件
//        • users(name, age) に "Alice", 22 を追加
//        • PreparedStatement を使う
//        • try-catch 必須

import java.sql.*;
class A260102 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:test.db"
            );
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(
                    "SELECT id, name, age FROM users"
            );
            while (rs.next()) {
                System.out.println(
                        rs.getInt("id")
                        + " "
                        + rs.getString("name")
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
