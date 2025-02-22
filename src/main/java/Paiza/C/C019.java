package Paiza.C;

import java.util.*;

public class C019 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int Q = sc.nextInt();
        List<Integer> numbers = new ArrayList<>();

        for (int i = 0; i < Q; i++) {
            numbers.add(sc.nextInt());
        }

        for (int value : numbers) {
            int sumOfDivisors = 0;
            for (int i = 1; i < value; i++) {
                if (value % i == 0) {
                    sumOfDivisors += i;
                }
            }

            if (value == sumOfDivisors) {
                System.out.println("perfect");
            } else if (Math.abs(value - sumOfDivisors) == 1) {
                System.out.println("nearly");
            } else {
                System.out.println("neither");
            }
        }
    }
}
