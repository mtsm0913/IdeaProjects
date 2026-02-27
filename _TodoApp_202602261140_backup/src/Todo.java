public class Todo {

    private int id;
    private String title;
    private String memo;
    private int done;
    private String createdAt;

    // TODO: コンストラクタを作成する
    // ヒント: 5つのフィールド全てを初期化する
    public Todo(int id, String title, String memo, int done, String createdAt) {
        // TODO: フィールドに値を代入
        this.id = id;
        this.title = title;
        this.memo = memo;
        this.done = done;
        this.createdAt = createdAt;
    }

    // TODO: 各フィールドのgetterを作成する
    // ヒント: IntelliJ IDEAでは Alt + Insert → Generate Getters で自動生成できる


    public int getId() {
        // TODO: idを返す
        return id;
    }

    public String getTitle() {
        // TODO: titleを返す
        return title;
    }

    public String getMemo() {
        // TODO: memoを返す
        return memo;
    }

    public int getDone() {
        // TODO: doneを返す
        return done;
    }

    public String getCreatedAt() {
        // TODO: createdAtを返す
        return createdAt;
    }
}
