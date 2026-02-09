//問題34
//次のコードはネストされたループである。
//        break が実行されると、どのループが終了するか説明しなさい。
//コードブロック
//for (int i = 1; i <= 3; i++) {
//    for (int j = 1; j <= 3; j++) {
//        if (j == 2) {
//            break;
//        }
//        System.out.print(i + "," + j + " ");
//    }
//}

// 1,1 2,1 3,1
class C0434 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 3; j++) {
                if (j == 2) {
                    break;
                }
                System.out.print(i + "," + j + " ");
            }
        }
    }
}
