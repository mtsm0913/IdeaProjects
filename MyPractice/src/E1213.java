//問題13
//次のコードの出力結果を書きなさい。
//コードブロック

// Sony
// Android
class Phone {
    String brand;
}
class E1213 {
    public static void main(String[] args) {
        Phone p1 = new Phone();
        Phone p2 = new Phone();
        p1.brand = "Apple";
        p2.brand = "Android";
        p1.brand = "Sony";
        System.out.println(p1.brand);
        System.out.println(p2.brand);
    }
}
