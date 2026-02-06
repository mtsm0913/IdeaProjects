//問題14
//次のコードには無限ループになる可能性がある。その理由を説明し、正しく動作するように修正し
//なさい。
//コードブロック
//int i = 0;
//while (i < 5) {
//        System.out.println(i);
//}

// カウンタ変数の更新が無いから

class C0414 {
    public static void main(String[] args) {
        int i = 0;
        while (i < 5) {
                System.out.println(i);
                i++;
        }
    }
}
