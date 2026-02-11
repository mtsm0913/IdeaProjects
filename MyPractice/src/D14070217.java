//問題17：ネストで九九の 1段だけ表示（1×1〜1×9）
//条件
//外側1回、内側9回
//形式：1 × 1 = 1 〜 1 × 9 = 9

//class D14070217 {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 1; i++) {
//            for (int j = 1, k = 0; j <= 9; j++) {
//                k = i * j;
//                System.out.println(i + " × " + j + " = " + k);
//            }
//        }
//    }
//}

// 模範解答
class D14070217 {
    public static void main(String[] args) {
        for (int i = 1; i <= 1; i++) {
            for (int j = 1; j <= 9; j++) {
                System.out.println(i + " × " + j + " = " + (i * j));
            }
        }
    }
}
