package Paiza.C;

import java.util.Scanner;

public class C078 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt(); // 日数
        int c1 = scanner.nextInt(); // 買値の基準
        int c2 = scanner.nextInt(); // 売値の基準
        int[] prices = new int[N];

        for (int i = 0; i < N; i++) {
            prices[i] = scanner.nextInt(); // 日ごとの株価を入力
        }

        int stocks = 0; // 持ち株数
        int cash = 0; // 現金
        for (int i = 0; i < N; i++) {
            if (prices[i] <= c1) {
                // 株価がc1円以下の場合、1株買う
                stocks++;
                cash -= prices[i];
            } else if (prices[i] >= c2) {
                // 株価がc2円以上の場合、持ち株をすべて売る
                cash += stocks * prices[i];
                stocks = 0;
            }
        }

        // N日目に持ち株をすべて売る
        cash += stocks * prices[N - 1];
        stocks = 0;

        // 損益を出力
        System.out.println(cash);
    }
}
