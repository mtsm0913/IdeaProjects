//問9
//Movie クラスを作成せよ。
//条件：
//        • フィールド：title（String）, time（int）
//        • コンストラクタで2つ受け取る
//• main で1つ作成し、値を表示

class Movie {
    String title;
    int time;
    Movie(String title, int time) {
        this.title = title;
        this.time = time;
    }
}
class E1309 {
    public static void main(String[] args) {
        Movie m = new Movie("Cars", 2);
        System.out.println(m.title);
        System.out.println(m.time);
    }
}
