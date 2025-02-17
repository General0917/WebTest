package AtCoder.AtCoder_Beginners_Selection.ABC085C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N - i; j++) {
                int k = N - i - j;
                if (i * 10000 + j * 5000 + k * 1000 == Y) {
                    System.out.println(i + " " + j + " " + k);
                    return;
                }
            }
        }

        System.out.println("-1 -1 -1");
    }

    // 以下のコードでも正解だが、こちらは全探索を使用し、処理時間が2秒を超える
    /*
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int Y = sc.nextInt();

        for (int i = 0; i <= N; i++) {
            for (int j = 0; j <= N; j++) {
                for (int k = 0; k <= N; k++) {
                    if (i * 10000 + j * 5000 + k * 1000 == Y && i + j + k == N) {
                        System.out.println(i + " " + j + " " + k);
                        return;
                    }
                }
            }
        }

        System.out.println("-1 -1 -1");
    }
    */
}
