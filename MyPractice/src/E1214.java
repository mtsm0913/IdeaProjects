//問題14
//次の条件を満たすプログラムを書きなさい。
//条件：
//        • クラス名：Coffee
//• フィールド：size（String）
//        • メソッド：info
//「このコーヒーのサイズは〇〇です」と表示する
//• mainでオブジェクトを作成
//• sizeに好きな値を入れてinfoを呼び出す

class Coffee {
    String size;
    void info() {
        System.out.println("このコーヒーのサイズは" + size + "です");
    }
}
class E1214 {
    public static void main(String[] args) {
        Coffee c = new Coffee();
        c.size = "Medium";
        c.info();
    }
}
