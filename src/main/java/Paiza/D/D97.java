package Paiza.D;

import java.util.Scanner;

public class D97 {
    public static void main(String[] args) {
        //  CLIから整数を入力する
        Scanner sc = new Scanner(System.in);
        String[] line = sc.nextLine().split(" ");

        int sum = 0;
        for (int i = 0; i < line.length; i++) {
            if (Integer.parseInt(line[i]) == 1) {
                sum += 1;
            }
        }

        if (sum >= 5) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}
