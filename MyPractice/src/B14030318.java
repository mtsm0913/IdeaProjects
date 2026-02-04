//問題18：文字列の先頭が'A'かどうか
//        条件
//• String t = "Apple"
//• t.charAt(0) が 'A' なら表示

class B14030318 {
    public static void main(String[] args) {

        // Variable Definition
//        String t = "Apple";
        String t = "Microsoft";

        // Output
        if (t.charAt(0) == 'A') {
            System.out.println(t);
        } else {
            System.out.println("1文字目がAでない");
        }
    }
}
