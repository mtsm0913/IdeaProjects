//問題2：配列の最後の要素を表示
//        条件
//• String[] colors = {"Red","Blue","Green"}
//• 最後の要素を表示

//class D14070302 {
//    public static void main(String[] args) {
//        String[] colors = {"Red","Blue","Green"};
//        System.out.println(colors[2]);
//    }
//}

// 模範解答
class D14070302 {
    public static void main(String[] args) {
        String[] colors = {"Red","Blue","Green"};
        System.out.println(colors[colors.length - 1]);
    }
}
