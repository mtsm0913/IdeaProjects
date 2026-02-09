//応用問題②：小数対応電卓
//        問題
//整数だけでなく、小数の計算ができる電卓を作れ。
//条件
//• 数値は nextDouble() で入力する
//• 変数は double a , double b
//• 四則演算すべて対応
//• 0割りチェックは b == 0.0 で行う
//• 結果はそのまま表示
//        学習ポイント
//• nextInt() と nextDouble() の使い分け
//• 割り算結果の違い（整数除算 vs 実数除算）

// Scannerクラスimport
import java.util.Scanner;

class C0602 {
    public static void main(String[] args) {

//        Scannerインスタンス化
        Scanner sc = new Scanner(System.in);

//        計算続行可否受取用変数
        String answer = "";

        do {
//            入力受取
            double a = sc.nextDouble();
            String op = sc.next();
            double b = sc.nextDouble();

//            計算
            if (op.equals("/") && b == 0.0) {
                System.out.println("0では割れません");
            } else if (op.equals("+")) {
                System.out.println(a + b);
            } else if (op.equals("-")) {
                System.out.println(a - b);
            } else if (op.equals("*")) {
                System.out.println(a * b);
            } else if (op.equals("/")) {
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
