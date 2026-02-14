// --------------------------------------------------
// クラスの組み合わせ
// --------------------------------------------------
//問題1：著者と本を組み合わせよう
//        条件
//Author クラス（name を持つ）
//Book クラス（title と Author を持つ）
//main で Author → Book の順に作る
//最後に本のタイトルと著者名を表示

//class Author {
//    String name;
//    Author(String name) {
//        this.name = name;
//    }
//}
//class Book {
//    String title;
//    Author author;
//    Book(String title, Author author) {
//        this.title = title;
//        this.author = author;
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        Author a = new Author("Imao");
//        Book b = new Book("地図帳の深読み", a);
//        System.out.println(b.title);
//        System.out.println(b.author.name);
//    }
//}

// --------------------------------------------------
//問題2：学校と生徒の関係
//        条件
//Student（name）
//School（schoolName と Student）
//main で Student を1つ作り、それを School に渡す
//        最後に学校名と生徒名を表示する

//class Student {
//    String name;
//    Student(String name) {
//        this.name = name;
//    }
//}
//class School {
//    String schoolName;
//    Student student;
//    School(String schoolName, Student student) {
//        this.schoolName = schoolName;
//        this.student = student;
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        Student st = new Student("Ohta");
//        School sc = new School("Takakei", st);
//        System.out.println(sc.schoolName);
//        System.out.println(sc.student.name);
//    }
//}

// --------------------------------------------------
//問題3：商品と注文を作ろう
//        条件
//Item（name と price）
//Order（Item と数量 quantity）
//main で Item → Order の順に作る
//商品名と金額を表示

class Item {
    String name;
    int price;
    Item(String name, int price) {
        this.name = name;
        this.price = price;
    }
}
class Order {
    Item item;
    int quantity;
    Order(Item item, int quantity) {
        this.item = item;
        this.quantity = quantity;
    }
}
class Main {
    public static void main(String[] args) {
        Item i = new Item("PC", 50000);
        Order o = new Order(i, 10);
        System.out.println(i.name);
        System.out.println(i.price * o.quantity);
    }
}

// --------------------------------------------------
// コンストラクタ
// --------------------------------------------------
//問題1：Book クラスにコンストラクタ
//条件
//クラス名：Book
//フィールド：title（String）
//コンストラクタで title を受け取ってセットする
//main で "Java入門" を渡して表示

//class Book {
//    String title;
//    Book(String title) {
//        this.title = title;
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        Book b = new Book("Java入門");
//        System.out.println(b.title);
//    }
//}

// --------------------------------------------------
//問題2：Person クラスで name と age をまとめて設定
//条件
//Person クラス
//フィールド：name（String）, age（int）
//コンストラクタで2つまとめてセット
//main で好きな値を使う

//class Person {
//    String name;
//    int age;
//    Person(String name, int age) {
//        this.name = name;
//        this.age = age;
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        Person p = new Person("Mito", 27);
//        System.out.println(p.name);
//        System.out.println(p.age);
//    }
//}

// --------------------------------------------------
//問題3：Animal クラスで3つのフィールドを初期化
//条件
//Animal クラス
//フィールド：name（String）, type（String）, age（int）
//コンストラクタで3つセット
//main で1つオブジェクトを作り、値を表示

//class Animal {
//    String name;
//    String type;
//    int age;
//    Animal(String name, String type, int age) {
//        this.name = name;
//        this.type = type;
//        this.age = age;
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        Animal a = new Animal("Jiro", "dog", 2);
//        System.out.println(a.name);
//        System.out.println(a.type);
//        System.out.println(a.age);
//    }
//}

// --------------------------------------------------
// メソッド分割
// --------------------------------------------------
//問題1：挨拶メソッドを分けよう
//        条件
//メソッド名：greet
//「こんにちは」を表示する
//main から呼び出す
//main をスッキリさせることが目的

//class Main {
//    public static void greet() {
//        System.out.println("こんにちは");
//    }
//    public static void main(String[] args) {
//        greet();
//    }
//}

// --------------------------------------------------
//問題2：計算メソッドを分けよう
//        条件
//メソッド名：multiply
//引数：int x, int y
//戻り値：x と y の掛け算結果
//main で呼び出して表示

//class Main {
//    public static int multiply(int x, int y) {
//        return x * y;
//    }
//    public static void main(String[] args) {
//        System.out.println(multiply(3, 4));
//    }
//}

// --------------------------------------------------
//問題3：メソッド分割で読みやすくしよう
//        条件
//挨拶・計算・結果表示をそれぞれ別メソッドに分ける
//計算は「2つの数字の合計」を返す
//main は“流れの管理”だけにする

//class Main {
//    public static void greet() {
//        System.out.println("こんにちは");
//    }
//    public static int addition(int x, int y) {
//        return x + y;
//    }
////    public static void displayResult() {
////    }
//    public static void main(String[] args) {
//        greet();
//        System.out.println(addition(4, 3));
//    }
//}

// --------------------------------------------------
// メソッド
// --------------------------------------------------
//問題1：メッセージを表示するメソッド
//        条件
//戻り値なし（void）
//メソッド名：hello
//「Hello Java」を表示する
//main で呼び出す

//class Main {
//
//    public static void hello() {
//        System.out.println("Hello Java");
//    }
//
//    public static void main(String[] args) {
//        hello();
//    }
//}

// --------------------------------------------------
//問題2：名前つきの挨拶メソッド
//        条件
//引数として名前（String）を受け取る
//「◯◯さん、こんにちは」と表示
//        好きな名前で呼び出す

//class Main {
//    public static void hello(String name) {
//        System.out.println(name + "さん、こんにちは");
//    }
//    public static void main(String[] args) {
//        hello("オオタ");
//    }
//}

// --------------------------------------------------
//問題3：2倍にして返すメソッド
//        条件
//int の引数を受け取る
//その2倍の値を「戻り値として返す」
//main で呼び出して結果を表示

//class Main {
//    public static int doubleNum(int num) {
//        return num * 2;
//    }
//    public static void main(String[] args) {
//        System.out.println(doubleNum(1000));
//    }
//}
