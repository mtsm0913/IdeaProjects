// --------------------------------------------------
// テーブル作成
// --------------------------------------------------

// JDBC APIがすべて入っているパッケージを読み込む。
// `Connection` や `Statement` などのクラスが使えるようになる。
import java.sql.*;

// クラス定義
class B01 {
    public static void main(String[] args) {

// 想定される例外
// - ファイルが見つからない
// - SQLの構文ミス
// - 接続エラー
        try {

// SQLite 接続（ファイルDB）

//            データベースへの「接続（コネクション）」を確立する命令
//            確立された接続情報が変数 `conn` に保存される。
//            以降、この `conn` を使って命令を送る。
            Connection conn = DriverManager.getConnection(

//                    接続先の情報を指定する文字列（接続文字列）
//                    `jdbc:sqlite:` は「SQLiteを使う」という指定
//                    `text.db` はデータベースファイルの名前
//                    このファイルがなければ自動的に作成され、あればそのファイルを開く
                    "jdbc:sqlite:test.db"
            );

// テーブル作成（なければ）
//            `conn.createStatement()` ：SQL文をデータベースに送るための
//              「伝令役」のようなオブジェクト（Statement）を作成
//            `stmt.executeUpdate()` ：データベースの内容を変更するSQL
//            （作成、追加、更新、削除など）を実行するメソッド。
            Statement stmt = conn.createStatement();
            stmt.executeUpdate(

//                    [usersB]というテーブルを、「もし存在しなければ」作成する。
                    "CREATE TABLE IF NOT EXISTS usersB (" +

//                            整数で主キー（重複しない識別子]であり、自動で連番が振られる
                            "id INTEGER PRIMARY KEY AUTOINCREMENT," +
                            "name TEXT," +
                            "age INTEGER" +
                            ")"
            );
// Create（追加）

//
            PreparedStatement ps1 = conn.prepareStatement(
                    "INSERT INTO users (name, age) VALUES (?, ?)"
            );
            ps1.setString(1, "Taro");
            ps1.setInt(2, 20);
            ps1.executeUpdate();
            conn.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
