import java.sql.*;

class A290401 {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:book.db"
            );
            String sql = "SELECT SUBSTRING(title, 1, 3) AS short_title FROM books";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(rs.getString("short_title"));
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
