// --------------------------------------------------
// 4. 全件出力
// --------------------------------------------------
import java.sql.*;

class Main {
    public static void main(String[] args) {

        try {
            Connection conn = DriverManager.getConnection(
                    "jdbc:sqlite:book.db"
            );

            Statement stmt = conn.createStatement();
            String sql = "SELECT * FROM books";
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                System.out.println(
                        rs.getString("title")
                        + " | "
                        + rs.getString("author")
                        + " | "
                        + rs.getString("category")
                        + " | "
                        + rs.getInt("price")
                        + " | "
                        + rs.getInt("stock")
                        + " | "
                        + rs.getInt("published_year")
                        + " | "
                        + rs.getDouble("rating")
                );
            }
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

// --------------------------------------------------
// 3. サンプルデータ存在確認
// --------------------------------------------------
//import java.sql.*;
//class Main {
//    public static void main(String[] args) {
//        try {
//// DB接続
//            Connection conn = DriverManager.getConnection(
//                    "jdbc:sqlite:book.db"
//            );
//            Statement stmt = conn.createStatement();
//            ResultSet rs = stmt.executeQuery("SELECT * FROM books");
//            while (rs.next()) {
//                System.out.println(
//                        rs.getString("title") + " / " +
//                                rs.getInt("price")
//                );
//            }
//            conn.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

// --------------------------------------------------
// 2. PreparedStatement
// --------------------------------------------------
//import java.sql.*;
//class Main {
//    public static void main(String[] args) {
//        try {
//// SQLite 接続（book.db を作成）
//            Connection conn = DriverManager.getConnection(
//                    "jdbc:sqlite:book.db"
//            );
//            Statement stmt = conn.createStatement();
//// books テーブル作成
//            stmt.executeUpdate(
//                    "CREATE TABLE IF NOT EXISTS books (" +
//                            "id INTEGER PRIMARY KEY AUTOINCREMENT," +
//                            "title TEXT," +
//                            "author TEXT," +
//                            "category TEXT," +
//                            "price INTEGER," +
//                            "stock INTEGER," +
//                            "published_year INTEGER," +
//                            "rating REAL" +
//                    ")"
//            );
//// 既存データ削除（毎回リセットしたい場合）
//            stmt.executeUpdate("DELETE FROM books");
//            String sql = "INSERT INTO books " +
//                    "(title, author, category, price, stock, published_year, rating) " + "VALUES (?, ?, ?, ?, ?, ?, ?)";
//            PreparedStatement ps = conn.prepareStatement(sql);
//// 20件サンプルデータ
//            Object[][] data = {
//                    {"Java入門", "山田太郎", "技術書", 2800, 5, 2021, 4.3},
//                    {"SQL完全攻略", "佐藤花子", "技術書", 3500, 2, 2022, 4.7},
//                    {"Python基礎", "鈴木一郎", "技術書", 3000, 8, 2020, 4.5},
//                    {"物語A", "村上春樹", "小説", 1500, 10, 2018, 3.8},
//                    {"物語B", "東野圭吾", "小説", 1800, 4, 2019, 4.1},
//                    {"ビジネス思考", "田中健", "ビジネス", 2200, 6, 2021, 4.0},
//                    {"投資の教科書", "伊藤誠", "ビジネス", 2600, 3, 2023, 4.6},
//                    {"AIの未来", "中村優", "技術書", 4000, 7, 2024, 4.8},
//                    {"データ構造", "高橋亮", "技術書", 3200, 2, 2019, 4.2},
//                    {"経営戦略", "松本剛", "ビジネス", 2700, 5, 2020, 3.9},
//                    {"小説C", "吉本ばなな", "小説", 1400, 12, 2017, 3.5},
//                    {"アルゴリズム入門", "林健太", "技術書", 3600, 4, 2022, 4.4},
//                    {"マーケティング基礎", "小林愛", "ビジネス", 2100, 9, 2021, 4.1},
//                    {"統計学入門", "山口誠", "技術書", 3300, 3, 2018, 4.3},
//                    {"小説D", "川上弘美", "小説", 1600, 6, 2020, 3.7},
//                    {"ネットワーク基礎", "藤井翔", "技術書", 2900, 5, 2019, 4.0},
//                    {"起業のリアル", "森田光", "ビジネス", 2500, 4, 2023, 4.5},
//                    {"小説E", "辻村深月", "小説", 1700, 8, 2022, 4.2},
//                    {"セキュリティ入門", "大野直", "技術書", 3800, 2, 2024, 4.6},
//                    {"リーダーシップ論", "岡田裕", "ビジネス", 2400, 7, 2021, 3.8}
//            };
//            for (Object[] book : data) {
//                ps.setString(1, (String) book[0]);
//                ps.setString(2, (String) book[1]);
//                ps.setString(3, (String) book[2]);
//                ps.setInt(4, (Integer) book[3]);
//                ps.setInt(5, (Integer) book[4]);
//                ps.setInt(6, (Integer) book[5]);
//                ps.setDouble(7, (Double) book[6]);
//                ps.executeUpdate();
//            }
//            System.out.println("booksテーブルを作成し、20件のデータを追加しました。");
//                    conn.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}

// --------------------------------------------------
// 1. 環境構築後確認
// --------------------------------------------------
//import java.sql.Connection;
//import java.sql.DriverManager;
//
//class Main {
//    public static void main(String[] args) {
//
//        // SQLiteはファイルDB。存在しなければ自動生成される
//        String url = "jdbc:sqlite:test.db";
//
//        try {
//            Connection conn = DriverManager.getConnection(url);
//            System.out.println("接続成功");
//            conn.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
