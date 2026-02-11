//問題7
//        次のコードで 2番目の要素を表示するように ___ を埋めなさい。
//        コードブロック
//        System.out.println(list.___);

import java.util.ArrayList;

class C0707 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Dog");
        list.add("Cat");
        list.add("Bird");

        System.out.println(list.get(1));
    }
}
