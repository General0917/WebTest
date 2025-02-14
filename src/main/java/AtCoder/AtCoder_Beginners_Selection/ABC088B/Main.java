package AtCoder.AtCoder_Beginners_Selection.ABC088B;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // CLIから整数を入力する
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N + 1];

        int score;
        int Alice = 0;
        int Bob = 0;
        for (int i = 1; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        // 配列を昇順にソートする
        Arrays.sort(A);

        // 配列を昇順にソートしたので、Aliceのスコアを計算する
        for (int i = N; i > 0; i -= 2) {
            Alice += A[i];
        }

        // 配列を昇順にソートしたので、Bobのスコアを計算する
        for (int i = N - 1; i > 0; i -= 2) {
            Bob += A[i];
        }

        score = Alice - Bob; // AliceのスコアからBobのスコアを引いた値をscoreに代入する

        System.out.println(score);
    }
}
