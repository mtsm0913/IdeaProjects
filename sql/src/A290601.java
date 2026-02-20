import java.sql.*;

class A290601 {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:book.db"
            );
            String sql = "SELECT " +
                    "title, " +
                    "LENGTH(title) AS title_length " +
                    "FROM books";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                        rs.getString("title")
                        + " / "
                        + rs.getString("title_length")
                );
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
