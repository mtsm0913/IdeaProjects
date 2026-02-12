//問題16
//整数を1つ受け取り、その数が正の数なら true、負の数なら false を返すメソッドを作成しなさい。

class E0916 {
    public static boolean signDecision(int num) {
        if (num > 0) {
            return true;
        } else {
            return false;
        }
    }
    public static void main(String[] args) {
        System.out.println(signDecision(0));
    }
}
