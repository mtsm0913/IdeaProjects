//問題19：ネストで階段状に「*」を表示
//        条件
//* を 1〜4個 まで増やしながら、4行の階段状に表示

//class D14070219 {
//    public static void main(String[] args) {
//        for (int i = 1, count = 1; i <= 4; i++) {
//            for (int j = 1; j <= count; j++) {
//                System.out.print("*");
//            }
//            count++;
//            System.out.println();
//        }
//    }
//}

// 模範解答
class D14070219 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
