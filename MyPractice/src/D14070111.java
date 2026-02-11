//問題11：名前リストから"S"で始まる名前を表示
//        条件
//• ArrayList names = {"Sara","Bob","Steve"}
//• Sで始まる名前を全部表示

import java.util.ArrayList;
class D14070111 {
    public static void main(String[] args) {
        ArrayList<String> names = new ArrayList<>();
        names.add("Sara");
        names.add("Bob");
        names.add("Steve");
        for (int i = 0; i < names.size(); i++) {
            if (names.get(i).charAt(0) == 'S') {
                System.out.println(names.get(i));
            }
        }
//        模範解答
//        for (String n : names) {
//            if (n.charAt(0) == 'S') {
//                System.out.println(n);
//            }
//        }
    }
}
