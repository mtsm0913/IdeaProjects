//問題9：breakで止める
//        条件
//1〜10 までループ
//5 に達したらループ終了

class D14070209 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                break;
            }
            System.out.println(i);
        }
    }
}
