//問5
//次のコードにはバグがある。どこが問題か説明せよ。
//コードブロック

// コンストラクタの中で引数のnameに引数のnameを代入する形となっている。
// this.name = name; とするのが正しい。

//class Person {
//    String name;
//    Person(String name) {
//        name = name;
//    }
//}

//class Person {
//    String name;
//    Person(String name) {
//        this.name = name;
//    }
//}
//class E1305 {
//    public static void main(String[] args) {
//        Person p = new Person("mtsm");
//        System.out.println(p.name);
//    }
//}
