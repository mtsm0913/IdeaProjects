import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {

        Cart cart = new Cart();

        cart.addProduct(new Product("商品A", 3000));
        cart.addProduct(new Product("商品B", 5000));
        cart.addProduct(new Product("商品C", 4000));

        cart.printCart();

        int total = cart.getTotalPrice();
        int discounted = cart.getDiscountedPrice();

        System.out.println();
        System.out.println("合計金額: " + total + "円");
        System.out.println("割引後金額: " + discounted + "円");
    }
}

/* -----------------------------
   Product（商品クラス）
----------------------------- */
class Product {

    // フィールドを定義せよ
    private String productName;
    private int price;

    // コンストラクタを作成せよ
    public Product(String productName, int price) {
        this.productName = productName;
        this.price = price;
    }

    // 商品名を取得するメソッドを作成せよ
    public String getProductName() {
        return productName;
    }

    // 価格を取得するメソッドを作成せよ
    public int getPrice() {
        return price;
    }
}

/* -----------------------------
   Cart（カートクラス）
----------------------------- */
class Cart {

    // 商品リストを保持するフィールドを定義せよ
    private ArrayList<Product> productslist = new ArrayList<>();

    // コンストラクタを作成せよ
    public Cart() {

    }

    // 商品を追加するメソッドを作成せよ
    public void addProduct(Product product) {
        productslist.add(product);
    }

    // 合計金額を計算するメソッドを作成せよ
    public int getTotalPrice() {
        int totalPrice = 0;
        for (Product p : productslist) {
            totalPrice += p.getPrice();
        }
        return totalPrice;
    }

    /*
      合計金額が10000円以上の場合は10%割引する。
      割引後金額を返すメソッドを作成せよ。
    */
    public int getDiscountedPrice() {
        int totalPrice = getTotalPrice();
        if (totalPrice >= 10000) {
            totalPrice -= totalPrice / 10;
        }
        return totalPrice; // 修正すること
    }

    // カート内容を表示するメソッドを作成せよ
    public void printCart() {
        for (Product p  : productslist) {
            System.out.println("商品名：" + p.getProductName() + " ／ 価格：" + p.getPrice() + "円");
        }
    }
}
