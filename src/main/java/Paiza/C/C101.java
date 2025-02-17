package Paiza.C;

import java.util.Scanner;

public class C101 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int X = sc.nextInt();

        int count = 0;
        for (int i = 0; i <= 364; i++) {
            if (String.valueOf(i).contains(String.valueOf(X))) {
                count++;
            }
        }

        System.out.println(count);
    }
}
