//問題20：配列の中で60〜80の値だけ表示（複合条件）
//条件
//• int[] arr = {45, 60, 75, 90}
//• 60以上 AND 80以下

class D14070120 {
    public static void main(String[] args) {
        int[] arr = {45, 60, 75, 90};

        for (int num : arr) {
            if (num >= 60 && num <= 80) {
                System.out.println(num);
            }
        }
    }
}
