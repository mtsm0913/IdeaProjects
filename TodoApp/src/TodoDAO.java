import java.sql.*;
import java.util.ArrayList;

public class TodoDAO {

    // タスクを新規登録する
    public void insert(String title, String memo, int done, String createdAt) throws SQLException {
        String sql = "INSERT INTO todos (title, memo, done, created_at) VALUES (?, ?, ?, ?)";

        // TODO: try-with-resources を使って接続と PreparedStatement を取得
        // TODO: プレースホルダーに値をセットする（setString, setInt）
        // TODO: executeUpdate() を実行する

        try (Connection conn = DBManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            // TODO: 1番目の ? に title をセット
            ps.setString(1, title);

            // TODO: 2番目の ? に memo をセット
            ps.setString(2, memo);

            // TODO: 3番目の ? に done をセット
            ps.setInt(3, done);

            // TODO: 4番目の ? に createdAt をセット
            ps.setString(4, createdAt);

            // TODO: SQL を実行（update）
            ps.executeUpdate();
        }
    }

    //  全タスクを取得する
    public ArrayList<Todo> findAll() throws SQLException {
        ArrayList<Todo> list = new ArrayList<>();

//        新しいタスク順に並べるためにDESCとしている。
        String sql = "SELECT * FROM todos ORDER BY id DESC";

        try (Connection conn = DBManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql);
             ResultSet rs = ps.executeQuery()) {

            // TODO: while文でResultSetを1行ずつ読み取る
            // TODO: 各列の値を取得し、Todoオブジェクトを作成
            // TODO: listに追加

            while (rs.next()) {
                // TODO: rs.getInt("id") で id を取得
                int id = rs.getInt("id");

                // TODO: rs.getString("title") で title を取得
                String title = rs.getString("title");

                // TODO: rs.getString("memo") で memo を取得
                String memo = rs.getString("memo");

                // TODO: rs.getInt("done") で done を取得
                int done = rs.getInt("done");

                // TODO: rs.getString("created_at") で createdAt を取得
                String createdAt = rs.getString("created_at");

                // TODO: 取得した値でTodoオブジェクトを作成
                // Todo todo = new Todo(...);
                Todo todo = new Todo(id, title, memo, done, createdAt);

                // TODO: listに追加
                // list.add(todo);
                list.add(todo);
            }
        }

        return list;
    }

    // タスクを更新する
    public void update(int id, String title, String memo, int done) throws SQLException {
        String sql = "UPDATE todos SET title = ?, memo = ?, done = ? WHERE id = ?";

        try (Connection conn = DBManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            // TODO: プレースホルダー(?)に値をセット
            ps.setString(1, title);
            ps.setString(2, memo);
            ps.setInt(3, done);
            ps.setInt(4, id);

            ps.executeUpdate();
        }
    }

    // タスクを削除する
    public void delete(int id) throws SQLException {
        String sql = "DELETE FROM todos WHERE id = ?";

        try (Connection conn = DBManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            // TODO: idをセット
            ps.setInt(1, id);

            ps.executeUpdate();
        }
    }

    // キーワード検索
    public ArrayList<Todo> search(String keyword) throws SQLException {
        ArrayList<Todo> list = new ArrayList<>();
        String sql = "SELECT * FROM todos WHERE title LIKE ? OR memo LIKE ? ORDER BY id DESC";

        try (Connection conn = DBManager.getConnection();
             PreparedStatement ps = conn.prepareStatement(sql)) {

            // TODO: キーワードを % で囲む
            String kw = "%" + keyword + "%";

            // TODO: プレースホルダーに同じ値を2回セット
            ps.setString(1, kw);
            ps.setString(2, kw);

            try (ResultSet rs = ps.executeQuery()) {
                while (rs.next()) {
                    int id = rs.getInt("id");
                    String title = rs.getString("title");
                    String memo = rs.getString("memo");
                    int done = rs.getInt("done");
                    String createdAt = rs.getString("created_at");

                    list.add(new Todo(id, title, memo, done, createdAt));
                }
            }
        }

        return list;
    }
}
