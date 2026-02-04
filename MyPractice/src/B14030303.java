//問題3：パスワード一致判定
//        条件
//• String pass = "abc"
//• 入力値 input = "abc"
//• 同じなら「OK」

class B14030303 {
    public static void main(String[] args) {

        // Variable Definition
        String pass = "abc";

        // String input = "abc";
        String input = "abd";

        // Output
        if (input.equals(pass)) {
            System.out.println("OK");
        }
    }
}
