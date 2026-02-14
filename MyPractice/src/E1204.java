//問題4
//次の条件を満たすコードを書きなさい。
//条件：
//        • クラス名：Dog
//• フィールド：name（String）
//        • mainでDogオブジェクトを1つ作る
//        • nameに好きな名前を入れて表示する

class Dog {
    String name;
}
class E1204 {
    public static void main(String[] args) {
        Dog d = new Dog();
        d.name = "Wanwan";
        System.out.println(d.name);
    }
}
