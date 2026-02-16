//実習3：ショッピングカートミニアプリ
//        条件
//• 商品を表す Product クラス
//◦ フィールド： name （String）, price （int）
//        ◦ すべて private
//◦ コンストラクタ（name, price）
//        ◦ getter（set は不要）
//        • カート内の1行ぶんを表す CartItem クラス
//◦ フィールド： product （Product）, quantity （int）
//        ◦ コンストラクタ（product, quantity）
//        ◦ getSubtotal() ：小計（price × quantity）を返す
//◦ show() ：商品名・数量・小計を表示
//• カート全体を表す Cart クラス
//◦ フィールド： items （ArrayList）
//        ◦ addItem(Product p, int quantity) ：CartItem を作って追加
//◦ showAll() ：全ての CartItem の show() を呼ぶ
//◦ getTotal() ：合計金額を返す
//• main では：
//        ◦ Product を3つくらい作る（Pen 120円, Notebook 200円 など）
//        ◦ Cart を1つ作る
//◦ addItem でいくつか商品を追加
//◦ showAll() で中身を表示
//◦ 最後に合計金額も表示

import java.util.ArrayList;

// --------------------------------------------------
// 商品
// --------------------------------------------------
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
    public String getName() {
        return name;
    }
    public int getPrice() {
        return price;
    }
}

// --------------------------------------------------
// カート内の１行分
// --------------------------------------------------
class CartItem {

//    フィールド
    private Product product;
    private int quantity;

//    コンストラクタ
    CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
    }

//    小計を返す
    public int getSubtotal() {
        return product.getPrice() * quantity;
    }

//    商品名・数量・小計を表示
    public void show() {
        System.out.println("商品名：" + product.getName() + " / 数量：" + quantity + " / 小計：" + getSubtotal());
    }
}

// --------------------------------------------------
// カート全体
// --------------------------------------------------
class Cart {

//    フィールド
    ArrayList<CartItem> items = new ArrayList<>();

//    メソッド
    public void addItem(Product p, int quantity) {
//        items.add(p);
//        items.add(quantity);

    }
}

// --------------------------------------------------
// Mainクラス
// --------------------------------------------------
class E1603 {
    public static void main(String[] args) {

    }
}
