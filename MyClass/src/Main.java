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

class Main {
    public static void main(String[] args) {
//        boolean isOpen = false;
        boolean isOpen = true;
        if (isOpen) {
            System.out.println("営業中");
        } else {
            System.out.println("閉店中");
        }
    }
}

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
