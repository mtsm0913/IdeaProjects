//問題6：3で割れる数だけカウント
//        条件
//• int[] arr = {1,3,6,7,9}
//• 3 の倍数を数えて、最後に件数を表示

class D14070106 {
    public static void main(String[] args) {
        int[] arr = {1,3,6,7,9};
        int count = 0;
        for (int a : arr) {
            if (a % 3 == 0) {
                count++;
            }
        }
        System.out.println(count);
    }
}
