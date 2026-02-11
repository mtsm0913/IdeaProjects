//問題8：10回ループして合計値を求める（do-while）
//条件
//1〜10 の合計（do-while）

class D14070208 {
    public static void main(String[] args) {
        int i = 1;
        int sum = 0;
        do {
            sum += i;
            i++;
        } while (i <= 10);
        System.out.println(sum);
    }
}
