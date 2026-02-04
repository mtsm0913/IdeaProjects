//問題20：複数条件の総まとめ
//        条件
//• int score = 55
//• 80以上 →「優秀」
//        • 60以上 →「普通」
//        • それ以外 →「がんばろう」

class B14030320 {
    public static void main(String[] args) {

        // Variable Definition
//        int score = 55;
//        int score = 80;
//        int score = 79;
//        int score = 60;
        int score = 59;

        // Output
        if (score >= 80) {
            System.out.println("優秀");
        } else if (score >= 60) {
            System.out.println("普通");
        } else {
            System.out.println("がんばろう");
        }
    }
}
