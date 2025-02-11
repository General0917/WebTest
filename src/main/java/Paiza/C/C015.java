package Paiza.C;

import java.util.Scanner;

public class C015 {
    public static void main(String[] args) {
        // CLIから整数を入力する
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        int num = Integer.parseInt(line);

        int point = 0;
        for (int i = 0; i < num; i++) {
            String[] input = sc.nextLine().split(" ");
            int day = Integer.parseInt(input[0]);
            int amount = Integer.parseInt(input[1]);

            if (String.valueOf(day).contains("5")) {
                point += amount * 0.05;
            } else if (String.valueOf(day).contains("3")) {
                point += amount * 0.03;
            } else {
                point += amount * 0.01;
            }
        }

        System.out.println(point);
    }
}
