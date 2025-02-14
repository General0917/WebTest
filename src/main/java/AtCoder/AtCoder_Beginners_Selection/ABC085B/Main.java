package AtCoder.AtCoder_Beginners_Selection.ABC085B;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int[] d = new int[N + 1];
        for (int i = 1; i < d.length; i++) {
            d[i] = sc.nextInt();
        }

        int count = 0;

        //　配列を昇順にソートする
        Arrays.sort(d);

        // 配列を昇順にソートしたので、重複を削除する
        for (int i = 1; i < d.length; i++) {
            if (d[i] > d[i - 1]) { // 隣り合う要素が異なる場合、countをインクリメントする
                count++;
            }
        }

        System.out.println(count);
    }
}
