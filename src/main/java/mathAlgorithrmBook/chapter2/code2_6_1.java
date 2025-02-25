package mathAlgorithrmBook.chapter2;

import java.util.Scanner;

public class code2_6_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // カードの枚数
        int N = scanner.nextInt();
        // 目標の合計
        int S = scanner.nextInt();
        // 各カードの整数値
        int[] A = new int[N];
        for (int i = 0; i < N; i++) {
            A[i] = scanner.nextInt();
        }

        // 全探索を用いて解を見つける
        boolean found = false;
        for (int i = 0; i < (1 << N); i++) {
            int sum = 0;
            for (int j = 0; j < N; j++) {
                if ((i & (1 << j)) != 0) {
                    sum += A[j];
                }
            }
            if (sum == S) {
                found = true;
                break;
            }
        }

        if (found) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }

    // 以下のコードでも正解
    /*
    public static void main(String[] args) {
        // 入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int S = sc.nextInt();
        int[] A = new int[N + 1];
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
        }

        // 全パターンを探索：(1L << N) は 2 の N 乗（ただし 1L は long 型の 1 を表す）
        String answer = "No";
        for (long i = 0; i < (1L << N); i++) {
            int sum = 0;
            for (int j = 1; j <= N; j++) {
                // (i & (1L << (j - 1))) != 0LL の場合、i の 2 進法表記の下から j 桁目が 1
                // (1L << (j - 1)) は Java では「2 の j-1 乗」を意味します
                if ((i & (1L << (j - 1))) != 0L) {
                    sum += A[j];
                }
            }
            if (sum == S) {
                answer = "Yes";
                break;
            }
        }

        // 出力
        System.out.println(answer);
    }
    */
}