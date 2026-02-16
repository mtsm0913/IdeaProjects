//2. == を試してみよう
//public class E1401 {
//    public static void main(String[] args) {
//        String a = new String("Hello");
//        String b = new String("Hello");
//        System.out.println(a == b);
//    }
//}

//3. equals() を使ってみよう
//public class E1401 {
//    public static void main(String[] args) {
//        String a = new String("Hello");
//        String b = new String("Hello");
//        System.out.println(a.equals(b));
//    }
//}

//4. 自分で作ったクラスで試す
//class Person {
//    String name;
//}
//public class E1401 {
//    public static void main(String[] args) {
//        Person p1 = new Person();
//        Person p2 = new Person();
//        p1.name = "Taro";
//        p2.name = "Taro";
//        System.out.println(p1 == p2);
//        System.out.println(p1.equals(p2));
//    }
//}

//5. equals() を自分で作る
//class Person {
//    String name;
//    @Override
//    public boolean equals(Object obj) {
//        Person other = (Person) obj;
//        return this.name.equals(other.name);
//    }
//}
//public class E1401 {
//    public static void main(String[] args) {
//        Person p1 = new Person();
//        Person p2 = new Person();
//        p1.name = "Taro";
//        p2.name = "Taro";
//        System.out.println(p1.equals(p2));
//    }
//}

//8. 最後の確認問題
public class E1401 {
    public static void main(String[] args) {
        String x = "Java";
        String y = "Java";
        System.out.println(x == y);
    }
}
// true
