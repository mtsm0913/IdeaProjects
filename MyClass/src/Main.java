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
class Main {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.println(i + ", " + j);
            }
        }
    }
}
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
