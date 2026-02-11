//問題8
//        ArrayList に入っている要素数を表示するように ___ を埋めなさい。
//        コードブロック
//        System.out.println(list.___);

import java.util.ArrayList;

class C0708 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Dog");
        list.add("Cat");
        list.add("Bird");

        System.out.println(list.size());
    }
}
