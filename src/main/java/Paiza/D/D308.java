package Paiza.D;

import java.util.Scanner;

public class D308 {
    public static void main(String[] args) {
        // CLIから整数を入力する
        Scanner sc = new Scanner(System.in);
        String[] input = sc.nextLine().split(" ");

        int sum = 0;
        for (int i = 0; i < input.length; i++) {
            sum += Integer.parseInt(input[i]);
        }

        System.out.println(sum);
    }
}
