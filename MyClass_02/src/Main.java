// --------------------------------------------------
// メソッド分割
// --------------------------------------------------
//問題1：挨拶メソッドを分けよう
//        条件
//メソッド名：greet
//「こんにちは」を表示する
//main から呼び出す
//main をスッキリさせることが目的

//class Main {
//    public static void greet() {
//        System.out.println("こんにちは");
//    }
//    public static void main(String[] args) {
//        greet();
//    }
//}

// --------------------------------------------------
//問題2：計算メソッドを分けよう
//        条件
//メソッド名：multiply
//引数：int x, int y
//戻り値：x と y の掛け算結果
//main で呼び出して表示

//class Main {
//    public static int multiply(int x, int y) {
//        return x * y;
//    }
//    public static void main(String[] args) {
//        System.out.println(multiply(3, 4));
//    }
//}

// --------------------------------------------------
//問題3：メソッド分割で読みやすくしよう
//        条件
//挨拶・計算・結果表示をそれぞれ別メソッドに分ける
//計算は「2つの数字の合計」を返す
//main は“流れの管理”だけにする

class Main {
    public static void greet() {
        System.out.println("こんにちは");
    }
    public static int addition(int x, int y) {
        return x + y;
    }
//    public static void displayResult() {
//    }
    public static void main(String[] args) {
        greet();
        System.out.println(addition(4, 3));
    }
}

// --------------------------------------------------
// メソッド
// --------------------------------------------------
//問題1：メッセージを表示するメソッド
//        条件
//戻り値なし（void）
//メソッド名：hello
//「Hello Java」を表示する
//main で呼び出す

//class Main {
//
//    public static void hello() {
//        System.out.println("Hello Java");
//    }
//
//    public static void main(String[] args) {
//        hello();
//    }
//}

// --------------------------------------------------
//問題2：名前つきの挨拶メソッド
//        条件
//引数として名前（String）を受け取る
//「◯◯さん、こんにちは」と表示
//        好きな名前で呼び出す

//class Main {
//    public static void hello(String name) {
//        System.out.println(name + "さん、こんにちは");
//    }
//    public static void main(String[] args) {
//        hello("オオタ");
//    }
//}

// --------------------------------------------------
//問題3：2倍にして返すメソッド
//        条件
//int の引数を受け取る
//その2倍の値を「戻り値として返す」
//main で呼び出して結果を表示

//class Main {
//    public static int doubleNum(int num) {
//        return num * 2;
//    }
//    public static void main(String[] args) {
//        System.out.println(doubleNum(1000));
//    }
//}
