//問題1：数字が正か負か判定しよう
//        条件
//• int n = 3
//• 0より大きければ「正」
//        • 0より小さければ「負」
//        • 0の場合は「0」

class B14030301 {
    public static void main(String[] args) {
//        int n = 3;
//        int n = 0;
        int n = -1;
        if (n > 0) {
            System.out.println("正");
        } else if (n == 0) {
            System.out.println("0");
        } else {
            System.out.println("負");
        }
    }
}
