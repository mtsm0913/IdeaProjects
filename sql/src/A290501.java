import java.sql.*;

class A290501 {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:book.db"
            );
            String sql = "SELECT " +
                    "UPPER(title) AS uppercase_title, " +
                    "LOWER(title) AS lowercase_title " +
                    "FROM books";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                        rs.getString("uppercase_title")
                        + " / "
                        + rs.getString("lowercase_title")
                );
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
