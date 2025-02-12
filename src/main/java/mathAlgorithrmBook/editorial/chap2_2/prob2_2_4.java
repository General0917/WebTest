package mathAlgorithrmBook.editorial.chap2_2;

import java.util.*;

public class prob2_2_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] A = new int[N + 1];

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            A[i] = sc.nextInt();
            sum += A[i];
        }

        System.out.println(sum % 100);
    }
}
