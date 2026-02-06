//問題21
//次のコードは意図した動作をしない。間違っている箇所を指摘し、修正しなさい。
//コードブロック
//for (int i = 0; i <= 3; i--) {
//    System.out.println(i);
//}

// 間違っている箇所
// 「i--」は「i++」とすべきである。
// このままでは「i <= 3」の条件を満たし続けることになり
// 無限ループとなる。

class C0421 {
    public static void main(String[] args) {
        for (int i = 0; i <= 3; i++) {
            System.out.println(i);
        }
    }
}
