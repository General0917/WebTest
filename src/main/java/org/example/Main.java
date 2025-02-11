package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // System.out.println("Hello world!");

        /*
        // CLIから整数を入力する
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();

        // inputは1以上100以下の整数である
        if (input < 1 || input > 100) {
            System.out.println("1以上100以下の整数を入力してください");
            return;
        }

        // 入力された整数を2乗して出力する
        input *= input;

        System.out.println(input);
        */

        // CLIから整数を入力する
        Scanner sc = new Scanner(System.in);
        String[] n = sc.nextLine().split(" ");

        // n[0]は数値であり、1以上100以下の整数である
        if (Integer.parseInt(n[0]) < 1 || Integer.parseInt(n[0]) > 100) {
            System.out.println("1以上100以下の整数を入力してください");
            return;
        }

        // n[1]は数値であり、1以上100以下の整数である
        if (Integer.parseInt(n[1]) < 1 || Integer.parseInt(n[1]) > 100) {
            System.out.println("1以上100以下の整数を入力してください");
            return;
        }

        // n[2]が入力された場合は、例外処理をする
        if (n.length > 2) {
            System.out.println("整数は2つまで入力可能です");
            return;
        }

        // n[0]で入力された整数の数だけ、さらにN個の整数を入力する
        String[] a = sc.nextLine().split(" ");
        if (a.length != Integer.parseInt(n[0])) {
            System.out.println("N個の整数を入力してください");
            return;
        }

        // aの要素数だけ繰り返す
        for (int i = 0; i < a.length; i++) {
            // a[i]がn[1]と一致しているものがあれば、YESを出力する
            if (a[i].equals(n[1])) {
                System.out.println("YES");
                return;
            }

            // a[i]がn[1]と一致していない場合、NOを出力する
            if (i == a.length - 1) {
                System.out.println("NO");
            }
        }
    }
}