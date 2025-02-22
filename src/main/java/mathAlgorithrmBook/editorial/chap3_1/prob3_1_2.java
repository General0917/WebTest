package mathAlgorithrmBook.editorial.chap3_1;

import java.util.*;

public class prob3_1_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        for (long i = 2; i * i <= N; i++) {
            while (N % i == 0) {
                N /= i;
                System.out.println(i);
            }
        }

        if (N >= 2) {
            System.out.println(N);
        }
    }
}
