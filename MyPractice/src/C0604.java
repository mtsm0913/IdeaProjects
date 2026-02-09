//応用問題④：計算履歴を表示する電卓
//        問題
//        何回計算したかを表示する電卓を作れ。
//        条件
//        • 計算するたびに回数を1増やす
//        • 終了時に
//        • 合計 ○ 回計算しました
//        • と表示
//        • 連続計算（応用①）と組み合わせてもOK

// Scannerクラスimport
import java.util.Scanner;

class C0604 {
    public static void main(String[] args) {

//        Scannerインスタンス化
        Scanner sc = new Scanner(System.in);

//        計算続行可否受取用変数
        String answer = "";

//        計算回数保持用変数
        int count = 0;

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
