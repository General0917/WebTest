package mathAlgorithrmBook.chapter2;

public class code2_3_1 {
    static int cnt = 1000;
    public static void main(String[] args) {
        System.out.println(func1());
        System.out.println(func2(500));
        System.out.println(func2(500));
    }

    public static int func1 () {
        return 2021;
    }

    public static int func2 (int pos) {
        cnt += 1;
        return cnt + pos;
    }
}
