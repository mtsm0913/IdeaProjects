//問題3：継承とオーバーライド（Animal → Dog）
//条件
//• 動物クラス Animal を作る
//◦ name （String）
//        ◦ コンストラクタ
//◦ speak() メソッド（内容は「……」を表示するだけ）
//        • Animal を継承した Dog クラスを作る
//◦ speak() をオーバーライドし「ワン！」と表示する
//• main で Animal と Dog を生成して speak を呼び比較する

//class Animal {
////    メソッド
//    private String name;
//
////    コンストラクタ
//    Animal(String name) {
//        this.name = name;
//    }
//
//    void speak() {
//        System.out.println("・・・・・・");
//    }
//}
//
//class Dog extends Animal {
//    Dog(String name) {
//        super(name);
//    }
//
////    ★★★ アノテーション ★★★
//    @Override
//    void speak() {
//        System.out.println("ワン！");
//    }
//}
//
//class E2303 {
//    public static void main(String[] args) {
//        Animal a = new Animal("cat");
//        Dog d = new Dog("dog");
//        a.speak();
//        d.speak();
//    }
//}
