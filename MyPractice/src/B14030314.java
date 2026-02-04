//問題14：料金の割引判定
//        条件
//• int age = 65
//• 65 以上なら「シニア割」

class B14030314 {
    public static void main(String[] args) {

        // Variable Definition
//        int age = 65;
        int age = 64;

        // Output
        if (age >= 65) {
            System.out.println("シニア割");
        } else {
            System.out.println("対象外");
        }
    }
}
