class Temp {
    public static void greet() {
        System.out.println("こんにちは");
    }
    public static int add(int a, int b) {
        return a + b;
    }
    public static void main(String[] args) {
        greet();
        System.out.println("計算結果：" + add(1, 2));
    }
}
