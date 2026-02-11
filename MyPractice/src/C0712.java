//問題12
//        ArrayList<Integer> を作成し、
//        5, 10, 15 を追加して 要素数だけ表示するプログラムを書きなさい。

import java.util.ArrayList;

class C0712 {
    public static void main(String[] args) {

        ArrayList<Integer> list = new ArrayList<>();

        list.add(5);
        list.add(10);
        list.add(15);

        System.out.println(list.size());
    }
}
