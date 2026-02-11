//問題16
//        次のコードを実行したとき、表示される結果を書きなさい。
//        コードブロック
//        ArrayList<String> list = new ArrayList<>();
//
//        list.add("X");
//        list.add("Y");
//        list.add("Z");
//        list.remove(1);
//        System.out.println(list.get(1));

// Z

import java.util.ArrayList;

class C0716 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("X");
        list.add("Y");
        list.add("Z");
        list.remove(1);
        System.out.println(list.get(1));
    }
}
