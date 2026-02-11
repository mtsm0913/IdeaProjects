//問題9：配列の中の「偶数」だけ合計
//        条件
//• int[] nums = {2,5,8,11}
//• 偶数だけ足して最後に合計を表示

class D14070109 {
    public static void main(String[] args) {
        int[] nums = {2,5,8,11};
        int sum = 0;
        for (int n : nums) {
            if (n % 2 == 0) {
                sum += n;            }
        }
        System.out.println(sum);
    }
}
