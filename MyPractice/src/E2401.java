//問題1：図形クラスの継承とオーバーライド
//        条件
//• 図形を表す Shape クラスを作成する
//◦ メソッド getArea() （戻り値 double）を定義する
//◦ 内容は「0.0 を返す」だけ
//• Shape を継承した
//◦ Circle （半径 radius）
//        ◦ Rectangle （幅 width、高さ height）
//を作る
//• Circle は 面積 = 半径 × 半径 × 3.14
//        • Rectangle は 面積 = 幅 × 高さ
//• main で Circle と Rectangle を生成し、面積を表示する

class Shape {

//    メソッド
    double getArea() {
        return 0.0;
    }
}

class Circle extends Shape {

//    フィールド
    private double radius;

//    コンストラクタ
    Circle(double radius) {
        this.radius = radius;
    }

//    メソッド
    @Override
    double getArea() {
        return radius * radius * 3.14;
    }
}

class Rectangle extends Shape {

//    フィールド
    private double width;
    private double height;

//    コンストラクタ
    Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

//    メソッド
    @Override
    double getArea() {
        return width * height;
    }
}

class E2401 {
    public static void main(String[] args) {

//        インスタンス生成
        Circle c = new Circle(2);
        Rectangle r = new Rectangle(3, 4);

//        結果表示
        System.out.println(c.getArea());
        System.out.println(r.getArea());
    }
}
