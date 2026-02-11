//問題5：配列の合計を求める
//        条件
//• int[] nums = {4,6,8}
//• 合計を表示

class D14070305 {
    public static void main(String[] args) {
        int[] nums = {4, 6, 8};
        int sum = 0;
        for (int num : nums) {
            sum += num;
        }
        System.out.println(sum);
    }
}
