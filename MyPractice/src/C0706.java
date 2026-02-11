//問題6
//次のコードの ___ を埋めて、文字列を3つ追加できるようにしなさい。
//コードブロック
//ArrayList<String> list = new ArrayList<>();
//list.___("Dog");
//list.___("Cat");
//list.___("Bird");

import java.util.ArrayList;
class C0706 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Dog");
        list.add("Cat");
        list.add("Bird");

        System.out.println(list.get(0));
        System.out.println(list.get(1));
        System.out.println(list.get(2));
    }
}
