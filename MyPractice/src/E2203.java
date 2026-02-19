//問題3
//次のコードの（①）（②）に入る正しいキーワードを書きなさい。
//コードブロック
//public static void check(int num) (①) Exception {
//    if (num < 0) {
//        (②) new Exception("エラー");
//    }
//}

class E2203 {
    public static void check(int num) throws Exception {
        if (num < 0) {
            throw new Exception("エラー");
        }
    }
    public static void main(String[] args) {
        try {
            check(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
