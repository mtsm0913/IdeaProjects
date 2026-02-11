//問題11
//        ArrayList を使って、 "Red" , "Blue" , "Green" を追加し、
//        先頭の要素だけ表示するプログラムを書きなさい。

import java.util.ArrayList;

class C0711 {
    public static void main(String[] args) {

        ArrayList<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Blue");
        list.add("Green");

        System.out.println(list.get(0));
    }
}
