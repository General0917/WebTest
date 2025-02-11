package Paiza.C;

import java.util.Scanner;

public class C084 {
    public static void main(String[] args) {
        // CLIから文字列を入力する
        Scanner sc = new Scanner(System.in);
        String line = sc.nextLine();

        // lineは英字のみで構成される
        if (!line.matches("[a-zA-Z]+")) {
            System.out.println("英字のみで構成された文字列を入力してください");
            return;
        }

        // lineは1文字以上100文字以下である
        if (line.length() < 1 || line.length() > 100) {
            System.out.println("1文字以上100文字以下で入力してください");
            return;
        }
        
        String border = "+".repeat(line.length() + 2);

        System.out.println(border);
        System.out.println("+" + line + "+");
        System.out.println(border);
    }
}
