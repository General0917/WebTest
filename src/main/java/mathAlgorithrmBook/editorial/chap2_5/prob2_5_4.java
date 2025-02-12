package mathAlgorithrmBook.editorial.chap2_5;

import java.util.Arrays;
import java.util.Scanner;

// N以下の素数を小さい順に出力
public class prob2_5_4 {
    public static void main(String[] args) {
        // CLIから入力
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        // エラトステネスの篩を使って素数を求める
        boolean[] isPrime = new boolean[N + 1];
        Arrays.fill(isPrime, true);
        isPrime[0] = isPrime[1] = false;

        for (int i = 2; i * i <= N; i++) {
            if (isPrime[i]) {
                for (int j = i * i; j <= N; j += i) {
                    isPrime[j] = false;
                }
            }
        }

        // 素数を小さい順に出力
        for (int i = 2; i <= N; i++) {
            if (isPrime[i]) {
                // 2以上の素数の場合は先頭にスペースを出力
                if (i >= 3) System.out.print(" ");
                System.out.print(i);
            }
        }
    }

    // 以下のソースでも正解
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 入力
        int N = sc.nextInt();

        // 出力
        for (int i = 2; i <= N; i++) {
            if (isPrime(i) == true) {
                if (i >= 3) System.out.print(" ");
                System.out.print(i);
            }
        }
        System.out.println();
    }
    static boolean isPrime(long N) {
        // 2 以上の整数 N に対し、N が素数であれば true、素数でなければ false を返す関数
        for (long i = 2; i <= N - 1; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
    */
}
