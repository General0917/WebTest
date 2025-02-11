package Paiza.D;

import java.util.Scanner;

public class D174 {
    public static void main(String[] args) {
        // CLIから整数を入力する
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // inputは1以上100以下の整数である
        if (input < 1 || input > 100) {
            System.out.println("1以上100以下の整数を入力してください");
            return;
        }

        input *= 1500;

        System.out.println(input);
    }
}
