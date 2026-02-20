//問題2：クラス同士の組み合わせ（Order と Product）
//条件
//• 上記 Product を利用する
//• 注文 1 件を表す Order クラスを作る
//• フィールド
//◦ product （Product 型）
//        ◦ quantity （数量：int）
//        • コンストラクタで product と quantity を受け取る
//• getTotalPrice() を作る（price×quantity）
//        • main で Order を生成し、合計金額を表示する

//class Product {
//
//    //    フィールド
//    private String name;
//    private int price;
//
//    //    コンストラクタ
//    Product(String name, int price) {
//        this.name = name;
//        this.price = price;
//    }
//
//    //    getter
//    String getName() {
//        return name;
//    }
//    int getPrice() {
//        return price;
//    }
//}

class Order {

//    フィールド
    private Product product;
    private int quantity;

//    コンストラクタ
    Order(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

//    メソッド
    int getTotalPrice() {
        return product.getPrice() * quantity;
    }
}

class E2302 {
    public static void main(String[] args) {
        Product p = new Product("Pen", 200);
        Order o = new Order(p, 2);
        System.out.println(o.getTotalPrice());
    }
}
