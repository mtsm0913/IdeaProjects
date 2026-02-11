//問題16：do-whileで4の倍数を3つ表示
//        条件
//4, 8, 12 を順番に表示

//class D14070216 {
//    public static void main(String[] args) {
//        int i = 4;
//        do {
//            System.out.println(i);
//            i += 4;
//        } while (i <= 12);
//    }
//}

// 模範解答
class D14070216 {
    public static void main(String[] args) {
        int i = 4;
        int count = 0;
        do {
            System.out.println(i);
            i += 4;
            count++;
        } while (count < 3);
    }
}
