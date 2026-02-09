// --------------------------------------------------
// 配列
// --------------------------------------------------
//問題1：3人分の年齢を配列で管理しよう
//        条件
//int[] ages = {20, 25, 30}; を使う
//3つの年齢を順番に表示する

//class Main {
//    public static void main(String[] args) {
//        int[] ages = {20, 25, 30};
//        System.out.println(ages[0]);
//        System.out.println(ages[1]);
//        System.out.println(ages[2]);
//    }
//}

// --------------------------------------------------
//問題2：配列の長さを表示しよう
//        条件
//好きな文字列3つを配列に入れる
//配列名.length を表示する

//class Main {
//    public static void main(String[] args) {
//        String[] languages = {"Japanese", "English", "Italian"};
//        System.out.println(languages.length);
//    }
//}

// --------------------------------------------------
//問題3：配列の値を書き換えてみよう
//        条件
//int[] points = {50, 60, 70};
//2つ目（インデックス1）の値を 100 に変更
//        その値を表示する

class Main {
    public static void main(String[] args) {
        int[] points = {50, 60, 70};
        points[1] = 100;
        System.out.println(points[1]);
    }
}

// --------------------------------------------------
// 電卓（標準入力受取）
// --------------------------------------------------
//問題1：2つの数を入力して足し算する
//        条件
//Scannerを使う
//2つの数を nextInt で入力
//        合計を表示
//※実行ログに数字を1回入力しエンター、もう一度数字を入力しエンターを押す。
//足した数が表示されるか確認する。

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        int b = sc.nextInt();
//
//        System.out.println(a + b);
//
//        sc.close();
//    }
//}

// --------------------------------------------------
//問題2：演算子を入力して計算する電卓
//        条件
//a, b を nextInt
//演算子 op を next
//  ＋ と - のみ対応
//if で分岐
//※実行ログに数字を1回入力→演算子を1回入力→数字を1回入力し、
//演算子によって計算された数が表示されるか確認する。

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        String op = sc.next();
//        int b = sc.nextInt();
//
//        int result = 0;
//
//        if (op.equals("+")) {
//            result = a + b;
//        } else if (op.equals("-")) {
//            result = a - b;
//        }
//
//        System.out.println(result);
//
//        sc.close();
//    }
//}

// --------------------------------------------------
//問題3：四則演算＋0割りチェック付き電卓
//        条件
//        a, b, op を Scanner で入力
//        ＋- * / をすべて扱う
//        / のとき b==0 ならエラーメッセージ
//        それ以外は計算結果を表示

//import java.util.Scanner;
//class Main {
//    public static void main(String[] args) {
//
//        Scanner sc = new Scanner(System.in);
//
//        int a = sc.nextInt();
//        String op = sc.next();
//        int b = sc.nextInt();
//
//        if (op.equals("/") && b == 0) {
//            System.out.println("0では割れません");
//        } else if (op.equals("+")) {
//            System.out.println(a + b);
//        } else if (op.equals("-")) {
//            System.out.println(a - b);
//        } else if (op.equals("*")) {
//            System.out.println(a * b);
//        } else if (op.equals("/")) {
//            System.out.println(a / b);
//        }
//
//        sc.close();
//    }
//}

// --------------------------------------------------
// 電卓
// --------------------------------------------------
// 問題1：四則演算だけの電卓ロジックを作ろう
//        条件
//        int a = 7, b = 3
// String op = "+" （演算子を変えてテストする）
// op(+, -, *, /) に応じて計算し、結果を表示
//        計算結果はresult変数に入れる
// / のときは割り算の結果を整数で表示
// if / else if を使うこと
//
// ※すべての演算子で正しく計算できることを確認してください。

//class Main {
//    public static void main(String[] args) {
//        int a = 7;
//        int b = 3;
////        String op = "+";
////        String op = "-";
////        String op = "*";
//        String op = "/";
//        int result = 0;
//
//        if (op.equals("+")) {
//            result = a + b;
//        } else if (op.equals("-")) {
//            result = a - b;
//        } else if (op.equals("*")) {
//            result = a * b;
//        } else if (op.equals("/")) {
//            result = a / b;
//        }
//
//        System.out.println(result);
//    }
//}

