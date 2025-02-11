package Paiza.D;

import java.util.Locale;
import java.util.Scanner;

public class D082 {
    public static void main(String[] args) {
        //  CLIから整数を入力する
        Scanner sc = new Scanner(System.in);

        String word1 = sc.nextLine();
        String word2 = sc.nextLine();

        // word1の末尾の文字が、word2の先頭の文字と一致しているか判定する
        if ((word1.charAt(word1.length() - 1) == word2.charAt(0))) {
            if (word2.charAt(word2.length() - 1) == 'n') { //  word2の末尾の文字列が、nであればNGそれ以外はOKと出力する
                System.out.println("NG");
            } else {
                System.out.println("OK");
            }
        } else {
            System.out.println("NG");
        }
    }
}
