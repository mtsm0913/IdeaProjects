import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class TodoTest {

    @Test
    public void testTodoCreation() {
        // テストデータを作成
        Todo todo = new Todo(1, "買い物", "牛乳を買う", 0, "2026-01-13");

        // 検証（Assertion）
        assertEquals(1, todo.getId());
        assertEquals("買い物", todo.getTitle());
        assertEquals("牛乳を買う", todo.getMemo());
        assertEquals(0, todo.getDone());
        assertEquals("2026-01-13", todo.getCreatedAt());
    }
}
