//実習1：簡易図書館アプリ
//        条件
//• 本を表す Book クラスを作る
//◦ フィールド： title （String）, author （String）
//        ◦ すべて private
//◦ コンストラクタ（title, author）
//        ◦ getter を用意（set はなくてもOK）
//        • 図書館を表す Library クラスを作る
//◦ フィールド： books （ArrayList）
//        ◦ 本を追加する addBook(Book book)
//◦ 全ての本を表示する showBooks()
//• main クラスで：
//        ◦ Library を1つ作る
//◦ 3冊ほど Book を作って addBook で追加
//◦ 最後に showBooks() で一覧表示

import java.util.ArrayList;
class Book {
  private String title;
  private String author;

  Book(String title, String author) {
    this.title = title;
    this.author = author;
  }

  public String getTitle() {
    return title;
  }

  public String getAuthor() {
    return author;
  }
}

class Library {
  ArrayList<Book> books = new ArrayList<>();

  public void addBook(Book book) {
    books.add(book);
  }

  public void showBooks() {
    for (Book book : books) {
      System.out.println("タイトル：" + book.getTitle());
      System.out.println("著者　　：" + book.getAuthor());
      System.out.println("--------------------");
    }
  }
}

class E1601 {
  public static void main(String[] args) {
    Library l = new Library();
    Book b1 = new Book("Java Silver", "志賀");
    Book b2 = new Book("COBOL入門", "結城");
    Book b3 = new Book("生成AIで世界はこう変わる", "今井");

    l.addBook(b1);
    l.addBook(b2);
    l.addBook(b3);
    l.showBooks();
  }
}
