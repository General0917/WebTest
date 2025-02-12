package Paiza.C;

import java.util.Scanner;

public class C051 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numbers = parseInput(sc.nextLine());

        int maxSum = calculateMaxSum(numbers);

        System.out.println(maxSum);
    }

    private static int[] parseInput(String input) {
        String[] numberStrings = input.split(" ");
        int[] numbers = new int[numberStrings.length];
        for (int i = 0; i < numberStrings.length; i++) {
            numbers[i] = Integer.parseInt(numberStrings[i]);
        }
        return numbers;
    }

    private static int calculateMaxSum(int[] numbers) {
        int maxSum = 0;
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i != j) {
                    int num1 = numbers[i] * 10 + numbers[j];
                    for (int k = 0; k < 4; k++) {
                        for (int l = 0; l < 4; l++) {
                            if (k != l && k != i && k != j && l != i && l != j) {
                                int num2 = numbers[k] * 10 + numbers[l];
                                int sum = num1 + num2;
                                if (sum > maxSum) {
                                    maxSum = sum;
                                }
                            }
                        }
                    }
                }
            }
        }
        return maxSum;
    }
}