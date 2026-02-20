//問題1：商品クラスの設計（基礎クラス設計）
//条件
//• 商品を表す Product クラスを作成する
//• 以下のフィールドを private で持つ
//◦ name （商品名：String）
//        ◦ price （価格：int）
//        • コンストラクタで 2 つの値を受け取る
//• それぞれの getter を作る
//• main で Product を2つ生成し、名前と価格を表示する

class Product {

//    フィールド
    private String name;
    private int price;

//    コンストラクタ
    Product(String name, int price) {
        this.name = name;
        this.price = price;
    }

//    getter
    String getName() {
        return name;
    }
    int getPrice() {
        return price;
    }
}

class E2301 {
    public static void main(String[] args) {

//        インスタンス生成
        Product p1 = new Product("book", 2000);
        Product p2 = new Product("pencil", 100);

//        表示
        System.out.println(p1.getName());
        System.out.println(p1.getPrice());
        System.out.println(p2.getName());
        System.out.println(p2.getPrice());
    }
}
