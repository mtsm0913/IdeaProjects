//問題3：偶数だけ表示
//        条件
//1〜10 の中で偶数だけ表示

class D14070203 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++)
            if (i % 2 == 0) {
                System.out.println(i);
            }
    }
}
