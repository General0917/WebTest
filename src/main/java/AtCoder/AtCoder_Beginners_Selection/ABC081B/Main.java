package AtCoder.AtCoder_Beginners_Selection.ABC081B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N];
        for (int i = 0; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        int count = 0;
        boolean allEven = true;

        while (allEven) {
            allEven = true;
            for (int i = 0; i < N; i++) {
                if (A[i] % 2 != 0) {
                    allEven = false;
                    break;
                }
            }

            if (allEven) {
                for (int i = 0; i < N; i++) {
                    A[i] /= 2;
                }
                count++;
            }
        }

        System.out.println(count);
    }
}
