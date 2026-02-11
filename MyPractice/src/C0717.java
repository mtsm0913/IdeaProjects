//問題17
//        次のコードを実行したとき、 size() の結果はいくつになるか答えなさい。

// 2

import java.util.HashSet;
class C0717 {
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        set.add("A");
        set.add("B");
        set.add("A");
        System.out.println(set.size());
    }
}
