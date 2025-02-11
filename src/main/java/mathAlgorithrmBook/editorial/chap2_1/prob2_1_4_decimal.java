package mathAlgorithrmBook.editorial.chap2_1;

public class prob2_1_4_decimal {
    public static void main(String[] args) {
        int binary = 1001;

        int decimal = 0;
        int digit = 0;

        // 2進数を10進数に変換する
        while (binary > 0) {
            int remainder = binary % 10;
            decimal += remainder * Math.pow(2, digit);
            binary = binary / 10;
            digit++;
        }

        System.out.println(decimal);

    }
}
