//問題10：continueでスキップ
//        条件
//1〜10 の中で
//3 の倍数だけスキップし、それ以外表示

class D14070210 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 3 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
