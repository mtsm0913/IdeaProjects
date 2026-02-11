//問題17：名前が3文字以下なら表示
//        条件
//• ArrayList list = {"Ken","Alice","Bob"}
//• 3文字以下の名前だけ表示

import java.util.ArrayList;
class D14070117 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Ken");
        list.add("Alice");
        list.add("Bob");
        for (String l : list) {
            if (l.length() <= 3) {
                System.out.println(l);
            }
        }
    }
}
