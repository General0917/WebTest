package Paiza.B;

import java.util.Scanner;

public class B158 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力データのサイズ（奇数）
        int n = sc.nextInt();
        int[][] stones = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                stones[i][j] = sc.nextInt();
            }
        }

        // 動的に目標のピラミッドパターンを生成
        int[][] target = new int[n][n];
        int center = n / 2;
        for (int i = 0; i <= center; i++) {
            for (int j = i; j < n - i; j++) {
                target[i][j] = i + 1;
                target[j][i] = i + 1;
                target[n - 1 - i][j] = i + 1;
                target[j][n - 1 - i] = i + 1;
            }
        }

        // 結果を計算
        int totalStonesToRemove = 0;
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                int stonesToRemove = stones[i][j] - target[i][j];
                if (stonesToRemove > 0) {
                    totalStonesToRemove += stonesToRemove;
                }
            }
        }

        // 結果を出力
        System.out.println(totalStonesToRemove);
    }
}
