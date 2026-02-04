//問題12：論理演算 AND を使う
//        条件
//• boolean login = true
//• boolean paid = true
//• 両方 true なら「利用開始」

class B14030312 {
    public static void main(String[] args) {

        // Variable Definition
        boolean login = true;
//        boolean login = false;
//        boolean paid = true;
        boolean paid = false;

        // Output
        if (login && paid) {
            System.out.println("利用開始");
        } else {
            System.out.println("利用できない");
        }
    }
}
