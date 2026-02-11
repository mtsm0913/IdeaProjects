//問題13
//        "A" , "B" , "C" を追加した ArrayList から
//        "A" を削除し、残りを表示するプログラムを書きなさい。

import java.util.ArrayList;

class C0713 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("A");
        list.add("B");
        list.add("C");

        list.remove(0);

        System.out.println(list.get(0));
        System.out.println(list.get(1));
    }
}
