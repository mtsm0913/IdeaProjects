//問題10：2つの値を比べる
//        条件
//• int a = 5, b = 10
//• 大きい方を表示

class B14030310 {
    public static void main(String[] args) {

        // Variable Definition
//        int a = 5;
//        int b = 10;
//        int a = 50;
//        int b = 10;
        int a = 100;
        int b = 100;

        // Output
        if (a > b) {
            System.out.println(a);
        } else if (b > a) {
            System.out.println(b);
        } else {
            System.out.println("aとbは同値");
        }
    }
}
