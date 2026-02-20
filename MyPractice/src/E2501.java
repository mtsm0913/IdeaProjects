//■ プロジェクト1：ポイントカード管理アプリ
//（クラス同士の組み合わせ＋例外処理）
//目的
//• has-a（クラスの組み合わせ）
//        • メソッド分割
//• 例外処理
//をまとめて扱う。
//条件
//• 会員を表す Member クラス
//◦ name
//◦ point
//◦ addPoint(int)
//◦ usePoint(int) （残高不足なら例外 PointException を投げる）
//        • 店舗側の管理クラス ShopSystem
//◦ members （ArrayList）
//        ◦ 会員追加 addMember(Member)
//◦ 全会員一覧表示
//• main で
//◦ 会員2人を登録
//◦ ポイントを加算
//◦ 足りないポイントの使用で例外が発生する動作を確認

import java.util.ArrayList;
// --------------------------------------------------
// Point 例外
// --------------------------------------------------
class PointException extends Exception {
  PointException(String msg) {
    super(msg);
  }
}

// --------------------------------------------------
// Member クラス
// --------------------------------------------------
class Member {

// フィールド
  private String name;
  private int point;

  //  コンストラクタ
//  ★★★ pointの初期値はゼロとし、コンストラクタではセットしない ★★★
//  Member(String name, int point) {
  Member(String name) {
    this.name = name;
//    this.point = point;
    this.point = 0;
  }

  //  ポイント追加
  void addPoint(int point) {
    this.point += point;
  }

  //  getter
//  String getName() {
//    return name;
//  }
//  int getPoint() {
//    return point;
//  }

//  name と point をまとめて表示
  String getInfo() {
    return name + " / " + point + "pt";
  }
  //  throws
//  ★★★ staticなメソッドからstaticでないメソッドにはアクセスできない ★★★
//  public static void usePoint(int p) throws PointException {
  public void usePoint(int p) throws PointException {

//  ★★★ useポイントが残高より多ければ例外をthrowする ★★★
//    if (p <= 0) {
    if (p > point) {
      throw new PointException("残高不足です");
    }
//    ★★★ useポイントを残高から引く★★★
    point -= p;
  }
}

// --------------------------------------------------
// ShopSystem クラス
// --------------------------------------------------
class ShopSystem {

//  フィールド
  ArrayList<Member> members = new ArrayList<>();

//  会員追加
  void addMember(Member member) {
    members.add(member);
  }

//  全会員一覧表示
  void showMembers() {
    for (Member m : members) {
      System.out.println(m.getInfo());
    }
  }
}

// --------------------------------------------------
// Main クラス
// --------------------------------------------------
class E2501 {
  public static void main(String[] args) {

//    ★★★ mainメソッドの中全体をtryで囲む ★★★
    try {
//    インスタンス生成
      Member m1 = new Member("Kazu");
      Member m2 = new Member("Sou");
      ShopSystem ss = new ShopSystem();

    //    会員登録
      ss.addMember(m1);
      ss.addMember(m2);

    //    ポイント加算
      m1.addPoint(100);
      m2.addPoint(200);

    //  ポイント消費
      m1.usePoint(0);
      m2.usePoint(201);

//      会員一覧表示
      ss.showMembers();

    } catch (PointException e) {
      System.out.println(e.getMessage());
    }
  }
}
