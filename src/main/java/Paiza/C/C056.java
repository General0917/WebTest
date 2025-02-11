package Paiza.C;

import java.util.Scanner;

public class C056 {
    public static void main(String[] args) {
        // CLIから整数を入力する
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int N = Integer.parseInt(input[0]);
        int M = Integer.parseInt(input[1]);

        for (int i = 1; i <= N; i++) {
            String[] line = sc.nextLine().split(" ");
            int testPoint = Integer.parseInt(line[0]);
            int numberOfAbsences = Integer.parseInt(line[1]);

            int score = testPoint - (numberOfAbsences * 5);

            if (score < 0) {
                score = 0;
            }

            if (score >= M) {
                System.out.println(i);
            }
        }
    }
}
