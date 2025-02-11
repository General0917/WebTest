package mathAlgorithrmBook.chapter2;

public class code2_2_1 {
    public static void main(String[] args) {
        // 四則演算
        System.out.println(869 + 120);
        System.out.println(869 - 120);
        System.out.println(869 * 120);
        System.out.println(869 / 120);

        System.out.println(); // 改行

        // 余剰（mod）
        System.out.println(8 % 5);
        System.out.println(869 % 120);

        System.out.println(); // 改行

        // 絶対値（abs）
        System.out.println(Math.abs(-45));
        System.out.println(Math.abs(15));

        System.out.println(); // 改行

        // 累乗（pow）
        System.out.println((int)Math.pow(10.0, 2.0));
        System.out.println((int)Math.pow(3.0, 4.0));

        System.out.println(); // 改行

        // ルート（sqrt）
        System.out.format("%.5f\n", Math.sqrt(4.0)); // 小数点以下5桁まで表示（formatメソッドを使用）
        System.out.format("%.5f\n", Math.sqrt(2.0)); // 小数点以下5桁まで表示（formatメソッドを使用）
    }
}
