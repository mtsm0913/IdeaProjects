//問題18：配列の平均が60以上なら合格
//        条件
//• int[] scores = {70,50,60}

class D14070118 {
    public static void main(String[] args) {
        int[] scores = {70, 50, 60};
        int total = 0;
        int avg = 0;
        for (int s : scores) {
            total += s;
        }
        avg = total / scores.length;
        if (avg >= 60) {
            System.out.println("合格");
        }
    }
}