// --------------------------------------------------
// 問題2：0割りチェックを追加した電卓ロジック
//        条件
//        int a = 10, b = 0
// op="/" のとき
// b が 0 →「0では割れません」
// それ以外 → 割り算
//        それ以外の演算子は普通に計算
// println で結果を出す
//
// ※特定条件の時、警告文が出るか確認しましょう。

//class Main {
//    public static void main(String[] args) {
//        int a = 10;
////        int a = 5279;
//        int b = 0;
////        int b = 2;
////        String op = "+";
////        String op = "-";
////        String op = "*";
//        String op = "/";
//
//        if (op.equals("/") && b == 0) {
//            System.out.println("0では割れません");
//        } else if (op.equals("+")) {
//            System.out.println(a + b);
//        } else if (op.equals("-")) {
//            System.out.println(a - b);
//        } else if (op.equals("*")) {
//            System.out.println(a * b);
//        } else if (op.equals("/")) {
//            System.out.println(a / b);
//        }
//    }
//}

// --------------------------------------------------
// ネストfor文
// --------------------------------------------------
//問題1：2行3列の表を表示しよう
//        条件
//二重 for文を使う
//「(i, j)」の形式で表示する
//i は 1〜2、j は 1〜3

//class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 2; i++) {
//            for (int j = 1; j <= 3; j++) {
//                System.out.print("(" + i + ", " + j + ")");
//            }
//            System.out.println();
//        }
//    }
//}

// --------------------------------------------------
//問題2：3行4列で「*」を表示しよう
//        条件
//print と println を使い分ける
//一行に4つ「*」を並べる
//        これを3行表示する

//class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 4; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//    }
//}

// --------------------------------------------------
//問題3：1〜3 を3回くりかえして表示しよう
//        条件
//外側：3回繰り返す
//内側：1〜3 を表示する
//        改行は外側の最後で行う

//class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 3; i++) {
//            for (int j = 1; j <= 3; j++) {
//                System.out.print(j);
//            }
//            System.out.println();
//        }
//    }
//}

// --------------------------------------------------
// while文
// --------------------------------------------------
//問題1：whileで1〜3を表示しよう
//        条件
//i = 1 から始める
//while文で1〜3を表示する

//class Main {
//    public static void main(String[] args) {
//        int i = 1;
//        while(i <= 3) {
//            System.out.println(i);
//            i++;
//        }
//    }
//}

// --------------------------------------------------
//問題2：do-whileでメッセージを3回表示
//        条件
//「Hello」を3回表示する
//do-while を使う

//class Main {
//    public static void main(String[] args) {
//        int i = 1;
//        do {
//            System.out.println("Hello");
//            i++;
//        } while(i <= 3);
//    }
//}

// --------------------------------------------------
//問題3：0になるまでカウントダウン
//        条件
//int num = 3;
//while文で 3, 2, 1, 0 を順に表示する
//num-- を使ってOK

//class Main {
//    public static void main(String[] args) {
//        int num = 3;
//        while (num >= 0) {
//            System.out.println(num);
//            num--;
//        }
//    }
//}

// --------------------------------------------------
// for文
// --------------------------------------------------
//問題1：1〜5を表示しよう
//        条件
//for文を使って1〜5を表示する
//1行ずつ出力する

//class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 5; i++) {
//            System.out.println(i);
//        }
//    }
//}

// --------------------------------------------------
//問題2：メッセージを3回表示しよう
//        条件
//「Javaを学習中」を3回表示する
//回数は for文で制御する

//class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 3; i++) {
//            System.out.println("Javaを学習中");
//        }
//    }
//}

// --------------------------------------------------
//問題3：回数つきのメッセージを表示しよう
//        条件
//1〜4の数字を使って
// 「1回目です」「2回目です」…のように4行表示する
//        文字列結合を使う

//class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 4; i++) {
//            System.out.println(i + "回目です");
//        }
//    }
//}

// --------------------------------------------------
//早めに終わった人向け：for文の中にfor文がある時の挙動を確認してみよう
//class Main {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 2; i++) {
//            for (int j = 1; j <= 3; j++) {
//                System.out.println(i + ", " + j);
//            }
//        }
//    }
//}

