//問題36
//次のwhile文は、ある条件下で無限ループになる可能性がある。
//その条件を説明しなさい。
//コードブロック
//int i = 10;
//while (i > 0) {
//    System.out.println(i);
//    i = i / 2;
//}

class C0436 {
    public static void main(String[] args) {
        int i = 6;
        while (i > 0) {
            System.out.println(i);
            i = i / 2;
        }
    }
}
