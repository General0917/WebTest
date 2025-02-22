package mathAlgorithrmBook.editorial.chap3_1;

import java.util.*;

public class prob3_1_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long N = sc.nextLong();
        boolean answer = isPrime(N);

        if (answer) {
            System.out.println("Prime");
        } else {
            System.out.println("not Prime");
        }
    }

    public static boolean isPrime(long N) {
        for (long i = 2; i * i <= N; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
