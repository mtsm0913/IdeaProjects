//問題6
//次のコードにはコンパイルエラーがあります。正しく修正しなさい。
//コードブロック
//public static void checkAge(int age) {
//    if (age < 0) {
//        throw new Exception("年齢エラー");
//    }
//}

class E2206 {
    public static void checkAge(int age) throws Exception {
        if (age < 0) {
            throw new Exception("年齢エラー");
        }
    }
    public static void main(String[] args) {

    }
}
