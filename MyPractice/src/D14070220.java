//問題20：フラグを使った検索処理風のロジック
//        条件
//1〜10 を順番に確認し
//5 を見つけたら「発見！」と表示して break

//class D14070220 {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(i);
//            if (i == 5) {
//                System.out.println("発見！");
//                break;
//            }
//        }
//    }
//}

// 模範解答
class D14070220 {
    public static void main(String[] args) {
        boolean found = false;
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                found = true;
                break;
            }
        }
        if (found) {
            System.out.println("発見！");
        }
    }
}
