// --------------------------------------------------
// 例外を投げる・作る
// --------------------------------------------------
//問題1：年齢チェックで例外を投げよう
//        条件
//メソッド名：checkAge
//引数：int age
//age が 0 未満なら throw new Exception("不正な年齢")
//        throws Exception を付ける
//main で try-catch を書く

class Main {
    public static void checkAge(int age) throws Exception {
        if (age < 0) {
            throw new Exception("不正な年齢");
        }
    }
    public static void main(String[] args) {
        try {
            checkAge(-1);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}

// --------------------------------------------------
//問題2：文字列が空なら例外にする
//        条件
//メソッド名：checkName
//空文字なら例外を throw
//        throws Exception をつける
//main で呼び出して catch

//class Main {
//    public static void checkName(String name) throws Exception {
//        if (name.equals("")) {
//            throw new Exception("名前が不正です");
//        }
//    }
//    public static void main(String[] args) {
//        try {
//            checkName("");
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}

// --------------------------------------------------
//問題3：自作例外を作って使おう
//        条件
//クラス名：InvalidPriceException
//price が 0 未満なら throw
//メッセージ：「価格が不正です」
//main で例外を受け取って表示

//class InvalidPriceException extends Exception {
//    InvalidPriceException(String message) {
//        super(message);
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        try {
//            int price = -1;
//            if (price < 0) {
//                throw new InvalidPriceException("価格が不正です");
//            }
//        } catch (Exception e) {
//            System.out.println(e.getMessage());
//        }
//    }
//}

// --------------------------------------------------
// ファイル読み書き
// --------------------------------------------------
//問題1：ファイルに文字を書いてみよう
//
//        条件
//ファイル名：hello.txt
//内容：「こんにちはファイル」
//        Files.writeString() を使い、任意の文字列を書き込む。
//        try-catch 必須。例外が発生したら、書き込みに失敗したと表示する。
//エラーが出なければ書き込み成功

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//class Main {
//    public static void main(String[] args) {
//        try {
//            Path path = Paths.get("hello.txt");
//            Files.writeString(path, "こんにちはファイル");
//        } catch (Exception e) {
//            System.out.println("書き込みに失敗した");
//        }
//    }
//}

// --------------------------------------------------
//問題2：読み込んで確認しよう
//
//        条件
//ファイル名：hello.txt
//中身を読み取って println する
//try-catch を使う

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//class Main {
//    public static void main(String[] args) {
//        try {
//            Path path = Paths.get("hello.txt");
//            String text = Files.readString(path);
//            System.out.println(text);
//        } catch (Exception e) {
//            System.out.println("読み込みに失敗した");
//        }
//    }
//}

// --------------------------------------------------
//問題3：書いて → 読む を一連でやる
//条件
//ファイル名：data.txt
//内容：「Java Study」
//書き込み → 読み込み → 表示
//全体を try-catch で囲む

//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;
//
//class Main {
//    public static void main(String[] args) {
//        try {
//            Path path = Paths.get("data.txt");
//            Files.writeString(path, "Java Study");
//            String text = Files.readString(path);
//            System.out.println(text);
//        } catch (Exception e) {
//            System.out.println("失敗");
//        }
//    }
//}

// --------------------------------------------------
// 例外処理
// --------------------------------------------------
//問題1：0で割る処理を try-catch で守ろう
//        条件
//10 ÷ 0 を計算するコードを書く
//try-catch で囲む
//catch では「計算できません」と表示

//import java.util.logging.Logger;
//class Main {
//    private static final Logger logger = Logger.getLogger(Main.class.getName());
//    public static void main(String[] args) {
//        try {
//            int a = 10 / 0;
//        } catch (Exception e) {
//            System.out.println("計算できません");
//        }
//    }
//}

// --------------------------------------------------
//問題2：配列の範囲外アクセスをキャッチ
//        条件
//int 配列 {1, 2, 3}
//インデックス 5 を読み込む（例外になる）
//        try-catch で囲む

//import java.util.logging.Logger;
//class Main {
//    private static final Logger logger = Logger.getLogger(Main.class.getName());
//    public static void main(String[] args) {
//        try {
//            int[] array = {1, 2, 3};
//            System.out.println(array[5]);
//        } catch (Exception e) {
//            System.out.println("！！！配列範囲外にアクセス！！！");
//        }
//    }
//}

// --------------------------------------------------
//問題3：文字列を数値に変換してみよう
//        条件
//"abc" を Integer.parseInt() に渡す（例外になる）
//        try-catch で処理を守る
//catch は「数値に変換できません」と表示

//import java.util.logging.Logger;
//class Main {
//    private static final Logger logger = Logger.getLogger(Main.class.getName());
//    public static void main(String[] args) {
//        try {
//            int num = Integer.parseInt("abc");
//        } catch (Exception e) {
//            System.out.println("数値に変換できません");
//        }
//    }
//}

// --------------------------------------------------
// オーバーライド
// --------------------------------------------------
//問題1：Animal → Dog をオーバーライド
//条件
//Animal：speak()（「動物が鳴きます」）
//Dog：Animal を継承し、speak() を上書きして「ワン！」
//main で speak() を呼ぶ

//class Animal {
//    void speak() {
//        System.out.println("動物が鳴きます");
//    }
//}
//class Dog extends Animal {
//    @Override
//    void speak() {
//        System.out.println("ワン！");
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        Animal a = new Animal();
//        Dog d = new Dog();
//        a.speak();
//        d.speak();
//    }
//}

// --------------------------------------------------
//問題2：Person → Student の showInfo 上書き
//条件
//Person：name と showInfo（「名前：◯◯」）
//Student：Person を継承し、showInfo を上書きして
// 「学生：◯◯」と表示
//main で Student の showInfo を呼ぶ

//class Person {
//    String name = "Ohta";
//    void showInfo() {
//        System.out.println("名前：" + name);
//    }
//}
//class Student extends Person {
//    @Override
//    void showInfo() {
//        System.out.println("学生：" + name);
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        Student s = new Student();
//        s.showInfo();
//    }
//}

// --------------------------------------------------
//問題3：Shape の draw() を上書き
//条件
//Shape：draw()（「図形を描きます」）
//Circle：Shape を継承し、draw() を上書きして「円を描きます」
//main で Circle の draw() を呼ぶ

//class Shape {
//    void draw() {
//        System.out.println("図形を描きます");
//    }
//}
//class Circle extends Shape {
//    void draw() {
//        System.out.println("円を描きます");
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        Circle c = new Circle();
//        c.draw();
//    }
//}

// --------------------------------------------------
// 継承
// --------------------------------------------------
//問題1：Animal を継承した Dog クラスを作ろう
//条件
//Animal：eat() を持つ
//Dog：Animal を継承
//Dog に bark() を追加
//main で両方呼び出す

//class Animal {
//    void eat() {
//        System.out.println("食べる");
//    }
//}
//class Dog extends Animal {
//    void bark() {
//        System.out.println("吠える");
//    }
//}
//
//class Main {
//    public static void main(String[] args) {
//        Animal a = new Animal();
//        Dog d = new Dog();
//        a.eat();
//        d.bark();
//    }
//}

// --------------------------------------------------
//問題2：Person を継承した Student
//        条件
//Person：name を持ち、showName() を持つ
//Student：Person を継承し、study() を追加
//main で両方のメソッドを呼ぶ

//class Person {
//    private String name = "Ohta";
//    void showName() {
//        System.out.println(name);
//    }
////    Person(String name) {
////        this.name = name;
////    }
//}
//class Student extends Person {
//    void study() {
//        System.out.println("勉強する");
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        Person p = new Person();
//        Student s = new Student();
//        p.showName();
//        s.study();
//    }
//}

// --------------------------------------------------
//問題3：Vehicle → Car の継承
//条件
//Vehicle に run()
//Car は Vehicle を継承し、brand を持つ
//main で brand を設定し、run() を呼ぶ

//class Vehicle {
//    void run() {
//        System.out.println("走る");
//    }
//}
//class Car extends Vehicle {
//    String brand;
//    Car(String brand) {
//        this.brand = brand;
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        Car c = new Car("TOYOTA");
//        c.run();
//        System.out.println(c.brand);
//    }
//}

// --------------------------------------------------
// カプセル化
// --------------------------------------------------
//問題1：Book クラスをカプセル化しよう
//条件
//フィールド：title（String）
//フィールドは private
//getter と setter を作る
//main で値をセット → 表示

//class Book {
//    private String title;
//    public String getTitle() {
//        return title;
//    }
//    public void setTitle(String title) {
//        this.title = title;
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        Book b = new Book();
//        b.setTitle("生成AI入門");
//        System.out.println(b.getTitle());
//    }
//}

// --------------------------------------------------
//問題2：Person の年齢にチェックを入れよう
//条件
//フィールド：age（int, private）
//setter で「0以上のときだけセット」
//main で age を設定して表示

//class Person {
//    private int age;
//    public void setAge(int age) {
//        if (age >= 0) {
//            this.age = age;
//        } else {
//            System.out.println("年齢に不正な値が入力されました：" + age);
//        }
//    }
//    public int getAge() {
//        return age;
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        Person p1 = new Person();
//        Person p2 = new Person();
//        Person p3 = new Person();
//
//        p1.setAge(1);
//        p2.setAge(0);
//        p3.setAge(-1);
//
//        System.out.println("p1: " + p1.getAge());
//        System.out.println("p2: " + p2.getAge());
//        System.out.println("p3: " + p3.getAge());
//    }
//}

//問題3：Product クラスで価格を守る
//条件
//フィールド：name（String）, price（int）
//どちらも private
//setter で price が 0 以上のみ許可
//main で設定して両方表示

//class Product {
//    private String name;
//    private int price;
//
//    public void setName(String name) {
//        this.name = name;
//    }
//    public void setPrice(int price) {
//        if (price >= 0) {
//            this.price = price;
//        } else {
//            System.out.println(name + "の金額に不正な値が入力されました：" + price);
//        }
//    }
//    public String getName() {
//        return name;
//    }
//    public int getPrice() {
//        return price;
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        Product p1 = new Product();
//        Product p2 = new Product();
//        Product p3 = new Product();
//
//        p1.setName("apple");
//        p1.setPrice(100);
//
//        p2.setName("orange");
//        p2.setPrice(0);
//
//        p3.setName("melon");
//        p3.setPrice(-100);
//
//        System.out.println("--------------------------------------------------");
//
//        System.out.println(p1.getName());
//        System.out.println(p1.getPrice());
//        System.out.println(p2.getName());
//        System.out.println(p2.getPrice());
//        System.out.println(p3.getName());
//        System.out.println(p3.getPrice());
//    }
//}

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

//class Item {
//    String name;
//    int price;
//    Item(String name, int price) {
//        this.name = name;
//        this.price = price;
//    }
//}
//class Order {
//    Item item;
//    int quantity;
//    Order(Item item, int quantity) {
//        this.item = item;
//        this.quantity = quantity;
//    }
//}
//class Main {
//    public static void main(String[] args) {
//        Item i = new Item("PC", 50000);
//        Order o = new Order(i, 10);
//        System.out.println(i.name);
//        System.out.println(i.price * o.quantity);
//    }
//}

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
