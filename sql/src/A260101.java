//問題1：INSERT をしてみよう
//        条件
//        • users(name, age) に "Alice", 22 を追加
//        • PreparedStatement を使う
//        • try-catch 必須

import java.sql.*;
class A260101 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:test.db"
            );
            Statement stmt = conn.createStatement();
            String sql = "INSERT INTO users" +
                    "(name, age)" +
                    "VALUES (?, ?)"
            ;
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, "Alice");
            ps.setInt(2, 22);
            ps.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
