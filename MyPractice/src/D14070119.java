//問題19：for で1〜10を回し、偶数だけ表示
//        条件
//• 通常の for を使う
//• 偶数だけ println

class D14070119 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
    }
}
