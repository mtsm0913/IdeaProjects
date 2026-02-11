//問題10
//        HashSet を使えるようにするために必要な import 文を ___ に書きなさい。
//        コードブロック
//import ___;

import java.util.HashSet;

class C0710 {
    public static void main(String[] args) {

        HashSet<String> list = new HashSet<>();

        list.add("Dog");
        list.add("Cat");
        list.add("Bird");

        System.out.println(list.size());
//        list.remove(0);
//        System.out.println(list.size());
    }
}
