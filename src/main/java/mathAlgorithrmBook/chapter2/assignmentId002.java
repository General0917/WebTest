package mathAlgorithrmBook.chapter2;

import java.util.*;

public class assignmentId002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n[] = new int[4];

        n[0] = sc.nextInt();
        n[1] = sc.nextInt();
        n[2] = sc.nextInt();

        /*
        int sum = 0;
        for (int i = 0; i < n.length; i++) {
            sum += n[i];
        }
        */

        int sum = n[0] + n[1] + n[2];

        System.out.println(sum);
    }
}
