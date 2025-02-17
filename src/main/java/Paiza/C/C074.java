package Paiza.C;

import java.util.Scanner;

public class C074 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int H = sc.nextInt();
        int W = sc.nextInt();
        int X = sc.nextInt();
        sc.nextLine();

        StringBuilder text = new StringBuilder();
        for (int i = 0; i < H; i++) {
            text.append(sc.nextLine());
        }

        String fullText = text.toString();
        int length = fullText.length();
        for (int i = 0; i < length; i += X) {
            if (i + X < length) {
                System.out.println(fullText.substring(i, i + X));
            } else {
                System.out.println(fullText.substring(i));
            }
        }
    }
}