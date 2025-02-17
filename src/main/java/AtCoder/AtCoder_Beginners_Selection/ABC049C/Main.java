package AtCoder.AtCoder_Beginners_Selection.ABC049C;

import java.util.*;

public class Main {
    public static void main(String[] args)  {
        Scanner sc = new Scanner(System.in);
        String S = sc.nextLine();

        // 正規表現を使用した場合でも正解
        // System.out.println(S.matches("^(dream|dreamer|erase|eraser)+$") ? "YES" : "NO");

        while (S.length() > 0) {
            if (S.endsWith("dream")) {
                S = S.substring(0, S.length() - 5);
            } else if (S.endsWith("dreamer")) {
                S = S.substring(0, S.length() - 7);
            } else if (S.endsWith("erase")) {
                S = S.substring(0, S.length() - 5);
            } else if (S.endsWith("eraser")) {
                S = S.substring(0, S.length() - 6);
            } else {
                System.out.println("NO");
                return;
            }
        }

        System.out.println("YES");
    }
}
