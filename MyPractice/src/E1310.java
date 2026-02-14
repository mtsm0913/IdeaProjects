//問10
//次の説明に合うクラスを設計せよ。
//        「スマートフォン。機種名と価格を持ち、作成時に必ず両方セットされる」

class SmartPhone {
    String modelName;
    int price;
    SmartPhone(String modelName, int price) {
        this.modelName = modelName;
        this.price = price;
    }
}
class E1310 {
    public static void main(String[] args) {
        SmartPhone sp = new SmartPhone("iPhone", 100000);
        System.out.println(sp.modelName);
        System.out.println(sp.price);
    }
}
