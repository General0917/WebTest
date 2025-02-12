package mathAlgorithrmBook.chapter2;

import java.util.*;

public class code2_4_3 {
    public static void main(String[] args) {
        // CLIからの入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();

        // 答えを求める
        int count = 0;
        for (int i = 1; i <= N; i++) {
            for (int j = 1; j <= N; j++) {
                int pattern = i + j;

                if (pattern <= S) {
                    count++;
                }
            }
        }

        // 答えを出力
        System.out.println(count);
    }
}
