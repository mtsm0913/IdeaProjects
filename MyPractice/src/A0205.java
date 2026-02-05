//問題5：定数を使った計算
//• final intで「税率（10）」を定数として作る
//• int型の金額を用意する
//• 税込み金額を計算して表示する
//（計算式は自由）

class A0205 {
    public static void main(String[] args) {

//        Variable Definition
        final int TAX_RATE = 10;
        int amount = 100;
//        double total = 0;
        int total = 0;

//        Processing
//        total = amount * (1 + (TAX_RATE * 0.01));
        total = amount + amount * TAX_RATE / 100;

//        Output
        System.out.println(total);
    }
}
