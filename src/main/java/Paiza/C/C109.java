package Paiza.C;

import java.util.Arrays;
import java.util.Comparator;
import java.util.Scanner;

public class C109 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // ユーザー数を読み込む
        int n = scanner.nextInt();
        scanner.nextLine(); // 改行を読み飛ばす

        // ユーザーIDを格納する配列を作成
        String[] userIds = new String[n];

        // ユーザーIDを入力から読み込む
        for (int i = 0; i < n; i++) {
            userIds[i] = scanner.nextLine();
        }

        // ユーザーIDを並べ替える
        Arrays.sort(userIds, new Comparator<String>() {
            @Override
            public int compare(String userId1, String userId2) {
                // ユーザーIDから番号部分を抽出し、数値に変換して比較する
                int number1 = extractNumber(userId1);
                int number2 = extractNumber(userId2);
                return Integer.compare(number1, number2);
            }

            private int extractNumber(String userId) {
                String numberPart = userId.replaceAll("[^0-9]", "");
                return Integer.parseInt(numberPart);
            }
        });

        // 並べ替えたユーザーIDを出力
        for (String userId : userIds) {
            System.out.println(userId);
        }
    }
}
