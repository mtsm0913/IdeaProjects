//問題17：2つの文字列の長さを比較
//        条件
//• s1="Java", s2="Hello"
//        • 長い方を表示

class B14030317 {
    public static void main(String[] args) {

        // Variable Definition
//        String s1 = "Java";
        String s1 = "Good Morning";
//        String s2 = "Hello";
        String s2 = "Good xxxxxxx";

        // Output
        if (s1.length() > s2.length()) {
            System.out.println(s1);
        } else if (s2.length() > s1.length()) {
            System.out.println(s2);
        } else {
            System.out.println("s1とs2の長さ（文字数）は同じ");
        }
    }
}
