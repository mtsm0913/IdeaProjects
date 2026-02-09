//応用問題①：連続計算できる電卓（while編）
//問題
//今の電卓は 1回計算したら終了 する。
//これを改造して、何度でも計算できる電卓を作れ。
//条件
//• 今までの電卓（四則演算＋0割りチェック）をベースにする
//• 計算後に 続けますか？(y / n): と表示する
//• y が入力されたら、最初に戻って再度計算
//• n が入力されたらプログラム終了
//• Scanner は1つだけ使う（毎回 new しない）

// Scannerクラスimport
import java.util.Scanner;

class C0601 {
    public static void main(String[] args) {

//        Scannerインスタンス化
        Scanner sc = new Scanner(System.in);

//        計算続行可否受取用変数
        String answer = "";

        do {
//            入力受取
            int a = sc.nextInt();
            String op = sc.next();
            int b = sc.nextInt();

//            計算
            if (op.equals("/") && b == 0) {
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
