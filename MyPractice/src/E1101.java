//問題1：Bookクラスを作ろう
//        条件
//• クラス名：Book
//• フィールド： title （String）
//        • mainクラスで Book オブジェクトを1つ作る
//• title に好きな本の名前を入れて表示

/**
 * 本を表すクラスです。
 */
class Book {
    /**
     * 本のタイトル
     */
    String title;
}

/**
 * 実行用のメインクラスです。
 */
class E1101 {
    /**
     * メインメソッドです。
     * Bookオブジェクトを作成し、タイトルを設定して表示します。
     *
     * @param args コマンドライン引数
     */
    public static void main(String[] args) {
        Book b = new Book();
        b.title = "Java入門";
        System.out.println(b.title);
    }
}
