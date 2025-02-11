package Paiza.D;

import java.util.Scanner;

public class D228 {
    public static void main(String[] args) {
        // CLIから整数を入力する
        Scanner sc = new Scanner(System.in);
        String[] number1 = sc.nextLine().split(" ");
        String[] number2 = sc.nextLine().split(" ");

        // 現在時刻を24時間表記にする
        int current = Integer.parseInt(number2[0]) * 60 + Integer.parseInt(number2[1]);

        // 日没時間を分単位にする
        int sunset = Integer.parseInt(number1[0]) * 60 + Integer.parseInt(number1[1]);

        // クリスマスなのかを判定する
        if (current >= 0 && current <= sunset) {
            System.out.println("Yes");
        } else {
            System.out.println("No");
        }
    }
}
