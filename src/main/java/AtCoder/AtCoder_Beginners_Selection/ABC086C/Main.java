package AtCoder.AtCoder_Beginners_Selection.ABC086C;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int preT = 0;
        int preX = 0;
        int preY = 0;

        for (int i = 0; i < N; i++) {
            int t = sc.nextInt();
            int x = sc.nextInt();
            int y = sc.nextInt();

            int dt = t - preT;
            int dist = Math.abs(x - preX) + Math.abs(y - preY);
            if ((dt < dist) || ((dist - dt) % 2 != 0)) {
                System.out.println("No");
                return;
            }

            preT = t;
            preX = x;
            preY = y;
        }

        System.out.println("Yes");
    }
}
