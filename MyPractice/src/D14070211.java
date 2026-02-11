//問題11：ネスト for で 2行×3列の座標表示
//条件
//        (1,1) (1,2) (1,3)
//        (2,1) (2,2) (2,3)

class D14070211 {
    public static void main(String[] args) {
        for (int i = 1; i <= 2; i++) {
            for (int j = 1; j <= 3; j++) {
                System.out.print("(" + i + "," + j + ") ");
            }
            System.out.println();
        }
    }
}
