//問題7：偶数だけ表示
//        条件
//• int[] nums = {1,2,3,4}
//• 偶数だけ表示

class D14070307 {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 4};
        for (int num : nums) {
            if (num % 2 == 0) {
                System.out.println(num);
            }
        }
    }
}
