package mathAlgorithrmBook.editorial.chap2_5;

import java.util.Scanner;

public class prob2_5_3 {
    public static void main(String[] args) {
        // CLIから入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // N!の計算
        int fact = 1;
        for (int i = 1; i <= N; i++) {
            fact *= i;
        }

        // 答えを出力
        System.out.println(fact);
    }
}
