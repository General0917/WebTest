package Paiza.D;

import java.util.Scanner;

public class D165 {
    public static void main(String[] args) {
        // CLIから整数を入力する
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine().trim();

        int num = Integer.parseInt(line);

        // numは4桁の整数である
        if (num < 1000 || num > 9999) {
            System.out.println("4桁の整数を入力してください");
            return;
        }

        // 数値を配列に変換
        char[] nums = String.valueOf(num).toCharArray();

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[i] == nums[j]) {
                    sum += 1;
                }
            }
        }

        // 一つでも重複があればNG
        if (sum >= 1) {
            System.out.println("NG");
        } else {
            System.out.println("OK");
        }

    }
}
