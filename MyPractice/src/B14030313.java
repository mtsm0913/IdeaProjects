//問題13：大文字か小文字か判定
//        条件
//• char c = 'A'
//• 'A'〜'Z' なら大文字

class B14030313 {
    public static void main(String[] args) {

        // Variable Definition
//        char c = 'A';
//        char c = 'z';
        char c = 'Z';

        // Output
        if (c >= 'A' && c <= 'Z') {
            System.out.println("大文字");
        } else {
            System.out.println("大文字ではない");
        }
    }
}
