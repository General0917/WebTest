package AtCoder.AtCoder_Beginners_Selection.ABC087B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int X = sc.nextInt();

        int count = 0;
        for (int i = 0; i <= A; i++) {
            for (int j = 0; j <= B; j++) {
                for (int k = 0; k <= C; k++) {
                    if ((500 * i) + (100 * j) + (50 * k) == X) {
                        count++;
                    }
                }
            }
        }

        System.out.println(count);
    }
}
