//問題6：営業時間かどうか判定
//        条件
//• int hour = 18
//• 9〜17 時なら「営業中」
//        • それ以外は「閉店」

class B14030306 {
    public static void main(String[] args) {

        // Variable Definition
//        int hour = 18;
//        int hour = 8;
//        int hour = 9;
        int hour = 17;

        // Output
        if (hour >= 9 && hour <= 17) {
            System.out.println("営業中");
        } else {
            System.out.println("閉店");
        }
    }
}
