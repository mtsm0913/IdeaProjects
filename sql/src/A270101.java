//問題1
//books テーブルから price が 3000円以上の本だけを表示せよ。
//条件：
//        • PreparedStatement を使うこと
//• ? を使うこと ※分からなければ、本ドキュメントの「PreparedStatement専用の書き方・
//        「?」について」を参照
//• title と price を表示すること
//• try-catch 必須

import java.sql.*;

class A270101 {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:book.db"
            );
            String sql = "SELECT * FROM books WHERE price >= ?";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setInt(1, 3000);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("title") + " / " + rs.getInt("price"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
