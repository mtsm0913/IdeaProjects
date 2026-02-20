//問題3：UPDATE と DELETE を続けてやってみよう
//        条件
//        • name="Bob" の age を 30 に更新
//        • そのあと Bob のデータを削除
//        • PreparedStatement を2回使う
//        • try-catch 必須

import java.sql.*;
class A260301 {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:test.db"
            );
            Statement stmt = conn.createStatement();
            String sql = "UPDATE users" +
                    "SET" +
                    "WHERE "
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
