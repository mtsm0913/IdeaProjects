import java.sql.*;

class A290301 {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:book.db"
            );
            String sql = "SELECT CONCAT(title, ' ', author) AS タイトル・著者 FROM books";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("タイトル・著者"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
