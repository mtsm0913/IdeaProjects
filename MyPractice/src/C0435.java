//問題35
//次の処理内容を満たすコードを書きなさい。
//        • 1〜10までの数を順に調べる
//• 3の倍数が出た時点で繰り返しを終了する
//• for文を使用すること

class C0435 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                break;
            }
            System.out.println(i);
        }
    }
}
