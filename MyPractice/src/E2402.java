//問題2：乗り物クラスと多態性
//        条件
//        • 基底クラス Vehicle を作る
//◦ run() メソッドを持ち、「移動します」と表示
//• Car クラスは「車が走ります」
//        • Bicycle クラスは「自転車が走ります」
//        • Vehicle 配列に Car と Bicycle を入れ、for-each で run() を呼ぶ

class Vehicle {

//    メソッド
    void run() {
        System.out.println("移動します");
    }
}

class Car extends Vehicle {

//    メソッド
    @Override
    void run() {
        System.out.println("車が走ります");
    }
}

class Bicycle extends Vehicle {

//    メソッド
    @Override
    void run() {
        System.out.println("自転車が走ります");
    }
}

class E2402 {
    public static void main(String[] args) {

//        インスタンス生成
        Car car = new Car();
        Bicycle bicycle = new Bicycle();

//        配列作成
        Vehicle[] vehicles = {car, bicycle};

//        出力
        for (Vehicle v : vehicles) {
            v.run();
        }
    }
}
