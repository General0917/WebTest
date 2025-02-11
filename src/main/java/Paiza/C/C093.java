package Paiza.C;

import java.util.Scanner;

public class C093 {
    public static void main(String[] args) {
        // CLIから整数を入力する
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int bobNumber = Integer.parseInt(input[0]);
        int aliceNumber = Integer.parseInt(input[1]);

        // bobNumberとaliceNumberの各桁の和を求める
        int bobSum = sumOfDigits(bobNumber);
        int aliceSum = sumOfDigits(aliceNumber);

        if (bobSum > aliceSum) {
            System.out.println("Bob");
        } else if (bobSum < aliceSum) {
            System.out.println("Alice");
        } else {
            System.out.println("Draw");
        }
    }

    private static int sumOfDigits(int number) {
        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        sum %= 10;
        return sum;
    }
}
