// 問題30
// 次の要件を満たすコードを書きなさい。
//        • 1〜5までの数字を表示する
//• ただし、表示は必ず1回以上行われることが保証されている

class C0430 {
    public static void main(String[] args) {
        int i = 1;
        do {
            System.out.println(i);
            i++;
        } while (i <= 5);
    }
}
