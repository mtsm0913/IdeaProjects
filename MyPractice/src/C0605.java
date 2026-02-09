//応用問題⑤：不正入力に強い電卓
//        問題
//        対応していない演算子が入力されたら、再入力させる電卓を作れ。
//        条件
//        • / 以外が入力された場合
//        • 不正な演算子です。もう一度入力してください。
//        • 正しい演算子が入るまで繰り返す
//        • 数値入力はそのままでOK

// Scannerクラスimport
import java.util.Scanner;

class C0605 {
    public static void main(String[] args) {

//        Scannerインスタンス化
        Scanner sc = new Scanner(System.in);

//        計算続行可否受取用変数
        String answer = "";

//        計算回数保持用変数
        int count = 0;

        do {
//            入力受取（左オペランド）
            double a = sc.nextDouble();

//            演算子チェック
            char op;
            boolean opCheck = false;
            do {
                op = sc.next().charAt(0);
                if (op == '+' || op == '-' || op == '*' || op == '/') {
                    opCheck = true;
                } else {
                    System.out.println("不正な演算子です。もう一度入力してください。");
                }
            } while (!opCheck);

//            入力受取（右オペランド）
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

//            計算回数更新
            count++;

//            計算続行可否確認
            System.out.print("続けますか？(y / n):");
            answer = sc.next();
        } while (answer.equals("y"));

//        計算回数表示
        System.out.println("合計" + count + "回計算しました");

//        クローズ
        sc.close();
    }
}
