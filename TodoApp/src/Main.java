import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        try {
            DBManager.initializeDatabase();
            TodoDAO dao = new TodoDAO();

            // テストデータを登録
            String today = LocalDate.now().toString();
//            dao.insert("食事", "プロテインを飲む", 0, today);  // 未完了
//            dao.insert("ペットお世話", "インコちゃんに餌あげる", 1, today);   // 完了済み
//            dao.insert("掃除", "部屋を掃除する", 0, today); // 未完了

            // 全件取得
            ArrayList<Todo> allTodos = dao.findAll();

            System.out.println("=== 全タスク ===");
            for (Todo todo : allTodos) {
                String status = todo.getDone() == 1 ? "完了" : "未完了";
                System.out.println(todo.getTitle() + " (" + status + ")");
            }

            // TODO: Stream APIで未完了タスクのみを抽出
            // ヒント: filter(todo -> todo.getDone() == 0)
            List<Todo> incompleteTodos = allTodos.stream()
                    // TODO: ここにfilterを書く
                    .filter(todo -> todo.getDone() == 0)
                    .collect(Collectors.toList());

            System.out.println("\n=== 未完了タスクのみ ===");
            for (Todo todo : incompleteTodos) {
                System.out.println(todo.getTitle());
            }

            // TODO: Stream APIでタスク名のリストを作成
            List<String> titles = allTodos.stream()
                    // TODO: ここにmapを書く
                    .map(todo -> todo.getTitle())
                    .collect(Collectors.toList());

            System.out.println("\n=== タスク名一覧 ===");
            for (String title : titles) {
                System.out.println("・" + title);
            }

            // TODO: 未完了タスクのメモのみを取得
// ヒント: filter() と map() を組み合わせる
            List<String> incompleteMemos = allTodos.stream()
                    // TODO: doneが0のものだけをfilter
                    .filter(todo -> todo.getDone() == 0)
                    // TODO: メモだけをmapで抽出
                    .map(todo -> todo.getMemo())
                    .collect(Collectors.toList());

            System.out.println("\n=== 未完了タスクのメモ ===");
            for (String memo : incompleteMemos) {
                System.out.println("・" + memo);
            }

            System.out.println("\n=== 未完了タスクのみ ===");
            for (Todo todo : dao.findIncomplete()) {
                System.out.println(todo.getTitle());
            }

            System.out.println("\n=== 未完了 かつ 'プロテイン' を含むタスク ===");
            for (Todo todo : dao.findIncompleteByKeyword("プロテイン")) {
                System.out.println(todo.getTitle());
            }

            //テストデータ登録場所
//            dao.insert("正常タスク1", "バグテスト", 0, today);
//            dao.insert("正常タスク2", "バグテスト", 0, today);
//            dao.insert("ng", "バグテスト", 0, today);
//            dao.insert("正常タスク3", "バグテスト", 0, today);
//            dao.insert("正常タスク4", "バグテスト", 0, today);

            ArrayList<Todo> list = dao.findAll();
            printShortTitles(list); // ← ここでエラーが発生する

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    //タスク名の最初の3文字を表示する（バグ有り）
//    private static void printShortTitles(ArrayList<Todo> list) {
//        System.out.println("\n=== タスク名の最初の3文字を表示 ===");
//        for (Todo todo : list) {
//            // バグ: タスク名が3文字未満の場合、エラーが発生する
//            String shortTitle = todo.getTitle().substring(0, 3);
//            System.out.println(shortTitle);
//        }
//    }

    private static void printShortTitles(ArrayList<Todo> list) {
        System.out.println("\n=== タスク名の最初の3文字を表示 ===");
        for (Todo todo : list) {
            String title = todo.getTitle();

            // 修正: タスク名が3文字未満の場合は全体を表示
            String shortTitle = title.length() >= 3
                    ? title.substring(0, 3)
                    : title;

            System.out.println(shortTitle);
        }
    }
}

// --------------------------------------------------
// ラムダ式に修正前
// --------------------------------------------------
//import java.time.LocalDate;
//import java.util.ArrayList;
//
//public class Main {
//    public static void main(String[] args) {
//        try {
//            DBManager.initializeDatabase();
//            TodoDAO dao = new TodoDAO();
//
//            String today = LocalDate.now().toString();
////          dao.insert("勉強", "Javaの復習", 0, today);
////          dao.insert("買い物", "牛乳を買う", 0, today);
//
//            System.out.println("=== 全件取得 ===");
//            for (Todo t : dao.findAll()) {
//                System.out.println(t.getId() + " : " + t.getTitle());
//            }
//
//            // id=1 を更新
//            dao.update(1, "勉強（更新済み）", "javaの予習", 1);
//            System.out.println("\n=== id=1を更新後 ===");
//
//            for (Todo t : dao.findAll()) {
//                System.out.println(t.getId() + " : " + t.getTitle() + " (完了:" + t.getDone() + ")");
//            }
//
//            // id=2 を削除
//            dao.delete(2);
//            System.out.println("\n=== id=2を削除後 ===");
//            for (Todo t : dao.findAll()) {
//                System.out.println(t.getId() + " : " + t.getTitle());
//            }
//
//            // 検索
//            System.out.println("\n=== 'Java' で検索 ===");
//            for (Todo t : dao.search("Java")) {
//                System.out.println(t.getId() + " : " + t.getTitle());
//            }
//
//        } catch (Exception e) {
//            e.printStackTrace();
//        }
//    }
//}
