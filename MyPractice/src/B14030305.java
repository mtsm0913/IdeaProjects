//問題5：点数に応じてランク表示
//        条件
//• int score = 92
//• 90以上 A
//• 70以上 B
//• それ以外 C

class B14030305 {
    public static void main(String[] args) {

        // Variable Definition
//        int score = 92;
//        int score = 70;
        int score = 69;

        // Output
        if (score >= 90) {
            System.out.println("A");
        } else if (score >= 70) {
            System.out.println("B");
        } else {
            System.out.println("C");
        }
    }
}
