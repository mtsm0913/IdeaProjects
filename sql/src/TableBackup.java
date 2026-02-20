//import java.sql.*;
//
//class TableBackup {
//    public static void main(String[] args) {
//        try {
//            Connection conn = DriverManager.getConnection(
//                    "jdbc:sqlite:book.db"
//            );
//            String sql = "CREATE TABLE _books_20260220_org AS SELECT * FROM books";
//            PreparedStatement ps = conn.prepareStatement(sql);
//            ResultSet rs = ps.executeQuery();
////            while (rs.next()) {
////                System.out.println(rs.getString("title"));
////            }
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
