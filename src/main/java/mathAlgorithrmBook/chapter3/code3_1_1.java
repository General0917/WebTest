package mathAlgorithrmBook.chapter3;

import java.util.*;

public class code3_1_1 {
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
        // 2以上の整数Nに対し、Nが素数であればtrue、素数でなければfalseを返す関数
        for (long i = 2; i <= N - 1; i++) {
            if (N % i == 0) {
                return false;
            }
        }
        return true;
    }
}
