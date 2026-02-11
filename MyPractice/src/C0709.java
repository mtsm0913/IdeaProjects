//問題9
//        次のコードで 最初の要素を削除するように ___ を埋めなさい。
//        コードブロック
//        list.___;

import java.util.ArrayList;

class C0709 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Dog");
        list.add("Cat");
        list.add("Bird");

        System.out.println(list.size());
        list.remove(0);
        System.out.println(list.size());
    }
}
