//問題16：午前か午後か
//        条件
//• int hour = 14
//• 12 未満 → 午前
//• 12 以上 → 午後

class B14030316 {
    public static void main(String[] args) {

        // Variable Definition
//        int hour = 14;
//        int hour = 11;
        int hour = 12;

        // Output
        if (hour < 12) {
            System.out.println("午前");
        } else {
            System.out.println("午後");
        }
    }
}
