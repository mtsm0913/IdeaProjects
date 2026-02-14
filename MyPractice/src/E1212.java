//問題12
//次のコードには間違いがあります。どこが間違いか答えなさい。
//コードブロック
//class Train {
//    String line;
//}
//class Main {
//    public static void main(String[] args) {
//        Train t;
//        t.line = "山手線";
//        System.out.println(t.line);
//    }
//}

// Train t; が誤り

class Train {
    String line;
}
class E1212 {
    public static void main(String[] args) {
        Train t = new Train();
        t.line = "山手線";
        System.out.println(t.line);
    }
}
