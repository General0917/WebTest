package AtCoder.AtCoder_Beginners_Selection.ABC081B;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int A[] = new int[N + 1];
        for (int i = 1; i < A.length; i++) {
            A[i] = sc.nextInt();
        }

        int count = 0;
        boolean flag = true;

        while (flag) {
            for (int i = 1; i < A.length; i++) {
                if (A[i] % 2 == 0) {
                    A[i] /= 2;
                } else {
                    flag = false;
                    break;
                }
            }

            if (flag) {
                count++;
            }
        }

        System.out.println(count);
    }
}
