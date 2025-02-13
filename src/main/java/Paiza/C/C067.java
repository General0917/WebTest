package Paiza.C;

import java.util.Scanner;

public class C067 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 最初の入力は数字の個数と対象の数字
        int numberOfDigits = sc.nextInt();
        int number = sc.nextInt();

        // 各桁の指定位置を格納する配列を作成
        int[] positions = new int[numberOfDigits];
        for (int i = 0; i < numberOfDigits; i++) {
            positions[i] = sc.nextInt();
        }

        // 2進数に変換して各位置のビット値を出力
        String binaryString = Integer.toBinaryString(number);
        int length = binaryString.length();

        for (int i = 0; i < numberOfDigits; i++) {
            int position = positions[i];
            if (position <= length) {
                System.out.println(binaryString.charAt(length - position));
            } else {
                System.out.println(0);  // 桁数より大きな場合は0を出力
            }
        }

        sc.close();
    }
}
