package mathAlgorithrmBook.chapter2;

import java.util.*;

public class code2_4_2 {
    public static void main(String[] args) {
        // CLIからの入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int Y = sc.nextInt();

        // 答えを求める
        int count = 0;
        for (int i = 1; i <= N; i++) {
            if (i % X == 0 || i % Y == 0) {
                count++;
            }
        }

        // 答えを出力
        System.out.println(count);
    }
}
