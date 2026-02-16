//実習2：成績管理ミニアプリ
//        条件
//• Student クラスを作る
//◦ フィールド： name （String）, scores （ArrayList）
//        ◦ name はコンストラクタで受け取る
//◦ addScore(int score) ：点数を追加
//◦ getAverage() ：平均点を int で返す
//◦ showInfo() ：名前と平均点を表示する
//• main では：
//        ◦ 学生を3人作る（例：Taro, Hanako, Ken）
//        ◦ それぞれに3教科ぶんくらいの点数を addScore で追加
//◦ 全員分の showInfo() を呼んで、
//        「名前：◯◯ / 平均：△△」 のように表示

import java.util.ArrayList;
class Student {
    private String name;
    ArrayList<Integer> scores = new ArrayList<>();

    Student(String name) {
        this.name = name;
    }

    public void addScore(int score) {
        scores.add(score);
    }
    public int getAverage() {
        int total = 0;
        for (int s : scores) {
            total += s;
        }
        return total / scores.size();
    }
    public void showInfo() {
        System.out.println("名前：" + name + " / 平均：" + getAverage());
    }
}

class E1602 {
    public static void main(String[] args) {
        Student s1 = new Student("Taro");
        Student s2 = new Student("Hanako");
        Student s3 = new Student("Ken");

        s1.addScore(15);
        s1.addScore(25);
        s1.addScore(40);

        s2.addScore(45);
        s2.addScore(55);
        s2.addScore(70);

        s3.addScore(75);
        s3.addScore(85);
        s3.addScore(100);

        s1.showInfo();
        s2.showInfo();
        s3.showInfo();
    }
}
