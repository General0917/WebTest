package mathAlgorithrmBook.chapter2;

import java.util.*;

public class code2_1_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        String answer = "";

        while (N >= 1) {
            if (N % 2 == 0) {
                answer = "0" + answer;

                // 以下の記載でも問題なし
                // answer += "0";
            }

            if (N % 2 == 1) {
                answer = "1" + answer;

                // 以下の記載でも問題なし
                // answer += "1";
            }

            N = N / 2;
        }

        System.out.println(answer);
    }
}
