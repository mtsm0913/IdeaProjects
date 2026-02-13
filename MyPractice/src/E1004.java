//問題4
//次のコードの問題点を説明せよ。
//コードブロック

/**
 * １つのメソッドが複数の役割を持っている点。
 */
class E1004 {
    public static void process(int a, int b) {
        System.out.println("開始");
        int total = a + b;
        System.out.println(total);
        System.out.println("終了");
    }
}
