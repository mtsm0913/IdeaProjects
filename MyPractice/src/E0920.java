//問題20
//整数を1つ受け取り、その数が偶数なら「偶数」、奇数なら「奇数」と表示するメソッドを作成しな
//さい。

class E0920 {
    public static void judgeEvenOrOdd(int num) {
        if (num % 2 == 0) {
            System.out.println("偶数");
        } else {
            System.out.println("奇数");
        }
    }
    public static void main(String[] args) {
        judgeEvenOrOdd(1);
    }
}
