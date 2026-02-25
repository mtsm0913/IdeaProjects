import java.time.LocalDate;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        try {
            DBManager.initializeDatabase();
            TodoDAO dao = new TodoDAO();

            String today = LocalDate.now().toString();
//          dao.insert("勉強", "Javaの復習", 0, today);
//          dao.insert("買い物", "牛乳を買う", 0, today);

            System.out.println("=== 全件取得 ===");
            for (Todo t : dao.findAll()) {
                System.out.println(t.getId() + " : " + t.getTitle());
            }

            // id=1 を更新
            dao.update(1, "勉強（更新済み）", "javaの予習", 1);
            System.out.println("\n=== id=1を更新後 ===");

            for (Todo t : dao.findAll()) {
                System.out.println(t.getId() + " : " + t.getTitle() + " (完了:" + t.getDone() + ")");
            }

            // id=2 を削除
            dao.delete(2);
            System.out.println("\n=== id=2を削除後 ===");
            for (Todo t : dao.findAll()) {
                System.out.println(t.getId() + " : " + t.getTitle());
            }

            // 検索
            System.out.println("\n=== 'Java' で検索 ===");
            for (Todo t : dao.search("Java")) {
                System.out.println(t.getId() + " : " + t.getTitle());
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
