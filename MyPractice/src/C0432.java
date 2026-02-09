//問題32
//次のコードは、意図として「0〜4を表示したい」ものである。
//実際の動作と問題点を説明し、修正しなさい。
//コードブロック
//int i = 0;
//while (i <= 4) {
//    System.out.println(i);
//    i = i++;
//}

class C0432 {
    public static void main(String[] args) {
        int i = 0;
        while (i <= 4) {
            System.out.println(i);
            i++;
        }
    }
}
