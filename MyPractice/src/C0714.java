//問題14
//        HashSet<String> を使って
//        "Java" , "Python" , "Java" を追加し、
//        最後に size() を表示するプログラムを書きなさい。

import java.util.HashSet;

class C0714 {
    public static void main(String[] args) {
        HashSet<String> pgLang = new HashSet<>();

        pgLang.add("Java");
        pgLang.add("Python");
        pgLang.add("Java");

        System.out.println(pgLang.size());
    }
}
