//問題11：論理演算 OR を使う
//        条件
//• boolean holiday = true
//• boolean rain = false
//• どちらかが true なら「出かける」

class B14030311 {
    public static void main(String[] args) {

        // Variable Definition
//        boolean holiday = true;
        boolean holiday = false;
//        boolean rain = false;
        boolean rain = true;

        // Output
        if (holiday || rain) {
            System.out.println("出かける");
        } else {
            System.out.println("出かけない");
        }
    }
}
