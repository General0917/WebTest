package AtCoder.AtCoder_Beginners_Selection.ABC081A;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] s = sc.next().split("");

        int count = 0;
        for (int i = 0; i < s.length; i++) {
            if (s[i].contains("1")) {
                count++;
            }
        }

        System.out.println(count);
    }
}
