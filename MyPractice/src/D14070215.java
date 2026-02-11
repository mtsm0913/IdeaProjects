//問題15：奇数の合計を求める
//        条件
//1〜10 の odd だけ合計

class D14070215 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 10; i++) {
            if (i % 2 != 0) {
                sum += i;
            }
        }
        System.out.println(sum);
    }
}
