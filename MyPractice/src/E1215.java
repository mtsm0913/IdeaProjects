//問題15
//次のコードの実行結果を書きなさい。
//コードブロック

// プレイヤー：A
// プレイヤー：B

class Player {
    String name;
    void show() {
        System.out.println("プレイヤー：" + name);
    }
}
class E1215 {
    public static void main(String[] args) {
        Player p1 = new Player();
        Player p2 = new Player();
        p1.name = "A";
        p2.name = "B";
        p1.show();
        p2.show();
    }
}
