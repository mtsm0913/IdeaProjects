//問題15：password の長さチェック
//条件
//• String pass = "abcd"
//• 長さが 4 未満なら「短すぎ」

class B14030315 {
    public static void main(String[] args) {

        // Variable Definition
//        String pass = "abcd";
        String pass = "bcd";

        // Output
        if (pass.length() < 4) {
            System.out.println("短すぎ");
        } else {
            System.out.println("OK");
        }
    }
}
