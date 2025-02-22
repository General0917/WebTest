package mathAlgorithrmBook.chapter3;

import java.util.*;

public class code3_1_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();

        for (long i = 1; i * i <= N; i++) {
            if (N % i != 0) {
                System.out.println(i);
                if (i != N / i) {
                    System.out.println(N / i);
                }
            }
        }
    }
}