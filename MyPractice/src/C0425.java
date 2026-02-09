//問題25
//次のコードは、処理回数が分かりにくい。for文に書き換えなさい。
//        ※breakは、処理を終了する命令
//コードブロック
//int i = 0;
//while (true) {
//    System.out.println(i);
//    i++;if (i == 5) {
//        break;
//    }
//}

class C0425 {
    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }
}

//class C0425 {
//    public static void main(String[] args) {
//        int i = 0;
//        while (true) {
//            System.out.println(i);
//            i++;if (i == 5) {
//                break;
//            }
//        }
//    }
//}
