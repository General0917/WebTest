package Paiza.C;

import java.util.Scanner;

public class C049 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int line = sc.nextInt();

        // エレベーターの初期値
        int elevator = 1;
        int totalDistance = 0;

        // エレベーターの移動回数
        for (int i = 1; i <= line; i++) {
            int floor = sc.nextInt();

            // エレベーターの移動
            totalDistance += Math.abs(floor - elevator);

            // エレベーターの階層が下層に移動する場合
            elevator = floor;
        }

        System.out.println(totalDistance);
    }
}
