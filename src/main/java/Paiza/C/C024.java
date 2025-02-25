package Paiza.C;

import java.util.*;

public class C024 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int[] a = {0, 0};

        sc.nextLine();

        for (int i = 0; i < t; i++) {
            String[] arrays = sc.nextLine().split(" ");
            String cmd = arrays[0];

            if (cmd.equals("SET")) {
                int j = Integer.parseInt(arrays[1]);
                int k = Integer.parseInt(arrays[2]);
                a[j - 1] = k;
            } else if (cmd.equals("ADD")) {
                int l = Integer.parseInt(arrays[1]);
                a[1] = a[0] + l;
            } else if (cmd.equals("SUB")) {
                int m = Integer.parseInt(arrays[1]);
                a[1] = a[0] - m;
            }
        }

        System.out.println(a[0] + " " + a[1]);
    }
}

