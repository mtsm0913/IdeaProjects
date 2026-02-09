//応用問題③：演算子を1文字でチェックする電卓
//        問題
//        演算子を String ではなく char型で扱う電卓を作れ。
//        条件
//        • 演算子入力は String で受け取る
//        • ただし、使うのは 先頭1文字だけ
//        コードブロック
//        char op = sc.next().charAt(0);
//        • 比較は == を使う
//        • 四則演算＋0割りチェックあり

// Scannerクラスimport
import java.util.Scanner;

class C0603 {
    public static void main(String[] args) {

//        Scannerインスタンス化
        Scanner sc = new Scanner(System.in);

//        計算続行可否受取用変数
        String answer = "";

        do {
//            入力受取
            double a = sc.nextDouble();
            char op = sc.next().charAt(0);
            double b = sc.nextDouble();

//            計算
            if (op == '/' && b == 0.0) {
                System.out.println("0では割れません");
            } else if (op == '+') {
                System.out.println(a + b);
            } else if (op == '-') {
                System.out.println(a - b);
            } else if (op == '*') {
                System.out.println(a * b);
            } else if (op == '/') {
                System.out.println(a / b);
            }

//            計算続行可否確認
            System.out.print("続けますか？(y / n):");
            answer = sc.next();
        } while (answer.equals("y"));

//        クローズ
        sc.close();
    }
}
