//問題7
//次の条件を満たすクラスを書きなさい。
//条件：
//        • クラス名：Light
//• フィールド：color（String）
//        • メソッド：turnOn（「〇〇のライトが点灯しました」と表示）
//        • mainでオブジェクトを作り、turnOnを呼び出す

class Light {
    String color;
    void turnOn() {
        System.out.println(color + "のライトが点灯しました");
    }
}
class E1207 {
    public static void main(String[] args) {
        Light l = new Light();
        l.color = "赤";
        l.turnOn();
    }
}
