//問題14：配列の中に0があるかどうか判定
//        条件
//• int[] nums = {1,2,0,4}
//• 0 があれば「0あり」

class D14070114 {
    public static void main(String[] args) {
        int[] nums = {1,2,0,4};
        boolean judge = false;
        for (int n : nums) {
            if (n == 0) {
                judge = true;
            }
        }
        if (judge) {
            System.out.println("0あり");
        }
    }
}
