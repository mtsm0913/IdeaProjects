import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import static org.junit.jupiter.api.Assertions.*;

public class TodoDAOTest {

    private TodoDAO dao;

    @BeforeEach
    void setUp() throws Exception {
        DBManagerTest.initializeDatabase();
        dao = new TodoDAO(DBManagerTest::getConnection);
    }

    @Test
    public void testInsertAndFindAll() throws Exception {
        // テストデータを登録
        String today = LocalDate.now().toString();
        dao.insert("テストタスク", "テストメモ", 0, today);

        // 全件取得
        ArrayList<Todo> list = dao.findAll();

        // TODO: listが空でないことを検証
        assertFalse(list.isEmpty());

        // TODO: 最初のタスクのタイトルが"テストタスク"であることを検証
        assertEquals("テストタスク", list.get(0).getTitle());
    }

//    @Test
//    public void testUpdate() throws Exception {
//        // テストデータを登録
//        String today = LocalDate.now().toString();
//        dao.insert("元のタスク", "元のメモ", 0, today);
//
//        // 登録したデータを取得
//        ArrayList<Todo> list = dao.findAll();
//        int id = list.get(0).getId();
//
//        // TODO: 更新処理を実行
//        dao.update(0, "更新後タスク", "更新後メモ", 1);
//
//        // 更新後のデータを取得
//        ArrayList<Todo> updatedList = dao.findAll();
//        Todo updated = updatedList.get(0);
//
//        // TODO: タイトルが"更新後タスク"であることを検証
//        assertEquals("更新後タスク", updated.getTitle());
//
//        // TODO: doneが1であることを検証
//        assertEquals(1, updated.getDone());
//    }


    @Test
    public void testUpdate() throws Exception {
        String today = LocalDate.now().toString();
        dao.insert("元のタスク", "元のメモ", 0, today);

        ArrayList<Todo> list = dao.findAll();
        int id = list.get(0).getId();

        dao.update(id, "更新後タスク", "更新後メモ", 1);

        ArrayList<Todo> updatedList = dao.findAll();
        Todo updated = updatedList.get(0);

        assertEquals("更新後タスク", updated.getTitle());
        assertEquals(1, updated.getDone());
    }

//    @Test
//    public void testDelete() throws Exception {
//        // テストデータを登録
//        String today = LocalDate.now().toString();
//        dao.insert("削除対象", "削除するタスク", 0, today);
//
//        // 登録したデータを取得
//        ArrayList<Todo> list = dao.findAll();
//        int id = list.get(0).getId();
//
//        // TODO: 削除処理を実行
//        dao.delete(0);
//
//        // 削除後のデータを取得
//        ArrayList<Todo> afterDelete = dao.findAll();
//
//        // TODO: リストが空であることを検証
//        assertTrue(afterDelete.isEmpty());
//    }

    @Test
    public void testDelete() throws Exception {
        String today = LocalDate.now().toString();
        dao.insert("削除対象", "削除するタスク", 0, today);

        ArrayList<Todo> list = dao.findAll();
        int id = list.get(0).getId();

        dao.delete(id);

        ArrayList<Todo> afterDelete = dao.findAll();

        assertTrue(afterDelete.isEmpty());
    }

    @Test
    public void testSearch() throws Exception {
        // テストデータを複数登録
        String today = LocalDate.now().toString();
        dao.insert("Java勉強", "Stream APIを学ぶ", 0, today);
        dao.insert("買い物", "牛乳を買う", 0, today);
        dao.insert("Javaテスト", "JUnit5を学ぶ", 0, today);

        // TODO: "Java"で検索
        ArrayList<Todo> result = dao.search("Java");

        // TODO: 検索結果が2件であることを検証
        assertEquals(2, result.size());
    }

    @Test
    public void testFindIncomplete() throws Exception {
        // テストデータを登録
        String today = LocalDate.now().toString();
        dao.insert("未完了タスク1", "メモ1", 0, today);
        dao.insert("完了済みタスク", "メモ2", 1, today);
        dao.insert("未完了タスク2", "メモ3", 0, today);

        // TODO: 未完了タスクのみを取得
        List<Todo> incomplete = dao.findIncomplete();

        // TODO: 結果が2件であることを検証
        assertEquals(2, incomplete.size());

        // TODO: 全てのタスクのdoneが0であることを検証
        // ヒント: ループで1つずつ確認する
        for (Todo todo : incomplete) {
            assertEquals(0, todo.getDone());
        }

    }
}
