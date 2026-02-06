//問題23
//次のコードはネストされたループである。このコードが何をしているかを説明しなさい。
//コードブロック
class C0423 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
//