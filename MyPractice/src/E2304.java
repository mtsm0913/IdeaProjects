//問題4：多態性（Polymorphism）を使ったクラス設計
//        条件
//• 上記 Animal を利用する
//• Cat クラスを追加（speak は「ニャー」）
//        • Animal 配列（または ArrayList）に
//◦ Animal
//◦ Dog
//◦ Cat
//        をまとめて入れる
//• for-each で speak() を呼ぶ

class Animal {

    //    メソッド
    private String name;

    //    コンストラクタ
    Animal(String name) {
        this.name = name;
    }

    void speak() {
        System.out.println("・・・・・・");
    }
}

class Dog extends Animal {

    Dog(String name) {
        super(name);
    }

//    ★★★ アノテーション ★★★
    @Override
    void speak() {
        System.out.println("ワン！");
    }
}

class Cat extends Animal {

    //    コンストラクタ
    Cat(String name) {
        super(name);
    }

    @Override
    void speak() {
        System.out.println("ニャー");
    }
}

class E2304 {
    public void main(String[] args) {
        Animal[] animals = {
                new Animal("動物"),
                new Dog("犬"),
                new Cat("猫")
        };

        for (Animal a : animals) {
            a.speak();
        }

    }
}
