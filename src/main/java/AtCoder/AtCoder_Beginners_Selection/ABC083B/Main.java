package AtCoder.AtCoder_Beginners_Selection.ABC083B;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A = sc.nextInt();
        int B = sc.nextInt();

        int sum = 0;
        for (int i = 1; i <= N; i++) {
            // iを配列に変換して、各桁の和を求める
            if (Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum() >= A  && Arrays.stream(String.valueOf(i).split("")).mapToInt(Integer::parseInt).sum() <= B) {
                sum += i;
            }
        }

        System.out.println(sum);
    }
}
