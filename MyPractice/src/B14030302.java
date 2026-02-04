//問題2：20歳以上なら大人
//        条件
//• int age = 19
//• 20以上なら「大人」
//        • それ以外は「未成年」

class B14030302 {
    public static void main(String[] args) {
//        int age = 19;
        int age = 20;
        if (age >= 20) {
            System.out.println("大人");
        } else {
            System.out.println("未成年");
        }
    }
}
