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
//    ArrayList<CartItem> items = new ArrayList<>();
//    private に修正
    private ArrayList<CartItem> items = new ArrayList<>();

//    メソッド
    public void addItem(Product p, int quantity) {
        CartItem ci = new CartItem(p, quantity);

//        ★ ci を items に追加
        items.add(ci);
    }

    public void showAll() {
        for (CartItem ci : items) {
            ci.show();
        }
    }
    public int getTotal() {
        int total = 0;
        for (CartItem ci : items) {
            total += ci.getSubtotal();
        }
        return total;
    }
}

// --------------------------------------------------
// Mainクラス
// --------------------------------------------------
class E1603 {
    public static void main(String[] args) {
        Product p1 = new Product("Pen", 120);
        Product p2 = new Product("Notebook", 200);
        Product p3 = new Product("clear file", 110);
        Cart cart = new Cart();
        cart.addItem(p1, 1);
        cart.addItem(p2, 2);
        cart.addItem(p3, 3);
        cart.showAll();
        System.out.println("合計金額：" + cart.getTotal());
    }
}
