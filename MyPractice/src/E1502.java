//問題2：料理注文システム
//レストランの注文を表すプログラムを作る。
//条件
//• Food（料理名 と 価格）
//        • Order（Food と 数量）
//        • main で
//Food f = new Food("Ramen", 800);
//Order o = new Order(f, 2);
//表示結果
//料理名: Ramen
//単価: 800
//数量: 2
//合計金額: 1600
//        ※ 合計は price × quantity で計算すること

//class Food {
//    String name;
//    int price;
//    Food(String name, int price) {
//        this.name = name;
//        this.price = price;
//    }
//}
//class Order {
//    Food food;
//    int quantity;
//    Order(Food food, int quantity) {
//        this.food = food;
//        this.quantity = quantity;
//    }
//}
//class E1502 {
//    public static void main(String[] args) {
//        Food f = new Food("Ramen", 800);
//        Order o = new Order(f, 2);
//
//        int totalPrice = f.price * o.quantity;
//
//        System.out.println("料理名: " + f.name);
//        System.out.println("単価: " + f.price);
//        System.out.println("数量: " + o.quantity);
//        System.out.println("合計金額: " + totalPrice);
//    }
//}
