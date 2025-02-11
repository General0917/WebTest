package mathAlgorithrmBook.chapter2;

import java.util.*;

public class code2_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 1];

        int answer = 0;
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
            answer += A[i];
        }

        System.out.println(answer);
    }
}
