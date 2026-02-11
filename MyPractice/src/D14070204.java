//問題4：5の倍数をカウント
//        条件
//1〜30 の中で5の倍数の個数を数える

class D14070204 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 1; i <= 30; i++) {
            if (i % 5 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
