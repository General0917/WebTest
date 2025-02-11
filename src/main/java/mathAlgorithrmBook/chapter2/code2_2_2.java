package mathAlgorithrmBook.chapter2;

import java.util.*;

public class code2_2_2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();

        // ビット演算では、&はAND、|はOR、^はXORを表す
        // ビット演算を行うためにわざわざ10進数を2進数に変換する必要はない
        System.out.println(a & b);
        System.out.println(a | b);
        System.out.println(a ^ b);
    }
}
