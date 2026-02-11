//問題6：最大値を求める
//        条件
//• int[] nums = {3,9,2}
//• 最大値を表示

class D14070306 {
    public static void main(String[] args) {
        int[] nums = {3, 9, 2};
        int max = nums[0];
        for (int num : nums) {
            if (num > max) {
                max = num;
            }
        }
        System.out.println(max);
    }
}
