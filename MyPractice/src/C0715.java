//問題15
//        HashMap<String, Integer> を使って
//        "Apple" → 100 , "Orange" → 80 を登録し、
//        "Apple" の値を表示するプログラムを書きなさい。

import java.util.HashMap;

class C0715 {
    public static void main(String[] args) {
        HashMap<String, Integer> products = new HashMap<>();

        products.put("Apple", 100);
        products.put("Orange", 80);

        System.out.println(products.get("Apple"));
    }
}