// --------------------------------------------------
// else-if文
// --------------------------------------------------
//問題1：点数でランク分けしよう
//        条件
//int score = 72;
//90以上→「A」
//        70以上→「B」
//それ以外→「C」

//class Main {
//    public static void main(String[] args) {
////        int score = 72;
////        int score = 90;
//        int score = 69;
//        if (score >= 90) {
//            System.out.println("A");
//        } else if (score >= 70) {
//            System.out.println("B");
//        } else {
//            System.out.println("C");
//        }
//    }
//}

// --------------------------------------------------
//問題2：年齢の範囲でメッセージを変えよう
//        条件
//int age = 25;
//18以上かつ30未満→「若い世代」
//        30以上→「大人」
//        18未満→「未成年」

//class Main {
//    public static void main(String[] args) {
////        int age = 25;
////        int age = 30;
//        int age = 17;
//        if (age >= 18 && age < 30) {
//            System.out.println("若い世代");
//        } else if (age >= 30) {
//            System.out.println("大人");
//        } else {
//            System.out.println("未成年");
//        }
//    }
//}

// --------------------------------------------------
//問題3：会員判定
//        条件
//boolean isMember = true;
//boolean hasCoupon = false;
//「会員またはクーポン所持」の場合→「割引対象」
//どちらもfalse→「対象外」

//class Main {
//    public static void main(String[] args) {
////        boolean isMember = true;
//        boolean isMember = false;
//        boolean hasCoupon = false;
//        if (isMember || hasCoupon) {
//            System.out.println("割引対象");
//        } else {
//            System.out.println("対象外");
//        }
//    }
//}

// --------------------------------------------------
// if文
// --------------------------------------------------
//問題1：合格かどうか判定しよう
//        条件
//点数を表すint score = 85;を使う
//70以上なら「合格」
//未満なら「不合格」

//class Main {
//    public static void main(String[] args) {
////        int score = 85;
//        int score = 69;
//        if (score >= 70) {
//            System.out.println("合格");
//        } else {
//            System.out.println("不合格");
//        }
//    }
//}

// --------------------------------------------------
//問題2：大人か子どもか表示しよう
//        条件
//int age = 16;
//20以上なら「大人です」
//        20未満なら「未成年です」

//class Main {
//    public static void main(String[] args) {
//        int age = 16;
//        int age = 20;
//        if (age >= 20) {
//            System.out.println("大人です");
//        } else {
//            System.out.println("未成年です");
//        }
//    }
//}

// --------------------------------------------------
//問題3：booleanを使ってみよう
//        条件
//boolean isOpen = false;
//trueなら「営業中」
//falseなら「閉店中」

//class Main {
//    public static void main(String[] args) {
////        boolean isOpen = false;
//        boolean isOpen = true;
//        if (isOpen) {
//            System.out.println("営業中");
//        } else {
//            System.out.println("閉店中");
//        }
//    }
//}

// --------------------------------------------------
// 文字列操作
// --------------------------------------------------
//問題1：文字数を調べよう
//        条件
//String型で好きな単語を入れる
//length()を使って文字数を表示する

//class Main {
//    public static void main(String[] args) {
//        String word = "東京都千代田区神田神保町";
//        System.out.println(word.length());
//    }
//}
// 結果
// 12

// --------------------------------------------------
//問題2：部分文字列を取り出そう
//        条件
//文字列"Programming"を変数に入れる
//        最初の2文字目から6文字目を取り出して表示する

//class Main {
//    public static void main(String[] args) {
//        String word = "Programming";
//        System.out.println(word.substring(1, 6));
//    }
//}
// 結果
// rogra

// --------------------------------------------------
//問題3：大文字と小文字を変換しよう
//        条件
//"Java"を文字列として作る
//大文字版、小文字版の2つをそれぞれ表示する

//class Main {
//    public static void main(String[] args) {
//        String word = "Java";
//        System.out.println(word.toUpperCase());
//        System.out.println(word.toLowerCase());
//    }
//}
// 結果
// JAVA
// java
