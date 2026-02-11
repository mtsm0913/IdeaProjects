//問題12：ネストで3行4列の「*」を表示
//        条件
//* を 3行4列 で表示するプログラム

class D14070212 {
    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++){
            for (int j = 1; j <= 4; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
