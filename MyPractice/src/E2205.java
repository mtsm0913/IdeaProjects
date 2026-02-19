//問題5
//次のコードを実行したときの出力を書きなさい。

// A
// B
// C

class E2205 {
    public static void main(String[] args) {
        try {
            System.out.println("A");
            throw new Exception("エラー");
        } catch (Exception e) {
            System.out.println("B");
        }
        System.out.println("C");
    }
}
