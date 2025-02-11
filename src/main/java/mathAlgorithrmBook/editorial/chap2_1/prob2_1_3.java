package mathAlgorithrmBook.editorial.chap2_1;

import java.util.Scanner;

public class prob2_1_3 {
    public static void main(String[] args) {
        // CLIから整数を入力する
        Scanner sc = new Scanner(System.in);
        int[] A = new int[3];

        int sum = 1;
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
            sum = sum * A[i];
        }

        System.out.println(sum);
    }
}
