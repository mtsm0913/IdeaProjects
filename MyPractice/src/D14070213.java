//問題13：1〜100 のうち合計が200を超えたら止める
//        条件
//for を使う
//合計値を常に足し続け、sum > 200 で break
//最後に合計を表示

class D14070213 {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <= 100; i++) {
            sum += i;
            if (sum > 200) {
                break;
            }
        }
        System.out.println(sum);
    }
}
